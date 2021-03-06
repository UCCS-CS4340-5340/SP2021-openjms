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
import org.exolab.castor.xml.util.XMLClassDescriptorAdapter;
import org.exolab.jms.config.XATopicConnectionFactoryDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class XATopicConnectionFactoryDescriptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      XATopicConnectionFactoryDescriptor xATopicConnectionFactoryDescriptor0 = new XATopicConnectionFactoryDescriptor();
      xATopicConnectionFactoryDescriptor0.getNameSpaceURI();
      assertEquals("XATopicConnectionFactory", xATopicConnectionFactoryDescriptor0.getXMLName());
  }

  @Test
  public void test1()  throws Throwable  {
      XATopicConnectionFactoryDescriptor xATopicConnectionFactoryDescriptor0 = new XATopicConnectionFactoryDescriptor();
      xATopicConnectionFactoryDescriptor0.getAccessMode();
      assertEquals("XATopicConnectionFactory", xATopicConnectionFactoryDescriptor0.getXMLName());
  }

  @Test
  public void test2()  throws Throwable  {
      XATopicConnectionFactoryDescriptor xATopicConnectionFactoryDescriptor0 = new XATopicConnectionFactoryDescriptor();
      XATopicConnectionFactoryDescriptor xATopicConnectionFactoryDescriptor1 = (XATopicConnectionFactoryDescriptor)xATopicConnectionFactoryDescriptor0.getValidator();
      assertEquals("XATopicConnectionFactory", xATopicConnectionFactoryDescriptor0.getXMLName());
      assertEquals("XATopicConnectionFactory", xATopicConnectionFactoryDescriptor1.getXMLName());
  }

  @Test
  public void test3()  throws Throwable  {
      XATopicConnectionFactoryDescriptor xATopicConnectionFactoryDescriptor0 = new XATopicConnectionFactoryDescriptor();
      XMLClassDescriptorAdapter xMLClassDescriptorAdapter0 = new XMLClassDescriptorAdapter((ClassDescriptor) xATopicConnectionFactoryDescriptor0, "org.exolab.jms.config.XATopicConnectionFactoryDescriptor@22936e45; descriptor for class: [null]; xml name: null");
      assertEquals("XATopicConnectionFactory", xATopicConnectionFactoryDescriptor0.getXMLName());
  }

  @Test
  public void test4()  throws Throwable  {
      XATopicConnectionFactoryDescriptor xATopicConnectionFactoryDescriptor0 = new XATopicConnectionFactoryDescriptor();
      xATopicConnectionFactoryDescriptor0.getNameSpacePrefix();
      assertEquals("XATopicConnectionFactory", xATopicConnectionFactoryDescriptor0.getXMLName());
  }
}
