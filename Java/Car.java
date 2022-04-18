import java.sql.Driver;

class Car {
    Integer id;
    String license;
    Account driver; /* Driver hereda de account y por eso el cambio de nombre */
    Integer passegenger;

    public Car(String license, Account driver) { /* Metodo Constructor, Aqui declaramos los atributos necesarios para este objeto*/
        this.license = license; /* this.license llama a la variable global y license a la variable local de este constructor */
        this.driver = driver;      
    }

    void printDataCar() {
        System.out.println("License: " + license + "Name Driver: " + driver.name + " Passegenger: " + passegenger);
    }
}
