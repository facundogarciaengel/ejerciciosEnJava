package burguerqueen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cliente {

    private String nombre;
    private String email;
    private List<Venta> ventas;
    private Map<String, Integer> comprasPorProducto;

    public Cliente(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
        this.ventas = new ArrayList<>();
        this.comprasPorProducto = new HashMap<>();
    }

    public String getEmail() {
        return this.email;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void registrarVenta(Venta venta){
        this.ventas.add(venta);
        String nombre = venta.getProducto().getNombre();
        Integer cantidadActual = this.comprasPorProducto.get(nombre);
        Integer nuevaCantidad;
        if (cantidadActual != null){
            nuevaCantidad = cantidadActual+1;
        } else {
            nuevaCantidad = 1;
        }
        this.comprasPorProducto.put(nombre, nuevaCantidad);
        }

    public Combo comboFavorito(){

    }
}
