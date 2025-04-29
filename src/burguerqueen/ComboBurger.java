package burguerqueen;

public class ComboBurger extends Combo{

    private Integer cantVentas;

    public ComboBurger(String codigo, String nombre, Boolean esGrande, Double precioBase, Boolean estaEnPromocion) {
        super(codigo, nombre, esGrande, precioBase, estaEnPromocion);
        this.cantVentas = 0;
    }

    //agregar los productos del combo
    public void agregarProductosDelCombo(Producto producto) {
        this.productos.add(producto);
    }


}
