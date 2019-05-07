#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.modelo;

public class NoVuelo implements Volable {

    @Override
    public void volar() {
        System.out.println("No vuelo");
    }
}
