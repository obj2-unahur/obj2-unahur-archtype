#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.modelo;

public class VueloConAlas implements Volable {

    @Override
    public void volar() {
        System.out.println("Vuelo con mis alas");
    }
}
