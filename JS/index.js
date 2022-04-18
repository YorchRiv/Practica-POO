var car = new Car("AW456", new Account("Andres Herrera", "QWERTY")) 
// dentro del objeto car() hemos declarado que los datos minimos son licence y driver, se llama a licencia y como driver hereda de acount, 
//creamos new account donde se requeriria el dato de driver y como en acount se requiere minimo name y document se llaman a los 2 y se guardan en driver
car.passenger = 4;
car.printDataCar();