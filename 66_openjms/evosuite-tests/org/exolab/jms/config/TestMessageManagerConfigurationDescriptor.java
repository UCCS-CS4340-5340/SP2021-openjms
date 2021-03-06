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
import org.exolab.jms.config.MessageManagerConfigurationDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestMessageManagerConfigurationDescriptor {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MessageManagerConfigurationDescriptor messageManagerConfigurationDescriptor0 = new MessageManagerConfigurationDescriptor();
      assertNotNull(messageManagerConfigurationDescriptor0);
      
      XMLClassDescriptorAdapter xMLClassDescriptorAdapter0 = new XMLClassDescriptorAdapter((ClassDescriptor) messageManagerConfigurationDescriptor0, "http://openjms.exolab.org/configuration");
      assertEquals("MessageManagerConfiguration", messageManagerConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", messageManagerConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test1()  throws Throwable  {
      MessageManagerConfigurationDescriptor messageManagerConfigurationDescriptor0 = new MessageManagerConfigurationDescriptor();
      assertNotNull(messageManagerConfigurationDescriptor0);
      
      messageManagerConfigurationDescriptor0.getNameSpacePrefix();
      assertEquals("MessageManagerConfiguration", messageManagerConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", messageManagerConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test2()  throws Throwable  {
      MessageManagerConfigurationDescriptor messageManagerConfigurationDescriptor0 = new MessageManagerConfigurationDescriptor();
      assertNotNull(messageManagerConfigurationDescriptor0);
      
      messageManagerConfigurationDescriptor0.getAccessMode();
      assertEquals("MessageManagerConfiguration", messageManagerConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", messageManagerConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test3()  throws Throwable  {
      MessageManagerConfigurationDescriptor messageManagerConfigurationDescriptor0 = new MessageManagerConfigurationDescriptor();
      assertNotNull(messageManagerConfigurationDescriptor0);
      
      MessageManagerConfigurationDescriptor messageManagerConfigurationDescriptor1 = (MessageManagerConfigurationDescriptor)messageManagerConfigurationDescriptor0.getValidator();
      assertEquals("http://openjms.exolab.org/configuration", messageManagerConfigurationDescriptor1.getNameSpaceURI());
      assertEquals("MessageManagerConfiguration", messageManagerConfigurationDescriptor1.getXMLName());
  }

  @Test
  public void test4()  throws Throwable  {
      MessageManagerConfigurationDescriptor messageManagerConfigurationDescriptor0 = new MessageManagerConfigurationDescriptor();
      assertNotNull(messageManagerConfigurationDescriptor0);
      
      String string0 = messageManagerConfigurationDescriptor0.getNameSpaceURI();
      assertEquals("http://openjms.exolab.org/configuration", string0);
      assertNotNull(string0);
      assertEquals("MessageManagerConfiguration", messageManagerConfigurationDescriptor0.getXMLName());
  }
}
