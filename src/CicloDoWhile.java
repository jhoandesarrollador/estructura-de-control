import java.util.Scanner;

public class CicloDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número mayor a 0: ");
            numero = scanner.nextInt();
        } while (numero <= 0);

        System.out.println("El número ingresado es: " + numero);
    }
}