package org.exolab.jms.client;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.jms.Destination;
import javax.jms.InvalidDestinationException;
import javax.jms.JMSException;
import javax.jms.Message;

import org.exolab.jms.message.DestinationImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.mockito.Mockito;

public class JmsMessageProducerTest {

	static JmsMessageProducer JmsMessageProducer;
	
//	@Before
//	public void setUp() throws Exception {
//		
//	}

	@After
	public void tearDown() throws Exception {
	}

	//kh-49
	@Test
	public void testJmsMessageProducerSessionNull() {
		
		final Destination destination = Mockito.mock(Destination.class);
		
		assertThrows(IllegalArgumentException.class, new ThrowingRunnable() {
			@Override
			public void run() throws Throwable {
				JmsMessageProducer JmsMessageProducerSessionNull = new JmsMessageProducer(null, destination);
			}
		});
	}

	//kh-50
	@Test
	public void testGetDestination() {

		JmsSession session = Mockito.mock(JmsSession.class);
		Destination destination = Mockito.mock(Destination.class);
		
		JmsMessageProducer = new JmsMessageProducer(session, destination);
		assertEquals(destination, JmsMessageProducer.getDestination());
	}

	//kh-51
	@Test
	public void testSetAndGetDisableMessageID() {
		JmsSession session = Mockito.mock(JmsSession.class);
		Destination destination = Mockito.mock(Destination.class);
		
		boolean value = true;
		JmsMessageProducer = new JmsMessageProducer(session, destination);
		JmsMessageProducer.setDisableMessageID(value);
		assertEquals(value, JmsMessageProducer.getDisableMessageID());
	}


	//kh-52
	@Test
	public void testSetAndGetDisableMessageTimestamp() {
		
		JmsSession session = Mockito.mock(JmsSession.class);
		Destination destination = Mockito.mock(Destination.class);
		
		boolean value = false;
		JmsMessageProducer = new JmsMessageProducer(session, destination);
		JmsMessageProducer.setDisableMessageTimestamp(value);
		assertEquals(value, JmsMessageProducer.getDisableMessageTimestamp());
	}

	//kh-53
	@Test
	public void testSetAndGetDeliveryMode() {
		
		int deliveryMode = 1;
		JmsSession session = Mockito.mock(JmsSession.class);
		Destination destination = Mockito.mock(Destination.class);
		
		JmsMessageProducer = new JmsMessageProducer(session, destination);
		JmsMessageProducer.setDeliveryMode(deliveryMode);
		assertEquals(deliveryMode, JmsMessageProducer.getDeliveryMode());
		
	}

	//kh-54
	@Test
	public void testSetAndGetPriority() {
		int priority = 1;
		JmsSession session = Mockito.mock(JmsSession.class);
		Destination destination = Mockito.mock(Destination.class);
		
		JmsMessageProducer = new JmsMessageProducer(session, destination);
		JmsMessageProducer.setPriority(priority);
		assertEquals(priority, JmsMessageProducer.getPriority());
	}

	//kh-55
	@Test
	public void testSetAndGetTimeToLive() {
		long timeToLive = 1;
		JmsSession session = Mockito.mock(JmsSession.class);
		Destination destination = Mockito.mock(Destination.class);
		
		JmsMessageProducer = new JmsMessageProducer(session, destination);
		JmsMessageProducer.setTimeToLive(timeToLive);
		assertEquals(timeToLive, JmsMessageProducer.getTimeToLive());
		
	}


//	@Test
//	public void testSendDestinationMessageIntIntLong() throws JMSException {
//	
//		int deliveryMode = 1;
//		int priority = 1;
//		long timeToLive = 1;
//		JmsSession session = Mockito.mock(JmsSession.class);
//		Destination destination = Mockito.mock(Destination.class);
//		Message message = Mockito.mock(Message.class);
//		
//		JmsMessageProducer = new JmsMessageProducer(session, destination);
//		
//		JmsMessageProducer.send(destination, message, deliveryMode, priority, timeToLive);
//		
//	}

	//kh-56
	@Test
	public void testSendDestinationMessageIntIntLongNullDestination() throws JMSException {
		
		final int deliveryMode = 1;
		final int priority = 1;
		final long timeToLive = 1;
		JmsSession session = Mockito.mock(JmsSession.class);
		final Destination destination = Mockito.mock(Destination.class);
		final Message message = Mockito.mock(Message.class);
		
		JmsMessageProducer = new JmsMessageProducer(session, destination);
		
		assertThrows(InvalidDestinationException.class, new ThrowingRunnable() {
			@Override
			public void run() throws Throwable {
				JmsMessageProducer.send(destination, message, deliveryMode, priority, timeToLive);

			}
		});
		
	}
	
//	@Test
//	public void testSendDestinationMessageIntIntLongMessageNull() throws JMSException {
//	
//		int deliveryMode = 1;
//		int priority = 1;
//		long timeToLive = 1;
//		
//		JmsDestination destination = new JmsDestination();
//		JmsSession session = Mockito.mock(JmsSession.class);
//		//Destination destination = Mockito.mock(Destination.class);
//		//Message message = Mockito.mock(Message.class);
//		
//		JmsMessageProducer = new JmsMessageProducer(session, destination);
//		
//		JmsMessageProducer.send(destination, null, deliveryMode, priority, timeToLive);
//		
//	}

}
