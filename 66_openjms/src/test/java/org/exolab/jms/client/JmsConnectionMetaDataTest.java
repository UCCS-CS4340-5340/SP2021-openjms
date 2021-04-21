package org.exolab.jms.client;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JmsConnectionMetaDataTest {

	static JmsConnectionMetaData JmsConnectionMetaData;
	
	@Before
	public void setUp() throws Exception {
		JmsConnectionMetaData = new JmsConnectionMetaData();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	//kh-38
	@Test
	public void testGetJMSVersion() {
		
		assertEquals(".1",JmsConnectionMetaData.getJMSVersion());
	}

	//kh-39
	@Test
	public void testGetJMSMajorVersion() {
		assertEquals(1, JmsConnectionMetaData.getJMSMajorVersion());
	}

	//kh-40
	@Test
	public void testGetJMSMinorVersion() {
		assertEquals(1, JmsConnectionMetaData.getJMSMinorVersion());
	}

	//kh-41
	@Test
	public void testGetJMSProviderName() {
		//This test passes but gives the console error: Error loading /org/exolab/jms/openjms.version: For input string: "@MAJOR_VERSION@"
		assertEquals("@TITLE@", JmsConnectionMetaData.getJMSProviderName());
	}

	//kh-42
	@Test
	public void testGetProviderVersion() {
		assertEquals("@VERSION@", JmsConnectionMetaData.getProviderVersion());
	}

	//kh-43
	@Test
	public void testGetProviderMajorVersion() {
		//This test passes but gives the console error: Error loading /org/exolab/jms/openjms.version: For input string: "@MAJOR_VERSION@"
		assertEquals(-1, JmsConnectionMetaData.getProviderMajorVersion());
	}

	//kh-44
	@Test
	public void testGetProviderMinorVersion() {
		assertEquals(-1, JmsConnectionMetaData.getProviderMinorVersion());
	}

//	@Test
//	public void testGetJMSXPropertyNames() {
//		fail("Not yet implemented");
//	}

}
