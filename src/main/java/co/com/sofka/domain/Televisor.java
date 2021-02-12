package co.com.sofka.domain;

public class Televisor extends Producto{

    private int tamano;
    private boolean isSintonizadorTDT;

    public Televisor(String consumo, String procedencia, int tamano, boolean isSintonizadorTDT) {
        super(consumo, procedencia);
        this.tamano = tamano;
        this.isSintonizadorTDT = isSintonizadorTDT;
    }

    @Override
    public double precio() {
        double precio = super.precio();
        precio += valorAdicionalTamano();
        precio += isSintonizadorTDT ? 250000 : 0 ;
        return precio;
    }

    private double valorAdicionalTamano() {
        return tamano > 40 ? super.precio() * 0.3: 0;
    }



}
