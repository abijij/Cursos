package ejemplos;

import ejemplos.models.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ejemplosStreamMap2 {

    public static void main(String[] args) {
        Stream<User> nombres = Stream
                .of("Pato Guzman" ,"Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena" )
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .map(user -> {
                    String nombre = user.getNombre().toLowerCase();
                    user.setNombre(nombre);
                    return user;
                })
                .peek(user -> System.out.println(user.getNombre()));

        List<User> list = nombres.collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
