/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.invoke;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.rmi.RemoteException;
import java.rmi.server.ObjID;
import org.exolab.jms.net.invoke.ExportServiceImpl__Proxy;
import org.exolab.jms.net.orb.UnicastDelegate;
import org.exolab.jms.net.proxy.Delegate;
import org.exolab.jms.net.uri.InvalidURIException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestExportServiceImpl__Proxy {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "u|ua");
      ExportServiceImpl__Proxy exportServiceImpl__Proxy0 = new ExportServiceImpl__Proxy((Delegate) unicastDelegate0);
      try {
        exportServiceImpl__Proxy0.exportObjectTo();
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }
}
