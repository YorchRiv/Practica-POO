class Car {
    constructor(license, driver) { //Datos inpresindibles en el constructor
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }
    
    printDataCar() { //Metodos
        console.log(this.driver) // Imprime una tabla con todos los datos
        console.log("Name: " + this.driver.name) // Imprime solamente el name dentro del objeto driver
        console.log("Document: " + this.driver.document) //Imprime solamente el document dentro del objeto driver.
        console.log("Licence: " + this.license)
    }
}