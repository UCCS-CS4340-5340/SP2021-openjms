package org.exolab.jms.authentication;

import static org.junit.Assert.*;

import java.io.ObjectInput;
import java.security.Principal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class AuthenticationMgrTest {

	static AuthenticationMgr AuthenticationMgr;
	
	
	@Before
	public void setUp() throws Exception {		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	//kh-23
	@Test
	public void testAddUser() {
		
		UserManager _users = Mockito.mock(UserManager.class);
		AuthenticationMgr = new AuthenticationMgr(_users);
		User user = Mockito.mock(User.class);
		Mockito.when(_users.createUser(user)).thenReturn(true);
		boolean result = AuthenticationMgr.addUser(user);
		assertEquals(true,result);
	}	
	
	//kh-24
	@Test
	public void testRemoveUser() {
		
		UserManager _users = Mockito.mock(UserManager.class);
		AuthenticationMgr = new AuthenticationMgr(_users);
		User user = Mockito.mock(User.class);
		Mockito.when(_users.deleteUser(user)).thenReturn(true);
		boolean result = AuthenticationMgr.removeUser(user);
		assertEquals(true,result);
	}

	//kh-25
	@Test
	public void testUpdateUser() {
		
		UserManager _users = Mockito.mock(UserManager.class);
		AuthenticationMgr = new AuthenticationMgr(_users);
		User user = Mockito.mock(User.class);
		Mockito.when(_users.updateUser(user)).thenReturn(true);
		boolean result = AuthenticationMgr.updateUser(user);
		assertEquals(true,result);
	}

	//kh-26
	@Test
	public void testValidateUser() {
		
		String username = "username";
		String password = "password";
		UserManager _users = Mockito.mock(UserManager.class);
		AuthenticationMgr = new AuthenticationMgr(_users);
		Mockito.when(_users.validateUser(username, password)).thenReturn(true);
		boolean result = AuthenticationMgr.validateUser(username, password);
		assertEquals(true,result);
	}

	
//	@Test
//	public void testAuthenticate() {
//		
//		String username = "username";
//		String password = "password";
//		Principal principal = Mockito.mock(Principal.class);
//		UserManager _users = Mockito.mock(UserManager.class);
//		Mockito.when(_users.validateUser(username, password)).thenReturn(true);
//		AuthenticationMgr = new AuthenticationMgr(_users);
//		boolean result = AuthenticationMgr.authenticate(principal);
//		assertEquals(true,result);
//
//	}

}
