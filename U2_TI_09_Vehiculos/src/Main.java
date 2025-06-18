//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Garage g1=new Garage(4);

    Coche c1=new Coche("3fwe4", "ferrari", 2);
    Coche c2=new Coche("5grr6", "tsuru", 4);
    Motocicleta m1=new Motocicleta("3rey8","italika",true);
    Motocicleta m2=new Motocicleta("4ett9","ducatti",false);
    g1.estacionar(c1);
    g1.estacionar(c2);
    g1.estacionar(m1);
    g1.estacionar(m2);
        System.out.println("numero de vehiculos:" + g1.contarVehiculos());
    g1.retirar(c2.getPlaca());
        System.out.println("numero de vehiculos:" + g1.contarVehiculos());

    }
}