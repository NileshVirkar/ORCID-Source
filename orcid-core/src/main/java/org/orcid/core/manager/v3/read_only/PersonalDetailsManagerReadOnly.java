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
package org.orcid.core.manager.v3.read_only;

import org.orcid.jaxb.model.v3.dev1.record.PersonalDetails;

/**
* 
* @author Angel Montenegro
* 
*/
public interface PersonalDetailsManagerReadOnly extends ManagerReadOnlyBase {
    PersonalDetails getPersonalDetails(String orcid);

    PersonalDetails getPublicPersonalDetails(String orcid);
}
