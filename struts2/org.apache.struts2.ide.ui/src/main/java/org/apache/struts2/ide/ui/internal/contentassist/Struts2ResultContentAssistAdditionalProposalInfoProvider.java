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
package org.apache.struts2.ide.ui.internal.contentassist;

import org.apache.struts2.ide.core.Struts2Constants;
import org.apache.struts2.ide.ui.internal.ImageResource;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMElement;
import org.w3c.dom.Node;

public class Struts2ResultContentAssistAdditionalProposalInfoProvider
		extends Struts2ContentAssistAdditionalProposalInfoProvider implements
		Struts2Constants {

	private static final String TRUE = "true";

	public Image getImage(Node node) {		
		return ImageResource.getImage(ImageResource.IMG_RESULT_OBJ);
	}

	@Override
	protected String doGetTextInfo(IDOMElement element) {
		StringBuilder buf = new StringBuilder();
		buf.append("<b>Result name:</b> ");
		buf.append(element.getAttribute(NAME_ATTR));
		buf.append("<br><b>Result type:</b> ");
		buf.append(element.getAttribute(TYPE_ATTR));		
		buf.append("<br><b>File:</b> ");
		String baseLocation = element.getModel().getBaseLocation();
		buf.append(baseLocation);
		return buf.toString();
	}

}
