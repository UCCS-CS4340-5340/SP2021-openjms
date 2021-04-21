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
public class MultiplexOutputStreamEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream((-1), (Multiplexer) null, 136, (-1));
      assertNotNull(multiplexOutputStream0);
      
      multiplexOutputStream0.disconnected();
      multiplexOutputStream0.write(126);
      try {
        multiplexOutputStream0.close();
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Connection has been closed
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream((-1), (Multiplexer) null, 136, (-1));
      assertNotNull(multiplexOutputStream0);
      
      String string0 = multiplexOutputStream0.toString();
      assertEquals("MultiplexOutputStream[index=0]", string0);
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream((-1), (Multiplexer) null, 136, (-1));
      multiplexOutputStream0.setType((byte)103);
      assertEquals("MultiplexOutputStream[index=0]", multiplexOutputStream0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream((-1), (Multiplexer) null, 126, 126);
      assertNotNull(multiplexOutputStream0);
      
      multiplexOutputStream0.write(126);
      // Undeclared exception!
      try {
        multiplexOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream(110, (Multiplexer) null, 110, 32);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try {
        multiplexOutputStream0.write(byteArray0, 229, 725);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream(2011, (Multiplexer) null, 2011, 2011);
      assertNotNull(multiplexOutputStream0);
      
      byte[] byteArray0 = new byte[9];
      multiplexOutputStream0.write(byteArray0);
      assertEquals("MultiplexOutputStream[index=9]", multiplexOutputStream0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream(7, (Multiplexer) null, 0, 7);
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
  public void test7()  throws Throwable  {
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream(63, (Multiplexer) null, 0, 0);
      assertNotNull(multiplexOutputStream0);
      
      // Undeclared exception!
      try {
        multiplexOutputStream0.write(328);
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
      MultiplexOutputStream multiplexOutputStream0 = new MultiplexOutputStream(1, (Multiplexer) null, 1, 0);
      try {
        multiplexOutputStream0.notifyRead(980);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Remote space=980 exceeds expected space=0
         */
      }
  }
}
