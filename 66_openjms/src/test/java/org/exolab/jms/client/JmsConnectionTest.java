package org.exolab.jms.client;

import static org.junit.Assert.*;

import javax.jms.ExceptionListener;
import javax.jms.JMSException;

import org.exolab.jms.server.ServerConnection;
import org.exolab.jms.server.ServerConnectionFactory;
import org.exolab.jms.service.ServiceException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.Mockito;

public class JmsConnectionTest {

	static JmsConnection JmsConnection;
	String _clientId = "_clientID";
	String username = "username";
	String password = "password";
	long connectionID = 12345;
	
	@Before
	public void setUp() throws Exception {
		
		
		
		JmsConnectionFactory factory = Mockito.mock(JmsConnectionFactory.class);
		ServerConnection _connection = Mockito.mock(ServerConnection.class);
		JmsServerStubIfc _proxy = Mockito.mock(JmsServerStubIfc.class);
		ServerConnectionFactory ServerConnectionFactory = Mockito.mock(ServerConnectionFactory.class);
		
		Mockito.when(_connection.getConnectionId()).thenReturn(connectionID);
		Mockito.when(ServerConnectionFactory.createConnection(_clientId, username, password)).thenReturn(_connection);
		Mockito.when(factory.getProxy()).thenReturn(_proxy);
		
		JmsConnection = new JmsConnection(factory, _clientId, username, password);
		
		
	}
	

	@After
	public void tearDown() throws Exception {
	}

	//kh-37
	@Test
	public void testJmsConnectionFactoryNull() throws JMSException {
		
		assertThrows(IllegalArgumentException.class, new ThrowingRunnable() {
			@Override
			public void run() throws Throwable {
				JmsConnection = new JmsConnection(null, "clientID", "username", "password");
			}
		});
		
	}
	
//	@Test
//	public void testJmsConnection() throws JMSException {
//	
//
//		//assertEquals(connectionID, JmsConnection.getConnectionId());
//	}
//
//	@Test
//	public void testGetConnectionId() throws JMSException {
//		
//		String _clientId = "_clientID";
//		String username = "username";
//		String password = "password";
//		long _connectionID = 1234;
//		JmsConnectionFactory factory = Mockito.mock(JmsConnectionFactory.class);
//		ServerConnection _connection = Mockito.mock(ServerConnection.class);
//		Mockito.when(factory.getProxy().createConnection(_clientId, username, password)).thenReturn(_connection).thenReturn(_connection);
//		Mockito.when(_connection.getConnectionId()).thenReturn(_connectionID);
//		JmsConnection = new JmsConnection(factory, _clientId, username, password);
//		
//		assertEquals(_connectionID,JmsConnection.getConnectionId());
//	}

	//kh-46
	@Test
	public void testSetAndGetClientID() throws JMSException {
		
		JmsConnection.setClientID(_clientId);
		
		assertEquals(_clientId, JmsConnection.getClientID());
	}

	//kh-47
	@Test
	public void testGetMetaData() throws JMSException {
		
		//This test is erroring because of the this._connection caused by the constructor... But would this test even work?
		//Two separate objects, one created by me here and one created by the JmsConnection class
		//If I could actually run this test I could tweak it to make it work for sure
		JmsConnectionMetaData _metaData = new JmsConnectionMetaData();
		assertEquals(_metaData, JmsConnection.getMetaData());
		
	}

	//kh-48
	@Test
	public void testSetAndGetExceptionListener() throws JMSException {
		
		ExceptionListener listener = Mockito.mock(ExceptionListener.class);
		JmsConnection.setExceptionListener(listener);
		assertEquals(listener, JmsConnection.getExceptionListener());
	}


//	@Test
//	public void testNotifyExceptionListener() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testStart() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testStop() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testClose() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCreateSession() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCreateConnectionConsumer() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCreateDurableConnectionConsumer() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetServerConnection() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testAddSession() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRemoveSession() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testIsStopped() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetModified() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeleteTemporaryDestination() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testEnsureOpen() {
//		fail("Not yet implemented");
//	}
//
}
