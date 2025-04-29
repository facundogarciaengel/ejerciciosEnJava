package burguerqueen;

public class Hamburguesa extends Producto{

    private String tipoCarne;

    public Hamburguesa(String codigo, String nombre, Boolean esGrande, Double precioBase, String tipoCarne) {
        super(codigo, nombre, esGrande, precioBase);
        this.tipoCarne = tipoCarne;
    }
}
