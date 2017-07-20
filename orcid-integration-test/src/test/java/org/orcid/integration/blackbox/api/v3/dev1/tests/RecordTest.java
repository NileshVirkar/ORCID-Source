/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
package org.orcid.integration.blackbox.api.v3.dev1.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import javax.annotation.Resource;

import org.codehaus.jettison.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.orcid.integration.api.pub.PublicV2ApiClientImpl;
import org.orcid.integration.blackbox.api.v2_1.release.BlackBoxBaseV2_1Release;
import org.orcid.integration.blackbox.api.v2_1.release.MemberV2_1ApiClientImpl;
import org.orcid.jaxb.model.v3.dev1.common.Visibility;
import org.orcid.jaxb.model.message.ScopePathType;
import org.orcid.jaxb.model.v3.dev1.record.summary.EducationSummary;
import org.orcid.jaxb.model.v3.dev1.record.summary.Educations;
import org.orcid.jaxb.model.v3.dev1.record.summary.EmploymentSummary;
import org.orcid.jaxb.model.v3.dev1.record.summary.Employments;
import org.orcid.jaxb.model.v3.dev1.record.summary.FundingGroup;
import org.orcid.jaxb.model.v3.dev1.record.summary.FundingSummary;
import org.orcid.jaxb.model.v3.dev1.record.summary.Fundings;
import org.orcid.jaxb.model.v3.dev1.record.summary.PeerReviewGroup;
import org.orcid.jaxb.model.v3.dev1.record.summary.PeerReviewSummary;
import org.orcid.jaxb.model.v3.dev1.record.summary.PeerReviews;
import org.orcid.jaxb.model.v3.dev1.record.summary.WorkGroup;
import org.orcid.jaxb.model.v3.dev1.record.summary.WorkSummary;
import org.orcid.jaxb.model.v3.dev1.record.summary.Works;
import org.orcid.jaxb.model.v3.dev1.record.Address;
import org.orcid.jaxb.model.v3.dev1.record.Addresses;
import org.orcid.jaxb.model.v3.dev1.record.Biography;
import org.orcid.jaxb.model.v3.dev1.record.Email;
import org.orcid.jaxb.model.v3.dev1.record.Emails;
import org.orcid.jaxb.model.v3.dev1.record.Keyword;
import org.orcid.jaxb.model.v3.dev1.record.Keywords;
import org.orcid.jaxb.model.v3.dev1.record.Name;
import org.orcid.jaxb.model.v3.dev1.record.OtherName;
import org.orcid.jaxb.model.v3.dev1.record.OtherNames;
import org.orcid.jaxb.model.v3.dev1.record.PersonExternalIdentifier;
import org.orcid.jaxb.model.v3.dev1.record.PersonExternalIdentifiers;
import org.orcid.jaxb.model.v3.dev1.record.Record;
import org.orcid.jaxb.model.v3.dev1.record.ResearcherUrl;
import org.orcid.jaxb.model.v3.dev1.record.ResearcherUrls;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sun.jersey.api.client.ClientResponse;

