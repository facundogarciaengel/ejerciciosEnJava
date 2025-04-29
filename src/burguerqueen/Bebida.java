package burguerqueen;

public class Bebida extends Producto{

    private Boolean conGas;
    private Boolean conAzucar;

    public Bebida(String codigo, String nombre, Boolean esGrande, Double precioBase, Boolean conGas, Boolean conAzucar) {
        super(codigo, nombre, esGrande, precioBase);
        this.conGas = conGas;
        this.conAzucar = conAzucar;

    }

}
