import java.util.Scanner;
import java.math.*;
 class KonwerterTemperatury {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wybierz rodzaj konwersji:");
            System.out.println("1. Celsiusz --> Fahrenheit");
            System.out.println("2. Fahrenheit --> Celsiusz");
            System.out.println("Wpisz 'koniec' aby zakończyć program.");

            String wybor = scanner.nextLine();

            if (wybor.equalsIgnoreCase("koniec")) {
                System.out.println("Koniec programu.");
                break;
            }

            if (wybor.equals("1")) {
                System.out.println("Podaj temperaturę w stopniach Celsiusza:");
                double celsius = scanner.nextDouble();
                double fahrenheit = konvertCelsiusToFahrenheit(celsius);
                System.out.println("Wynik: " + fahrenheit + " stopni Fahrenheit");
            } else if (wybor.equals("2")) {
                System.out.println("Podaj temperaturę w stopniach Fahrenheita:");
                double fahrenheit = scanner.nextDouble();
                double celsius = konvertFahrenheitToCelsius(fahrenheit);
                System.out.println("Wynik: " + celsius + " stopni Celsiusza");
            } else {
                System.out.println("Nieprawidłowy wybór. Wybierz ponownie.");
            }

            scanner.nextLine();
        }

        scanner.close();
    }

    private static double konvertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double konvertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
