def MenuMultiplicacion():
    print("Bienvenido a tu menu de multiplicar")
    opciones_menu = [f"{i}. Tabla del {i}" for i in range(1, 11)]
    opciones_menu.append("11. Salir") 
    for opcion_texto in opciones_menu:
        print(opcion_texto)

    while True:
        try:
            opcion = int(input("Selecciona una opción: "))

            if 1 <= opcion <= 10:
        
                tabla_seleccionada = opcion
                print(f"\n--- Tabla del {tabla_seleccionada} ---")
                
                for i in range(1, 11):
                    print(f"{tabla_seleccionada} x {i} = {tabla_seleccionada * i}")
                print("---------------------------\n") 

            elif opcion == 11:
                
                print("Saliendo del programa...")
                break 

            else:
                
                print("Opción no válida. Por favor, selecciona una opción entre 1 y 11.")

        except ValueError:
        
            print("Entrada inválida. Por favor, introduce un número entero.")
        except Exception as e:
            
            print(f"Ocurrió un error inesperado: {e}")

MenuMultiplicacion()