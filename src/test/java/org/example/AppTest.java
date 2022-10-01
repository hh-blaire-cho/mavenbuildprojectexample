package org.example;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

    String apple;
    String banana;

    @Before
    public void setup() {
        apple = "APPLE";
        banana = "BANANA";
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
        assertEquals(apple, "APPLE");
        assertThat(banana, equalTo("BANANA"));
    }

    @Test
    public void testMockito() {
        Complicate cp = mock(Complicate.class);
        when(cp.func()).thenReturn("qwerty");
        assertThat(cp.func(), equalTo("qwerty"));
    }

    @Test
    public void testNonMockito() {
        Complicate cp = new Complicate();
        assertThat(cp.func(), equalTo("abcde"));
    }
}
