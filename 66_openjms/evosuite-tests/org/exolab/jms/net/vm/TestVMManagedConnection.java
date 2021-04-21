/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.vm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.security.Principal;
import org.exolab.jms.net.connector.IllegalStateException;
import org.exolab.jms.net.connector.ResourceException;
import org.exolab.jms.net.connector.URIRequestInfo;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.net.vm.VMInvoker;
import org.exolab.jms.net.vm.VMManagedConnection;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestVMManagedConnection {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      URI uRI0 = new URI();
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      VMManagedConnection vMManagedConnection0 = new VMManagedConnection((Principal) null, uRIRequestInfo0, (VMInvoker) null, uRI0);
      URI uRI1 = vMManagedConnection0.getLocalURI();
      assertNull(uRI1.getUserinfo());
  }

  @Test
  public void test1()  throws Throwable  {
      URI uRI0 = new URI();
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      VMManagedConnection vMManagedConnection0 = new VMManagedConnection((Principal) null, uRIRequestInfo0, (VMInvoker) null, uRI0);
      URI uRI1 = vMManagedConnection0.getRemoteURI();
      assertEquals(false, uRI1.isGenericURI());
  }

  @Test
  public void test2()  throws Throwable  {
      VMManagedConnection vMManagedConnection0 = null;
      try {
        vMManagedConnection0 = new VMManagedConnection((Principal) null, (URIRequestInfo) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      URI uRI0 = new URI();
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      VMManagedConnection vMManagedConnection0 = new VMManagedConnection((Principal) null, uRIRequestInfo0, (VMInvoker) null, uRI0);
      try {
        vMManagedConnection0.getConnection();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * No InvocationHandler registered
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      URI uRI0 = new URI();
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      VMManagedConnection vMManagedConnection0 = new VMManagedConnection((Principal) null, uRIRequestInfo0, (VMInvoker) null, uRI0);
      vMManagedConnection0.destroy();
      assertEquals(false, vMManagedConnection0.isAliveLocal());
  }

  @Test
  public void test5()  throws Throwable  {
      URI uRI0 = new URI();
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      VMManagedConnection vMManagedConnection0 = new VMManagedConnection((Principal) null, uRIRequestInfo0, (VMInvoker) null, uRI0);
      vMManagedConnection0.destroyLocal();
      assertEquals(false, vMManagedConnection0.isAliveLocal());
  }
}
