package Hospital;

public class LowHospital implements HospitalBuilder {

	private Hospital hospital;
	
	public LowHospital(){
		hospital =new Hospital();
	}
	
	
	public void buildAdress() {
		// TODO Auto-generated method stub
		hospital.setAdress("av bodereau 1500");
				
	}

	public void buildName() {
		// TODO Auto-generated method stub
		hospital.setName("Hospital New Life 24hs");
	}

	public void buildRoom() {
		// TODO Auto-generated method stub
		hospital.setRoom(150);
	}

	public void buildBathroom() {
		// TODO Auto-generated method stub
		hospital.setBathroom(160);
	}

	public void buildFloor() {
		// TODO Auto-generated method stub
		hospital.setFloor(2);
	}

	public Hospital getHospital() {
		// TODO Auto-generated method stub
		return hospital;
	}

}
