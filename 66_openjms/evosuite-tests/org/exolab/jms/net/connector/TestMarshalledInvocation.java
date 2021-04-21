/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.connector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.rmi.MarshalledObject;
import org.exolab.jms.net.connector.Caller;
import org.exolab.jms.net.connector.CallerImpl;
import org.exolab.jms.net.connector.MarshalledInvocation;
import org.exolab.jms.net.uri.URI;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestMarshalledInvocation {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MarshalledObject<String> marshalledObject0 = new MarshalledObject<String>("X8b-");
      URI uRI0 = new URI("X8b-", "X8b-", "X8b-", "X8b-", "X8b-");
      CallerImpl callerImpl0 = new CallerImpl(uRI0, uRI0);
      MarshalledInvocation marshalledInvocation0 = new MarshalledInvocation((MarshalledObject) marshalledObject0, (Caller) callerImpl0);
      CallerImpl callerImpl1 = (CallerImpl)marshalledInvocation0.getCaller();
      assertSame(callerImpl0, callerImpl1);
  }

  @Test
  public void test1()  throws Throwable  {
      MarshalledObject<String> marshalledObject0 = new MarshalledObject<String>("X8b-");
      URI uRI0 = new URI("X8b-", "X8b-", "X8b-", "X8b-", "X8b-");
      CallerImpl callerImpl0 = new CallerImpl(uRI0, uRI0);
      MarshalledInvocation marshalledInvocation0 = new MarshalledInvocation((MarshalledObject) marshalledObject0, (Caller) callerImpl0);
      try {
        marshalledInvocation0.getRequest();
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.String cannot be cast to org.exolab.jms.net.connector.Request
         */
      }
  }
}