package design_patterns.dao;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;


public class ConsumersBuyMilk {

	@Test
	public void test() {
		
		List<Supermarket> supermarkets = Arrays.asList(new ColesSupermarket(),new WoolworthsSupermarket(),new ColesSupermarket());
		List<String> expectedMilk = Arrays.asList(ColesSupermarket.HOMEBRAND_MILK,WoolworthsSupermarket.SELECT_MILK,ColesSupermarket.HOMEBRAND_MILK);
		
		List<String> milkFromSupermarkets = supermarkets.stream().map(e -> e.buyMilk()).collect(Collectors.toList());

		assert(milkFromSupermarkets.equals(expectedMilk));
	}

}
