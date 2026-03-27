package ejemplos;

import java.util.stream.IntStream;

public class Test1 {

    public static void main(String[] args) {
        Double resultado = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 10 != 0)
                .mapToDouble(n -> (double) n/2)
                .reduce(0.0, Double::sum);

        System.out.println("Resultado: " + resultado);
    }




}
