/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.migration.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.util.ArrayList;
import javax.jms.JMSException;
import javax.jms.Message;
import org.apache.commons.dbcp.PoolingConnection;
import org.exolab.jms.message.StreamMessageImpl;
import org.exolab.jms.persistence.PersistenceException;
import org.exolab.jms.tools.migration.proxy.DestinationStore;
import org.exolab.jms.tools.migration.proxy.StreamMessageHandler;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestStreamMessageHandler {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PoolingConnection poolingConnection0 = new PoolingConnection((Connection) null);
      StreamMessageHandler streamMessageHandler0 = new StreamMessageHandler((DestinationStore) null, (Connection) poolingConnection0);
      StreamMessageImpl streamMessageImpl0 = (StreamMessageImpl)streamMessageHandler0.newMessage();
      ArrayList<Object> arrayList0 = (ArrayList<Object>)streamMessageHandler0.getBody((Message) streamMessageImpl0);
      streamMessageHandler0.setBody((Object) arrayList0, (Message) streamMessageImpl0);
      assertEquals("StreamMessage", streamMessageImpl0.getJMSType());
  }

  @Test
  public void test1()  throws Throwable  {
      PoolingConnection poolingConnection0 = new PoolingConnection((Connection) null);
      StreamMessageHandler streamMessageHandler0 = new StreamMessageHandler((DestinationStore) null, (Connection) poolingConnection0);
      String string0 = streamMessageHandler0.getType();
      assertEquals("StreamMessage", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      PoolingConnection poolingConnection0 = new PoolingConnection((Connection) null);
      StreamMessageHandler streamMessageHandler0 = new StreamMessageHandler((DestinationStore) null, (Connection) poolingConnection0);
      StreamMessageImpl streamMessageImpl0 = (StreamMessageImpl)streamMessageHandler0.newMessage();
      try {
        streamMessageHandler0.setBody((Object) null, (Message) streamMessageImpl0);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Expected non-null body for StreamMessage with JMSMessageID=null
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      StreamMessageHandler streamMessageHandler0 = new StreamMessageHandler((DestinationStore) null, (Connection) null);
      // Undeclared exception!
      try {
        streamMessageHandler0.setBody((Object) "Alias", (Message) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
