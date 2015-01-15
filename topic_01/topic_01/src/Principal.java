
public class Principal {
	
	public static void main (String[] args){
		
		HouseBuilder houseBuilder=new BasicHouseBuilder();
		HouseDirector houseDirector=new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		House house=houseDirector.getHouse();
		System.out.println("House 1: "+ house);
		
		houseBuilder=new MediumHouseBuilder();
		houseDirector=new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		house=houseDirector.getHouse();
		System.out.println("House 2: "+ house);
		
		houseBuilder=new HighHouseBuilder();
		houseDirector=new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		house=houseDirector.getHouse();
		System.out.println("House 3: "+ house);
		
		
	}

}
