package ejemplos;

import ejemplos.models.User;

import java.util.stream.Stream;

public class EjemploStreamFilterCount {

    public static void main(String[] args) {

        Long exist = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia" )
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u-> u.getNombre().contains("pa"))
                .count();

        System.out.println(exist);




    }
}
