class UberX extends Car{ /* extends es la palabra clave para heredar, entonces UberX hereda de Car */
    String brand; /* Atributos Propios de la clase uberx */
    String model;

    public UberX(String license, Account driver, String brand, String model){
        super(license, driver); /*Super hara referencia a la clase padre */
        this.brand = brand;/* Atributos Propios de la clase uberx */
        this.model = model;
    }
}
