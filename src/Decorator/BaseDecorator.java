/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author isaias
 */

public class BaseDecorator extends Notifier {
    protected Notifier wrappee;

    public BaseDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}