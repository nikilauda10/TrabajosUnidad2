import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    public List<Animal> mascotas;

    public Cliente(String nombre){
        this.nombre = nombre;
        this.mascotas = new ArrayList<Animal>();
    }
}
