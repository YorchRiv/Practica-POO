from io import BufferedRandom
from car import Car

class UberPool(Car):
    brand = str
    model = str

    def __init__(self, license, driver, brand, model): #Esto es igual al metodo constructor, lo declaramos usando __init__
        super().__init__(license, driver)
        self.brand = brand #self. es para variable global = variable local
        self.model = model