package Design_Pattern_Abstruct_Factory_Pattern;

public class IndiacarFactory {
	public static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case MICRO:
			car = new MicroCar(Location.INDIA);
			break;

		case MINI:
			car = new MiniCar(Location.INDIA);
			break;

		case LUXURY:
			car = new LuxuryCar(Location.INDIA);
			break;

		default:
			break;
		}
		return car;
	}
}
