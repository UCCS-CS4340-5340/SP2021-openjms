/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.socket;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.net.connector.ResourceException;
import org.exolab.jms.net.socket.SocketRequestInfo;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.net.util.Properties;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SocketRequestInfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      URI uRI0 = new URI();
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0);
      assertNotNull(socketRequestInfo0);
      
      socketRequestInfo0.getAlternativeHost();
      assertEquals(true, socketRequestInfo0.getBindAll());
      assertEquals(50, socketRequestInfo0.getConnectionRequestQueueSize());
  }

  @Test
  public void test1()  throws Throwable  {
      URI uRI0 = new URI();
      Properties properties0 = new Properties("6M9Y/");
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0, properties0);
      assertNotNull(socketRequestInfo0);
      
      int int0 = socketRequestInfo0.getConnectionRequestQueueSize();
      assertEquals(true, socketRequestInfo0.getBindAll());
      assertEquals(50, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      URI uRI0 = new URI();
      Properties properties0 = new Properties("6M9Y/");
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0, properties0);
      assertNotNull(socketRequestInfo0);
      
      socketRequestInfo0.setAlternativeHost("6M9Y/");
      try {
        socketRequestInfo0.getAlternativeURI();
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      URI uRI0 = new URI();
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0);
      assertNotNull(socketRequestInfo0);
      
      Properties properties0 = new Properties("t{Gb4iQLE");
      socketRequestInfo0.export(properties0);
      assertEquals(50, socketRequestInfo0.getConnectionRequestQueueSize());
      assertEquals(true, socketRequestInfo0.getBindAll());
  }

  @Test
  public void test4()  throws Throwable  {
      URI uRI0 = new URI();
      Properties properties0 = new Properties("l");
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0, properties0);
      assertNotNull(socketRequestInfo0);
      
      URI uRI1 = socketRequestInfo0.getAlternativeURI();
      assertEquals(50, socketRequestInfo0.getConnectionRequestQueueSize());
      assertNull(uRI1);
      assertEquals(true, socketRequestInfo0.getBindAll());
  }

  @Test
  public void test5()  throws Throwable  {
      URI uRI0 = new URI();
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0);
      assertNotNull(socketRequestInfo0);
      
      Properties properties0 = new Properties("t{Gb4iQLE");
      socketRequestInfo0.setAlternativeHost("t{Gb4iQLE");
      socketRequestInfo0.export(properties0);
      assertEquals(true, socketRequestInfo0.getBindAll());
      assertEquals(50, socketRequestInfo0.getConnectionRequestQueueSize());
  }

  @Test
  public void test6()  throws Throwable  {
      URI uRI0 = new URI();
      Properties properties0 = new Properties("6M9Y/");
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0, properties0);
      assertNotNull(socketRequestInfo0);
      
      boolean boolean0 = socketRequestInfo0.equals((Object) socketRequestInfo0, (Object) null);
      assertEquals(true, socketRequestInfo0.getBindAll());
      assertEquals(50, socketRequestInfo0.getConnectionRequestQueueSize());
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      URI uRI0 = new URI();
      Properties properties0 = new Properties("l");
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0, properties0);
      assertNotNull(socketRequestInfo0);
      
      boolean boolean0 = socketRequestInfo0.equals((Object) socketRequestInfo0);
      assertEquals(true, boolean0);
      assertEquals(50, socketRequestInfo0.getConnectionRequestQueueSize());
      assertEquals(true, socketRequestInfo0.getBindAll());
  }

  @Test
  public void test8()  throws Throwable  {
      URI uRI0 = new URI();
      Properties properties0 = new Properties("l");
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0, properties0);
      assertNotNull(socketRequestInfo0);
      
      URI uRI1 = new URI("l", "l");
      URI uRI2 = new URI(uRI1);
      SocketRequestInfo socketRequestInfo1 = new SocketRequestInfo(uRI2);
      boolean boolean0 = socketRequestInfo0.equals((Object) socketRequestInfo1);
      assertEquals(true, socketRequestInfo0.getBindAll());
      assertEquals(true, socketRequestInfo1.getBindAll());
      assertEquals(50, socketRequestInfo0.getConnectionRequestQueueSize());
      assertEquals(false, boolean0);
      assertEquals(50, socketRequestInfo1.getConnectionRequestQueueSize());
  }

  @Test
  public void test9()  throws Throwable  {
      URI uRI0 = new URI();
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0);
      assertNotNull(socketRequestInfo0);
      
      Properties properties0 = new Properties("t{Gb4iQLE");
      socketRequestInfo0.setAlternativeHost("t{Gb4iQLE");
      SocketRequestInfo socketRequestInfo1 = new SocketRequestInfo(uRI0, properties0);
      boolean boolean0 = socketRequestInfo0.equals((Object) socketRequestInfo1);
      assertEquals(true, socketRequestInfo0.getBindAll());
      assertFalse(socketRequestInfo1.equals(socketRequestInfo0));
      assertEquals(50, socketRequestInfo1.getConnectionRequestQueueSize());
      assertEquals(false, boolean0);
      assertEquals(50, socketRequestInfo0.getConnectionRequestQueueSize());
      assertEquals(true, socketRequestInfo1.getBindAll());
  }

  @Test
  public void test10()  throws Throwable  {
      URI uRI0 = new URI();
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0);
      assertNotNull(socketRequestInfo0);
      
      Properties properties0 = new Properties((String) null);
      socketRequestInfo0.setConnectionRequestQueueSize((-915));
      SocketRequestInfo socketRequestInfo1 = new SocketRequestInfo(uRI0, properties0);
      boolean boolean0 = socketRequestInfo0.equals((Object) socketRequestInfo1);
      assertEquals(-915, socketRequestInfo0.getConnectionRequestQueueSize());
      assertEquals(false, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      URI uRI0 = new URI();
      Properties properties0 = new Properties("l");
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0, properties0);
      assertNotNull(socketRequestInfo0);
      
      SocketRequestInfo socketRequestInfo1 = new SocketRequestInfo(uRI0, properties0);
      assertEquals(true, socketRequestInfo1.getBindAll());
      
      socketRequestInfo1.setBindAll(false);
      boolean boolean0 = socketRequestInfo1.equals((Object) socketRequestInfo0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      URI uRI0 = new URI();
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0);
      assertNotNull(socketRequestInfo0);
      
      Object object0 = new Object();
      boolean boolean0 = socketRequestInfo0.equals((Object) null, object0);
      assertEquals(50, socketRequestInfo0.getConnectionRequestQueueSize());
      assertEquals(true, socketRequestInfo0.getBindAll());
      assertEquals(false, boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      URI uRI0 = new URI();
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0);
      assertNotNull(socketRequestInfo0);
      
      Object object0 = new Object();
      boolean boolean0 = socketRequestInfo0.equals(object0, object0);
      assertEquals(50, socketRequestInfo0.getConnectionRequestQueueSize());
      assertEquals(true, socketRequestInfo0.getBindAll());
      assertEquals(true, boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      URI uRI0 = new URI("u", "u", "u", "u", "u");
      SocketRequestInfo socketRequestInfo0 = null;
      try {
        socketRequestInfo0 = new SocketRequestInfo(uRI0);
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
      }
  }
}