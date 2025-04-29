package burguerqueen;

public class Ensalada extends Producto{
    private Integer cantDEIngredientes;

    public Ensalada(String codigo, String nombre, Boolean esGrande, Double precioBase, Integer cantDEIngredientes) {
        super(codigo, nombre, esGrande, precioBase);
        this.cantDEIngredientes = cantDEIngredientes;
    }
}
