package ejemplos;

import ejemplos.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {
//        List<User> list = factoryNewUser();
//        list.stream().map(u ->
//                u.getNombre().toUpperCase().concat(" ")
//                        .concat(u.getApellido()).toUpperCase())
//
//                .forEach(System.out::println);
//
//        List<User> list = factoryNewUser();
//        list.stream()
//                .map(u -> u.getNombre().toUpperCase()
//                        .concat(" ").concat(u.getApellido()).toUpperCase())
//                .flatMap(nombre -> {
//                    if (nombre.contains("Bruce".toUpperCase())){
//                        return Stream.of(nombre);
//                    }
//                    return Stream.empty();
//                })
//                .map(String::toLowerCase)
//                .forEach(System.out::println);


        List<User> list = factoryNewUser();
        Stream<String> nombres =list.stream()
                .map(u -> u.getNombre().toUpperCase()
                        .concat(" ").concat(u.getApellido()).toUpperCase())
                .flatMap(nombre -> {
                    if (nombre.contains("Bruce".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);
        System.out.println(nombres.count());

    }




    private static List<User> factoryNewUser() {
        List<User> result = new ArrayList<>();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        User user6 = new User();
        User user7 = new User();
        User user8 = new User();

        user1.setNombre("Andres");
        user1.setApellido("Guzman");
        result.add(user1);

        user2.setNombre("Luci");
        user2.setApellido("Martinez");
        result.add(user2);

        user3.setNombre("Pepe");
        user3.setApellido("Fernandez");
        result.add(user3);

        user4.setNombre("Cata");
        user4.setApellido("Perez");
        result.add(user4);

        user5.setNombre("Lalo");
        user5.setApellido("Mena");
        result.add(user5);

        user6.setNombre("Exequiel");
        user6.setApellido("Doe");
        result.add(user6);

        user7.setNombre("Bruce");
        user7.setApellido("lee");
        result.add(user7);

        user8.setNombre("Bruce");
        user8.setApellido("Willis");
        result.add(user8);

        return result;
    }
}
