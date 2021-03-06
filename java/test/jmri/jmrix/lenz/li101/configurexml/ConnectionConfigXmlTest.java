package jmri.jmrix.lenz.li101.configurexml;

import jmri.util.JUnitUtil;
import org.junit.Before;
import jmri.jmrix.lenz.li101.ConnectionConfig;

/**
 * ConnectionConfigXmlTest.java
 *
 * Test for the ConnectionConfigXml class
 *
 * @author   Paul Bender  Copyright (C) 2016
 */
public class ConnectionConfigXmlTest extends jmri.jmrix.lenz.configurexml.AbstractXNetSerialConnectionConfigXmlTest {

    @Before
    @Override
    public void setUp() {
        JUnitUtil.setUp();
        xmlAdapter = new ConnectionConfigXml();
        cc = new ConnectionConfig();
    }
}
