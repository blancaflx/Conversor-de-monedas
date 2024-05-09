package Principal;

import Modelos.Buscar;
import Modelos.Conversion;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        Buscar busqueda = new Buscar();
        String monedaOriginal=" ";
        String monedaCambio= " ";
        String tipoDeCambio=" ";
        boolean ciclo=true;

        try {
            while (ciclo){
                System.out.print("Bienvenido al Conversor de monedas"+'\n'+
                        "1) Dolar >>> Peso Argentino"+'\n'+
                        "2) Peso Argentino >>> Dolar"+'\n'+
                        "3) Dolar >>> Real brasilenio"+'\n'+
                        "4) Real brasilenio >>> Dolar"+'\n'+
                        "5) Dolar >>> Peso Colombiano"+'\n'+
                        "6) Peso Colombiano >>> Dolar"+'\n'+
                        "7) Salir"+'\n'+
                        "Seleccione una opcion valida: ");

                int opcion = Integer.parseInt(ingresar.nextLine());

                switch (opcion){
                    case 1:
                        monedaOriginal="USD";
                        monedaCambio="ARS";
                        tipoDeCambio="DOLAR A PESO ARGENTINO";
                        break;
                    case 2:
                        monedaOriginal="ARS";
                        monedaCambio="USD";
                        tipoDeCambio="PESO ARGENTINO A DOLAR";
                        break;
                    case 3:
                        monedaOriginal="USD";
                        monedaCambio="BRL";
                        tipoDeCambio="DOLAR A REAL BRASILENIO";
                        break;
                    case 4:
                        monedaOriginal="BRL";
                        monedaCambio="USD";
                        tipoDeCambio="REAL BRASILENIO A DOLAR";
                        break;
                    case 5:
                        monedaOriginal="USD";
                        monedaCambio="COP";
                        tipoDeCambio="DOLAR A PESO COLOMBIANO";
                        break;
                    case 6:
                        monedaOriginal="COP";
                        monedaCambio="USD";
                        tipoDeCambio="PESO COLOMBIANO A DOLAR";
                        break;
                    case 7:
                        ciclo=false;
                        break;

                }

                if (ciclo){
                    Map<String, Double> original = busqueda.busqueda(monedaOriginal).conversion_rates();
                    BigDecimal tasaConversion = BigDecimal.valueOf(original.get(monedaCambio));
                    System.out.println("--------------------------------------------");
                    System.out.println("CAMBIO DE "+tipoDeCambio+": "+tasaConversion);
                    System.out.println("--------------------------------------------");
                    System.out.println("\n");
                }else {
                    System.out.println("GRACIAS POR USAR NUESTRO SISTEMA DE CONVERSION");
                }

            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }





    }
}
