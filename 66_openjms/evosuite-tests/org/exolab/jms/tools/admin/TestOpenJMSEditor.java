/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import javax.swing.JComboBox;
import javax.swing.JTree;
import org.exolab.jms.tools.admin.OpenJMSEditor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestOpenJMSEditor {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JComboBox<MouseEvent> jComboBox0 = new JComboBox<MouseEvent>();
      OpenJMSEditor openJMSEditor0 = new OpenJMSEditor((JTree) null, (JComboBox) jComboBox0);
      boolean boolean0 = openJMSEditor0.isCellEditable((EventObject) null);
      assertEquals(false, boolean0);
  }
}
