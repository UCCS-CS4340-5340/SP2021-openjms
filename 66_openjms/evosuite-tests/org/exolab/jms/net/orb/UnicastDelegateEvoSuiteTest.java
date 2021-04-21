/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.orb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.rmi.server.ObjID;
import org.exolab.jms.net.connector.Connection;
import org.exolab.jms.net.orb.UnicastDelegate;
import org.exolab.jms.net.uri.InvalidURIException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UnicastDelegateEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      Object[] objectArray0 = new Object[5];
      try {
        unicastDelegate0.invoke((Method) null, objectArray0, (-669L));
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ObjID objID0 = new ObjID(1);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (Connection) null);
      assertNotNull(unicastDelegate0);
  }

  @Test
  public void test2()  throws Throwable  {
      UnicastDelegate unicastDelegate0 = new UnicastDelegate();
      unicastDelegate0.dispose();
  }
}