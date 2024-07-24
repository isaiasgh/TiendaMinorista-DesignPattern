package FactoryMethod;

/**
 *
 * @author Grupo 9
 */

public class ConcreteCreatorTVIP implements ICardFactory {
    @Override
    public TarjetaCredito createProduct() {
        return new ConcreteTarjetaCreditoVIP();
    }
}