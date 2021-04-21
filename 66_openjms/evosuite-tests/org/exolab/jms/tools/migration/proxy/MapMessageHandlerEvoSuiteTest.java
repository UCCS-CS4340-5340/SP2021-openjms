/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.migration.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.util.HashMap;
import javax.jms.JMSException;
import javax.jms.Message;
import org.exolab.jms.message.MapMessageImpl;
import org.exolab.jms.persistence.PersistenceException;
import org.exolab.jms.tools.migration.proxy.DestinationStore;
import org.exolab.jms.tools.migration.proxy.MapMessageHandler;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MapMessageHandlerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MapMessageHandler mapMessageHandler0 = new MapMessageHandler((DestinationStore) null, (Connection) null);
      MapMessageImpl mapMessageImpl0 = (MapMessageImpl)mapMessageHandler0.newMessage();
      HashMap<Object, Object> hashMap0 = (HashMap<Object, Object>)mapMessageHandler0.getBody((Message) mapMessageImpl0);
      mapMessageHandler0.setBody((Object) hashMap0, (Message) mapMessageImpl0);
      assertEquals(true, hashMap0.isEmpty());
  }

  @Test
  public void test1()  throws Throwable  {
      MapMessageHandler mapMessageHandler0 = new MapMessageHandler((DestinationStore) null, (Connection) null);
      String string0 = mapMessageHandler0.getType();
      assertEquals("MapMessage", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      MapMessageHandler mapMessageHandler0 = new MapMessageHandler((DestinationStore) null, (Connection) null);
      mapMessageHandler0.setBody((Object) null, (Message) null);
      assertEquals("MapMessage", mapMessageHandler0.getType());
  }

  @Test
  public void test3()  throws Throwable  {
      MapMessageHandler mapMessageHandler0 = new MapMessageHandler((DestinationStore) null, (Connection) null);
      MapMessageImpl mapMessageImpl0 = (MapMessageImpl)mapMessageHandler0.newMessage();
      try {
        mapMessageHandler0.setBody((Object) "Table", (Message) mapMessageImpl0);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Expected Map body for MapMessage with JMSMessageID=null but got type java.lang.String
         */
      }
  }
}
