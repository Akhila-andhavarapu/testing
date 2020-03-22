package com.mycompany.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveACharTest {
 
	RemoveAChar r;
	@BeforeEach
	void setUp() {
		r= new RemoveAChar();
	}
	@Test
	void test1() {
		assertEquals("BCD", r.remove("ABCD"));
	}
	
	@Test
	void test2() {
		assertEquals("CD",r.remove("AACD"));
	}
	@Test
	void test3() {
		assertEquals("BCD", r.remove("BACD"));
	}
	@Test
	void test4() {
		assertEquals("BBAA", r.remove("BBAA"));
	}
	@Test
	void test5() {
		assertEquals("BBAA", r.remove("AABBAA"));
	}
	

}
