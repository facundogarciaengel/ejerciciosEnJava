package burguerqueen;

public class SaladCombo extends Combo {
    private Integer cantVentas;

    public SaladCombo() {
        super();
        cantVentas = 0;
    }

    public Integer obtenerCantVentas(){
        return this.cantVentas;
    }
}
