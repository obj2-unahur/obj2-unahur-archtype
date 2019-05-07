#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.modelo;

public class PatoCabezaNegra extends Pato {

    public PatoCabezaNegra() {
        super(new VueloConAlas());
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un pato Cabeza Negra");
    }
}
