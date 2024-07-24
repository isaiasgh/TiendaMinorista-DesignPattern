package FactoryMethod;

/**
 *
 * @author Grupo 9
 */

public class ConcreteCreatorTBasica implements ICardFactory {
    @Override
    public TarjetaCredito createProduct() {
        return new ConcreteTarjetaCreditoBasica();
    }
}