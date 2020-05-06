package Design_Pattern_Abstruct_Factory_Pattern;

public class MiniCar extends Car{

	public MiniCar(Location location) {
		super(CarType.MINI, location);
		construct();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to Mini Car");
	}

}
