package impl;

import model.Articulo;

public class ManejadorLote extends ManejadorCalidad{
    @Override
    public String comprobarArticulo(Articulo articulo) {
       if(articulo.getLote()>1000 && articulo.getLote()<2000){
           System.out.println("Paso la revisión de lote");
           return getSiguienteManejador().comprobarArticulo(articulo);
       }
        System.out.println( "No ha pasado revisión de lote");
       return "No ha pasado revisión de lote";
    }

}
