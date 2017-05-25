package design_patterns.bulking;

public class Electrician {

	ElectricitySwitch electricitySwitch = ElectricitySwitch.LIVE;
	
	public void turnOffElectricity(){
		electricitySwitch = ElectricitySwitch.OFF;
	}
	
	public void replaceWiring() throws DeathByElectrocutionException {
		if(electricitySwitch.equals(ElectricitySwitch.LIVE)){
			throw new DeathByElectrocutionException("You has died");
		}
	}

	public void turnOnElectricity(){
		electricitySwitch = ElectricitySwitch.LIVE;
	}
	
}
