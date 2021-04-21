package org.exolab.jms.selector.parser;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import antlr.LexerSharedInputState;
import antlr.Token;
import antlr.TokenStreamException;

public class SelectorLexerTest {

	
	@Before
	public void setUp() throws Exception {
		
		LexerSharedInputState state = Mockito.mock(LexerSharedInputState.class);
		SelectorLexer SelectorLexer = new SelectorLexer(state);
		SelectorLexer.initialise();
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testInitialise() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectorLexerInputStream() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectorLexerReader() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectorLexerInputBuffer() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectorLexerLexerSharedInputState() {
//		fail("Not yet implemented");
//	}

	//kh-59
	@Test
	public void testNextToken() throws TokenStreamException {
		
		//java.lang.NullPointerException: Cannot invoke "antlr.InputBuffer.LA(int)" because "this.inputState.input" is null
		//gives this error message on line 130 of SelectorLexer class
		Token Token = Mockito.mock(Token.class);
		LexerSharedInputState state = Mockito.mock(LexerSharedInputState.class);
		SelectorLexer nextTokenTest = new SelectorLexer(state);
		assertEquals(Token, nextTokenTest.nextToken());
		
	}

//	@Test
//	public void testMLPAREN() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMRPAREN() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMCOMMA() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMEQUAL() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMNOT_EQUAL() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMDIVIDE() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMPLUS() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMMINUS() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMMULTIPLY() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMGE() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMGT() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMLE() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMLT() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMWS() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMSTRING_LITERAL() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMHEX_DIGIT() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMIDENT() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMIDENT_START() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMIDENT_PART() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMNUM_INT() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMEXPONENT() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMFLOAT_SUFFIX() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMIDENT_NON_START() {
//		fail("Not yet implemented");
//	}
//
}
