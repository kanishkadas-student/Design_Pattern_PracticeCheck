package Design_Pattern_Observer_Pattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NotificationService implements INotificationService{

	private List<INotificationObserver> notificationService = new LinkedList<>();
	@Override
	public void AddSubscriber(INotificationObserver type) {
		// TODO Auto-generated method stub
		notificationService.add(type);
		System.out.println("List of Observers:");
		for (INotificationObserver iNotificationObserver : notificationService) {
			System.out.println(iNotificationObserver.toString());
		}
	}

	@Override
	public void RemoveSubscriber(INotificationObserver type) {
		// TODO Auto-generated method stub
		notificationService.remove(type);
		System.out.println("List of Observers");
		for (INotificationObserver iNotificationObserver : notificationService) {
			System.out.println(iNotificationObserver.toString());
		}
	}

	@Override
	public void NotifySubscriber() {
		// TODO Auto-generated method stub
		for (INotificationObserver iNotificationObserver : notificationService) {
			iNotificationObserver.OnServerDown();
		}
	}

}
