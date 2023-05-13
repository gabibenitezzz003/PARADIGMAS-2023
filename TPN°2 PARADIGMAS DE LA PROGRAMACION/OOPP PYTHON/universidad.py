#gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 19


class Universidad:
    def __init__(self):
        self.estudiantes = []
    
    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)
    
    def mostrar_estudiantes(self):
        for estudiante in self.estudiantes:
            print(f"Nombre: {estudiante.nombre}, Edad: {estudiante.edad}, Nacionalidad: {estudiante.nacionalidad}, Aprobado Secundario: {estudiante.aprobado_secundario}")

class Estudiante:
    def __init__(self, nombre, edad, nacionalidad, aprobado_secundario):
        self.nombre = nombre
        self.edad = edad
        self.nacionalidad = nacionalidad
        self.aprobado_secundario = aprobado_secundario
    
    def validar_admision(self):
        if self.edad >= 18 and (self.nacionalidad == 'argentino' or self.nacionalidad == 'nacionalizado') and self.aprobado_secundario:
            return True
        else:
            return False

# Creamos una instancia de la clase Universidad
universidad = Universidad()

# Creamos varios estudiantes y los agregamos a la universidad
est1 = Estudiante('Juan', 20, 'argentino', True)
universidad.agregar_estudiante(est1)

est2 = Estudiante('María', 17, 'nacionalizado', False)
universidad.agregar_estudiante(est2)

est3 = Estudiante('Pedro', 19, 'argentino', True)
universidad.agregar_estudiante(est3)

# Mostramos los estudiantes que cumplen con los requisitos de admisión
print("Estudiantes que cumplen con los requisitos de admisión:")
for est in universidad.estudiantes:
    if est.validar_admision():
        print(est.nombre)

# Mostramos todos los estudiantes
