// NotificationManager.java - Código a refactorizar
public class NotificationManager {
    private NotificationService service;

    public NotificationManager(NotificationService service) {
        this.service = service;
    }

    public void notify(String message) {
        service.send(message);
    }

}
