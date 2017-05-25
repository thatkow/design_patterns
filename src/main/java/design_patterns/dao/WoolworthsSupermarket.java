package design_patterns.dao;

public class WoolworthsSupermarket implements Supermarket {

	public static final String SELECT_MILK = "Select Milk";

	@Override
	public String buyMilk() {
		return SELECT_MILK;
	}

}
