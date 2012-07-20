/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.bridge;

import java.io.IOException;

import javax.faces.application.ResourceHandler;
import javax.faces.context.FacesContext;


/**
 * This class provides a compatibility layer that isolates differences between JSF1 and JSF2.
 *
 * @author  Neil Griffin
 */
public abstract class BridgePhaseCompatImpl implements BridgePhase {

	public void handleJSF2ResourceRequest(FacesContext facesContext) throws IOException {
		ResourceHandler resourceHandler = facesContext.getApplication().getResourceHandler();
		resourceHandler.handleResourceRequest(facesContext);
	}

	public boolean isJSF2ResourceRequest(FacesContext facesContext) {
		ResourceHandler resourceHandler = facesContext.getApplication().getResourceHandler();

		return resourceHandler.isResourceRequest(facesContext);
	}
}