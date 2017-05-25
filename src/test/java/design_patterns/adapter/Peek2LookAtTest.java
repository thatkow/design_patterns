package design_patterns.adapter;

import org.junit.Test;

public class Peek2LookAtTest {

	@Test
	public void test() {
		Peek peek = new PeekImpl();
		LookAt lookAt = new LookAtImpl(peek);
		assert(lookAt.lookat().equals(PeekImpl.SUPRISE));		
	}

}
