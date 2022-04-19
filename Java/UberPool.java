class UberPool extends Car{
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model){
        super(license, driver); /*Super hara referencia a la clase padre */
        this.brand = brand;
        this.model = model;
    }
}
