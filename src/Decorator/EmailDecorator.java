package Decorator;

/**
 *
 * @author Grupo 9
 */

public class EmailDecorator extends BaseDecorator {
    public EmailDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending Email: " + message);
    }
}