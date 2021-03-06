/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import org.exolab.castor.util.NestedIOException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.exolab.jms.config.RdbmsDatabaseConfiguration;
import org.junit.BeforeClass;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.XMLFilterImpl;

@RunWith(EvoSuiteRunner.class)
public class RdbmsDatabaseConfigurationEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.hasTestBeforeUse();
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
  }

  @Test
  public void test1()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      int int0 = rdbmsDatabaseConfiguration0.getEvictionInterval();
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(0, int0);
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
  }

  @Test
  public void test2()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      int int0 = rdbmsDatabaseConfiguration0.getMinIdleTime();
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(0, int0);
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
  }

  @Test
  public void test3()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      int int0 = rdbmsDatabaseConfiguration0.getMaxActive();
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(10, int0);
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
  }

  @Test
  public void test4()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      int int0 = rdbmsDatabaseConfiguration0.getMaxIdle();
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(10, int0);
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
  }

  @Test
  public void test5()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.hasBatch();
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
  }

  @Test
  public void test6()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.deleteTestBeforeUse();
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(false, rdbmsDatabaseConfiguration0.hasTestBeforeUse());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
  }

  @Test
  public void test7()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.setEvictionInterval(0);
      assertEquals(true, rdbmsDatabaseConfiguration0.hasEvictionInterval());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
  }

  @Test
  public void test8()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.setBatchSize(1889);
      assertEquals(1889, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
  }

  @Test
  public void test9()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.getUser();
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
  }

  @Test
  public void test10()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      boolean boolean0 = rdbmsDatabaseConfiguration0.isValid();
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(false, boolean0);
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
  }

  @Test
  public void test11()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.deleteEvictionInterval();
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(false, rdbmsDatabaseConfiguration0.hasEvictionInterval());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
  }

  @Test
  public void test12()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.getPassword();
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
  }

  @Test
  public void test13()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.setDriver((String) null);
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
  }

  @Test
  public void test14()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.setMinIdleTime(0);
      assertEquals(true, rdbmsDatabaseConfiguration0.hasMinIdleTime());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
  }

  @Test
  public void test15()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      boolean boolean0 = rdbmsDatabaseConfiguration0.getBatch();
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(false, boolean0);
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
  }

  @Test
  public void test16()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.hasEvictionInterval();
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
  }

  @Test
  public void test17()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.hasMaxActive();
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
  }

  @Test
  public void test18()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.setTestBeforeUse(true);
      assertEquals(true, rdbmsDatabaseConfiguration0.hasTestBeforeUse());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
  }

  @Test
  public void test19()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      try {
        rdbmsDatabaseConfiguration0.marshal((ContentHandler) xMLFilterImpl0);
        fail("Expecting exception: NestedIOException");
      } catch(NestedIOException e) {
        /*
         * System property org.xml.sax.parser not specified
         */
      }
  }

  @Test
  public void test20()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.getUrl();
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
  }

  @Test
  public void test21()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.setUser("ISO-8859-5");
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
  }

  @Test
  public void test22()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.hasMinIdleTime();
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
  }

  @Test
  public void test23()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.setMaxActive((-114));
      assertEquals(true, rdbmsDatabaseConfiguration0.hasMaxActive());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
  }

  @Test
  public void test24()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.hasBatchSize();
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
  }

  @Test
  public void test25()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.setMaxIdle((-114));
      assertEquals(-114, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
  }

  @Test
  public void test26()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.setTestQuery("Tq.=<kQfyCk");
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
  }

  @Test
  public void test27()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.deleteMaxActive();
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(false, rdbmsDatabaseConfiguration0.hasMaxActive());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
  }

  @Test
  public void test28()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.deleteBatch();
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(false, rdbmsDatabaseConfiguration0.hasBatch());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
  }

  @Test
  public void test29()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.setUrl("");
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
  }

  @Test
  public void test30()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      boolean boolean0 = rdbmsDatabaseConfiguration0.getTestBeforeUse();
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(false, boolean0);
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
  }

  @Test
  public void test31()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.getTestQuery();
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
  }

  @Test
  public void test32()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.deleteBatchSize();
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(false, rdbmsDatabaseConfiguration0.hasBatchSize());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
  }

  @Test
  public void test33()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.setPassword((String) null);
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
  }

  @Test
  public void test34()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.hasMaxIdle();
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
  }

  @Test
  public void test35()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.deleteMinIdleTime();
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(false, rdbmsDatabaseConfiguration0.hasMinIdleTime());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
  }

  @Test
  public void test36()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.setBatch(false);
      assertEquals(true, rdbmsDatabaseConfiguration0.hasBatch());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
  }

  @Test
  public void test37()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      // Undeclared exception!
      try {
        rdbmsDatabaseConfiguration0.marshal((Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'out' is null.
         */
      }
  }

  @Test
  public void test38()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      rdbmsDatabaseConfiguration0.deleteMaxIdle();
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(false, rdbmsDatabaseConfiguration0.hasMaxIdle());
      assertEquals(10, rdbmsDatabaseConfiguration0.getBatchSize());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
  }

  @Test
  public void test39()  throws Throwable  {
      RdbmsDatabaseConfiguration rdbmsDatabaseConfiguration0 = new RdbmsDatabaseConfiguration();
      int int0 = rdbmsDatabaseConfiguration0.getBatchSize();
      assertEquals(false, rdbmsDatabaseConfiguration0.getBatch());
      assertEquals(false, rdbmsDatabaseConfiguration0.getTestBeforeUse());
      assertEquals("org.exolab.jms.persistence.DBCPConnectionManager", rdbmsDatabaseConfiguration0.getClazz());
      assertEquals(0, rdbmsDatabaseConfiguration0.getMinIdleTime());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxIdle());
      assertEquals(10, rdbmsDatabaseConfiguration0.getMaxActive());
      assertEquals(10, int0);
  }

  @Test
  public void test40()  throws Throwable  {
      try {
        RdbmsDatabaseConfiguration.unmarshal((Reader) null);
        fail("Expecting exception: MarshalException");
      } catch(MarshalException e) {
        /*
         * 
         */
      }
  }
}
