package burguerqueen;

public class Main {
    public static void main(String[] args) {
        BurguerQueen burguerQueen = new BurguerQueen();
        Producto papas = new Papas("1", "papas fritas", false, 5.0);
        Producto hamburguesa = new Hamburguesa("2", "big mc", true, 10.0, "simple");
        Producto ensalada = new Ensalada("3", "rusa", false, 10.0, 2);
        Producto bebida = new Bebida("4", "cola", false, 2.0, true, true);

        //Registrar producto individual
        burguerQueen.registrarProducto(papas.getCodigo(), papas);
        burguerQueen.registrarProducto(hamburguesa.getCodigo(), hamburguesa);
        burguerQueen.registrarProducto(ensalada.getCodigo(), ensalada);
        burguerQueen.registrarProducto(bebida.getCodigo(), bebida);

        //Registrar clientes
        Cliente cliente1 = new Cliente("Nestor", "nestorr@gmail.com");
        Cliente cliente2 = new Cliente("Gustavo", "grusso@gmail.com");
        Cliente Cliente3 = new Cliente("Esteban", "esteban@gmail.com");

        burguerQueen.registrarCliente(cliente1.getEmail(), cliente1);
        burguerQueen.registrarCliente(cliente2.getEmail(), cliente2);
        burguerQueen.registrarCliente(Cliente3.getEmail(), Cliente3);

        //Registrar ventas
        Venta venta1 = new Venta("nestorr@gmail.com", papas, true);
        Venta venta2 = new Venta("grusso@gmail.com", hamburguesa, false);
        Venta venta3 = new Venta("esteban@gmail.com", bebida, false);

        burguerQueen.registrarVenta(venta1);
        burguerQueen.registrarVenta(venta2);
        burguerQueen.registrarVenta(venta3);

        //Consultar precio de los productos (En este caso individuales)
        burguerQueen.consultarPrecioProducto(papas.getCodigo());
        burguerQueen.consultarPrecioProducto(hamburguesa.getCodigo());
        burguerQueen.consultarPrecioProducto(ensalada.getCodigo());
        burguerQueen.consultarPrecioProducto(bebida.getCodigo());

        Producto comboburger = new ComboBurger("11", "comboBurger", true, 20.0, true);


    }
}
