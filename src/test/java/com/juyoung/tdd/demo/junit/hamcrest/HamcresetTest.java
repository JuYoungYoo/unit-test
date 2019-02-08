package com.juyoung.tdd.demo.junit.hamcrest;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HamcresetTest {

    @Test
    public void assertThat_default() throws Exception {
        assertThat(123, is("123")); // fail
    }

    @Test
    public void assertThat_array() throws Exception {
        // ASSERT ARRAY
        assertArrayEquals(new String[] {"test1", "test2"}, new String[] {"test3", "test4"});
        assertThat(new String[]{"test3","test4"}, is(new String[]{"test3","test4"}));
        // /ASSERT ARRAY
    }

    @Test
    public void assertThat_boolean() throws Exception {
        assertTrue(true);
        assertFalse(false);

        assertThat(true, is(true));
        assertThat(false, is(false));
    }
    @Test
    public void assertThat_null() throws Exception {
        String test = null;
        assertNull(test);
        test = "test";
        assertNotNull(test);

    }
    @Test
    public void assertThat_same() throws Exception {
        assertSame(3,3);
        assertNotSame(3,1);

        List<Integer> list = Arrays.asList(1,2,3,4);
        assertThat(list, sameInstance(list));
        assertThat(list, not(sameInstance(Arrays.asList(1,2,3))));
    }

    @Test
    public void assertThat_true() throws Exception {
        assertThat(5, greaterThan(2)); // 5 > 2

//        assertThat("abc",containsString("c"));  // true
        assertThat("abc",containsString("d"));  // fail
    }
}
