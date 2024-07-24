package Decorator;

/**
 *
 * @author Grupo 9
 */

public class SMSDecorator extends BaseDecorator {
    public SMSDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SMS: " + message);
    }
}