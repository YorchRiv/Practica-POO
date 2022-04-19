import imp
from car import Car

class UberVan(Car):
    typeCarAccepted = []
    seetsMaterial = []

    def __init__(self, license, driver, typeCarAccepted, seetsMaterial):
        super().__init__(license, driver)
        self.typeCarAccepted = typeCarAccepted
        self.seetsMaterial = seetsMaterial