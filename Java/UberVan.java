import java.util.Map;
import java.util.ArrayList;

class UberVan extends Car{
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    /*private Integer passenger;*/

    public UberVan(String license, Account driver, 
    Map<String, Map<String,Integer>> typeCarAccepted, 
    ArrayList<String> seatsMaterial){
        super(license, driver); /*Super hara referencia a la clase padre */
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    public UberVan(String license, Account driver){
        super(license, driver); /*Super hara referencia a la clase padre */
    }

    @Override /*Sobreescribiendo este metodo de la clase Car, eso es polimorfismo */
    public void setPassenger(Integer passenger) {
        // TODO Auto-generated method stub
        if(passenger == 6) {
            this.passegenger = passenger;
        }
        else {
            System.out.println("Necesitas Asignar 4 pasajeros");
        }
    }
}