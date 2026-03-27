package ejemplos;

import ejemplos.models.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {

    public static void main(String[] args) {

        Long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "",
                        "Pepe Mena", "" )
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();
        System.out.println("count = " + count );


    }
}
