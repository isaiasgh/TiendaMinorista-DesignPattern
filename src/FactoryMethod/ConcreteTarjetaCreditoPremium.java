package FactoryMethod;

/**
 *
 * @author Grupo 9
 */

public class ConcreteTarjetaCreditoPremium implements TarjetaCredito {
    @Override
    public double obtenerCosto() {
        return 1000.0;
    }

    @Override
    public double obtenerLimiteCredito() {
        return 15000.0;
    }
}