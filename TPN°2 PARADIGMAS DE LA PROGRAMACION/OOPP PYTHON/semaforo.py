#gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 18


class Semaforo:
    def __init__(self):
        self.color = 'verde'
        self.encendido = True
    
    def cambio_color(self, nuevo_color):
        self.color = nuevo_color
    
    def cambio_encendido(self):
        self.encendido = not self.encendido

class Vehiculo:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.movimiento = 'detenido'
    
    def avanzar(self):
        self.movimiento = 'avanzar'
    
    def detenerse(self):
        self.movimiento = 'detenido'

# Creamos una instancia de la clase Semaforo y otra de la clase Vehiculo
semáforo = Semaforo()
vehículo = Vehiculo('Ford', 'F100')

# Simulamos el cambio de color del semáforo y determinamos si el vehículo puede avanzar o no
semáforo.cambio_color('rojo')

if semáforo.color == 'verde' and semáforo.encendido:
    vehículo.avanzar()
else:
    vehículo.detenerse()

print(f"El semáforo está en color {semáforo.color} y el vehículo está {vehículo.movimiento}.")