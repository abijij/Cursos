package ejemplos;

import ejemplos.models.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {

    public static void main(String[] args) {

        Boolean exist = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia" )
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(1));

        System.out.println(exist);




        /*Codigo que se actualiza con ocupar el stream y el operador terminal anymatch
        List<User> list = Arrays.asList(new User("Pato", "Guzman"),
                new User("Paco", "Gonzalez"),
                new User("Pepa", "Gutierrez"),
                new User("Pepe", "Mena"),
                new User("Pepe", "Garcia"));
        boolean result = false;
        for (User u: list){
            if (u.getId().equals(3)){
                result = true;
                break;
            }
        }
        System.out.println(result);*/
    }
}
