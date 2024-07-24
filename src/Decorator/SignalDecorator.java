package Decorator;

/**
 *
 * @author Grupo 9
 */

public class SignalDecorator extends BaseDecorator {
    public SignalDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending Signal: " + message);
    }
}