/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.multiplexer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.rmi.MarshalException;
import java.rmi.RemoteException;
import java.rmi.server.ObjID;
import org.exolab.jms.net.connector.Request;
import org.exolab.jms.net.connector.Response;
import org.exolab.jms.net.multiplexer.Channel;
import org.exolab.jms.net.multiplexer.MultiplexInputStream;
import org.exolab.jms.net.multiplexer.MultiplexOutputStream;
import org.exolab.jms.net.multiplexer.Multiplexer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestChannel {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Channel channel0 = new Channel((-1947), (Multiplexer) null, (MultiplexInputStream) null, (MultiplexOutputStream) null);
      // Undeclared exception!
      try {
        channel0.release();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Channel channel0 = new Channel(65544, (Multiplexer) null, (MultiplexInputStream) null, (MultiplexOutputStream) null);
      int int0 = channel0.getId();
      assertEquals(65544, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      Channel channel0 = new Channel(251, (Multiplexer) null, (MultiplexInputStream) null, (MultiplexOutputStream) null);
      String string0 = channel0.toString();
      assertNotNull(string0);
      assertEquals("Channel[id=251, out=null, in=null ]", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      Channel channel0 = new Channel(251, (Multiplexer) null, (MultiplexInputStream) null, (MultiplexOutputStream) null);
      // Undeclared exception!
      try {
        channel0.writeResponse((Response) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Channel channel0 = new Channel(65544, (Multiplexer) null, (MultiplexInputStream) null, (MultiplexOutputStream) null);
      // Undeclared exception!
      try {
        channel0.readRequest();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Channel channel0 = new Channel((-1947), (Multiplexer) null, (MultiplexInputStream) null, (MultiplexOutputStream) null);
      channel0.destroy();
      assertEquals("Channel[id=-1947, out=null, in=null ]", channel0.toString());
      assertEquals(-1947, channel0.getId());
  }

  @Test
  public void test6()  throws Throwable  {
      Channel channel0 = new Channel((-1735), (Multiplexer) null, (MultiplexInputStream) null, (MultiplexOutputStream) null);
      ObjID objID0 = new ObjID((-1735));
      Object[] objectArray0 = new Object[1];
      Request request0 = new Request(objID0, (Method) null, objectArray0, (long) (-1735));
      try {
        channel0.invoke(request0);
        fail("Expecting exception: MarshalException");
      } catch(MarshalException e) {
        /*
         * Failed to marshal call; nested exception is: 
         * \tjava.lang.NullPointerException
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      Channel channel0 = new Channel(272, (Multiplexer) null, (MultiplexInputStream) null, (MultiplexOutputStream) null);
      // Undeclared exception!
      try {
        channel0.disconnected();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}