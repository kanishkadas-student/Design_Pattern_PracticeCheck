package Design_Pattern_Observer_Pattern;

public interface INotificationService {

	void AddSubscriber(INotificationObserver type);
	void RemoveSubscriber(INotificationObserver type);
	void NotifySubscriber();
}
