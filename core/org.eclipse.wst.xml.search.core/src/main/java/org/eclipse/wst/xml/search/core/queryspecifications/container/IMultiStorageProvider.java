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
package org.eclipse.wst.xml.search.core.queryspecifications.container;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;

/**
 * 
 * Provider to get several {@link IStorage} (files coming from JAR....) used to
 * search DOM Document to use to search DOM Nodes.
 * 
 */
public interface IMultiStorageProvider {

	public static final IStorage[] EMPTY_STORAGE = new IStorage[0];

	/**
	 * Returns array of {@link IStorage} (files coming from JAR....) used to
	 * search DOM Document to use to search DOM Nodes. If null is returned,
	 * search is stopped.
	 * 
	 * @param selectedNode
	 *            the selected node which have launch the search.
	 * @param resource
	 *            the owner resource file of the selected node.
	 * @return
	 */
	IStorage[] getStorages(Object selectedNode, IResource resource);
}
