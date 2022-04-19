from hashlib import new
from car import Car #Sirve para importar la clase, car en minusculas es el nombre del archivo y en mayusculas el nombre de la clase
from account import Account
from driver import Driver
from user import User
# from user import User
def run():
    print("Hola Mundo")
    car = Car("AMD333", Account("Andres Herrera", "AND2222")) #Variable car = objeto Car()
    print(vars(car))
    print(vars(car.driver))

    user1 = User("Jorge Mejicanos", "3239")
    print("varUser: ")
    print(vars(user1))

    driver1 = Driver(user1.name, user1.document)
    print("varDriver: ")
    print(vars(driver1))
if __name__ == "__main__":
    run()