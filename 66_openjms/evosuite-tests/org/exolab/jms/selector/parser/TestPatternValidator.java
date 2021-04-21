/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.selector.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.selector.SelectorException;
import org.exolab.jms.selector.parser.PatternValidator;
import org.exolab.jms.selector.parser.SelectorAST;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestPatternValidator {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SelectorAST selectorAST0 = new SelectorAST();
      PatternValidator.validate(selectorAST0, (SelectorAST) null);
      assertEquals(" null", selectorAST0.toStringList());
  }

  @Test
  public void test1()  throws Throwable  {
      SelectorAST selectorAST0 = new SelectorAST();
      selectorAST0.setText("^");
      // Undeclared exception!
      try {
        PatternValidator.validate(selectorAST0, selectorAST0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SelectorAST selectorAST0 = new SelectorAST();
      selectorAST0.setText("7ealubswLAzor;");
      // Undeclared exception!
      try {
        PatternValidator.validate(selectorAST0, selectorAST0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
