package me.elkady;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NonEmptyStackTest {
    private Stack<String> stack;

    @Before
    public void setup() {
        stack = new Stack<>();
        stack.push("Test");
    }

    @Test
    public void testEmptyPop() throws Exception {
        stack.pop();
        assertTrue(true);
    }

    @Test
    public void testEmptyPeek() throws Exception {
        stack.peek();
        assertTrue(true);
    }


}
