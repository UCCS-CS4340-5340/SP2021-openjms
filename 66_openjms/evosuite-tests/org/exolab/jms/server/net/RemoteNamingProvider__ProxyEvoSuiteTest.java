/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.server.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.rmi.server.ObjID;
import java.util.Properties;
import javax.naming.CompositeName;
import javax.naming.CompoundName;
import javax.naming.InvalidNameException;
import javax.naming.Name;
import javax.naming.NamingException;
import org.exolab.jms.net.connector.Connection;
import org.exolab.jms.net.orb.UnicastDelegate;
import org.exolab.jms.net.proxy.Delegate;
import org.exolab.jms.net.uri.InvalidURIException;
import org.exolab.jms.server.net.RemoteNamingProvider__Proxy;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RemoteNamingProvider__ProxyEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) null);
      Properties properties0 = new Properties();
      CompoundName compoundName0 = new CompoundName("n3EG", properties0);
      try {
        remoteNamingProvider__Proxy0.destroySubcontext((Name) compoundName0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) null);
      try {
        remoteNamingProvider__Proxy0.lookup((Name) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ObjID objID0 = new ObjID(1277);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (Connection) null);
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) unicastDelegate0);
      CompositeName compositeName0 = new CompositeName();
      try {
        remoteNamingProvider__Proxy0.rebind((Name) compositeName0, ";K];&YKw", (Object) compositeName0);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "2o+.S]o%!.~C9");
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) unicastDelegate0);
      Properties properties0 = new Properties();
      CompoundName compoundName0 = new CompoundName("e(!sDna#HQ\"~MRc0", properties0);
      try {
        remoteNamingProvider__Proxy0.bind((Name) compoundName0, "e(!sDna#HQ\"~MRc0", (Object) "java.naming.language");
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) null);
      CompositeName compositeName0 = new CompositeName();
      try {
        remoteNamingProvider__Proxy0.unbind((Name) compositeName0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ObjID objID0 = new ObjID(1610);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "jndi.syntax.direction");
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) unicastDelegate0);
      try {
        remoteNamingProvider__Proxy0.listBindings((Name) null);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Properties properties0 = new Properties();
      CompoundName compoundName0 = new CompoundName("@@c", properties0);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate((ObjID) null, "3i#~LP6SZT");
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) unicastDelegate0);
      try {
        remoteNamingProvider__Proxy0.list((Name) compoundName0);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) null);
      try {
        remoteNamingProvider__Proxy0.getNameParser();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      RemoteNamingProvider__Proxy remoteNamingProvider__Proxy0 = new RemoteNamingProvider__Proxy((Delegate) unicastDelegate0);
      Properties properties0 = new Properties();
      CompoundName compoundName0 = new CompoundName("", properties0);
      try {
        remoteNamingProvider__Proxy0.createSubcontext((Name) compoundName0);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }
}