
class Car {
    /* Atributos */
    Integer id;
    String license;
    Account driver; /* Driver hereda de account y por eso el cambio de nombre */
    private Integer passegenger; /* Encapsulamiento de mi atributo passenger */

    public Car(String license, Account driver) { /* Metodo Constructor, Aqui declaramos los atributos necesarios para este objeto*/
        this.license = license; /* this.license llama a la variable global y license a la variable local de este constructor */
        this.driver = driver;

    }

    void printDataCar() { /*Metodos */
        if(passegenger != null){
            System.out.println("License: " + license + "Name Driver: " + driver.name + " Passegenger: " + passegenger);
        }
        else {
            System.out.println("Necesitas Asignar 4 pasajeros a UberX");
        } 
    }

    /* getters y setters */
    public Integer getPassenger() {
        return passegenger;
    }

    public void setPassenger(Integer passenger) {
        if(passenger == 4) {
        this.passegenger = passenger;
        }
    }
}
