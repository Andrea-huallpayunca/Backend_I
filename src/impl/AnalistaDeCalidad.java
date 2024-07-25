package impl;

import model.Articulo;

public class AnalistaDeCalidad {
    private ManejadorCalidad iniciarControl;

    public AnalistaDeCalidad() {
        this.iniciarControl = new ManejadorLote();
        ManejadorCalidad peso = new ManejadorPeso();
        ManejadorCalidad envase = new ManejadorEnvase();
        ManejadorCalidad ultimo = new ManejadorFinal();

        iniciarControl.setSiguienteManejador(peso);
        peso.setSiguienteManejador(envase);
        envase.setSiguienteManejador(ultimo);
    }

    public String comprobandoArticulo (Articulo articulo){

        return iniciarControl.comprobarArticulo(articulo);
    }
}
