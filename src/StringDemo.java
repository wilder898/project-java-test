public class StringDemo {
    public static void main(String[] args) {
        String greeting = "Hello";
        String name = "Wilder";

        // String concatenation
        String message = greeting + ", " + name + "!";
        System.out.println(message);

        // String length
        System.out.println("La longitud del mensaje es: " + message.length());

        // Accessing characters in a string
        System.out.println("La primera letra es: " + message.charAt(0));

        // Converting to uppercase
        System.out.println("Mensaje en mayúsculas: " + message.toUpperCase());
        // Substring
        System.out.println("Primeros cinco caracteres: " + message.substring(0, 5));
    }
}
