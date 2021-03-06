/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Connection;
import javax.jms.JMSException;
import org.exolab.jms.message.MessageImpl;
import org.exolab.jms.message.ObjectMessageImpl;
import org.exolab.jms.persistence.Destinations;
import org.exolab.jms.persistence.Messages;
import org.exolab.jms.persistence.PersistenceException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MessagesEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Messages messages0 = new Messages((Destinations) null);
      // Undeclared exception!
      try {
        messages0.removeExpiredMessages((Connection) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Messages messages0 = new Messages((Destinations) null);
      ObjectMessageImpl objectMessageImpl0 = new ObjectMessageImpl();
      byte[] byteArray0 = messages0.serialize((MessageImpl) objectMessageImpl0);
      assertNotNull(byteArray0);
  }

  @Test
  public void test2()  throws Throwable  {
      Messages messages0 = new Messages((Destinations) null);
      try {
        messages0.deserialize((byte[]) null);
        fail("Expecting exception: PersistenceException");
      } catch(PersistenceException e) {
        /*
         * Cannot de-serialize null message blob
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Messages messages0 = new Messages((Destinations) null);
      byte[] byteArray0 = new byte[1];
      try {
        messages0.deserialize(byteArray0);
        fail("Expecting exception: PersistenceException");
      } catch(PersistenceException e) {
        /*
         * Failed to de-serialize message
         */
      }
  }
}