/**
 * 
 * @author Angel Montenegro
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml" })
public class RecordTest extends BlackBoxBaseV2_1Release {    
    @Resource(name = "memberV2_1ApiClient")
    private MemberV2_1ApiClientImpl memberV2_1ApiClient;
    @Resource(name = "publicV2_1ApiClient")
    private PublicV2ApiClientImpl publicV2_1ApiClient;
        
    @Test
    public void testViewRecordFromMemberAPI() throws InterruptedException, JSONException {
        String accessToken = getAccessToken();
        assertNotNull(accessToken);
        ClientResponse response = memberV2_1ApiClient.viewRecord(getUser1OrcidId(), accessToken);
        assertNotNull(response);        
        assertEquals("invalid " + response,200,response.getStatus());        
        Record record = response.getEntity(Record.class);
        assertNotNull(record);
        assertNotNull(record.getOrcidIdentifier());
        assertEquals(getUser1OrcidId(), record.getOrcidIdentifier().getPath());               
        //Check the visibility of every activity that exists
        if(record.getActivitiesSummary() != null) {
            //Educations
            if(record.getActivitiesSummary().getEducations() != null) {
                Educations e = record.getActivitiesSummary().getEducations();
                if(e.getSummaries() != null) {
                    for(EducationSummary s : e.getSummaries()) {
                        assertNotNull(s.getSource());
                        assertNotNull(s.getVisibility());
                        Visibility v = s.getVisibility();
                        //If the visibility is PRIVATE the client should be the owner
                        if(Visibility.PRIVATE.equals(v)) {                            
                            assertEquals(getClient1ClientId(), s.getSource().retrieveSourcePath());
                        }
                    }
                }
            }
            //Employments
            if(record.getActivitiesSummary().getEmployments() != null) {
                Employments e = record.getActivitiesSummary().getEmployments();
                if(e.getSummaries() != null) {
                    for(EmploymentSummary s : e.getSummaries()) {
                        assertNotNull(s.getSource());
                        assertNotNull(s.getVisibility());
                        Visibility v = s.getVisibility();
                        //If the visibility is PRIVATE the client should be the owner
                        if(Visibility.PRIVATE.equals(v)) {                            
                            assertEquals(getClient1ClientId(), s.getSource().retrieveSourcePath());
                        }
                    }
                }
            }
            //Fundings
            if(record.getActivitiesSummary().getFundings() != null) {
                Fundings f = record.getActivitiesSummary().getFundings();
                List<FundingGroup> groups = f.getFundingGroup();
                if(groups != null) {
                    for(FundingGroup fGroup : groups) {
                        List<FundingSummary> summaries = fGroup.getFundingSummary();
                        if(summaries != null) {
                            for(FundingSummary s : summaries) {
                                assertNotNull(s.getSource());
                                assertNotNull(s.getVisibility());
                                Visibility v = s.getVisibility();
                                //If the visibility is PRIVATE the client should be the owner
                                if(Visibility.PRIVATE.equals(v)) {                            
                                    assertEquals(getClient1ClientId(), s.getSource().retrieveSourcePath());
                                }
                            }
                        }
                    }
                }
            }
            //PeerReviews
            if(record.getActivitiesSummary().getPeerReviews() != null) {
                PeerReviews p = record.getActivitiesSummary().getPeerReviews();
                List<PeerReviewGroup> groups = p.getPeerReviewGroup();
                if(groups != null) {
                    for(PeerReviewGroup pGroup : groups) {
                        List<PeerReviewSummary> summaries = pGroup.getPeerReviewSummary();
                        if(summaries != null) {
                            for(PeerReviewSummary s : summaries) {
                                assertNotNull(s.getSource());
                                assertNotNull(s.getVisibility());
                                Visibility v = s.getVisibility();
                                //If the visibility is PRIVATE the client should be the owner
                                if(Visibility.PRIVATE.equals(v)) {                            
                                    assertEquals(getClient1ClientId(), s.getSource().retrieveSourcePath());
                                }
                            }
                        }
                    }
                }
            }
            //Works
            if(record.getActivitiesSummary().getWorks() != null) {
                Works w = record.getActivitiesSummary().getWorks();
                List<WorkGroup> groups = w.getWorkGroup();
                if(groups != null) {
                    for(WorkGroup wGroup : groups) {
                        List<WorkSummary> summaries = wGroup.getWorkSummary();
                        if(summaries != null) {
                            for(WorkSummary s : summaries) {
                                assertNotNull(s.getSource());
                                assertNotNull(s.getVisibility());
                                Visibility v = s.getVisibility();
                                //If the visibility is PRIVATE the client should be the owner
                                if(Visibility.PRIVATE.equals(v)) {                            
                                    assertEquals(getClient1ClientId(), s.getSource().retrieveSourcePath());
                                }
                            }
                        }
                    }
                }
            }
        }
                        
        //Check the visibility of every biography elements that exists
        if(record.getPerson() != null) {
            //Address
            if(record.getPerson().getAddresses() != null) {
                Addresses addresses = record.getPerson().getAddresses();
                List<Address> list = addresses.getAddress();
                if(list != null) {
                    for(Address o : list) {
                        assertNotNull(o.getSource());
                        assertNotNull(o.getVisibility());
                        Visibility v = o.getVisibility();
                        //If the visibility is PRIVATE the client should be the owner
                        if(Visibility.PRIVATE.equals(v)) {                            
                            assertEquals(getClient1ClientId(), o.getSource().retrieveSourcePath());
                        }
                    }
                }
            }
            //Biography
            if(record.getPerson().getBiography() != null) {
                Biography b = record.getPerson().getBiography();
                if(b != null) {
                    assertNotNull(b.getVisibility());
                    if(Visibility.PRIVATE.equals(b.getVisibility())) {
                        fail("Visibility is private");
                    }
                }
            }
            //Emails
            if(record.getPerson().getEmails() != null) {
                Emails emails = record.getPerson().getEmails();
                List<Email> list = emails.getEmails();
                if(list != null) {
                    for(Email e : list) {
                        assertNotNull(e.getVisibility());
                        if(Visibility.PRIVATE.equals(e.getVisibility())) {
                            fail("Email " + e.getEmail() + " is private");
                        }
                    }
                }
            }
            //External identifiers
            if(record.getPerson().getExternalIdentifiers() != null) {
                PersonExternalIdentifiers extIds = record.getPerson().getExternalIdentifiers();
                List<PersonExternalIdentifier> list = extIds.getExternalIdentifiers();
                if(list != null) {
                    for(PersonExternalIdentifier e : list) {
                        assertNotNull(e.getVisibility());
                        if(Visibility.PRIVATE.equals(e.getVisibility())) {
                            assertEquals(getClient1ClientId(), e.getSource().retrieveSourcePath());
                        }
                    }
                }
            }
            //Keywords
            if(record.getPerson().getKeywords() != null) {
                Keywords keywords = record.getPerson().getKeywords();
                List<Keyword> list = keywords.getKeywords();
                if(list != null) {
                    for(Keyword e : list) {
                        assertNotNull(e.getVisibility());
                        if(Visibility.PRIVATE.equals(e.getVisibility())) {
                            assertEquals(getClient1ClientId(), e.getSource().retrieveSourcePath());
                        }
                    }
                }
            }
            //Name
            if(record.getPerson().getName() != null) {
               Name name =  record.getPerson().getName();
               if(Visibility.PRIVATE.equals(name.getVisibility())) {
                  fail("Name is private"); 
               }
            }
            //Other names
            if(record.getPerson().getOtherNames() != null) {
                OtherNames otherNames = record.getPerson().getOtherNames();
                List<OtherName> list = otherNames.getOtherNames();
                if(list != null) {
                    for(OtherName e : list) {
                        assertNotNull(e.getVisibility());
                        if(Visibility.PRIVATE.equals(e.getVisibility())) {
                            assertEquals(getClient1ClientId(), e.getSource().retrieveSourcePath());
                        }
                    }
                }
            }
            //Researcher urls
            if(record.getPerson().getResearcherUrls() != null) {
                ResearcherUrls rUrls = record.getPerson().getResearcherUrls();
                List<ResearcherUrl> list = rUrls.getResearcherUrls();
                if(list != null) {
                    for(ResearcherUrl e : list) {
                        assertNotNull(e.getVisibility());
                        if(Visibility.PRIVATE.equals(e.getVisibility())) {
                            assertEquals(getClient1ClientId(), e.getSource().retrieveSourcePath());
                        }
                    }
                }
            }            
        }
    }    
    
    @Test
    public void testViewRecordFromPublicAPI() {
        ClientResponse response = publicV2_1ApiClient.viewRecordXML(getUser1OrcidId());
        assertNotNull(response);        
        assertEquals("invalid " + response,200,response.getStatus());        
        Record record = response.getEntity(Record.class);
        assertNotNull(record);
        assertNotNull(record.getOrcidIdentifier());
        assertEquals(getUser1OrcidId(), record.getOrcidIdentifier().getPath());               
        //Check the visibility of every activity that exists
        if(record.getActivitiesSummary() != null) {
            if(record.getActivitiesSummary() != null) {
                //Educations
                if(record.getActivitiesSummary().getEducations() != null) {
                    Educations e = record.getActivitiesSummary().getEducations();
                    if(e.getSummaries() != null) {
                        for(EducationSummary s : e.getSummaries()) {
                            assertNotNull(s.getSource());                            
                            assertEquals(Visibility.PUBLIC, s.getVisibility());                            
                        }
                    }
                }
                //Employments
                if(record.getActivitiesSummary().getEmployments() != null) {
                    Employments e = record.getActivitiesSummary().getEmployments();
                    if(e.getSummaries() != null) {
                        for(EmploymentSummary s : e.getSummaries()) {
                            assertNotNull(s.getSource());
                            assertEquals(Visibility.PUBLIC, s.getVisibility());
                        }
                    }
                }
                //Fundings
                if(record.getActivitiesSummary().getFundings() != null) {
                    Fundings f = record.getActivitiesSummary().getFundings();
                    List<FundingGroup> groups = f.getFundingGroup();
                    if(groups != null) {
                        for(FundingGroup fGroup : groups) {
                            List<FundingSummary> summaries = fGroup.getFundingSummary();
                            if(summaries != null) {
                                for(FundingSummary s : summaries) {
                                    assertNotNull(s.getSource());
                                    assertEquals(Visibility.PUBLIC, s.getVisibility());
                                }
                            }
                        }
                    }
                }
                //PeerReviews
                if(record.getActivitiesSummary().getPeerReviews() != null) {
                    PeerReviews p = record.getActivitiesSummary().getPeerReviews();
                    List<PeerReviewGroup> groups = p.getPeerReviewGroup();
                    if(groups != null) {
                        for(PeerReviewGroup pGroup : groups) {
                            List<PeerReviewSummary> summaries = pGroup.getPeerReviewSummary();
                            if(summaries != null) {
                                for(PeerReviewSummary s : summaries) {
                                    assertNotNull(s.getSource());
                                    assertEquals(Visibility.PUBLIC, s.getVisibility());
                                }
                            }
                        }
                    }
                }
                //Works
                if(record.getActivitiesSummary().getWorks() != null) {
                    Works w = record.getActivitiesSummary().getWorks();
                    List<WorkGroup> groups = w.getWorkGroup();
                    if(groups != null) {
                        for(WorkGroup wGroup : groups) {
                            List<WorkSummary> summaries = wGroup.getWorkSummary();
                            if(summaries != null) {
                                for(WorkSummary s : summaries) {
                                    assertNotNull(s.getSource());
                                    assertEquals(Visibility.PUBLIC, s.getVisibility());
                                }
                            }
                        }
                    }
                }
            }
        }
                        
        //Check the visibility of every biography elements that exists
        if(record.getPerson() != null) {
          //Address
            if(record.getPerson().getAddresses() != null) {
                Addresses addresses = record.getPerson().getAddresses();
                List<Address> list = addresses.getAddress();
                if(list != null) {
                    for(Address o : list) {
                        assertNotNull(o.getSource());
                        assertEquals(Visibility.PUBLIC, o.getVisibility());
                    }
                }
            }
            //Biography
            if(record.getPerson().getBiography() != null) {
                Biography b = record.getPerson().getBiography();
                if(b != null) {
                    assertNotNull(b.getVisibility());
                    assertEquals(Visibility.PUBLIC, b.getVisibility());
                }
            }
            //Emails
            if(record.getPerson().getEmails() != null) {
                Emails emails = record.getPerson().getEmails();
                List<Email> list = emails.getEmails();
                if(list != null) {
                    for(Email e : list) {
                        assertNotNull(e.getVisibility());
                        assertEquals(Visibility.PUBLIC, e.getVisibility());
                    }
                }
            }
            //External identifiers
            if(record.getPerson().getExternalIdentifiers() != null) {
                PersonExternalIdentifiers extIds = record.getPerson().getExternalIdentifiers();
                List<PersonExternalIdentifier> list = extIds.getExternalIdentifiers();
                if(list != null) {
                    for(PersonExternalIdentifier e : list) {
                        assertEquals(Visibility.PUBLIC, e.getVisibility());
                    }
                }
            }
            //Keywords
            if(record.getPerson().getKeywords() != null) {
                Keywords keywords = record.getPerson().getKeywords();
                List<Keyword> list = keywords.getKeywords();
                if(list != null) {
                    for(Keyword e : list) {
                        assertEquals(Visibility.PUBLIC, e.getVisibility());
                    }
                }
            }
            //Name
            if(record.getPerson().getName() != null) {
               Name name =  record.getPerson().getName();
               assertEquals(Visibility.PUBLIC, name.getVisibility());
            }
            //Other names
            if(record.getPerson().getOtherNames() != null) {
                OtherNames otherNames = record.getPerson().getOtherNames();
                List<OtherName> list = otherNames.getOtherNames();
                if(list != null) {
                    for(OtherName e : list) {
                        assertEquals(Visibility.PUBLIC, e.getVisibility());
                    }
                }
            }
            //Researcher urls
            if(record.getPerson().getResearcherUrls() != null) {
                ResearcherUrls rUrls = record.getPerson().getResearcherUrls();
                List<ResearcherUrl> list = rUrls.getResearcherUrls();
                if(list != null) {
                    for(ResearcherUrl e : list) {
                        assertEquals(Visibility.PUBLIC, e.getVisibility());
                    }
                }
            } 
        }
    }
    
    public String getAccessToken() throws InterruptedException, JSONException {
        return getAccessToken(getScopes(ScopePathType.READ_LIMITED));
    }
}