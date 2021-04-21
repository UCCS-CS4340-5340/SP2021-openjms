/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Hashtable;
import java.util.Properties;
import javax.naming.BinaryRefAddr;
import javax.naming.CompoundName;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.InvalidNameException;
import javax.naming.Name;
import javax.naming.NamingException;
import javax.naming.RefAddr;
import javax.naming.Reference;
import org.exolab.jms.client.JmsDestinationFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JmsDestinationFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JmsDestinationFactory jmsDestinationFactory0 = new JmsDestinationFactory();
      Properties properties0 = new Properties();
      CompoundName compoundName0 = new CompoundName("", properties0);
      InitialContext initialContext0 = new InitialContext();
      Object object0 = jmsDestinationFactory0.getObjectInstance((Object) "", (Name) compoundName0, (Context) initialContext0, (Hashtable) properties0);
      assertNull(object0);
  }

  @Test
  public void test1()  throws Throwable  {
      JmsDestinationFactory jmsDestinationFactory0 = new JmsDestinationFactory();
      byte[] byteArray0 = new byte[1];
      BinaryRefAddr binaryRefAddr0 = new BinaryRefAddr("", byteArray0);
      Reference reference0 = new Reference("", (RefAddr) binaryRefAddr0);
      Properties properties0 = new Properties();
      CompoundName compoundName0 = new CompoundName("", properties0);
      InitialContext initialContext0 = new InitialContext();
      Object object0 = jmsDestinationFactory0.getObjectInstance((Object) reference0, (Name) compoundName0, (Context) initialContext0, (Hashtable) properties0);
      assertNull(object0);
  }
}