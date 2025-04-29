package burguerqueen;

import java.util.HashMap;
import java.util.Map;

public class BurguerQueen {

    private Map<String, Producto> productos;
    private Map<String, Cliente> clientes;

    public BurguerQueen() {
        productos = new HashMap<>();
        clientes = new HashMap<>();
    }

    public void registrarProducto(String codProducto, Producto producto) {
        productos.put(codProducto, producto);
        System.out.println("Registrado el producto: " + producto.getNombre());
    }

    public void registrarCliente(String emailCliente, Cliente cliente) {
        //REgistra un nuevo cliente y lo agrega al Map de clientes?
        clientes.put(emailCliente, cliente);
        System.out.println("Registrado el cliente: " + cliente.getNombre());
    }

    public void registrarVenta(Venta venta){
        //registra una nueva venta. Es una responsabilidad del cliente, ya que se suma al historial de compras
        //del cliente
        Cliente cliente = clientes.get(venta.getEmailCliente());
        cliente.registrarVenta(venta);
    }

    public Double consultarPrecioProducto(String codProducto){
        // Recibe el codigo del producto y consulta el precio del mismo. Puede ser un producto individual,
        //O puede ser un combo.
        Producto producto = productos.get(codProducto);
        return producto.consultarPrecio();
    }

    public Combo consultarComboMasVendido(){
        //Compara y nos dice cual fue el combo mas vendido.
    }

    public String comboFavoritoCliente(String emailcliente){
        //Se fija en el Map de compras por producto de ese cliente cual es el que tiene mayor cantidad.
    }

    public void enviarPromociones(String promociones){
        //Se fija los email de todos los clientes y les envia una promocion ??
    }



}
