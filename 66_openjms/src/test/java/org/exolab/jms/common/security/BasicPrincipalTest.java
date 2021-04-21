package org.exolab.jms.common.security;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.mockito.Mockito;

public class BasicPrincipalTest {

	static BasicPrincipal BasicPrincipal;
	static String name = "Bob";
	static String password = "thisIsABadPassword";
	
	
	@Before
	public void setUp() throws Exception {
		
		BasicPrincipal = new BasicPrincipal(name, password);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	//kh-18
	@Test
	public void testHashCode() {
		
		assertEquals(66965, BasicPrincipal.hashCode());
	}

	//kh-19
	@Test
	public void testBasicPrincipalNull() {
		
		final String name = null;
		final String password = null;
		
		assertThrows(IllegalArgumentException.class, new ThrowingRunnable() {
			@Override
			public void run() throws Throwable {
				BasicPrincipal BasicPrincipalNull = new BasicPrincipal(name, password);
			}
		});
	}
	
	//kh-20
	@Test
	public void testGetName() {
		
		assertEquals(name, BasicPrincipal.getName());
	}

	//kh-21
	@Test
	public void testGetPassword() {
		
		assertEquals(password, BasicPrincipal.getPassword());
	}

	//kh-22
	@Test
	public void testEqualsBooleanFalse() {
		
		Object another = Mockito.mock(Object.class);
		assertEquals(false, BasicPrincipal.equals(another));
	}
	
	//kh-23
		@Test
		public void testEqualsBooleanTrue() {
			
			//Object another = Mockito.mock(Object.class);
			assertEquals(true, BasicPrincipal.equals(BasicPrincipal));
		}
	

}
