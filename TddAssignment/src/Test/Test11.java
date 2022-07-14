package Test;

import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Test;

import Code.Assignment11;

import Code.Assignment11check;

class Test11 {



	@Test
	void test() {
		
		Assignment11 st1=Assignment11.getAssignment11();
		Assignment11 st2=Assignment11.getAssignment11();
		assertTrue(Assignment11check.check(st1, st2));
	}

	
}