package co.com.sofka.domain;

public class Nevera extends Producto {
    private final int capacidadLitros;

    public Nevera(String consumo, String procedencia, int capacidadLitros) {
        super(consumo, procedencia);
        this.capacidadLitros = capacidadLitros;
    }

    @Override
    public double precio() {
        return tieneIncremento() ? precioConLitrosAdicionales() : super.precio();
    }

    private boolean tieneIncremento() {
        return capacidadLitros >= 130;
    }

    private double precioConLitrosAdicionales() {
        int litros = capacidadLitros - 120;
        int contador = contadorDe10En10(litros);
        double precio = super.precio();
        return precio + (precio * porcentaje(contador));
    }

    private double porcentaje(int contador) {
        return contador * 0.05;
    }

    private int contadorDe10En10(int litros) {
        int contador = 1;
        while ((litros -=10) > 0)
            ++contador;
        return contador;
    }
}
