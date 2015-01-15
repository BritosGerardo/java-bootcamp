
public class House {

	private String adress;
	private int room;
	private float price;
	private int bathroom;
	
		
	public String getAdress(){
		return adress;
	}
	public void setAdress(String adress){
		this.adress=adress;
	}
	
		
	public int getRoom(){
		return room;
	}
	public void setRoom(int room){
		this.room=room;
	}
	
	
	public float getPrice(){
		return price;
	}
	public void setPrice(float price){
		this.price=price;
	}
	
	public int getBathroom(){
		return bathroom;
	}
	public void setBathroom(int bathroom){
		this.bathroom=bathroom;
	}
	
	
	public String toString(){
		return("adress: "+ adress +" - "+ "rooms: "+ room +" - "+ "price: "+ price +" - "+ "bathroom: "+ bathroom);
	}
	
	
	
	
	
	
}
