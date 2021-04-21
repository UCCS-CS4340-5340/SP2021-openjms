/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.castor.mapping.ClassDescriptor;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.NodeType;
import org.exolab.castor.xml.util.XMLClassDescriptorAdapter;
import org.exolab.jms.config.SubscriberDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SubscriberDescriptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SubscriberDescriptor subscriberDescriptor0 = new SubscriberDescriptor();
      subscriberDescriptor0.getNameSpacePrefix();
      assertEquals("Subscriber", subscriberDescriptor0.getXMLName());
  }

  @Test
  public void test1()  throws Throwable  {
      SubscriberDescriptor subscriberDescriptor0 = new SubscriberDescriptor();
      assertNotNull(subscriberDescriptor0);
      
      SubscriberDescriptor subscriberDescriptor1 = (SubscriberDescriptor)subscriberDescriptor0.getValidator();
      assertEquals("Subscriber", subscriberDescriptor0.getXMLName());
      assertEquals("Subscriber", subscriberDescriptor1.getXMLName());
  }

  @Test
  public void test2()  throws Throwable  {
      SubscriberDescriptor subscriberDescriptor0 = new SubscriberDescriptor();
      assertNotNull(subscriberDescriptor0);
      
      XMLClassDescriptorAdapter xMLClassDescriptorAdapter0 = new XMLClassDescriptorAdapter((ClassDescriptor) subscriberDescriptor0, (String) null, (NodeType) null);
      assertEquals("Subscriber", xMLClassDescriptorAdapter0.getXMLName());
  }

  @Test
  public void test3()  throws Throwable  {
      SubscriberDescriptor subscriberDescriptor0 = new SubscriberDescriptor();
      assertNotNull(subscriberDescriptor0);
      
      subscriberDescriptor0.getNameSpaceURI();
      assertEquals("Subscriber", subscriberDescriptor0.getXMLName());
  }

  @Test
  public void test4()  throws Throwable  {
      SubscriberDescriptor subscriberDescriptor0 = new SubscriberDescriptor();
      assertNotNull(subscriberDescriptor0);
      
      subscriberDescriptor0.getAccessMode();
      assertEquals("Subscriber", subscriberDescriptor0.getXMLName());
  }
}