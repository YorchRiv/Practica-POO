from account import Account
#acount en minuscula es el nombre del archivo y Account en mayuscula es el nombre de la clase
#aqui importo Account en esta clase
class Car:
    id = int
    license = str
    driver = Account("", "") #Driver hereda a account
    passegenger = int

    def __init__(self, license, driver): #Requiere estrictametne licence y driver para instanciar el objeto
        self.license = license #self.license es variable global y license es variable local
        self.driver = driver