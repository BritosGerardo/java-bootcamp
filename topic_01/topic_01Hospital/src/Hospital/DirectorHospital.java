package Hospital;

public class DirectorHospital {
	
	private  HospitalBuilder hospitalBuilder=null;
	
	public DirectorHospital(HospitalBuilder hospitalBuilder){
		this.hospitalBuilder=hospitalBuilder;
	}
	
	
	public void constructHospital(){
		hospitalBuilder.buildAdress();
		hospitalBuilder.buildName();
		hospitalBuilder.buildRoom();
		hospitalBuilder.buildBathroom();
		hospitalBuilder.buildFloor();
	}
	
	
	public Hospital getHospital(){
		return hospitalBuilder.getHospital();
		
	}
	
	
}
