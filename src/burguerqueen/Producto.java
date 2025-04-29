package burguerqueen;

public abstract class Producto {
    private String codigo;
    private String nombre;
    private Boolean esGrande;
    private Double precioBase;

    public Producto(String codigo, String nombre, Boolean esGrande, Double precioBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.esGrande = esGrande;
        this.precioBase = precioBase;
    }

    public Double consultarPrecio(){
        return this.precioBase;
    }

    public String getCodigo() {
        return this.codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
}
