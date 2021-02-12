package co.com.sofka.domain;

public class Producto {

    private String procedencia;
    private String consumo;

    public Producto(String consumo, String procedencia) {
        this.procedencia = procedencia;
        this.consumo = consumo;
    }

    public double valorProcedencia() {
        double resultado = 0;
        switch (procedencia) {
            case "Nacional" : resultado = 250000; break;
            case "Importado" : resultado = 350000; break;
            default: resultado = 0;
        }
        return resultado;
    }

    public double valorConsumo() {
        double resultado = 0;
        switch (consumo) {
            case "A" : resultado = 450000; break;
            case "B" : resultado = 350000; break;
            case "C" : resultado = 250000; break;
            default: resultado = 0;
        }
        return resultado;
    }

    public double precio() {
        return valorProcedencia() + valorConsumo();
    }

}
