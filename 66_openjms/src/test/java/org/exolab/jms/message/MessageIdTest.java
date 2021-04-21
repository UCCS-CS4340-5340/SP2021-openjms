package org.exolab.jms.message;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.ObjectInput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.mockito.Mockito;

public class MessageIdTest {

	//This entire test class was created by Kathryn Hines, 3/10/2021
	
	static MessageId MessageId;
	
	@Before
	public void setUp() throws Exception {
		
		String fakeID = "1234";
		
		MessageId = new MessageId(fakeID);
	}

	@After
	public void tearDown() throws Exception {
	}

	//kh-1
	@Test
	public void testGetID() {
		
		assertEquals("1234", MessageId.getId());
		
	}
	
	//kh-2
	@Test
	public void testHashCode() {
		
		assertEquals(1509442, MessageId.hashCode());
		
	}
	
	//kh-3
	@Test
	public void testToString() {
		
		//Test is failing, obviously
		//Make this test better...
		assertEquals("jellybean", MessageId.toString());
		
	}
	
	//kh-4
	@Test
	public void testEquals() {
		
		//What is the equals method even trying to do??
		Object object = new Object();
		assertEquals(true, MessageId.equals(object));
		
	}
	
	//kh-5
	@Test
	public void testGetNull() {
		
		assertEquals("ID:0", org.exolab.jms.message.MessageId.getNull());
		
	}
	 
	//kh-6
	@Test
	public void testCreate() {
		
		//This is technically an integration test, in that the "equals" class calls the UUID class, which calls UUID generator
		//This test should always fail... Because UUID creates unique identifiers
		assertEquals("ID:1234", org.exolab.jms.message.MessageId.create());
		
	}
	
	//kh-7
	@Test
	public void testReadExternalVersion2() throws IOException, ClassNotFoundException {
		
		long version = 2;
		ObjectInput in = Mockito.mock(ObjectInput.class);
		Mockito.when(in.readLong()).thenReturn(version);
		Mockito.when(in.readUTF()).thenReturn("newID");
		MessageId.readExternal(in);
		
		assertEquals("newID", MessageId.getId());
		
		
	}
	
	//kh-8
	@Test
	public void testReadExternalVersion1() throws IOException, ClassNotFoundException {
		
		long version = 1; 
		ObjectInput in = Mockito.mock(ObjectInput.class);
		Mockito.when(in.readLong()).thenReturn(version);
		Mockito.when(in.readObject()).thenReturn("newID");
		MessageId.readExternal(in);
		
		assertEquals("ID:newID", MessageId.getId());
		
	}
	
	//kh-9
	@Test
	public void testReadExternalIncorrectVersionBranch() throws IOException, ClassNotFoundException {
		
		long version = 4; //make the version an incompatible version 
		final ObjectInput in = Mockito.mock(ObjectInput.class);
		Mockito.when(in.readLong()).thenReturn(version);
		
		assertThrows(IOException.class, new ThrowingRunnable() {
			@Override
			public void run() throws Throwable {
				MessageId.readExternal(in);
			}
		});
		
	}
//	//kh-10
//	@Test
//	public void testWriteExternal() throws IOException, ClassNotFoundException {
//		//Not sure how to get this test method to work... How would you test writeExternal
//		long version = 2;
//		ObjectInput out = Mockito.mock(ObjectInput.class);
//		Mockito.when(out.writeLong(serialVersionUID)).thenReturn(version);
//		Mockito.when(in.readUTF()).thenReturn("newID");
//		MessageId.readExternal(out);
//		
//		assertEquals("newID", MessageId.getId());
//		
//		
//	}
	

}
