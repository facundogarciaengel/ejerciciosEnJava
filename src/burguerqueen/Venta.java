package burguerqueen;

public class Venta {
    private String emailCliente;
    private Producto producto;
    private Boolean paraLlevar; 
    
    public Venta(String emailCliente, Producto producto, Boolean paraLlevar) {
        this.emailCliente = emailCliente;
        this.producto = producto;
        this.paraLlevar = paraLlevar;
    }

    public String getEmailCliente() {
        return this.emailCliente;
    }

    public Producto getProducto() {
        return this.producto;
    }
    public Boolean getParaLlevar() {
        return this.paraLlevar;
    }
}
