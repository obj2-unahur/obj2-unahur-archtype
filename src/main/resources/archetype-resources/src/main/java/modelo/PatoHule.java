#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.modelo;

public class PatoHule extends Pato {

    public PatoHule() {
        super(new NoVuelo());
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un pato de hule");
    }

    @Override
    public void parpar() {
        System.out.println("Cuek");
    }
}
