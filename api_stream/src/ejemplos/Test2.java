package ejemplos;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test2 {

    public static void main(String[] args) {
        String[][] lenguajes = {
                {"java", "groovy"},
                {"php"},
                {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"},
                {"javascript"},
                {}
        };

        // Solución con Stream API
        String[] resultado = Arrays.stream(lenguajes)      // Stream<String[]>
                .flatMap(Arrays::stream)                       // Stream<String> (aplanar)
                .distinct()                                     // Eliminar repetidos
                .toArray(String[]::new);                        // Convertir a array

        // Mostrar resultado
        System.out.println(Arrays.toString(resultado));
        // [java, groovy, php, c#, python, javascript, kotlin]
    }
    }





