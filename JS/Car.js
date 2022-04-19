class Car {
    constructor(license, driver) { //Datos inpresindibles en el constructor
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }
    
    printDataCar() { //Metodos
        console.log(this.driver) // Imprime una tabla con todos los datos
        console.log(this.driver.name) // Imprime solamente el name dentro del objeto driver
        console.log(this.driver.document) //Imprime solamente el document dentro del objeto driver.
    }
}