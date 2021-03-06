/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import org.exolab.jms.tools.admin.DatabaseFilter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DatabaseFilterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DatabaseFilter databaseFilter0 = new DatabaseFilter();
      String string0 = databaseFilter0.getDescription();
      assertEquals("Database Files(*.db)", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      DatabaseFilter databaseFilter0 = new DatabaseFilter();
      File file0 = new File("", "");
      boolean boolean0 = databaseFilter0.accept(file0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      DatabaseFilter databaseFilter0 = new DatabaseFilter();
      File file0 = new File("Database Files(*.db)", "Database Files(*.db)");
      boolean boolean0 = databaseFilter0.accept(file0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      DatabaseFilter databaseFilter0 = new DatabaseFilter();
      File file0 = new File("OU]4{vO,$h(NN'|");
      boolean boolean0 = databaseFilter0.accept(file0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      DatabaseFilter databaseFilter0 = new DatabaseFilter();
      File file0 = new File("d#?c%st..");
      String string0 = databaseFilter0.getSuffix(file0);
      assertNull(string0);
  }
}
