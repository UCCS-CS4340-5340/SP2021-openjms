/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Connection;
import org.exolab.jms.authentication.User;
import org.exolab.jms.persistence.PersistenceException;
import org.exolab.jms.persistence.Users;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestUsers {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Users users0 = new Users();
      User user0 = new User("", "");
      try {
        users0.add((Connection) null, user0);
        fail("Expecting exception: PersistenceException");
      } catch(PersistenceException e) {
        /*
         * Users.add failed with java.lang.NullPointerException
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Users users0 = new Users();
      try {
        users0.update((Connection) null, (User) null);
        fail("Expecting exception: PersistenceException");
      } catch(PersistenceException e) {
        /*
         * Users.add failed with java.lang.NullPointerException
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Users users0 = new Users();
      boolean boolean0 = users0.remove((Connection) null, (User) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      Users users0 = new Users();
      User user0 = new User("", "");
      try {
        users0.remove((Connection) null, user0);
        fail("Expecting exception: PersistenceException");
      } catch(PersistenceException e) {
        /*
         * Users.remove failed java.lang.NullPointerException
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Users users0 = new Users();
      User user0 = users0.get((Connection) null, (User) null);
      assertNull(user0);
  }

  @Test
  public void test5()  throws Throwable  {
      Users users0 = new Users();
      User user0 = new User();
      try {
        users0.get((Connection) null, user0);
        fail("Expecting exception: PersistenceException");
      } catch(PersistenceException e) {
        /*
         * Users.get failed java.lang.NullPointerException
         */
      }
  }
}