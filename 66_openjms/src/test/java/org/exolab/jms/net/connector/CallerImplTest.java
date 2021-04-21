package org.exolab.jms.net.connector;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.exolab.jms.net.uri.URI;


//Test written by Kathryn Hines 3/9/2021
//Mockito cannot mock URI class because final class??

public class CallerImplTest {

	CallerImpl CallerImpl;
	
	@Before
	public void setUp() throws Exception {
		
		//mock(URI.class);
		
		URI _localURI = Mockito.mock(URI.class);
		URI _remoteURI = Mockito.mock(URI.class);
		
		CallerImpl = new CallerImpl(_localURI, _remoteURI);
		
	}

	@After 
	public void tearDown() throws Exception {
	}

//	//kh-16
//	@Test
//	public void testGetRemoteURI() throws Exception {
//		assertEquals("www.testing.com", CallerImpl.getRemoteURI());
//		
//	}
//	
//	//kh-17
//	@Test
//	public void testGetLocalURI() throws Exception {
//		assertEquals("www.testing1.com", CallerImpl.getLocalURI());
//		
//	}

}
