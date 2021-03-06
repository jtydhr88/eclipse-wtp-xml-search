/**
 *  Copyright (c) 2013-2014 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package org.apache.struts2.ide.core.internal;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.struts2.ide.core.IStruts2Model;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IStorage;
import org.eclipse.wst.xml.search.editor.util.JdtUtils;

public class Struts2Model implements IStruts2Model {

	private static final IStruts2Model INSTANCE = new Struts2Model();

	public static final String STRUTS_DEFAULT_XML = "struts-default.xml";
	public static final String DEFAULT_XML = "default.xml";

	public static IStruts2Model getInstance() {
		return INSTANCE;
	}

	public IStorage getStrutsDefaultFromStruts2CoreJAR(IProject project) {
		return JdtUtils.getJavaResourceFileFromBinary(project, "struts2-core",
				null, STRUTS_DEFAULT_XML);
	}

	public IStorage getDefaultFromXWorkCoreJAR(IProject project) {
		return JdtUtils.getJavaResourceFileFromBinary(project, "xwork-core",
				"com.opensymphony.xwork2.validator.validators", DEFAULT_XML);
	}
	
	public IStorage[] getStrutsXMLFromJAR(IProject project) {		
		return JdtUtils.getJavaResourcesFileFromBinary(project, "struts", null, "struts");
	}
}
