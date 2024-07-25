package impl;

import model.Articulo;

public class ManejadorFinal extends ManejadorCalidad {

    @Override
    public String comprobarArticulo(Articulo articulo) {
        System.out.println("El articulo "+articulo.getNombre()+ " cumple con todos los estándares de calidad.");
        return "El articulo "+articulo.getNombre()+ " cumple con todos los estándares de calidad." ;
    }
}
