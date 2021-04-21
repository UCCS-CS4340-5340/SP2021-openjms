package org.exolab.jms.authentication;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserTest {

	static User user;
	
	String username = "username";
	String password = "badPassword";
	
	@Before
	public void setUp() throws Exception {
		
		user = new User(username,password);
		
	}

	//kh-27
	@Test
	public void testGetUsername() {
		
		assertEquals(username, user.getUsername());
	}

	//kh-28
	@Test
	public void testSetUsername() {

		String newUsername = "newUsername";
		user.setUsername(newUsername);
		assertEquals(newUsername, user.getUsername());
	}

	//kh-29
	@Test
	public void testGetPassword() {
		assertEquals(password, user.getPassword());
	}

	//kh-30
	@Test
	public void testSetPassword() {
		
		String newPassword = "newPassword";
		user.setPassword(newPassword);
		assertEquals(newPassword, user.getPassword());
	}

	//kh-31
	@Test
	public void testToString() {

		assertEquals(username, user.toString());
	}

}
