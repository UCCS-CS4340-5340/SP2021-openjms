package org.exolab.jms.tools.migration;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MigrationHelperTest {

	static MigrationHelper MigrationHelper;
	
	@Before
	public void setUp() throws Exception {
		MigrationHelper = new MigrationHelper();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	//kh-18
	@Test
	public void testGetDataSource() {
		assertEquals("org.apache.derby.jdbc.EmbeddedDataSource@47db50c5", org.exolab.jms.tools.migration.MigrationHelper.getDataSource("Testing"));
	}

}
