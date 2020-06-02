package com.dikzz;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class MainTest {

    private static class ExampleClass {
        private String name;
        private Integer test;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getTest() {
            return test;
        }

        public void setTest(Integer test) {
            this.test = test;
        }
    }

    private Main main = new Main();

    @Test
    public void test1() {

        Set<String> output = main.test("three");

        Set<String> expected = new TreeSet<>(Comparator.nullsFirst(Comparator.comparing(ExampleClass::getTest)));
        expected.addAll(Arrays.asList("One", "four"));

        assertEquals(expected, output);

    }
}