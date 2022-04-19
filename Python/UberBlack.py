from car import Car

class UberBlack(Car):
    typeCarAccepted = []
    seetsMaterial = []

    def __init__(self, license, driver, typeCarAccepted, seetsMaterial):
        super().__init__(license, driver)
        self.typeCarAccepted = typeCarAccepted
        self.seetsMaterial = seetsMaterial