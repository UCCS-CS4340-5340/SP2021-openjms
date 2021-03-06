/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Enumeration;
import org.exolab.castor.util.NestedIOException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.exolab.jms.config.AdministeredTopic;
import org.exolab.jms.config.Subscriber;
import org.junit.BeforeClass;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.XMLFilterImpl;

@RunWith(EvoSuiteRunner.class)
public class AdministeredTopicEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      Subscriber subscriber0 = new Subscriber();
      boolean boolean0 = administeredTopic0.removeSubscriber(subscriber0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      try {
        administeredTopic0.marshal((ContentHandler) xMLFilterImpl0);
        fail("Expecting exception: NestedIOException");
      } catch(NestedIOException e) {
        /*
         * System property org.xml.sax.parser not specified
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      Enumeration<Object> enumeration0 = administeredTopic0.enumerateSubscriber();
      assertEquals(false, enumeration0.hasMoreElements());
  }

  @Test
  public void test3()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      Subscriber subscriber0 = new Subscriber();
      administeredTopic0.addSubscriber(subscriber0);
      administeredTopic0.getSubscriber();
      assertEquals(1, administeredTopic0.getSubscriberCount());
  }

  @Test
  public void test4()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      administeredTopic0.clearSubscriber();
      assertNull(administeredTopic0.getName());
  }

  @Test
  public void test5()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      StringWriter stringWriter0 = new StringWriter(23);
      try {
        administeredTopic0.marshal((Writer) stringWriter0);
        fail("Expecting exception: ValidationException");
      } catch(ValidationException e) {
        /*
         * name is a required field.
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      Subscriber subscriber0 = new Subscriber();
      administeredTopic0.addSubscriber(0, subscriber0);
      assertEquals(1, administeredTopic0.getSubscriberCount());
  }

  @Test
  public void test7()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      boolean boolean0 = administeredTopic0.isValid();
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      administeredTopic0.setName((String) null);
      assertNull(administeredTopic0.getName());
  }

  @Test
  public void test9()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      int int0 = administeredTopic0.getSubscriberCount();
      assertEquals(0, int0);
  }

  @Test
  public void test10()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      try {
        administeredTopic0.getSubscriber((-611));
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      try {
        administeredTopic0.getSubscriber(217);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      try {
        administeredTopic0.getSubscriber(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      try {
        administeredTopic0.setSubscriber((-402), (Subscriber) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      Subscriber subscriber0 = new Subscriber();
      try {
        administeredTopic0.setSubscriber(0, subscriber0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      try {
        administeredTopic0.setSubscriber(1, (Subscriber) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      AdministeredTopic administeredTopic0 = new AdministeredTopic();
      Subscriber[] subscriberArray0 = new Subscriber[8];
      administeredTopic0.setSubscriber(subscriberArray0);
      assertEquals(8, administeredTopic0.getSubscriberCount());
  }

  @Test
  public void test17()  throws Throwable  {
      try {
        AdministeredTopic.unmarshal((Reader) null);
        fail("Expecting exception: MarshalException");
      } catch(MarshalException e) {
        /*
         * 
         */
      }
  }
}
