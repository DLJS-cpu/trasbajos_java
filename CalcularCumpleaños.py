from datetime import datetime, date

def calcular_edad(fecha_nacimiento):
    hoy = date.today()
    edad = hoy.year - fecha_nacimiento.year

    
    if (hoy.month, hoy.day) < (fecha_nacimiento.month, fecha_nacimiento.day):
        edad -= 1
    return edad

def dias_para_cumple(fecha_nacimiento):
    hoy = date.today()
    proximo_cumple = date(hoy.year, fecha_nacimiento.month, fecha_nacimiento.day)

    if proximo_cumple < hoy:
        proximo_cumple = date(hoy.year + 1, fecha_nacimiento.month, fecha_nacimiento.day)
    
    return (proximo_cumple - hoy).days

def main():
    print("Bienvenido al programa de cálculo de edad y días para el cumpleaños.")
    nombre = input("Introduce tu nombre: ")
    print(f"Hola, {nombre}!")
    fecha_str = input("Introduce tu fecha de nacimiento (AAAA-MM-DD): ")
                 
    try:
        fecha_nacimiento = datetime.strptime(fecha_str, "%Y-%m-%d").date()
    except ValueError:
        print("Formato de fecha inválido. Usa AAAA-MM-DD.")
        return

    edad = calcular_edad(fecha_nacimiento)
    dias = dias_para_cumple(fecha_nacimiento)

    print(f"Tienes {edad} años.")
    print(f"Faltan {dias} días para tu próximo cumpleaños.")

if __name__ == "__main__":
    main()
