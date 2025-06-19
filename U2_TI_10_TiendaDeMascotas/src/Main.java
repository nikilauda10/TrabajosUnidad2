//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Perro perro = new Perro("Max", 1);
        Gato gato = new Gato("Molly", 4);
        Cliente cliente = new Cliente("Nicholas");


        tienda.reabactecer(gato);

        tienda.venderAnimal(cliente,perro);
        tienda.reabactecer(perro);
        tienda.venderAnimal(cliente,perro);
        tienda.venderAnimal(cliente,perro);
        tienda.venderAnimal(cliente,gato);






        }
    }
