/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.tools.db.TypeMapper;
import org.exolab.jms.tools.db.TypeSet;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestTypeMapper {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TypeMapper typeMapper0 = null;
      try {
        typeMapper0 = new TypeMapper((TypeSet) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}