# FPII_P2
Segunda práctica de FPII
Se quiere modelar el sistema de gestión de los vehículos que se reparan en un taller mecánico
en una semana, incluyendo información sobre el dinero recaudado. Todos los vehículos tienen 
una matrícula identificativa, marca y modelo, y se debe saber cuánto cuesta reparar el motor y 
cambiar una rueda. 
En este taller se pueden reparar coches y motos. De los coches se conoce el kilometraje y el tipo 
de combustible que utilizan (gasolina o diésel). El coste de la reparación del motor depende de:
• Kilometraje <= 150.000 km → 0,02€/km
• Kilometraje > 150.000 km → Coste fijo 1.000€ + 0,01€/km
• Si el motor es de gasolina, se aplica un descuento del 10% sobre el valor obtenido
El coste del cambio de una rueda es de 100€ por rueda para todos los coches. Además, en los 
coches se puede cambiar el limpiaparabrisas, con un coste de 55€.
De las motos se conoce la cilindrada del motor. La reparación del motor depende de su 
cilindrada:
• Cilindrada <= 250cc → 300€
• Cilindrada > 250cc → Coste fijo 200€ + 0,25€/cc
El coste del cambio de rueda por defecto es de 50€ para todas las motos.
Tanto para coches como para motos se debe contar con un método toString() que devuelva toda 
la información de los atributos del vehículo correspondiente.
Se pide:
a) Dibujar en UML el diagrama de clases indicando las relaciones entre las mismas y los 
miembros que hay en cada una. Debe incluir métodos para la consulta de todos los atributos y 
todos los métodos que sean necesarios para la resolución del ejercicio.
b) Implementar en Java dichas clases.
c) Implementar un programa principal donde se realicen los siguientes apartados:
1) Crear los vehículos
2) El orden de llegada de los vehículos al taller y las reparaciones realizadas a cada uno de 
ellos se muestran en la siguiente tabla
3) Mostrar por pantalla una lista detallada de todos los vehículos, por orden de llegada,
indicando qué reparaciones se han aplicado a cada uno de ellos y cuánto han costado.
4) Mostrar por pantalla el dinero cobrado por cada uno de los tres tipos de reparaciones, 
así como la cantidad total.
# Nota: 9.3/10
Documentacion: https://drive.google.com/drive/folders/1AVE39tJw-jwnvlTyBYG9GjqIo1jM1R1C?usp=drive_link
