public class Garage {
    private int numEspacios;
    private Vehiculo[] vehiculos;


   public Garage(int numEspacios) {

       this.vehiculos = new Vehiculo[numEspacios];
   }

   public boolean estacionar(Vehiculo vehiculo) {
       for(int i=0; i < vehiculos.length; i++) {
           if(vehiculos[i]==null) {
               vehiculos[i]=vehiculo;
               return true;
           }
       }
       return false;
   }
   public boolean retirar(String placaBuscar) {
       for(int i=0; i < vehiculos.length; i++) {
           if(vehiculos[i].getPlaca().equals(placaBuscar)) {
               vehiculos[i]=null;
               return true;
           }
           }
       return false;
       }
    public int contarVehiculos() {
        int contador = 0;
        for(int i=0; i < vehiculos.length; i++){
            if(vehiculos[i]!=null){
                contador++;
            }
        }
        return contador;
    }
   }



