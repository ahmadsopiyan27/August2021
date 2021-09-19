package qaautomation.august2021;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
	@BeforeMethod
	public void setUp() {
		System.out.println("this is set up");
	}
    @Test
    public void test() {
        assertEquals( 1, 1);
        // result vs expected
    }
    
    @AfterMethod
    public void close() {
    	System.out.println("this is after method");
    }

	
		
	}
