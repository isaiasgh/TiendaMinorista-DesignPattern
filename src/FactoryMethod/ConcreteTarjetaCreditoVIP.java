package FactoryMethod;

/**
 *
 * @author Grupo 9
 */

public class ConcreteTarjetaCreditoVIP implements TarjetaCredito {
    @Override
    public double obtenerCosto() {
        return 2000.0;
    }

    @Override
    public double obtenerLimiteCredito() {
        return 30000.0;
    }
}