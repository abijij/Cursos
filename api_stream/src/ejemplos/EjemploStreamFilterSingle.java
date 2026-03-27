package ejemplos;

import ejemplos.models.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {

    public static void main(String[] args) {

        Stream<User> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia" )
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepemmm"))
                .peek(System.out::println);

        Optional<User> user = nombres.findFirst();
        //System.out.println(user.orElse(new User("Jhon", "Doe")).getNombre());
        //System.out.println(user.orElseGet(() -> new User("Jhon", "Doe")).getNombre());
        if (user.isPresent()){
            System.out.println(user.get().getNombre());
        }else {
            System.out.println("No se encontro el objeto");
        }







    }
}
