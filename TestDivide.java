import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestDivide {

	
	//First failing red line test
	@Test //Declares that the function is a Junit test
	public void assertDivideClassExists(){
		Divide d = new Divide(); //Creates a divide object and test if the reference exists
		Assert.assertNotNull(d);
		
	}

	
	
	
	
	
	
	
	
	
	
	/**
	//Second failing red line test
	@Test 
	public void assertDivideMethodAcceptsParameters(){
		Divide d = new Divide();
		
		Assert.assertTrue(d.divide(1,1) == 1); //tests that the divide function exists and accepts parameters
	}
	**/
	
	
	
	
	
	/**
	//Third Failing red line test
	@Test
	public void assertDivideCanDivideTwoPositiveNumbers(){
		Divide d = new Divide();
		
		
		
		Assert.assertEquals(d.divide(9, 3), 3); //tests that dividing 9 by 3 returns 3
	}
	**/
	
	/**
	//fourth failing red line test
	@Test(expected = IllegalArgumentException.class)   //test is expecting an error
	public void assertDivideByZeroError(){
		Divide d = new Divide();
		d.divide(1, 0);
		
		
		
	}
	**/
	/**
	//fifth passing red line test
	@Test
	public void assertDivideWorksForOneNegativeNumber(){
		Divide d = new Divide();
		
		Assert.assertEquals(d.divide(-16, 4), -4 ); //test that dividing a negative by positive returns negative
		
		
	}
	**/
	/**
	//sixth passing red line test
	@Test
	public void assertDivideWorksForTwoNegativeNumbers(){
		Divide d = new Divide();
		
		Assert.assertEquals(d.divide(-16, -4), 4 ); //test that dividing a  negative by negative  returns positive
		
		
	}
	**/
	/**
	//seventh passing red line test 
	@Test
	public void assertDivideIntoZero(){
		Divide d = new Divide();
		Assert.assertEquals(d.divide(0, 1000000), 0); //test that dividing from 0 returns 0
	}
	**/

	
	
	

}
