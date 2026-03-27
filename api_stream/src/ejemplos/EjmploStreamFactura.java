package ejemplos;

import ejemplos.models.Tax;
import ejemplos.models.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EjmploStreamFactura {

    public static void main(String[] args) {

        List<User> users  = factoryNewUser();
//
//        users.stream()
//                .map(User::getTaxes)
//                .flatMap(Collection::stream)
//                .forEach(f -> System.out.println(f.getDescripcion().concat(" :cliente ")
//                        .concat(f.getUser().toString())));

        users.stream()
                .flatMap(u -> u.getTaxes().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(" :cliente ")
                        .concat(f.getUser().toString())));


//        for (User u : users){
//            for (Tax t : u.getTaxes()){
//                System.out.println("taxes = " + t.getDescripcion());
//            }
//        }


    }


    private static List<User> factoryNewUser() {
        List<User> result = new ArrayList<>();
        User user1 = new User();
        User user2 = new User();

        user1.setNombre("Andres");
        user1.setApellido("Guzman");
        user1.addTaxe(new Tax("Compras tecnologicas"));
        user1.addTaxe(new Tax("Compra de muebles"));
        result.add(user1);

        user2.setNombre("Luci");
        user2.setApellido("Martinez");
        user2.addTaxe(new Tax("bicicleta"));
        user2.addTaxe(new Tax("notebook gamer"));
        result.add(user2);

        return result;
    }


}
