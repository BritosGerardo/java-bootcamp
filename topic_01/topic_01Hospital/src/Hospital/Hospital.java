package Hospital;

public class Hospital {

	private String adress;
	private String name;
	private int room;
	private int bathroom;
	private int floor;
	
	public String getAdress(){
		return adress;
	}
	public void setAdress(String adress){
		this.adress=adress;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public int getRoom(){
		return room;
	}
	public void setRoom(int room){
		this.room=room;
	}

	
	public int getBathroom(){
		return bathroom;
	}
	public void setBathroom(int bathroom){
		this.bathroom=bathroom;
	}

	
	public int getFloor(){
		return floor;
	}
	public void setFloor(int floor){
		this.floor=floor;
	}

	public String toString(){
		return "Adress: "+ adress + " - "+ "Name: "+ name + " - " + "Room: "+ room + " - " + "Bathroom: "+ bathroom + " - " + "Floor: "+ floor;                  
		
	}
	
	
	
}
