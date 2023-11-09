import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmaduraTest {
    Armadura armadura;
    Jarvis jarvis;

    @BeforeEach
    public void crearClases(){
        armadura = new Armadura("Rojo", "Dorado", "1000");
        jarvis = new Jarvis(armadura);
    }


    @Test
    public void pruebaCaminarDescargaGenerador(){
        armadura.caminar(10);
        assertEquals(10000000000f-70000, armadura.getGenerador().getCargaActual());
    }

    @Test
    public void pruebaCorrerDescargaGenerador(){
        armadura.correr(1);
        assertEquals(10000000000f-14000, armadura.getGenerador().getCargaActual());
    }

    @Test
    public void pruebaCalculoBateriaFullJarvis(){
        assertEquals(100,jarvis.calcularPorcentajeBateria());
    }



}