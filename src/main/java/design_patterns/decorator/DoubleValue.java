package design_patterns.decorator;

public class DoubleValue implements Value {

	Value value;
	
	public DoubleValue(Value value) {
		super();
		this.value = value;
	}

	@Override
	public Integer getValue() {
		return 2 * value.getValue();
	}

}
