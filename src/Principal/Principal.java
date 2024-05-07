package Principal;

import Modelos.Buscar;
import Modelos.Conversion;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        Buscar busqueda = new Buscar();

//        System.out.print("Bienvenido al Conversor de monedas"+'\n'+
//                "1) Dolar >>> Peso Argentino"+'\n'+
//                "2) Peso Argentino >>> Dolar"+'\n'+
//                "3) Dolar >>> Real brasilenio"+'\n'+
//                "4) Real brasilenio >>> Dolar"+'\n'+
//                "5) Dolar >>> Peso Colombiano"+'\n'+
//                "6) Peso Colombiano >>> Dolar"+'\n'+
//                "7) Salir"+'\n'+
//                "Seleccione una opcion valida: ");

        Conversion conversion = busqueda.busqueda("USD");
        System.out.println(conversion.toString());



    }
}
