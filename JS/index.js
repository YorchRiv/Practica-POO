var car = new Car("AW456", new Account("Andres Herrera", "QWERTY")) 
// dentro del objeto car() hemos declarado que los datos minimos son licence y driver, se llama a licencia y como driver hereda de acount, 
//creamos new account donde se requeriria el dato de driver y como en acount se requiere minimo name y document se llaman a los 2 y se guardan en driver
car.passenger = 4;
car.printDataCar();

var uberX = new UberX("AWS111", new Account("Andres Fernando", "WSA222"), "Chevrolet", "Spark")
//Mi variable uberX va a ser igual a un nuevo objeto, de la clase UberX y ese va a ser igua a
//su constructor que requiere los parametros, license, driver(que recordemos, requiere name y document de la clase Account)
//requiere brand y model
uberX.passenger = 4;
uberX.printDataCar();