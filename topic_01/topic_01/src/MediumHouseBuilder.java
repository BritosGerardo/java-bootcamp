
public class MediumHouseBuilder implements HouseBuilder{
	
private House house;
	
	public MediumHouseBuilder(){
		house=new House();
	}

	
	
	public void buildAdress() {
		// TODO Auto-generated method stub
		house.setAdress("Av lima 234");
	}

	public void buildRoom() {
		// TODO Auto-generated method stub
		house.setRoom(5);
	}

	public void buildPrice() {
		// TODO Auto-generated method stub
		house.setPrice(550000);
	}

	public void buildBathroom() {
		// TODO Auto-generated method stub
		house.setBathroom(2);
	}

	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}



