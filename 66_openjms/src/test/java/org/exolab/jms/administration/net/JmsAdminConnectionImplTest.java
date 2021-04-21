package org.exolab.jms.administration.net;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//Test created by Kathryn Hines on 3/9/2021
//Test errors out because it "Failed to get registry service for URL. Which is obvious, but there's an interface in the constructor of JmsAdminConnectionImpl that needs to be mocked out, probably, but WHERE? Class has a very complicated constructor.
//find another class with a less complicated constructor to practice mocking

public class JmsAdminConnectionImplTest {
	static JmsAdminConnectionImpl JmsAdminConnectionImpl;
	
	//Testing class "JmsAdminConnectionImpl"
	@Before
	public void setUp() throws Exception {
		 
		JmsAdminConnectionImpl = new JmsAdminConnectionImpl("www.testServerURL.com", "username", "password1");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	//kh-15
	@Test
	public void testDurableCustomerExists() throws Exception{
		//This method tests durableCustomerExists method in JmsAdminConnectionImpl
		assertEquals(false, JmsAdminConnectionImpl.durableConsumerExists("Bob Customer"));
		
		
	}
	
//	@Test
//	public void TestJmsAdminConnectionImplThrowsException() {
//		
//		
//		
//		
//	}

}
