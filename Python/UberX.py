from car import Car #Desde archivo car se importa clase Car

class UberX(Car): #Clase UberX hereda de Car
    brand = str #Variables especificas de clase UberX
    model = str

    def __init__(self, license, driver, brand, model): #Esto es igual al metodo constructor, lo declaramos usando __init__
        super().__init__(license, driver) #Super es para llavar a los atributos de la clase padre en este caso Car()
        self.brand = brand #self. es para variable global = variable local
        self.model = model