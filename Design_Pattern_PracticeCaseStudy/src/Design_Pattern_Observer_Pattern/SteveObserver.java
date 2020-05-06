package Design_Pattern_Observer_Pattern;

public class SteveObserver implements INotificationObserver{
	
	String name = "Steve";
	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		System.out.println("The notification has been received by "+name+".");
	}
	@Override
	public String toString() {
		return "SteveObserver [name=" + name + "]";
	}

}
