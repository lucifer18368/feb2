package system.vehiclemanagement;

public class vehicle {
	String Model;
	String Type;
	int Price;
	
	vehicle(String Model,String Type,int Price) {
		this.Model=Model;
		this.Type=Type;
		this.Price=Price;
	}
	
	void display() {
		System.out.println("Model is" +" "+Model);
		System.out.println("Price is" +" "+Price);
		System.out.println("Type is" +" "+Type);
	}
}

