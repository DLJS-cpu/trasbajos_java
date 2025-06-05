def Calificaciones(): 
    nombre = input("Ingrese su nombre: ")

    print("Hola", nombre, "bienvenido a tu mensaje motivacional")
    print("¿Cuál es tu promedio de calificaciones?")


    promedio = int(input("Ingrese su promedio: "))
    if promedio >= 90:
        print("¡Excelente trabajo!", nombre, "sigue así y alcanzarás tus metas.")
    elif promedio >= 80:
        print("¡Buen trabajo!", nombre, "sigue esforzándote y lograrás grandes cosas.")
    elif promedio >= 70:
        print("¡Bien hecho!", nombre, "sigue trabajando duro y verás resultados positivos.")
    elif promedio >= 60:
        print("¡Sigue adelante!", nombre, "no te rindas y sigue mejorando.")
    else:
        print("No te desanimes", nombre, "cada día es una nueva oportunidad para aprender y crecer.")

Calificaciones()        

