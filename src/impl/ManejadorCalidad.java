package impl;

import model.Articulo;

public abstract class ManejadorCalidad {

    private ManejadorCalidad siguienteManejador;

    public ManejadorCalidad getSiguienteManejador() {
        return siguienteManejador;
    }

    public void setSiguienteManejador(ManejadorCalidad siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }

    public abstract String comprobarArticulo(Articulo articulo);
}
