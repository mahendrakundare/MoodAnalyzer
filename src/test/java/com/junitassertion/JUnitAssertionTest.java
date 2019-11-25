package com.junitassertion;

import org.junit.Assert;
import org.junit.Test;

public class JUnitAssertionTest {

    @Test
    public void assertionTest() {
        //Variable declartion
        String string1 = "Junit";
        String string2 = "Junit";
        Object obj1 = new Object();
        Object obj2 = new Object();
        String string5 = null;
        int variable1=1;
        int variable2=2;
        int[] arithmaticArray1 = {1, 2, 3};
        int[] arithmaticArray2 = {1, 2, 3};

        //Array Statement
        Assert.assertEquals(string1,string2);
        Assert.assertSame(string1,string2);
        Assert.assertSame(obj1,obj1);
        Assert.assertNotSame(obj1, obj2);
        Assert.assertNotNull(string1);
        Assert.assertNull(string5);
        Assert.assertTrue(variable1<variable2);
        Assert.assertArrayEquals(arithmaticArray1,arithmaticArray2);
    }

}
