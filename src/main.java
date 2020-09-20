import java.util.Scanner;
public class main {
    public static double promedio (double a, double b, double c, double d, double e) { return (a+b+c+d+e)/5; }
    public static void main (String[]args) {
        Scanner entrada = new Scanner (System.in);
        double numero1=0, numero2=0, numero3=0, numero4=0, numero5=0;
        System.out.println("<<<<<<<<<<Bienvenido a la Calculadora básica>>>>>>>>>>");
        System.out.println("Ingresa un numero: ");
        numero1=entrada.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        numero2=entrada.nextDouble();
        System.out.println("Ingresa el tercer numero: ");
        numero3=entrada.nextDouble();
        System.out.println("Ingresa el cuarto numero: ");
        numero4=entrada.nextDouble();
        System.out.println("Ingresa el quinto numero: ");
        numero5=entrada.nextDouble();
        if (promedio(numero1, numero2, numero3, numero4, numero5) <= 50)
        {
            System.out.println("El promedio del alumno es: "+promedio(numero1,numero2,numero3,numero4,numero5));

            System.out.println("Tienes F");
        }
        else if((promedio(numero1, numero2, numero3, numero4, numero5) > 50 ) && (promedio(numero1, numero2, numero3, numero4, numero5) <= 60))
        {
            System.out.println("El promedio del alumno es: "+promedio(numero1,numero2,numero3,numero4,numero5));
            System.out.println("Tienes E");
        }
        else if ((promedio(numero1, numero2, numero3, numero4, numero5) > 61 )&& (promedio(numero1, numero2, numero3, numero4, numero5) <= 70))
        {
            System.out.println("El promedio del alumno es: "+promedio(numero1,numero2,numero3,numero4,numero5));
            System.out.println("Tienes D");
        }
        else if ((promedio(numero1, numero2, numero3, numero4, numero5) > 71 )&& (promedio(numero1, numero2, numero3, numero4, numero5) <= 80))
        {
            System.out.println("El promedio del alumno es: "+promedio(numero1,numero2,numero3,numero4,numero5));
            System.out.println("Tienes C");
        }
        else if ((promedio(numero1, numero2, numero3, numero4, numero5) > 81 )&&(promedio(numero1, numero2, numero3, numero4, numero5) <= 90))
        {
            System.out.println("El promedio del alumno es: "+promedio(numero1,numero2,numero3,numero4,numero5));
            System.out.println("Tienes B");
        }
        else if ((promedio(numero1, numero2, numero3, numero4, numero5) > 91 )&& (promedio(numero1, numero2, numero3, numero4, numero5) <= 100))
        {
            System.out.println("El promedio del alumno es: "+promedio(numero1,numero2,numero3,numero4,numero5));
            System.out.println("Tienes A");
        }
    }
}