from car import Car #Sirve para importar la clase, car en minusculas es el nombre del archivo y en mayusculas el nombre de la clase
def run():
    print("Hola Mundo")
    car = Car() #Variable car = objeto Car()
    car.license = "AMD123"
    car.driver = "Jorge Rivera"
    car.passegenger = 4
    print(vars(car))

    car2 = Car()
    car2.license = "INTEL123"
    car2.driver = "Luis Mejicanos"
    print(vars(car2))

if __name__ == "__main__":
    run()