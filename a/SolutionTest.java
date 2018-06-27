package com.section.a.one.a;

import org.junit.Test;

import com.section.A.One.A.Solution1A;

public class SolutionTest {

	@Test
    public void testSing(){
        Bird bird = new Bird();
        assertEquals("I am Singing", true, bird.sing());
    }
}
