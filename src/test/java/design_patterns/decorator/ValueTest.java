package design_patterns.decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValueTest {

	@Test
	public void testDoubleTwo() {
		
		Value value = new Two();
		
		DoubleValue doubleValue = new DoubleValue(value);
		
		assert(doubleValue.getValue().equals(4));
		
	}

	@Test
	public void testDoubleThree() {
		
		Value value = new Three();
		
		DoubleValue doubleValue = new DoubleValue(value);
		
		assert(doubleValue.getValue().equals(6));
		
	}
	
}
