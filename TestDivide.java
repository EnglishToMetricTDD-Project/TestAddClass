import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestDivide {

	
	//First failing red line test
	@Test
	public void assertDivideClassExists(){
		Divide d = new Divide();
		Assert.assertNotNull(d);
		
	}

	
	//Second failing red line test
	@Test 
	public void assertDivideMethodAcceptsParameters(){
		Divide d = new Divide();
		
		Assert.assertTrue(d.divide(1,1) == 1);
	}
	
	//Third Failing red line test
	@Test
	public void assertDivideCanDivideTwoPositiveNumbers(){
		Divide d = new Divide();
		
		
		
		Assert.assertEquals(d.divide(9, 3), 3);
	}
	
	//fourth failing red line test
	@Test(expected = IllegalArgumentException.class)
	public void assertDivideByZeroError(){
		Divide d = new Divide();
		d.divide(1, 0);
		
		
		
	}
	
	//fifth passing red line test
	@Test
	public void assertDivideWorksForOneNegativeNumber(){
		Divide d = new Divide();
		
		Assert.assertEquals(d.divide(-16, 4), -4 );
		
		
	}
	
	//sixth passing red line test
	@Test
	public void assertDivideWorksForTwoNegativeNumbers(){
		Divide d = new Divide();
		
		Assert.assertEquals(d.divide(-16, -4), 4 );
		
		
	}
	
	//seventh passing red line test 
	@Test
	public void assertDivideIntoZero(){
		Divide d = new Divide();
		Assert.assertEquals(d.divide(0, 1000000), 0);
	}
	
	
	
	

}
