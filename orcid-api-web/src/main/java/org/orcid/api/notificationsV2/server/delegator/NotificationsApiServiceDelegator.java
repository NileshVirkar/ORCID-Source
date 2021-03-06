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
package org.orcid.api.notificationsV2.server.delegator;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.orcid.core.exception.OrcidNotificationAlreadyReadException;

/**
 * 
 * @author Will Simpson
 *
 */
public interface NotificationsApiServiceDelegator<NOTIFICATIONPERMISSION> {

    Response viewStatusText();

    Response findPermissionNotifications(String orcid);
    
    Response findPermissionNotification(String orcid, Long id);
    
    Response flagNotificationAsArchived(String orcid, Long id) throws OrcidNotificationAlreadyReadException;

    Response addPermissionNotification(UriInfo uriInfo, String orcid, NOTIFICATIONPERMISSION notification);

}
