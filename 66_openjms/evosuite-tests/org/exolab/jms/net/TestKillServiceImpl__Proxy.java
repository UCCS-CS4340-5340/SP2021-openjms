/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.rmi.server.ObjID;
import org.exolab.jms.net.KillServiceImpl__Proxy;
import org.exolab.jms.net.connector.Connection;
import org.exolab.jms.net.orb.UnicastDelegate;
import org.exolab.jms.net.proxy.Delegate;
import org.exolab.jms.net.proxy.RemoteInvocationException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestKillServiceImpl__Proxy {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (Connection) null);
      KillServiceImpl__Proxy killServiceImpl__Proxy0 = new KillServiceImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        killServiceImpl__Proxy0.kill((-1967L));
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }
}
