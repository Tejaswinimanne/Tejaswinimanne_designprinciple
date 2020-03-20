package com.epam.TDDandJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveFirstTwoACharTest {

	/*
	 * 1. 2 chars : "AA" => "", "AB" =>"B", "BA" => "B";
	 * 2. 1 chars : "A" =>"", "B"=>"B", "C"=>"C";
	 * 3. 4 chars : "AAAA" =>"AA", "AABA"=>"BA", "ABCD"=>"BCD", "BACD"=>"BCD";
	 * 4. n chars :"AABAA"=>"BAA", "ABCD"=>"BCD";
	 * 5. empty char :""=>"";
	 */
	RemoveFirstTwoAChar removeA;
	@BeforeEach
	void setUp() {
		removeA = new RemoveFirstTwoAChar();
	}
	
	@Test
	void test2Chars() {
		assertEquals("B",removeA.remove("AB"));
		assertEquals("",removeA.remove("AA"));
	}
	
	@Test
	void test1Char() {
		assertEquals("B",removeA.remove("B"));
		assertEquals("",removeA.remove("A"));
	}
	
	@Test
	void test4Chars() {
		assertEquals("BCD",removeA.remove("ABCD"));
		assertEquals("CD",removeA.remove("AACD"));
		assertEquals("BCD",removeA.remove("BACD"));
		assertEquals("BBAA",removeA.remove("BBAA"));
	}
	
	@Test
	void testnChars() {
		assertEquals("BAA",removeA.remove("AABAA"));
		assertEquals("BCDAB",removeA.remove("BACDAB"));
	}
	
	@Test
	void testEmptyChar() {
		assertEquals("",removeA.remove(""));
	}

}
