import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
    Empleado empleado1 = new EmpleadoTiempoCompleto("20243ds050","Nicholas", 1500,"Gasaolina de a grapa");
    Empleado empleado2= new EmpleadoPorHoras("20243fs001","Lionel Messi", 200,5);

    System.out.println(empleado1.getNombre() + " tiene un salario base de :" + empleado1.calcularSalario());
        System.out.println("----------------------------------------------");
        System.out.println(empleado2.getNombre() + " tiene un salario base de :" + empleado2.calcularSalario());
    }
}
