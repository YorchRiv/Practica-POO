class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car();
        /* 
        Instancia de la clase
        Car car = new Car()
        Tipo de clase, nombre del objeto, = palabra reservada, metodo constructor
        */

        car.license = "AMQ145";
        car.driver = "Jorge Mejicanos";
        car.passegenger = 4;
        /*
        Asignamos datos a car
        */

        Car car2 = new Car();
        car2.license = "QWE123";
        car2.driver = "Luis Rivera";
        car2.passegenger = 2;
        
        car.printDataCar();
        car2.printDataCar();
        
    }
}