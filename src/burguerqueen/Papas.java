package burguerqueen;

import java.util.ArrayList;
import java.util.List;

public class Papas extends Producto{

    private List<String> aderezos;

    public Papas(String codigo, String nombre, Boolean esGrande, Double precioBase){
        super(codigo, nombre, esGrande, precioBase);
        this.aderezos = new ArrayList<>();
    }

}
