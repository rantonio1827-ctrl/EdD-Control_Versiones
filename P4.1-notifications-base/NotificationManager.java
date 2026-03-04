// NotificationManager.java - Código a refactorizar
public class NotificationManager {
    private NotificationService service;

    public NotificationManager(NotificationService service) {
        this.service = service;
    }

    public void notify(String message) {
        Logger.log("Iniciando proceso de notificaion");
        service.send(message);
    }
}
