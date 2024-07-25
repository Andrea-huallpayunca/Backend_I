package impl;

import model.Articulo;

public class ManejadorPeso extends ManejadorCalidad{
    @Override
    public String comprobarArticulo(Articulo articulo) {
        if(articulo.getPeso()>1200 && articulo.getPeso()<1300){
            System.out.println("Paso la revisión de Peso");
            return getSiguienteManejador().comprobarArticulo(articulo);
        }
        System.out.println( "No ha pasado revisión de Peso");
        return "No ha pasado revisión de Peso";
    }
}
