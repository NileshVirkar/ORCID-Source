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
package org.orcid.core.manager.read_only.impl;

import java.util.List;

import javax.annotation.Resource;

import org.orcid.core.adapter.JpaJaxbExternalIdentifierAdapter;
import org.orcid.core.manager.read_only.ExternalIdentifierManagerReadOnly;
import org.orcid.jaxb.model.record_v2.PersonExternalIdentifier;
import org.orcid.jaxb.model.record_v2.PersonExternalIdentifiers;
import org.orcid.persistence.dao.ExternalIdentifierDao;
import org.orcid.persistence.jpa.entities.ExternalIdentifierEntity;

public class ExternalIdentifierManagerReadOnlyImpl extends ManagerReadOnlyBaseImpl implements ExternalIdentifierManagerReadOnly {
    
    @Resource
    protected JpaJaxbExternalIdentifierAdapter jpaJaxbExternalIdentifierAdapter;
    
    protected ExternalIdentifierDao externalIdentifierDao;

    public void setExternalIdentifierDao(ExternalIdentifierDao externalIdentifierDao) {
        this.externalIdentifierDao = externalIdentifierDao;
    }

    @Override
    public PersonExternalIdentifiers getPublicExternalIdentifiers(String orcid) {
        List<ExternalIdentifierEntity> externalIdentifiers = externalIdentifierDao.getPublicExternalIdentifiers(orcid, getLastModified(orcid));
        return jpaJaxbExternalIdentifierAdapter.toExternalIdentifierList(externalIdentifiers);
    }

    @Override
    public PersonExternalIdentifiers getExternalIdentifiers(String orcid) {
        List<ExternalIdentifierEntity> externalIdentifiers = externalIdentifierDao.getExternalIdentifiers(orcid, getLastModified(orcid));
        return jpaJaxbExternalIdentifierAdapter.toExternalIdentifierList(externalIdentifiers);
    }

    @Override
    public PersonExternalIdentifier getExternalIdentifier(String orcid, Long id) {  
        ExternalIdentifierEntity entity = externalIdentifierDao.getExternalIdentifierEntity(orcid, id);
        return jpaJaxbExternalIdentifierAdapter.toExternalIdentifier(entity);
    }
}
