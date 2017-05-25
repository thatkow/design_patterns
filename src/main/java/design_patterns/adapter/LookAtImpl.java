package design_patterns.adapter;

public class LookAtImpl implements LookAt {

	Peek peek;
	
	public LookAtImpl(Peek peek) {
		super();
		this.peek = peek;
	}

	@Override
	public String lookat() {
		return peek.peek();
	}

}
