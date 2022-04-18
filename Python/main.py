from car import Car #Sirve para importar la clase, car en minusculas es el nombre del archivo y en mayusculas el nombre de la clase
from account import Account
def run():
    print("Hola Mundo")
    car = Car("AMD333", Account("Andres Herrera", "AND2222")) #Variable car = objeto Car()
    print(vars(car))
    print(vars(car.driver))

if __name__ == "__main__":
    run()