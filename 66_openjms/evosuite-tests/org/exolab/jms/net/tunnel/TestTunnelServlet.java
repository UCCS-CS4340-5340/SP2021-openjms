/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.tunnel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.exolab.jms.net.tunnel.TunnelServlet;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestTunnelServlet {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TunnelServlet tunnelServlet0 = new TunnelServlet();
      // Undeclared exception!
      try {
        tunnelServlet0.doGet((HttpServletRequest) null, (HttpServletResponse) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TunnelServlet tunnelServlet0 = new TunnelServlet();
      // Undeclared exception!
      try {
        tunnelServlet0.init();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
