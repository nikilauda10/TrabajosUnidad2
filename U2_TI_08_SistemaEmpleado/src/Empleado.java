public abstract class Empleado {
    private String id;
    private String nombre;
    private double salarioBase;

    //constructor con parametros
    public Empleado(String id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    //metodo abtracto
    public  abstract double calcularSalario();



    //setters y getters
    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public double getSalarioBase() {

        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {

        this.salarioBase = salarioBase;
    }
}
