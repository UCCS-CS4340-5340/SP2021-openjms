/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.rmi.server.ObjID;
import javax.transaction.xa.XAException;
import javax.transaction.xa.XAResource;
import javax.transaction.xa.Xid;
import org.exolab.jms.client.JmsXAResource;
import org.exolab.jms.net.connector.Connection;
import org.exolab.jms.net.orb.UnicastDelegate;
import org.exolab.jms.net.proxy.Delegate;
import org.exolab.jms.server.ServerSession;
import org.exolab.jms.server.net.RemoteServerSession__Proxy;
import org.exolab.jms.tranlog.ExternalXid;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestJmsXAResource {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "gnN<Xd 0|q6I@La3~");
      RemoteServerSession__Proxy remoteServerSession__Proxy0 = new RemoteServerSession__Proxy((Delegate) unicastDelegate0);
      JmsXAResource jmsXAResource0 = new JmsXAResource((ServerSession) remoteServerSession__Proxy0);
      byte[] byteArray0 = new byte[8];
      ExternalXid externalXid0 = new ExternalXid(5, byteArray0, byteArray0);
      try {
        jmsXAResource0.forget((Xid) externalXid0);
        fail("Expecting exception: XAException");
      } catch(XAException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ObjID objID0 = new ObjID(1787);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (Connection) null);
      RemoteServerSession__Proxy remoteServerSession__Proxy0 = new RemoteServerSession__Proxy((Delegate) unicastDelegate0);
      JmsXAResource jmsXAResource0 = new JmsXAResource((ServerSession) remoteServerSession__Proxy0);
      try {
        jmsXAResource0.recover(1787);
        fail("Expecting exception: XAException");
      } catch(XAException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      UnicastDelegate unicastDelegate0 = new UnicastDelegate((ObjID) null, ".g$4");
      RemoteServerSession__Proxy remoteServerSession__Proxy0 = new RemoteServerSession__Proxy((Delegate) unicastDelegate0);
      JmsXAResource jmsXAResource0 = new JmsXAResource((ServerSession) remoteServerSession__Proxy0);
      try {
        jmsXAResource0.setTransactionTimeout((-1724));
        fail("Expecting exception: XAException");
      } catch(XAException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      RemoteServerSession__Proxy remoteServerSession__Proxy0 = new RemoteServerSession__Proxy((Delegate) unicastDelegate0);
      JmsXAResource jmsXAResource0 = new JmsXAResource((ServerSession) remoteServerSession__Proxy0);
      byte[] byteArray0 = new byte[9];
      ExternalXid externalXid0 = new ExternalXid((-1685), byteArray0, byteArray0);
      try {
        jmsXAResource0.end((Xid) externalXid0, (int) (byte)0);
        fail("Expecting exception: XAException");
      } catch(XAException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "&t%BO]=_ >7Rh_tjGF4");
      RemoteServerSession__Proxy remoteServerSession__Proxy0 = new RemoteServerSession__Proxy((Delegate) unicastDelegate0);
      JmsXAResource jmsXAResource0 = new JmsXAResource((ServerSession) remoteServerSession__Proxy0);
      ExternalXid externalXid0 = new ExternalXid();
      try {
        jmsXAResource0.commit((Xid) externalXid0, false);
        fail("Expecting exception: XAException");
      } catch(XAException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "@ eH|e");
      RemoteServerSession__Proxy remoteServerSession__Proxy0 = new RemoteServerSession__Proxy((Delegate) unicastDelegate0);
      JmsXAResource jmsXAResource0 = new JmsXAResource((ServerSession) remoteServerSession__Proxy0);
      ExternalXid externalXid0 = new ExternalXid();
      try {
        jmsXAResource0.prepare((Xid) externalXid0);
        fail("Expecting exception: XAException");
      } catch(XAException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ObjID objID0 = new ObjID((-1510));
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      RemoteServerSession__Proxy remoteServerSession__Proxy0 = new RemoteServerSession__Proxy((Delegate) unicastDelegate0);
      JmsXAResource jmsXAResource0 = new JmsXAResource((ServerSession) remoteServerSession__Proxy0);
      try {
        jmsXAResource0.getTransactionTimeout();
        fail("Expecting exception: XAException");
      } catch(XAException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      ObjID objID0 = new ObjID((-1348));
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (String) null);
      RemoteServerSession__Proxy remoteServerSession__Proxy0 = new RemoteServerSession__Proxy((Delegate) unicastDelegate0);
      JmsXAResource jmsXAResource0 = new JmsXAResource((ServerSession) remoteServerSession__Proxy0);
      byte[] byteArray0 = new byte[5];
      ExternalXid externalXid0 = new ExternalXid((-1348), byteArray0, byteArray0);
      try {
        jmsXAResource0.start((Xid) externalXid0, (int) (byte)0);
        fail("Expecting exception: XAException");
      } catch(XAException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      ObjID objID0 = new ObjID(1246);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "Trnsction in progNess, allocated at ");
      RemoteServerSession__Proxy remoteServerSession__Proxy0 = new RemoteServerSession__Proxy((Delegate) unicastDelegate0);
      JmsXAResource jmsXAResource0 = new JmsXAResource((ServerSession) remoteServerSession__Proxy0);
      ExternalXid externalXid0 = new ExternalXid();
      try {
        jmsXAResource0.rollback((Xid) externalXid0);
        fail("Expecting exception: XAException");
      } catch(XAException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      JmsXAResource jmsXAResource0 = null;
      try {
        jmsXAResource0 = new JmsXAResource((ServerSession) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'session' is null
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      RemoteServerSession__Proxy remoteServerSession__Proxy0 = new RemoteServerSession__Proxy((Delegate) unicastDelegate0);
      JmsXAResource jmsXAResource0 = new JmsXAResource((ServerSession) remoteServerSession__Proxy0);
      boolean boolean0 = jmsXAResource0.isSameRM((XAResource) null);
      assertEquals("[5189a522:13f9166fe3f:-691b, 2147977515443666096]", objID0.toString());
      assertEquals(false, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      UnicastDelegate unicastDelegate0 = new UnicastDelegate((ObjID) null, "q1-ejWv!hV![lsg#");
      RemoteServerSession__Proxy remoteServerSession__Proxy0 = new RemoteServerSession__Proxy((Delegate) unicastDelegate0);
      JmsXAResource jmsXAResource0 = new JmsXAResource((ServerSession) remoteServerSession__Proxy0);
      try {
        jmsXAResource0.isSameRM((XAResource) jmsXAResource0);
        fail("Expecting exception: XAException");
      } catch(XAException e) {
        /*
         * No scheme found in URI.
         */
      }
  }
}
