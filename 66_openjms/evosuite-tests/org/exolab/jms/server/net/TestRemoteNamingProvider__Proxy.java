/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.server.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.rmi.server.ObjID;
import javax.naming.CompositeName;
import javax.naming.InvalidNameException;
import javax.naming.Name;
import javax.naming.NamingException;
import org.exolab.jms.net.orb.UnicastDelegate;
import org.exolab.jms.net.proxy.Delegate;
import org.exolab.jms.net.uri.InvalidURIException;
import org.exolab.jms.server.net.RemoteNamingProvider__Proxy;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestRemoteNamingProvider__Proxy {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) null);
      try {
        remoteNamingProvider__Proxy0.destroySubcontext((Name) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) unicastDelegate0);
      try {
        remoteNamingProvider__Proxy0.lookup((Name) null);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "9pXX");
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) unicastDelegate0);
      CompositeName compositeName0 = new CompositeName();
      try {
        remoteNamingProvider__Proxy0.rebind((Name) compositeName0, "[4c3b6780:13f91694165:-7e74, -4149439933860557747]", (Object) "");
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ObjID objID0 = new ObjID((-411));
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) unicastDelegate0);
      try {
        remoteNamingProvider__Proxy0.bind((Name) null, "", (Object) null);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ObjID objID0 = new ObjID(1934);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "m@w");
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) unicastDelegate0);
      CompositeName compositeName0 = new CompositeName("m@w");
      try {
        remoteNamingProvider__Proxy0.unbind((Name) compositeName0);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "&");
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) unicastDelegate0);
      CompositeName compositeName0 = new CompositeName("&");
      try {
        remoteNamingProvider__Proxy0.listBindings((Name) compositeName0);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      UnicastDelegate unicastDelegate0 = new UnicastDelegate((ObjID) null, "");
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) unicastDelegate0);
      CompositeName compositeName0 = new CompositeName("");
      try {
        remoteNamingProvider__Proxy0.list((Name) compositeName0);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      ObjID objID0 = new ObjID(0);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) unicastDelegate0);
      try {
        remoteNamingProvider__Proxy0.getNameParser();
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) unicastDelegate0);
      CompositeName compositeName0 = new CompositeName();
      try {
        remoteNamingProvider__Proxy0.createSubcontext((Name) compositeName0);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }
}
