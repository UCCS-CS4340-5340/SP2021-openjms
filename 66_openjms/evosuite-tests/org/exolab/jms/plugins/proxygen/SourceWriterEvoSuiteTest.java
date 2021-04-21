/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.plugins.proxygen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import org.exolab.jms.plugins.proxygen.SourceWriter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SourceWriterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      SourceWriter sourceWriter0 = new SourceWriter((Writer) pipedWriter0);
      sourceWriter0.writelnInc(";z~,Z,Yc91hopb>f");
      SourceWriter sourceWriter1 = (SourceWriter)sourceWriter0.append((CharSequence) ";z~,Z,Yc91hopb>f");
      assertSame(sourceWriter1, sourceWriter0);
  }

  @Test
  public void test1()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourceWriter sourceWriter0 = new SourceWriter((Writer) stringWriter0);
      sourceWriter0.writelnDec("A!}aJshOfWePN)e");
  }

  @Test
  public void test2()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintWriter printWriter0 = new PrintWriter((OutputStream) byteArrayOutputStream0);
      BufferedWriter bufferedWriter0 = new BufferedWriter((Writer) printWriter0);
      SourceWriter sourceWriter0 = new SourceWriter((Writer) bufferedWriter0);
      sourceWriter0.writeln();
  }

  @Test
  public void test3()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourceWriter sourceWriter0 = new SourceWriter((Writer) stringWriter0);
      char[] charArray0 = new char[5];
      sourceWriter0.write(charArray0);
  }

  @Test
  public void test4()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      SourceWriter sourceWriter0 = new SourceWriter((Writer) stringWriter0);
      sourceWriter0.writelnDec();
  }

  @Test
  public void test5()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      SourceWriter sourceWriter0 = new SourceWriter((Writer) pipedWriter0);
      SourceWriter sourceWriter1 = (SourceWriter)sourceWriter0.append('|');
      assertSame(sourceWriter0, sourceWriter1);
  }

  @Test
  public void test6()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      SourceWriter sourceWriter0 = new SourceWriter((Writer) pipedWriter0);
      sourceWriter0.writelnInc();
  }
}
