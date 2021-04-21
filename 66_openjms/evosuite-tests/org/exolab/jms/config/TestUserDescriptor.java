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
import org.exolab.jms.config.UserDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestUserDescriptor {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      UserDescriptor userDescriptor0 = new UserDescriptor();
      XMLClassDescriptorAdapter xMLClassDescriptorAdapter0 = new XMLClassDescriptorAdapter((ClassDescriptor) userDescriptor0, (String) null, (NodeType) null);
      assertEquals("User", xMLClassDescriptorAdapter0.getXMLName());
  }

  @Test
  public void test1()  throws Throwable  {
      UserDescriptor userDescriptor0 = new UserDescriptor();
      assertNotNull(userDescriptor0);
      
      userDescriptor0.getNameSpaceURI();
      assertEquals("User", userDescriptor0.getXMLName());
  }

  @Test
  public void test2()  throws Throwable  {
      UserDescriptor userDescriptor0 = new UserDescriptor();
      assertNotNull(userDescriptor0);
      
      UserDescriptor userDescriptor1 = (UserDescriptor)userDescriptor0.getValidator();
      assertEquals("User", userDescriptor0.getXMLName());
      assertEquals("User", userDescriptor1.getXMLName());
  }

  @Test
  public void test3()  throws Throwable  {
      UserDescriptor userDescriptor0 = new UserDescriptor();
      assertNotNull(userDescriptor0);
      
      userDescriptor0.getAccessMode();
      assertEquals("User", userDescriptor0.getXMLName());
  }

  @Test
  public void test4()  throws Throwable  {
      UserDescriptor userDescriptor0 = new UserDescriptor();
      assertNotNull(userDescriptor0);
      
      userDescriptor0.getNameSpacePrefix();
      assertEquals("User", userDescriptor0.getXMLName());
  }
}
