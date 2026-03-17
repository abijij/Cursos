package ejemplos;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ejemplosStreamMap {
    public static void main(String[] args) {

//        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe").map(nombre -> {
//            return nombre.toUpperCase();
//        });
//        nombres.forEach(System.out::println );

//        Stream<String> nombres = Stream
//                .of("Pato", "Paco", "Pepa", "Pepe")
//                .peek(e -> System.out.println(e))
//                .map(nombre -> {
//            return nombre.toUpperCase();
//        });
//        nombres.forEach(System.out::println );


//        Stream<String> nombres = Stream.
//                of("Pato", "Paco", "Pepa", "Pepe")
//                .map(String::toUpperCase)
//                .peek(e -> System.out.println(e))
//                .map(String::toLowerCase);
//        nombres.forEach(System.out::println);


        Stream<String> nombres = Stream.
                of("Pato", "Paco", "Pepa", "Pepe")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);
        List<String> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);


    }
}
