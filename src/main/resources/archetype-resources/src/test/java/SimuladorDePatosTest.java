#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.modelo.*;
import org.testng.annotations.Test;

public class SimuladorDePatosTest {

    @Test
    public void testPatos() {
        Pato patoHule = new PatoHule();
        Pato patoCapuchino = new PatoCapuchino();
        Pato patoCabeza = new PatoCabezaNegra();

        patoHule.volar();
        patoCabeza.volar();
        patoCapuchino.volar();

        patoCabeza.setComportamientoDeVuelo(new NoVuelo());

        patoCabeza.volar();

    }


}