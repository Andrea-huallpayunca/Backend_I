package test;

import impl.AnalistaDeCalidad;
import model.Articulo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManejadorCalidadTest {

    @Test
    @DisplayName("Verificar un articulo")
    void caso1(){
        Articulo carro = new Articulo("Carro", 1200, 1250, "sano");
        AnalistaDeCalidad analizarArticulo = new AnalistaDeCalidad();
        String respuestaEsperada = "El articulo "+carro.getNombre()+ " cumple con todos los estándares de calidad.";
        // cuando
        String respuestaObtenida = analizarArticulo.comprobandoArticulo(carro);
        // entonces
        assertEquals(respuestaEsperada, respuestaObtenida);
    }

}