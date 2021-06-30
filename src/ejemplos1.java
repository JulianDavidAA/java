import java.util.Scanner;

public class ejemplos1 {
    public static void main(String args[]){
        
        // Implemente un algoritmo que dado un nombre en una variable de tipo cadena,
        // imprima un saludo en consola.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);
    }

    public static String saludar(String nombre){
        return "Hola " + nombre;
    }
    
}
