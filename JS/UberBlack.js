class UberBlack extends Car { // Clase UberBlack hereda de clase car
    constructor(license, driver, typeCarAccepted, seatsMaterial) { //Minimo necesario para funcionar de la clase UberBlack
        super(license, driver) // Hace referencia a la clase padre en este caso Car()
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}