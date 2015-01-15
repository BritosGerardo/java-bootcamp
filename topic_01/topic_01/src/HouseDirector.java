
public class HouseDirector {
	
	private HouseBuilder houseBuilder=null;
	
	public HouseDirector (HouseBuilder houseBuilder){
		this.houseBuilder=houseBuilder;
	}
	
	public void constructHouse(){
		houseBuilder.buildAdress();
		houseBuilder.buildRoom();
		houseBuilder.buildPrice();
		houseBuilder.buildBathroom();
	}
	
	public House getHouse(){
		return houseBuilder.getHouse();
	}

}
