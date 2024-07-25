package impl;

import model.Articulo;

public class ManejadorEnvase extends ManejadorCalidad{
    @Override
    public String comprobarArticulo(Articulo articulo) {
        if(articulo.getEnvasado().equals("sano") ||
                articulo.getEnvasado().equals("casi sano")){
            System.out.println("Paso la revisión de Envase");
            return getSiguienteManejador().comprobarArticulo(articulo);
        }
        System.out.println( "No ha pasado revisión de Envase");
        return "No ha pasado revisión de envase";
    }
}
