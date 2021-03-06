/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.client.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.rmi.RemoteException;
import java.rmi.server.ObjID;
import java.util.LinkedList;
import java.util.List;
import javax.jms.JMSException;
import javax.transaction.xa.XAException;
import javax.transaction.xa.Xid;
import org.exolab.jms.client.JmsDestination;
import org.exolab.jms.client.JmsMessageListener;
import org.exolab.jms.client.JmsQueue;
import org.exolab.jms.client.JmsTemporaryQueue;
import org.exolab.jms.client.JmsTopic;
import org.exolab.jms.client.net.JmsSessionStubImpl__Proxy;
import org.exolab.jms.message.BytesMessageImpl;
import org.exolab.jms.message.MessageImpl;
import org.exolab.jms.message.StreamMessageImpl;
import org.exolab.jms.net.connector.Connection;
import org.exolab.jms.net.orb.UnicastDelegate;
import org.exolab.jms.net.proxy.Delegate;
import org.exolab.jms.net.proxy.RemoteInvocationException;
import org.exolab.jms.net.uri.InvalidURIException;
import org.exolab.jms.tranlog.ExternalXid;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestJmsSessionStubImpl__Proxy {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      ExternalXid externalXid0 = new ExternalXid();
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.start((Xid) externalXid0, 1250);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) null);
      JmsQueue jmsQueue0 = new JmsQueue("SX\"X)+%d)/h))Wl{B");
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.createBrowser(jmsQueue0, "SX\"X)+%d)/h))Wl{B");
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "X]5m_N@O7O8G@yP7");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.closeConsumer(0L);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ObjID objID0 = new ObjID((-1064));
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      try {
        jmsSessionStubImpl__Proxy0.onMessageAvailable();
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (Connection) null);
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.setAsynchronous((-1143L), false);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "_2ks:Olot#]@xbyxA[,");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.recover(1000);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.setTransactionTimeout(0);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) null);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.receiveNoWait((-12L));
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      ObjID objID0 = new ObjID(627);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "KN/Ze4qF[");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.acknowledgeMessage((long) 627, "KN/Ze4qF[");
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "79~Zr`Hl|C{[0.1+E5");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      byte[] byteArray0 = new byte[2];
      ExternalXid externalXid0 = new ExternalXid((-576), byteArray0, byteArray0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.commit((Xid) externalXid0, true);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      UnicastDelegate unicastDelegate0 = new UnicastDelegate((ObjID) null, (Connection) null);
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.stop();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      ObjID objID0 = new ObjID(1435);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.send((MessageImpl) bytesMessageImpl0);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      ObjID objID0 = new ObjID(0);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "us");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      StreamMessageImpl streamMessageImpl0 = new StreamMessageImpl();
      try {
        jmsSessionStubImpl__Proxy0.onMessage((MessageImpl) streamMessageImpl0);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      ObjID objID0 = new ObjID(11);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "1x_l(k");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.rollback();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "n#WWbn-m9r5eAU5");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.setMessageListener((JmsMessageListener) null);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      ObjID objID0 = new ObjID(0);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.send((List) linkedList0);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      ObjID objID0 = new ObjID(0);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "I!8 }i@");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      ExternalXid externalXid0 = new ExternalXid();
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.rollback((Xid) externalXid0);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      UnicastDelegate unicastDelegate0 = new UnicastDelegate((ObjID) null, "_U7F$QN)ysy@");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.getResourceManagerId();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "I.JhEVH'&");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.prepare((Xid) null);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) null);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.receive(0L, 0L);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.getTransactionTimeout();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      ObjID objID0 = new ObjID(67108864);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (Connection) null);
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      JmsTemporaryQueue jmsTemporaryQueue0 = new JmsTemporaryQueue();
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.createConsumer((JmsDestination) jmsTemporaryQueue0, "QW5;:7qM'4x^Y", false);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test22()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (String) null);
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.close();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) null);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.recover();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) null);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.createDurableConsumer((JmsTopic) null, "YB(v}zF=ake@D\"FH%\"", "YB(v}zF=ake@D\"FH%\"", true);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test25()  throws Throwable  {
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) null);
      byte[] byteArray0 = new byte[4];
      ExternalXid externalXid0 = new ExternalXid(529, byteArray0, byteArray0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.forget((Xid) externalXid0);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test26()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "]");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.commit();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test27()  throws Throwable  {
      ObjID objID0 = new ObjID(127);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "%J>`eBmFaPP\"");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.start();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test28()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "${");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.unsubscribe("${");
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test29()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      ExternalXid externalXid0 = new ExternalXid();
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.end((Xid) externalXid0, (-445));
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test30()  throws Throwable  {
      ObjID objID0 = new ObjID(0);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "ySG;+EI75!tN");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.browse(0L, 0);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }
}
