/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.jndi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Hashtable;
import java.util.Properties;
import javax.naming.ConfigurationException;
import javax.naming.NamingException;
import org.codehaus.spice.jndikit.NamingProvider;
import org.exolab.jms.jndi.InitialContextFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class InitialContextFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      InitialContextFactory initialContextFactory0 = new InitialContextFactory();
      Hashtable<String, NamingProvider> hashtable0 = new Hashtable<String, NamingProvider>();
      try {
        initialContextFactory0.getInitialContext(hashtable0);
        fail("Expecting exception: ConfigurationException");
      } catch(ConfigurationException e) {
        /*
         * Cannot connect to JNDI provider - java.naming.provider.url not set 
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      InitialContextFactory initialContextFactory0 = new InitialContextFactory();
      try {
        initialContextFactory0.getInitialContext((Hashtable) null);
        fail("Expecting exception: ConfigurationException");
      } catch(ConfigurationException e) {
        /*
         * Cannot connect to JNDI provider - environment not set
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      InitialContextFactory initialContextFactory0 = new InitialContextFactory();
      Properties properties0 = new Properties();
      properties0.put((Object) "java.naming.provider.url", (Object) "java.naming.provider.url");
      try {
        initialContextFactory0.getInitialContext((Hashtable) properties0);
        fail("Expecting exception: ConfigurationException");
      } catch(ConfigurationException e) {
        /*
         * No scheme found in URI.
         */
      }
  }
}
