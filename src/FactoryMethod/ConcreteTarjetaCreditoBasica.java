package FactoryMethod;

/**
 *
 * @author Grupo 9
 */

public class ConcreteTarjetaCreditoBasica implements TarjetaCredito {
    @Override
    public double obtenerCosto() {
        return 500.0;
    }

    @Override
    public double obtenerLimiteCredito() {
        return 5000.0;
    }
}