public class Vprimitivas {
    public static void main(String[] args) {
        byte age = 25; // Tipo de dato byte, rango de -128 a 127
        short year = 2023; // Tipo de dato short, rango de -32,768 a 32,767
        int population = 1000000; // Tipo de dato int, rango de -2,147,483,648 a 2,147,483,647
        long distance = 123456789L; // Tipo de dato long, rango de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        float pi = 3.14f; // Tipo de dato float, precisión simple
        double e = 2.718281828459045; // Tipo de dato double, precisión doble
        char initial = 'A'; // Tipo de dato char, representa un solo carácter
        boolean isJavaFun = true; // Tipo de dato boolean, puede ser true o false
        // Imprimir los valores de las variables
        System.out.println("Edad: " + age);
        System.out.println("Año: " + year);
        System.out.println("Población: " + population);
        System.out.println("Distancia: " + distance);
        System.out.println("Pi: " + pi);
        System.out.println("e: " + e);
        System.out.println("Inicial: " + initial);
        System.out.println("¿Es Java divertido? " + isJavaFun);
        // Ejemplo de operaciones con variables
        int sum = age + year; // Suma de byte y short, se convierte a int
        System.out.println("Suma de edad y año: " + sum);
        double area = pi * 5 * 5; // Cálculo del área de un círculo con radio 5
        System.out.println("Área de un círculo con radio 5: " + area);

        // Ejemplo de conversión de tipos
        int intValue = (int) pi; // Conversión de float a int, se pierde la parte decimal
        System.out.println("Valor de pi convertido a int: " + intValue);
        // Ejemplo de comparación
        if (population > 500000) {
            System.out.println("La población es mayor a 500,000.");
        } else {
            System.out.println("La población es menor o igual a 500,000.");
        }
        // Ejemplo de uso de boolean
        if (isJavaFun) {
            System.out.println("¡Java es divertido!");
        } else {
            System.out.println("Java no es divertido.");

        }
    }
}
