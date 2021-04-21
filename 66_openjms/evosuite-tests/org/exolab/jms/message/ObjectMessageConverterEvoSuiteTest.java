/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.message;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.jms.JMSException;
import javax.jms.Message;
import org.exolab.jms.message.MessageImpl;
import org.exolab.jms.message.ObjectMessageConverter;
import org.exolab.jms.message.ObjectMessageImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ObjectMessageConverterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ObjectMessageConverter objectMessageConverter0 = new ObjectMessageConverter();
      ObjectMessageImpl objectMessageImpl0 = (ObjectMessageImpl)objectMessageConverter0.create();
      assertEquals(0L, objectMessageImpl0.getSequenceNumber());
  }

  @Test
  public void test1()  throws Throwable  {
      ObjectMessageConverter objectMessageConverter0 = new ObjectMessageConverter();
      MessageImpl messageImpl0 = new MessageImpl();
      // Undeclared exception!
      try {
        objectMessageConverter0.populate((Message) messageImpl0, (Message) messageImpl0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * org.exolab.jms.message.MessageImpl cannot be cast to javax.jms.ObjectMessage
         */
      }
  }
}