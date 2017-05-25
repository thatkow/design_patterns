package design_patterns.dao;

public class ColesSupermarket implements Supermarket{

	public static final String HOMEBRAND_MILK = "Homebrand Milk";

	@Override
	public String buyMilk() {
		return HOMEBRAND_MILK;
	}

}
