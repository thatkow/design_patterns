package design_patterns.bulking;

import static org.junit.Assert.fail;

import org.junit.Test;

public class ChangeWiringTest {

	@Test
	public void badElectrician() {
		Electrician electrician = new Electrician();
		try {
			electrician.replaceWiring();
			fail();
		}catch(DeathByElectrocutionException e){

		}
	}

	@Test
	public void goodElectrician() {
		Electrician electrician = new Electrician();
		electrician.turnOffElectricity();
		try {
			electrician.replaceWiring();
		}catch(DeathByElectrocutionException e){
			fail();			
		}
		electrician.turnOnElectricity();
	}

}
