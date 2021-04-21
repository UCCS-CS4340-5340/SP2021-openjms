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
import org.exolab.jms.config.SecurityConfigurationDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestSecurityConfigurationDescriptor {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SecurityConfigurationDescriptor securityConfigurationDescriptor0 = new SecurityConfigurationDescriptor();
      assertNotNull(securityConfigurationDescriptor0);
      
      securityConfigurationDescriptor0.getNameSpacePrefix();
      assertEquals("SecurityConfiguration", securityConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", securityConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test1()  throws Throwable  {
      SecurityConfigurationDescriptor securityConfigurationDescriptor0 = new SecurityConfigurationDescriptor();
      assertNotNull(securityConfigurationDescriptor0);
      
      XMLClassDescriptorAdapter xMLClassDescriptorAdapter0 = new XMLClassDescriptorAdapter((ClassDescriptor) securityConfigurationDescriptor0, "http://openjms.exolab.org/configuration");
      assertEquals("SecurityConfiguration", securityConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", securityConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test2()  throws Throwable  {
      SecurityConfigurationDescriptor securityConfigurationDescriptor0 = new SecurityConfigurationDescriptor();
      assertNotNull(securityConfigurationDescriptor0);
      
      SecurityConfigurationDescriptor securityConfigurationDescriptor1 = (SecurityConfigurationDescriptor)securityConfigurationDescriptor0.getValidator();
      assertEquals("SecurityConfiguration", securityConfigurationDescriptor1.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", securityConfigurationDescriptor1.getNameSpaceURI());
  }

  @Test
  public void test3()  throws Throwable  {
      SecurityConfigurationDescriptor securityConfigurationDescriptor0 = new SecurityConfigurationDescriptor();
      assertNotNull(securityConfigurationDescriptor0);
      
      String string0 = securityConfigurationDescriptor0.getNameSpaceURI();
      assertEquals("http://openjms.exolab.org/configuration", string0);
      assertNotNull(string0);
      assertEquals("SecurityConfiguration", securityConfigurationDescriptor0.getXMLName());
  }

  @Test
  public void test4()  throws Throwable  {
      SecurityConfigurationDescriptor securityConfigurationDescriptor0 = new SecurityConfigurationDescriptor();
      assertNotNull(securityConfigurationDescriptor0);
      
      securityConfigurationDescriptor0.getAccessMode();
      assertEquals("http://openjms.exolab.org/configuration", securityConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("SecurityConfiguration", securityConfigurationDescriptor0.getXMLName());
  }
}
