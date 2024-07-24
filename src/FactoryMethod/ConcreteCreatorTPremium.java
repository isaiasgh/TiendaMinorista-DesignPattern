package FactoryMethod;

/**
 *
 * @author Grupo 9
 */

public class ConcreteCreatorTPremium implements ICardFactory {
    @Override
    public TarjetaCredito createProduct() {
        return new ConcreteTarjetaCreditoPremium();
    }
}