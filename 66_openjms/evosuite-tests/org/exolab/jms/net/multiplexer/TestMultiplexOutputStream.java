/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.multiplexer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import org.exolab.jms.net.multiplexer.MultiplexOutputStream;
import org.exolab.jms.net.multiplexer.Multiplexer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestMultiplexOutputStream {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream(0, (Multiplexer) null, 0, 0);
      multiplexOutputStream0.disconnected();
      byte[] byteArray0 = new byte[7];
      try {
        multiplexOutputStream0.write(byteArray0, (int) (byte)39, 1);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Connection has been closed
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream(0, (Multiplexer) null, 0, 0);
      assertNotNull(multiplexOutputStream0);
      
      String string0 = multiplexOutputStream0.toString();
      assertNotNull(string0);
      assertEquals("MultiplexOutputStream[index=0]", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream(241, (Multiplexer) null, 241, 241);
      multiplexOutputStream0.setType((byte) (-5));
      assertEquals("MultiplexOutputStream[index=0]", multiplexOutputStream0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream(228, (Multiplexer) null, 228, 228);
      byte[] byteArray0 = new byte[8];
      multiplexOutputStream0.write(byteArray0);
      // Undeclared exception!
      try {
        multiplexOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream(1, (Multiplexer) null, 1, 1);
      assertNotNull(multiplexOutputStream0);
      
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try {
        multiplexOutputStream0.write(byteArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream((-1), (Multiplexer) null, 0, 1155);
      assertNotNull(multiplexOutputStream0);
      
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try {
        multiplexOutputStream0.write(byteArray0, (-1893), 1155);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream(241, (Multiplexer) null, 241, 241);
      assertNotNull(multiplexOutputStream0);
      
      multiplexOutputStream0.write((int) (byte)0);
      assertEquals("MultiplexOutputStream[index=1]", multiplexOutputStream0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream(40, (Multiplexer) null, 0, 40);
      assertNotNull(multiplexOutputStream0);
      
      // Undeclared exception!
      try {
        multiplexOutputStream0.write((-1773));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 0
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream(0, (Multiplexer) null, 0, 0);
      multiplexOutputStream0.notifyRead(0);
      assertEquals("MultiplexOutputStream[index=0]", multiplexOutputStream0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream((-1631), (Multiplexer) null, 1756, (-1173));
      try {
        multiplexOutputStream0.notifyRead(1756);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Remote space=583 exceeds expected space=-1173
         */
      }
  }
}
