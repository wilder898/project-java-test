import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperatura en Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius;

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("%.1f°F es igual a %.1f°C\n", fahrenheit, celsius);
        scanner.close();
    }
}
