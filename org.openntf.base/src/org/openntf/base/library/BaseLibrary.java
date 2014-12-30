package org.openntf.base.library;

import com.ibm.xsp.library.AbstractXspLibrary;

public class BaseLibrary extends AbstractXspLibrary {

	public BaseLibrary() {
	}

	@Override
	public String getLibraryId() {
		return "org.openntf.base.library";
	}

	@Override
	public String getPluginId() {
		return "org.openntf.base";
	}
	
	public String[] getDependencies() {
		return new String[] { "com.ibm.xsp.core.library", // $NON-NLS-1$
				"com.ibm.xsp.extsn.library", // $NON-NLS-1$
				"com.ibm.xsp.domino.library", // $NON-NLS-1$
				"com.ibm.xsp.designer.library" // $NON-NLS-1$
		};
	}
}
