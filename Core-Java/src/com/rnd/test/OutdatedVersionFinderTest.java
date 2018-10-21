package com.rnd.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.rnd.core.OutdatedVersionFinder;

public class OutdatedVersionFinderTest {

		OutdatedVersionFinder ovf = null;
	 	@Before  
	    public void setUp() throws Exception {  
	 		ovf = new OutdatedVersionFinder();
	    }
	 	
	 	@Test
	 	public void testFindOutdatedVersion(){
	 		assertEquals(true, ovf.findOutdatedVersion());
	 	}
	 	
	 	
	 	 @After  
	     public void tearDown() throws Exception {  
	         ovf = null; 
	     }  
}
