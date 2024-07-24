package tiendaminorista;

import Decorator.*;
import Facade.*;
import FactoryMethod.*;

/**
 *
 * @author Grupo 9
 */

public class Main {
    public static void main(String[] args) {
        // Facade Pattern
        System.out.println("=== Facade Pattern ===");
        Facade facade = new Facade();
        facade.subsystemOperation();

        // Decorator Pattern
        System.out.println("\n=== Decorator Pattern ===");
        Notifier notifier = new Notifier();
        Notifier smsNotifier = new SMSDecorator(notifier);
        Notifier emailNotifier = new EmailDecorator(smsNotifier);
        Notifier whatsappNotifier = new WhatsAppDecorator(emailNotifier);

        whatsappNotifier.send("Payment due in one week.");

        // Factory Method Pattern
        System.out.println("\n=== Factory Method Pattern ===");
        ICardFactory basicaFactory = new ConcreteCreatorTBasica();
        ICardFactory premiumFactory = new ConcreteCreatorTPremium();
        ICardFactory vipFactory = new ConcreteCreatorTVIP();

        TarjetaCredito basica = basicaFactory.createProduct();
        TarjetaCredito premium = premiumFactory.createProduct();
        TarjetaCredito vip = vipFactory.createProduct();

        System.out.println("Basica: Costo - " + basica.obtenerCosto() + ", Limite - " + basica.obtenerLimiteCredito());
        System.out.println("Premium: Costo - " + premium.obtenerCosto() + ", Limite - " + premium.obtenerLimiteCredito());
        System.out.println("VIP: Costo - " + vip.obtenerCosto() + ", Limite - " + vip.obtenerLimiteCredito());
    }
}