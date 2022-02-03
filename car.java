package system.vehiclemanagement;

public class car extends vehicle {
	String Brand;
	public car(String Model,String Type,int Price,String Brand){
		super(Model,Type,Price);
		this.Brand=Brand;
		}
		public void carDetails() {
		display();
		System.out.println("car is of"+" "+Brand);
		}
	}

