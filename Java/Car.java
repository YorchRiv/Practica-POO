
class Car {
    /* Atributos */
    protected Integer id;
    protected String license;
    protected Account driver; /* Driver hereda de account y por eso el cambio de nombre */
    protected Integer passegenger; /* Encapsulamiento de mi atributo passenger */

    public Car(String license, Account driver) { /* Metodo Constructor, Aqui declaramos los atributos necesarios para este objeto*/
        this.license = license; /* this.license llama a la variable global y license a la variable local de este constructor */
        this.driver = driver;

    }

    void printDataCar() { /*Metodos */
        if(passegenger != null){
            System.out.println("License: " + license + "Name Driver: " + driver.name + " Passegenger: " + passegenger);
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
        else {
            System.out.println("Necesitas Asignar 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }


    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }


    public Account getDriver() {
        return driver;
    }
    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}
