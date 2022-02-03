package system.vehiclemanagement;

public class bike extends vehicle {
	String Brand;
	int cc;
	public bike(String Model,String Type,int Price,int cc){
		super(Model,Type,Price);
		this.cc=cc;
	}
	public void bikeDetails() {
		display();
		System.out.println("bike cc is"+" "+cc);
	}
}
