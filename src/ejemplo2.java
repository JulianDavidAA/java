import java.util.Scanner;

public class ejemplo2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int resultado = calculardigitos(numero);
        System.out.println(resultado);
    }

    public static int calculardigitos(int numero){
        int cifras = 0;
        while(numero!=0){
            numero /=10;
            cifras++;
        }
        return cifras;

    }

}
