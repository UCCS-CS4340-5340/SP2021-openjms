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
import org.exolab.jms.client.JmsTopic;
import org.exolab.jms.client.net.JmsSessionStubImpl__Proxy;
import org.exolab.jms.message.BytesMessageImpl;
import org.exolab.jms.message.MapMessageImpl;
import org.exolab.jms.message.MessageImpl;
import org.exolab.jms.net.connector.Connection;
import org.exolab.jms.net.orb.UnicastDelegate;
import org.exolab.jms.net.proxy.Delegate;
import org.exolab.jms.net.proxy.RemoteInvocationException;
import org.exolab.jms.net.uri.InvalidURIException;
import org.exolab.jms.tranlog.ExternalXid;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JmsSessionStubImpl__ProxyEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) null);
      ExternalXid externalXid0 = new ExternalXid();
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.start((Xid) externalXid0, (-1815));
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "V<N!+@^'XU");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      JmsQueue jmsQueue0 = new JmsQueue();
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.createBrowser(jmsQueue0, "V<N!+@^'XU");
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) null);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.closeConsumer(0L);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) null);
      try {
        jmsSessionStubImpl__Proxy0.onMessageAvailable();
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * null; nested exception is: 
         * \tjava.lang.NullPointerException
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ObjID objID0 = new ObjID(292);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.setAsynchronous((long) 292, true);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "Service not started");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.recover((-1));
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ObjID objID0 = new ObjID(1745);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "*");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.setTransactionTimeout(1745);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      ObjID objID0 = new ObjID((-6));
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (String) null);
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.receiveNoWait((long) (-6));
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      UnicastDelegate unicastDelegate0 = new UnicastDelegate((ObjID) null, "JMSXGroupSeq");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.acknowledgeMessage(368L, "JMSXGroupSeq");
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      ObjID objID0 = new ObjID(1685);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (Connection) null);
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      ExternalXid externalXid0 = new ExternalXid();
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.commit((Xid) externalXid0, true);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      ObjID objID0 = new ObjID(0);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "zOpC9y7Z/*7");
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
      ObjID objID0 = new ObjID(824);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (String) null);
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
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (String) null);
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      try {
        jmsSessionStubImpl__Proxy0.onMessage((MessageImpl) mapMessageImpl0);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "No connector for URI=");
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
      UnicastDelegate unicastDelegate0 = new UnicastDelegate((ObjID) null, ">K3IR@fXAmdeJ@&G");
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
      ObjID objID0 = new ObjID(1);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (String) null);
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      LinkedList<MessageImpl> linkedList0 = new LinkedList<MessageImpl>();
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.send((List) linkedList0);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) null);
      byte[] byteArray0 = new byte[9];
      ExternalXid externalXid0 = new ExternalXid(1, byteArray0, byteArray0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.rollback((Xid) externalXid0);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) null);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.getResourceManagerId();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) null);
      byte[] byteArray0 = new byte[8];
      ExternalXid externalXid0 = new ExternalXid((-738), byteArray0, byteArray0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.prepare((Xid) externalXid0);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      ObjID objID0 = new ObjID(1000);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.receive((-1449L), (-883L));
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) null);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.getTransactionTimeout();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      ObjID objID0 = new ObjID(779);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      JmsTopic jmsTopic0 = new JmsTopic();
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.createConsumer((JmsDestination) jmsTopic0, "", false);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test22()  throws Throwable  {
      ObjID objID0 = new ObjID(0);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "H%Fx@6;");
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
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (Connection) null);
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
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
        jmsSessionStubImpl__Proxy0.createDurableConsumer((JmsTopic) null, "", "", true);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test25()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      ExternalXid externalXid0 = new ExternalXid();
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.forget((Xid) externalXid0);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test26()  throws Throwable  {
      ObjID objID0 = new ObjID((-410));
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "Cannot create a queue with null or empty name");
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
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "0T@");
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
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) null);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.unsubscribe("DATE");
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test29()  throws Throwable  {
      ObjID objID0 = new ObjID((-1900));
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "Could not instantiate Log '");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      ExternalXid externalXid0 = new ExternalXid();
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.end((Xid) externalXid0, (-1900));
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test30()  throws Throwable  {
      UnicastDelegate unicastDelegate0 = new UnicastDelegate((ObjID) null, "");
      JmsSessionStubImpl__Proxy jmsSessionStubImpl__Proxy0 = new JmsSessionStubImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        jmsSessionStubImpl__Proxy0.browse(1106L, 0);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }
}
