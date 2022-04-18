class Account:
    id = int
    name = str
    document = str
    email = str
    password = str

    def __init__(self, name, document): #Esto es igual al metodo constructor, lo declaramos usando __init__
        self.name = name #self es igual a this. en JS
        self.document = document