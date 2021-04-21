/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.util.CommandLine;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestCommandLine {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.add(">P'Y", ">P'Y");
      assertEquals(true, boolean0);
      
      boolean boolean1 = commandLine0.exists(">P'Y");
      assertEquals(true, boolean1);
  }

  @Test
  public void test1()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.isParameter("-");
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.isSwitch("!o*u");
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-";
      stringArray0[1] = "-";
      stringArray0[2] = "";
      stringArray0[3] = "-";
      stringArray0[4] = "-";
      stringArray0[5] = "-";
      stringArray0[6] = "";
      stringArray0[7] = "";
      CommandLine commandLine0 = new CommandLine(stringArray0);
      assertNotNull(commandLine0);
      
      boolean boolean0 = commandLine0.exists("");
      assertEquals(true, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.exists(">P'Y");
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-";
      stringArray0[1] = "-";
      stringArray0[2] = "";
      stringArray0[3] = "-";
      stringArray0[4] = "-";
      stringArray0[5] = "-";
      stringArray0[6] = "";
      stringArray0[7] = "";
      CommandLine commandLine0 = new CommandLine(stringArray0);
      assertNotNull(commandLine0);
      
      String string0 = commandLine0.value("", "-");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.value(">P'Y", ">P'Y");
      assertEquals(">P'Y", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.add((String) null, (String) null, true);
      boolean boolean1 = commandLine0.add((String) null, (String) null, false);
      assertFalse(boolean1 == boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.add("!o*u", "!o*u", false);
      boolean boolean1 = commandLine0.add("!o*u", "!o*u", false);
      assertFalse(boolean1 == boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-cq@*+7zw$@{B5,/W4";
      CommandLine commandLine0 = new CommandLine(stringArray0);
      assertNotNull(commandLine0);
  }
}
