public class PrefixPostfix {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a; // Prefijo: primero incrementa, luego asigna
        System.out.println("a: " + a + ", b(prefijo): " + b);

        int x = 5;
        int y = x++; // Posfijo: primero asigna, luego incrementa
        System.out.println("x: " + x + ", y (posfijo): " + y);
    }
}
