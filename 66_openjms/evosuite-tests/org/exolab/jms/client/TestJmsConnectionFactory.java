/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectOutput;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import javax.jms.JMSException;
import javax.naming.Reference;
import org.exolab.jms.client.JmsConnection;
import org.exolab.jms.client.JmsConnectionFactory;
import org.exolab.jms.client.JmsServerStubIfc;
import org.exolab.jms.client.JmsXAConnectionFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestJmsConnectionFactory {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      JmsXAConnectionFactory jmsXAConnectionFactory0 = new JmsXAConnectionFactory("", (Map) hashMap0, (Map) hashMap0);
      jmsXAConnectionFactory0.onException((JMSException) null);
  }

  @Test
  public void test1()  throws Throwable  {
      JmsConnectionFactory jmsConnectionFactory0 = new JmsConnectionFactory();
      jmsConnectionFactory0.addConnection((JmsConnection) null);
  }

  @Test
  public void test2()  throws Throwable  {
      HashMap<Map.Entry<JmsServerStubIfc, Integer>, Integer> hashMap0 = new HashMap<Map.Entry<JmsServerStubIfc, Integer>, Integer>();
      JmsXAConnectionFactory jmsXAConnectionFactory0 = new JmsXAConnectionFactory("|[%|sEDG.omyTh4[^vO", (Map) hashMap0, (Map) hashMap0);
      try {
        jmsXAConnectionFactory0.createConnection();
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Failed to create proxy: java.lang.ClassNotFoundException: |[%|sEDG/omyTh4[^vO
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      JmsConnectionFactory jmsConnectionFactory0 = new JmsConnectionFactory();
      try {
        jmsConnectionFactory0.createQueueConnection();
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Failed to create proxy: java.lang.NullPointerException
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      JmsConnectionFactory jmsConnectionFactory0 = new JmsConnectionFactory();
      // Undeclared exception!
      try {
        jmsConnectionFactory0.writeExternal((ObjectOutput) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      JmsConnectionFactory jmsConnectionFactory0 = new JmsConnectionFactory();
      try {
        jmsConnectionFactory0.createTopicConnection();
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Failed to create proxy: java.lang.NullPointerException
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      JmsConnectionFactory jmsConnectionFactory0 = new JmsConnectionFactory();
      jmsConnectionFactory0.removeConnection((JmsConnection) null);
  }

  @Test
  public void test7()  throws Throwable  {
      HashMap<JmsServerStubIfc, Object> hashMap0 = new HashMap<JmsServerStubIfc, Object>();
      JmsXAConnectionFactory jmsXAConnectionFactory0 = null;
      try {
        jmsXAConnectionFactory0 = new JmsXAConnectionFactory((String) null, (Map) hashMap0, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'className' is null
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      JmsXAConnectionFactory jmsXAConnectionFactory0 = null;
      try {
        jmsXAConnectionFactory0 = new JmsXAConnectionFactory("H4PYWl G$fYh/", (Map) null, (Map) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'properties' is null
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      HashMap<Integer, Map.Entry<Integer, Integer>> hashMap0 = new HashMap<Integer, Map.Entry<Integer, Integer>>();
      JmsConnectionFactory jmsConnectionFactory0 = new JmsConnectionFactory("!", (Map) hashMap0, (Map) hashMap0);
      assertNotNull(jmsConnectionFactory0);
      
      Reference reference0 = jmsConnectionFactory0.getReference();
      assertNotNull(reference0);
      assertEquals("Reference Class Name: org.exolab.jms.client.JmsConnectionFactory\nType: serverClass\nContent: !\n", reference0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      HashMap<Integer, Map.Entry<Integer, Integer>> hashMap0 = new HashMap<Integer, Map.Entry<Integer, Integer>>();
      AbstractMap.SimpleEntry<Integer, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Integer>((Integer) null, (Integer) null);
      hashMap0.put((Integer) null, (Map.Entry<Integer, Integer>) abstractMap_SimpleEntry0);
      JmsConnectionFactory jmsConnectionFactory0 = new JmsConnectionFactory("!", (Map) hashMap0, (Map) hashMap0);
      // Undeclared exception!
      try {
        jmsConnectionFactory0.getReference();
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.util.AbstractMap$SimpleEntry cannot be cast to java.lang.String
         */
      }
  }
}