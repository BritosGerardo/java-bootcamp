
public class HighHouseBuilder implements HouseBuilder{
	
	
private House house;
	
	public HighHouseBuilder(){
		house=new House();
	}

	
	
	public void buildAdress() {
		// TODO Auto-generated method stub
		house.setAdress("Av velez sarsfield 345");
	}

	public void buildRoom() {
		// TODO Auto-generated method stub
		house.setRoom(7);
	}

	public void buildPrice() {
		// TODO Auto-generated method stub
		house.setPrice(750000);
	}

	public void buildBathroom() {
		// TODO Auto-generated method stub
		house.setBathroom(4);
	}

	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
