package co.com.sofka.dominio;

public class Producto {

    private final String procedencia;
    private final String consumo;

    public Producto(String consumo, String procedencia) {
        this.procedencia = procedencia;
        this.consumo = consumo;
    }

    public double valorProcedencia() {
        switch (procedencia) {
            case "Nacional" : return 250000;
            case "Importado" : return 350000;
            default: return 0;
        }
    }

    public double valorConsumo() {
        switch (consumo) {
            case "A" : return 450000;
            case "B" : return 350000;
            case "C" : return 250000;
            default: return 0;
        }
    }

    public double precio() {
        return valorProcedencia() + valorConsumo();
    }

}
