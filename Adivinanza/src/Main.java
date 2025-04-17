import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Generar el número aleatorio entre 0 y 100 (inclusive)
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(101); // nextInt(101) genera 0–100

        // 2. Preparar el scanner y las variables de control
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        final int MAX_INTENTOS = 5;
        int guess;

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("Tienes hasta " + MAX_INTENTOS + " intentos para adivinar un número entre 0 y 100.");

        // 3. Bucle de intentos
        while (intentos < MAX_INTENTOS) {
            System.out.print("Intento " + (intentos + 1) + ": ingresa tu número: ");
            guess = sc.nextInt();
            intentos++;

            if (guess == numeroSecreto) {
                System.out.println("🎉 ¡Felicidades! Has adivinado el número en " + intentos + " intento(s).");
                break;  // salir del bucle si acierta
            } else if (guess < numeroSecreto) {
                System.out.println("El número secreto es MAYOR que " + guess + ".");
            } else {
                System.out.println("El número secreto es MENOR que " + guess + ".");
            }

            // Si llegamos al máximo de intentos sin acertar
            if (intentos == MAX_INTENTOS) {
                System.out.println("☹️ Se te acabaron los intentos. El número era: " + numeroSecreto);
            }
        }

        sc.close();
    }
}
