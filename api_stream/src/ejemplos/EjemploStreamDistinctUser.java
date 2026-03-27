package ejemplos;

import ejemplos.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinctUser {

    public static void main(String[] args) {

        Stream<User> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia", "Pato Guzman", "Pato Guzman" )
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();
                nombres.forEach(System.out::println);






    }
}
