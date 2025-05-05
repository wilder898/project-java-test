public class TemperatureConverter {
    public static void main(String[] args) {
        int fahrenheit = 98;
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        String message = fahrenheit + "°F es igual a " + celsius + "°C";
        System.out.println(message);

        // Rounding to two decimal places
        double roundedCelsius = Math.round(celsius * 100.0) / 100.0;
        String formattedMessage = String.format("%d°F is equal to %.2f°C", fahrenheit, roundedCelsius);
        System.out.println(formattedMessage);

        // Converting the other way
        celsius = 37.0;
        fahrenheit = (int) (celsius * 9.0 / 5.0 + 32);
        System.out.println(celsius + "°C es aproximadamente " + fahrenheit + "°F");
    }
}
