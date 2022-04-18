class Car {
    constructor(license, driver) { //Datos inpresindibles en el constructor
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }
    
    printDataCar() {
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
}