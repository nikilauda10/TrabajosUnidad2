//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Inventario inventario=new Inventario(3);

        Producto p1=new Producto("321","Marlboro rojo",20);
        Producto p2=new Producto("656","Sabritas limon",30);
        Producto p3=new Producto("387","Dr pepper",10);
        Producto p4=new Producto("678","Tang fresa",14);

        System.out.println("----------------------------");
        System.out.println(inventario.agregarProducto(p1));
        System.out.println(inventario.agregarProducto(p2));
        System.out.println(inventario.agregarProducto(p3));
        System.out.println(inventario.agregarProducto(p4));

        System.out.println("El total de productos es:" + inventario.totalItems());
        System.out.println("----------------------------");
        System.out.println("Buscando el producto 321");
        Producto buscado = inventario.buscar("321");
        if(buscado != null){
            System.out.println(buscado.getNombre());
        }else{
            System.out.println("No existe el producto");
        }
        System.out.println("----------------------------");
        System.out.println("Buscando el producto 435");
        Producto buscado2 = inventario.buscar("435");
        if(buscado2 == null){
            System.out.println("No existe el producto");
        }
        System.out.println("----------------------------");
        System.out.println("eliminando el producto 321");
        inventario.eliminarProducto("321");
        System.out.println("productos eliminado");
        System.out.println("El total de productos es:" + inventario.totalItems());
        System.out.println("----------------------------");
        System.out.println("agregando el producto 678");
        inventario.agregarProducto(p4);
        System.out.println("producto agregado");
        System.out.println("El total de productos es:" + inventario.totalItems());
        System.out.println("----------------------------");


        }
    }
