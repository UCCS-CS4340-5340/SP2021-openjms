package org.exolab.jms.authentication;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.mockito.Mockito;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.persistence.DatabaseService;
import org.exolab.jms.persistence.PersistenceAdapter;
import org.exolab.jms.service.ServiceException;


public class UserManagerTest {

	static UserManager UserManager;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//kh-32
	@Test
	public void testDoStartThrowsException() {
		
		final Configuration config = Mockito.mock(Configuration.class);
	    final DatabaseService database = Mockito.mock(DatabaseService.class);
	    
	    UserManager = new UserManager(config, database);
	    
		assertThrows(ServiceException.class, new ThrowingRunnable() {
			@Override
			public void run() throws Throwable {
				 UserManager.doStart();
			}
		});
	}

//	@Test
//	public void testDoStop() {
//		fail("Not yet implemented");
//	}

	//kh-33
	@Test
	public void testUserManagerNullConfig() {
		
		//final Configuration config = Mockito.mock(Configuration.class);
	    final DatabaseService database = Mockito.mock(DatabaseService.class);

	    assertThrows(IllegalArgumentException.class, new ThrowingRunnable() {
			@Override
			public void run() throws Throwable {
				 UserManager = new UserManager(null, database);
			}
		});
	    
	}
	
	//kh-34
	@Test
	public void testUserManagerNullDatabase() {
		
		final Configuration config = Mockito.mock(Configuration.class);
	    //final DatabaseService database = Mockito.mock(DatabaseService.class);

	    assertThrows(IllegalArgumentException.class, new ThrowingRunnable() {
			@Override
			public void run() throws Throwable {
				 UserManager = new UserManager(config, null);
			}
		});
	    
	}

	//kh-35
	@Test
	public void testCreateUserUserNull() {

		final Configuration config = Mockito.mock(Configuration.class);
	    final DatabaseService database = Mockito.mock(DatabaseService.class);
	    UserManager = new UserManager(config, database);
		User user = Mockito.mock(User.class);
		assertEquals(false, UserManager.createUser(user));
		
		
	}
	
	//kh-57
	@Test
	public void testUpdateUserNull() {
		
		User user = Mockito.mock(User.class);
		PersistenceAdapter adapter = Mockito.mock(PersistenceAdapter.class);
		DatabaseService _database = Mockito.mock(DatabaseService.class);
		boolean success = false;
		
		Mockito.when(_database.getAdapter()).thenReturn(adapter);
		
		
		assertEquals(success, UserManager.updateUser(user));
		
		
	}

	//kh-58
	@Test
	public void testDeleteUserNull() {
		
		User user = Mockito.mock(User.class);
		PersistenceAdapter adapter = Mockito.mock(PersistenceAdapter.class);
		DatabaseService _database = Mockito.mock(DatabaseService.class);
		boolean success = false;
		
		Mockito.when(_database.getAdapter()).thenReturn(adapter);
		
		
		assertEquals(success, UserManager.deleteUser(user));
	}

	//kh-36
	@Test
	public void testGetUser() {
		
		final Configuration config = Mockito.mock(Configuration.class);
	    final DatabaseService database = Mockito.mock(DatabaseService.class);
	    HashMap _userCache = Mockito.mock(HashMap.class);
	    User user = Mockito.mock(User.class);
	    UserManager = new UserManager(config, database);
	    //Mockito.when(_userCache.get(user.getUsername()).thenReturn(user);
	    Mockito.when(_userCache.get(user.getUsername())).thenReturn(null);
	    
	    assertEquals(null,UserManager.getUser(user));
	    
	}
	
	//kh-45
	@Test
	public void testUserNames() {
		
		//Not sure what this is actually supposed to test, since it's a java.util package?
		//I think this test will always fail because the output is always different
		final Configuration config = Mockito.mock(Configuration.class);
	    final DatabaseService database = Mockito.mock(DatabaseService.class);
	    UserManager = new UserManager(config, database);
		Iterator iterator = Mockito.mock(Iterator.class);
		assertEquals("java.util.HashMap$KeyIterator@7c22d4f", UserManager.userNames());
	}

//	@Test
//	public void testValidateUserBooleanFalse() {
//		
//		//This test says that the "config.getSecurityConfiguration()" doesn't return boolean... yet it's within an if-statement predicate? so idk
//		final Configuration config = Mockito.mock(Configuration.class);
//	    final DatabaseService database = Mockito.mock(DatabaseService.class);
//	    Mockito.when(config.getSecurityConfiguration()).thenReturn(false);
//	    UserManager = new UserManager(config, database);
//		String username = "username";
//		String password = "password";
//		assertEquals(false, UserManager.validateUser(username, password));
//	}

//	@Test
//	public void testInit() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testAddToUserCache() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRemoveFromUserCache() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRegisterConfiguredUsers() {
//		fail("Not yet implemented");
//	}
	
}
