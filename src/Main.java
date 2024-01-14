import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Utilidades.imprimirElementos(numeros);

        List<String> palabras= new ArrayList<>();
        palabras.add("Holas");
        palabras.add("Mundo");
        Utilidades.imprimirElementos(palabras);

        List<Integer> numerosOrigen=new ArrayList<>();
        numerosOrigen.add(10);
        numerosOrigen.add(20);
        numerosOrigen.add(30);

        List<Number> numeroDestino= new ArrayList<>();
        Utilidades.copiarElementos(numerosOrigen, numeroDestino);
        Utilidades.imprimirElementos(numeroDestino);

        List<Number> numerosFloatDestino = new ArrayList<>();
        Utilidades.copiarElementos(numerosOrigen, numerosFloatDestino);
        Utilidades.imprimirElementos(numerosFloatDestino);
    }
}