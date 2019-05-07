#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.modelo;

public class PatoCapuchino extends Pato {

    public PatoCapuchino() {
        super(new VueloConAlas());
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato Capuchino");
    }
}
