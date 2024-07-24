package Decorator;

/**
 *
 * @author Grupo 9
 */

public class WireDecorator extends BaseDecorator {
    public WireDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending Wire: " + message);
    }
}