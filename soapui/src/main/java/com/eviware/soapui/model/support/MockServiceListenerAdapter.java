/*
 *  SoapUI, copyright (C) 2004-2012 smartbear.com
 *
 *  SoapUI is free software; you can redistribute it and/or modify it under the
 *  terms of version 2.1 of the GNU Lesser General Public License as published by 
 *  the Free Software Foundation.
 *
 *  SoapUI is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 *  even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 *  See the GNU Lesser General Public License for more details at gnu.org.
 */

package com.eviware.soapui.model.support;

import com.eviware.soapui.model.mock.MockOperation;
import com.eviware.soapui.model.mock.MockResponse;
import com.eviware.soapui.model.mock.MockServiceListener;

/**
 * Adapter for MockServiceListeners
 * 
 * @author ole.matzura
 */

public class MockServiceListenerAdapter implements MockServiceListener
{
	public void mockOperationAdded( MockOperation operation )
	{
	}

	public void mockOperationRemoved( MockOperation operation )
	{
	}

	public void mockResponseAdded( MockResponse request )
	{
	}

	public void mockResponseRemoved( MockResponse request )
	{
	}
}