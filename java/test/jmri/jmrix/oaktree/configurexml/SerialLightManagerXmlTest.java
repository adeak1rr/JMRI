package jmri.jmrix.oaktree.configurexml;

import jmri.util.JUnitUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * SerialLightManagerXmlTest.java
 *
 * Test for the SerialLightManagerXml class
 *
 * @author   Paul Bender  Copyright (C) 2016
 */
public class SerialLightManagerXmlTest {

    @Test
    public void testCtor(){
      Assert.assertNotNull("SerialLightManagerXml constructor",new SerialLightManagerXml());
    }

    @Before
    public void setUp() {
        JUnitUtil.setUp();
    }

    @After
    public void tearDown() {
        JUnitUtil.tearDown();
    }

}

