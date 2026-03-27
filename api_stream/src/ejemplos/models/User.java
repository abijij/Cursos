package ejemplos.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String nombre;

    private String apellido;

    private Integer id;

    private static int ultimoId;

    private List<Tax> taxes = new ArrayList<>();

    public User() {

    }

    public List<Tax> getTaxes() {
        return taxes;
    }

    public void addTaxe(Tax taxes) {
        this.taxes.add(taxes);
        taxes.setUser(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return nombre + " " +  apellido ;
    }

    public User(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++ultimoId;
        this.taxes = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nombre, user.nombre) && Objects.equals(apellido, user.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}
