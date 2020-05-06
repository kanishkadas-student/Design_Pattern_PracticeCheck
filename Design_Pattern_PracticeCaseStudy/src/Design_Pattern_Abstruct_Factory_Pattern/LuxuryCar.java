package Design_Pattern_Abstruct_Factory_Pattern;

public class LuxuryCar extends Car{

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to luxury Car");
	}

}
