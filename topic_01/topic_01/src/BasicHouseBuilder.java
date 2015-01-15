
public class BasicHouseBuilder implements HouseBuilder{
	
	private House house;
	
	public BasicHouseBuilder(){
		house=new House();
	}

	
	
	public void buildAdress() {
		// TODO Auto-generated method stub
		house.setAdress("Av Colon 123");
	}

	public void buildRoom() {
		// TODO Auto-generated method stub
		house.setRoom(4);
	}

	public void buildPrice() {
		// TODO Auto-generated method stub
		house.setPrice(450000);
	}

	public void buildBathroom() {
		// TODO Auto-generated method stub
		house.setBathroom(1);
	}

	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
