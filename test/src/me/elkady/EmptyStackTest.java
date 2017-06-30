package me.elkady;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmptyStackTest {
    private Stack<String> stack;

    @Before
    public void setup() {
        stack = new Stack<>();
    }

    @Test
    public void testEmptyPop(){
        try {
            stack.pop();
            fail();
        } catch(RuntimeException ex) {
            assertTrue(true);
        }
    }

    @Test
    public void testEmptyPeek(){
        String p = stack.peek();
        assertNull(p);
    }

    @Test
    public void testPushPop() {
        String s1 = "Test";

        stack.push(s1);
        String s2 = stack.pop();

        assertEquals(s1, s2);

        try {
            stack.pop();
            fail();
        } catch(RuntimeException ex) {
            assertTrue(true);
        }
    }

    @Test
    public void testPushPeek() {
        String s1 = "Test";

        stack.push(s1);
        String s2 = stack.peek();

        assertEquals(s1, s2);
        stack.pop();
    }
}