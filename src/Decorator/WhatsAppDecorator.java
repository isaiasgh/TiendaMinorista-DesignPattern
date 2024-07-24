package Decorator;

/**
 *
 * @author Grupo 9
 */

public class WhatsAppDecorator extends BaseDecorator {
    public WhatsAppDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending WhatsApp: " + message);
    }
}