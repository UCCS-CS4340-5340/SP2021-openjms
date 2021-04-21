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
import org.exolab.jms.config.JndiConfigurationDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestJndiConfigurationDescriptor {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JndiConfigurationDescriptor jndiConfigurationDescriptor0 = new JndiConfigurationDescriptor();
      JndiConfigurationDescriptor jndiConfigurationDescriptor1 = (JndiConfigurationDescriptor)jndiConfigurationDescriptor0.getValidator();
      assertEquals("http://openjms.exolab.org/configuration", jndiConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("JndiConfiguration", jndiConfigurationDescriptor0.getXMLName());
      assertEquals("JndiConfiguration", jndiConfigurationDescriptor1.getXMLName());
  }

  @Test
  public void test1()  throws Throwable  {
      JndiConfigurationDescriptor jndiConfigurationDescriptor0 = new JndiConfigurationDescriptor();
      assertNotNull(jndiConfigurationDescriptor0);
      
      jndiConfigurationDescriptor0.getNameSpacePrefix();
      assertEquals("http://openjms.exolab.org/configuration", jndiConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("JndiConfiguration", jndiConfigurationDescriptor0.getXMLName());
  }

  @Test
  public void test2()  throws Throwable  {
      JndiConfigurationDescriptor jndiConfigurationDescriptor0 = new JndiConfigurationDescriptor();
      assertNotNull(jndiConfigurationDescriptor0);
      
      XMLClassDescriptorAdapter xMLClassDescriptorAdapter0 = new XMLClassDescriptorAdapter((ClassDescriptor) jndiConfigurationDescriptor0, (String) null);
      assertEquals("JndiConfiguration", xMLClassDescriptorAdapter0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", jndiConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test3()  throws Throwable  {
      JndiConfigurationDescriptor jndiConfigurationDescriptor0 = new JndiConfigurationDescriptor();
      assertNotNull(jndiConfigurationDescriptor0);
      
      String string0 = jndiConfigurationDescriptor0.getNameSpaceURI();
      assertEquals("JndiConfiguration", jndiConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", string0);
      assertNotNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      JndiConfigurationDescriptor jndiConfigurationDescriptor0 = new JndiConfigurationDescriptor();
      assertNotNull(jndiConfigurationDescriptor0);
      
      jndiConfigurationDescriptor0.getAccessMode();
      assertEquals("http://openjms.exolab.org/configuration", jndiConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("JndiConfiguration", jndiConfigurationDescriptor0.getXMLName());
  }
}