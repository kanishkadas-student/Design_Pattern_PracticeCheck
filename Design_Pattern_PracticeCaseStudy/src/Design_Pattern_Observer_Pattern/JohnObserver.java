package Design_Pattern_Observer_Pattern;

public class JohnObserver implements INotificationObserver{

	private String name = "John";
	
	@Override
	public void OnServerDown() {
		System.out.println("The notification has been received by "+name+".");
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "JohnObserver [name=" + name + "]";
	}

}
