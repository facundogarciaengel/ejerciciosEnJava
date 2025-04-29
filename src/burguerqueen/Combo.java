package burguerqueen;

import java.util.ArrayList;
import java.util.List;

public abstract class Combo extends Producto{
  private List<Producto> productos;
  private Double descuento;
  private Boolean estaEnPromocion;

    public Combo(String codigo, String nombre, Boolean esGrande, Double precioBase, Boolean estaEnPromocion) {
        super(codigo, nombre, esGrande, precioBase);
        this.descuento = 0.1;
        this.estaEnPromocion = estaEnPromocion;
        productos = new ArrayList<>();
    }


    @Override
    public Double consultarPrecio() {
        Double precioFinal = 0.0;
        for (Producto producto : productos) {
            precioFinal += producto.consultarPrecio();
        }
        precioFinal = precioFinal - (precioFinal * this.descuentoFinal());
        return precioFinal;
    }

        public Double descuentoFinal() {
            if (estaEnPromocion) {
                descuento = 0.15;
            }
        return descuento;

        }

}
