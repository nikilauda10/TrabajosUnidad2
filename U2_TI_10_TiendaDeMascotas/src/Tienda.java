import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Animal> inventario;

    public Tienda( ){
        inventario = new ArrayList<Animal>();
    }
    public void reabactecer(Animal a){
        inventario.add(a);
    }

   public boolean venderAnimal(Cliente c, Animal a){
        boolean compraDoble = false;
        for(int i = 0; i <c.mascotas.size(); i++){
            if(c.mascotas.get(i) == a){
                compraDoble = true;
            }
        }
        if(compraDoble == true){
            System.out.println("El cliente ya lo tiene");
            return false;
        }
        boolean estaEnInventario = false;
        for(int i = 0; i < inventario.size(); i++){
            Animal animal=inventario.get(i);
            if(a==animal){
                estaEnInventario = true;
            }
        }
        if(estaEnInventario == false){
            System.out.println("No esta disponible");
            return false;
        }


    inventario.remove(a);
    c.mascotas.add(a);
        System.out.println("Venta realizada");
       return true;
    }
}
