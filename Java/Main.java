class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ145", new Account("Andres Herrera", "And123"));
        /* 
        Instancia de la clase
        Car car = new Car()
        Tipo de clase, nombre del objeto, = palabra reservada new, metodo constructor
        
        Dentro del metodo constructor se llamara a los atributos que tenga declarados, en este caso license y driver
        Y como driver hereda de Account se llamara a name y document que seran los datos de driver
        */

        car.printDataCar();        
    }
}