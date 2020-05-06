package Design_Pattern_Abstruct_Factory_Pattern;

public class MicroCar extends Car{

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to Micro Car");
	}

}
