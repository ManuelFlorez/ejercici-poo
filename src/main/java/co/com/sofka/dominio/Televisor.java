package co.com.sofka.dominio;

public class Televisor extends Producto{

    private final int tamano;
    private final boolean sintonizadorTDT;

    public Televisor(String consumo, String procedencia, int tamano, boolean sintonizadorTDT) {
        super(consumo, procedencia);
        this.tamano = tamano;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double precio() {
        double precio = super.precio();
        precio += valorAdicionalTamano() + valorAdicionalSintonizador();
        return precio;
    }

    private double valorAdicionalTamano() {
        return tamano > 40 ? super.precio() * 0.3: 0;
    }

    private int valorAdicionalSintonizador() {
        return sintonizadorTDT ? 250000 : 0;
    }

}
