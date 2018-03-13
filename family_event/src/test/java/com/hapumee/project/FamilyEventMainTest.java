package com.hapumee.project;

import junit.framework.TestCase;

public class FamilyEventMainTest extends TestCase{
    public void testReverse() {
        String actual = FamilyEventMain.reverse("hello");
        String expected = "olleh";
        assertEquals(expected, actual);
    }
}