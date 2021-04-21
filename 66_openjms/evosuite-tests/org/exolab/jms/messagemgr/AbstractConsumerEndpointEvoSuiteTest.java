/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.messagemgr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.jms.InvalidSelectorException;
import javax.jms.JMSException;
import org.exolab.jms.client.JmsTemporaryTopic;
import org.exolab.jms.client.JmsTopic;
import org.exolab.jms.messagemgr.DestinationManager;
import org.exolab.jms.messagemgr.DurableConsumerEndpoint;
import org.exolab.jms.messagemgr.TopicConsumerEndpoint;
import org.exolab.jms.persistence.PersistenceException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AbstractConsumerEndpointEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic();
      DurableConsumerEndpoint durableConsumerEndpoint0 = null;
      try {
        durableConsumerEndpoint0 = new DurableConsumerEndpoint((-1722L), jmsTopic0, "`lu@[3L", (DestinationManager) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TopicConsumerEndpoint topicConsumerEndpoint0 = null;
      try {
        topicConsumerEndpoint0 = new TopicConsumerEndpoint(1832L, 1832L, (JmsTopic) null, "", true, (DestinationManager) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'destination' is null
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      JmsTemporaryTopic jmsTemporaryTopic0 = new JmsTemporaryTopic();
      TopicConsumerEndpoint topicConsumerEndpoint0 = null;
      try {
        topicConsumerEndpoint0 = new TopicConsumerEndpoint(0L, 0L, (JmsTopic) jmsTemporaryTopic0, "y o$mtoMM[x^O", true, (DestinationManager) null);
        fail("Expecting exception: InvalidSelectorException");
      } catch(InvalidSelectorException e) {
        /*
         * line 1, column 3: unexpected token: o$mtoMM
         */
      }
  }
}