/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.config.ConnectionFactoryDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestConnectionFactoryDescriptor {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ConnectionFactoryDescriptor connectionFactoryDescriptor0 = new ConnectionFactoryDescriptor();
      connectionFactoryDescriptor0.getNameSpacePrefix();
      assertEquals("ConnectionFactory", connectionFactoryDescriptor0.getXMLName());
  }

  @Test
  public void test1()  throws Throwable  {
      ConnectionFactoryDescriptor connectionFactoryDescriptor0 = new ConnectionFactoryDescriptor();
      ConnectionFactoryDescriptor connectionFactoryDescriptor1 = (ConnectionFactoryDescriptor)connectionFactoryDescriptor0.getValidator();
      assertEquals("ConnectionFactory", connectionFactoryDescriptor0.getXMLName());
      assertEquals("ConnectionFactory", connectionFactoryDescriptor1.getXMLName());
  }

  @Test
  public void test2()  throws Throwable  {
      ConnectionFactoryDescriptor connectionFactoryDescriptor0 = new ConnectionFactoryDescriptor();
      connectionFactoryDescriptor0.getExtends();
      assertEquals("ConnectionFactory", connectionFactoryDescriptor0.getXMLName());
  }

  @Test
  public void test3()  throws Throwable  {
      ConnectionFactoryDescriptor connectionFactoryDescriptor0 = new ConnectionFactoryDescriptor();
      connectionFactoryDescriptor0.getAccessMode();
      assertEquals("ConnectionFactory", connectionFactoryDescriptor0.getXMLName());
  }

  @Test
  public void test4()  throws Throwable  {
      ConnectionFactoryDescriptor connectionFactoryDescriptor0 = new ConnectionFactoryDescriptor();
      connectionFactoryDescriptor0.getNameSpaceURI();
      assertEquals("ConnectionFactory", connectionFactoryDescriptor0.getXMLName());
  }

  @Test
  public void test5()  throws Throwable  {
      ConnectionFactoryDescriptor connectionFactoryDescriptor0 = new ConnectionFactoryDescriptor();
      String string0 = connectionFactoryDescriptor0.getXMLName();
      assertEquals("ConnectionFactory", string0);
      assertNotNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      ConnectionFactoryDescriptor connectionFactoryDescriptor0 = new ConnectionFactoryDescriptor();
      connectionFactoryDescriptor0.getIdentity();
      assertEquals("ConnectionFactory", connectionFactoryDescriptor0.getXMLName());
  }

  @Test
  public void test7()  throws Throwable  {
      ConnectionFactoryDescriptor connectionFactoryDescriptor0 = new ConnectionFactoryDescriptor();
      connectionFactoryDescriptor0.getJavaClass();
      assertEquals("ConnectionFactory", connectionFactoryDescriptor0.getXMLName());
  }
}