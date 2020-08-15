package com.sapient.week1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testCheckEven()
    {
        assertEquals( false,CheckEven.isEven(19) );
	assertEquals( true,CheckEven.isEven(20) );
	assertEquals( true,CheckEven.isEven(8) );
	assertEquals( false,CheckEven.isEven(5) );
    }
}
