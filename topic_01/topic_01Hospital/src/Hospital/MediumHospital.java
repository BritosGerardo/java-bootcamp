package Hospital;

public class MediumHospital implements HospitalBuilder{

	private Hospital hospital;
	
	
	public MediumHospital(){
		hospital= new Hospital(); 
	}
	
	public void buildAdress() {
		// TODO Auto-generated method stub
		hospital.setAdress("Alvear 250");
		
	}

	public void buildName() {
		// TODO Auto-generated method stub
		hospital.setName("New Hospital Belgrano");
		
	}

	public void buildRoom() {
		// TODO Auto-generated method stub
		hospital.setRoom(200);
		
	}

	public void buildBathroom() {
		// TODO Auto-generated method stub
		hospital.setBathroom(215);
		
	}

	public void buildFloor() {
		// TODO Auto-generated method stub
		hospital.setFloor(4);
		
	}

	public Hospital getHospital() {
		// TODO Auto-generated method stub
		return hospital;
	}
	

}
