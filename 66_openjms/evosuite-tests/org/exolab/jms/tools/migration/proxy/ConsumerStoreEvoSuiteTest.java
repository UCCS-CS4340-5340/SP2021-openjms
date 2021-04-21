/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.migration.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.util.Iterator;
import javax.jms.JMSException;
import org.apache.commons.dbcp.PoolingConnection;
import org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList;
import org.exolab.jms.client.JmsDestination;
import org.exolab.jms.client.JmsQueue;
import org.exolab.jms.client.JmsTemporaryQueue;
import org.exolab.jms.persistence.PersistenceException;
import org.exolab.jms.tools.migration.IteratorAdapter;
import org.exolab.jms.tools.migration.StoreIterator;
import org.exolab.jms.tools.migration.proxy.Consumer;
import org.exolab.jms.tools.migration.proxy.ConsumerStore;
import org.exolab.jms.tools.migration.proxy.DestinationStore;
import org.exolab.jms.tools.migration.proxy.Subscription;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ConsumerStoreEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ConsumerStore consumerStore0 = new ConsumerStore((DestinationStore) null, (Connection) null);
      // Undeclared exception!
      try {
        consumerStore0.size();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PoolingConnection poolingConnection0 = new PoolingConnection((Connection) null);
      ConsumerStore consumerStore0 = new ConsumerStore((DestinationStore) null, (Connection) poolingConnection0);
      // Undeclared exception!
      try {
        consumerStore0.exportCollection();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ConsumerStore consumerStore0 = new ConsumerStore((DestinationStore) null, (Connection) null);
      JmsTemporaryQueue jmsTemporaryQueue0 = new JmsTemporaryQueue();
      Consumer consumer0 = new Consumer((JmsQueue) jmsTemporaryQueue0);
      // Undeclared exception!
      try {
        consumerStore0.add(consumer0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ConsumerStore consumerStore0 = new ConsumerStore((DestinationStore) null, (Connection) null);
      ConstraintDescriptorList constraintDescriptorList0 = new ConstraintDescriptorList();
      Iterator<Object> iterator0 = constraintDescriptorList0.iterator();
      IteratorAdapter iteratorAdapter0 = new IteratorAdapter(iterator0);
      consumerStore0.importCollection((StoreIterator) iteratorAdapter0);
      assertEquals(false, iteratorAdapter0.hasNext());
  }

  @Test
  public void test4()  throws Throwable  {
      ConsumerStore consumerStore0 = new ConsumerStore((DestinationStore) null, (Connection) null);
      JmsTemporaryQueue jmsTemporaryQueue0 = new JmsTemporaryQueue();
      Consumer consumer0 = new Consumer((JmsQueue) jmsTemporaryQueue0);
      consumerStore0.addSubscriptions(0L, consumer0);
      assertNull(consumer0.getName());
  }

  @Test
  public void test5()  throws Throwable  {
      ConsumerStore consumerStore0 = new ConsumerStore((DestinationStore) null, (Connection) null);
      JmsQueue jmsQueue0 = new JmsQueue((String) null);
      Subscription subscription0 = new Subscription((JmsDestination) jmsQueue0);
      consumerStore0.addMessages((-5L), (-5L), subscription0);
  }
}