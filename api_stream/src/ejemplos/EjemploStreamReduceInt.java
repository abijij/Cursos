package ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {

    public static void main(String[] args) {

        Stream<Integer> nombres = Stream.of(5, 10, 15 ,20).peek(System.out::println);

                Integer result = nombres.reduce(0, (a,b) -> a + b);
        System.out.println(result);

    }
}
