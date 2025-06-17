public class EmpleadoPorHoras extends Empleado {
    private int horasExtra;
    public EmpleadoPorHoras(String id, String nombre, int salarioBase, int horasExtra) {
        super(id, nombre, salarioBase);
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSalario(double horas) {
        return getSalarioBase() * horas;
    }
}
