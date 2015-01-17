package Hospital;

public class PrincipalHospital {
	public static void main(String[] args){
		
		HospitalBuilder hospitalBuilder=new MediumHospital();
		DirectorHospital directorHospital=new DirectorHospital(hospitalBuilder);
		directorHospital.constructHospital();
		Hospital hospital=directorHospital.getHospital();
		System.out.println("Medium Hospital : " + hospital);
		
		hospitalBuilder=new LowHospital();
		directorHospital=new DirectorHospital(hospitalBuilder);
		directorHospital.constructHospital();
		hospital=directorHospital.getHospital();
		System.out.println("Low Hospital : " + hospital);
		
	}
	
	
	

}
