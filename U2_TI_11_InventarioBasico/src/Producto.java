public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;

    public Producto(){

    }

    public void setCodigo(String codigo){
        if(codigo != null){
            this.codigo = codigo;
        } else{
            System.out.println("ingrese un codigo valido");
        }
    }

    public void setCantidad(int cantidad){
        if(cantidad>=0) {
            this.cantidad = cantidad;
        }else {
            System.out.println("Ingrese una cantidad valida");
        }
    }
    public String getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
