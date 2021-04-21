/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.messagemgr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.jms.InvalidDestinationException;
import javax.jms.JMSException;
import org.exolab.jms.client.JmsDestination;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.message.MessageImpl;
import org.exolab.jms.message.ObjectMessageImpl;
import org.exolab.jms.messagemgr.MessageMgr;
import org.exolab.jms.persistence.DatabaseService;
import org.exolab.jms.service.ServiceException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestMessageMgr {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      DatabaseService databaseService0 = new DatabaseService(configuration0);
      MessageMgr messageMgr0 = new MessageMgr(databaseService0);
      messageMgr0.removeEventListener((JmsDestination) null);
      assertNull(messageMgr0.getName());
  }

  @Test
  public void test1()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      DatabaseService databaseService0 = new DatabaseService(configuration0);
      MessageMgr messageMgr0 = new MessageMgr(databaseService0);
      messageMgr0.doStop();
      assertNull(messageMgr0.getName());
  }

  @Test
  public void test2()  throws Throwable  {
      MessageMgr messageMgr0 = null;
      try {
        messageMgr0 = new MessageMgr((DatabaseService) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'database' is null
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      DatabaseService databaseService0 = new DatabaseService(configuration0);
      MessageMgr messageMgr0 = new MessageMgr(databaseService0);
      ObjectMessageImpl objectMessageImpl0 = new ObjectMessageImpl();
      try {
        messageMgr0.prepare((MessageImpl) objectMessageImpl0);
        fail("Expecting exception: InvalidDestinationException");
      } catch(InvalidDestinationException e) {
        /*
         * Message has no destination
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      DatabaseService databaseService0 = new DatabaseService(configuration0);
      MessageMgr messageMgr0 = new MessageMgr(databaseService0);
      try {
        messageMgr0.add((MessageImpl) null);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Null message
         */
      }
  }
}