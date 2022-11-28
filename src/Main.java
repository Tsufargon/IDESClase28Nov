import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] vectorS = new String[5];
        int indiceSiguiente = 0;

        boolean continuar = true;
        Scanner sc;
    }

    public static int getOption() {
        Scanner sc;
        int ans;
        do {
            sc = new Scanner(System.in);
            System.out.print("[1] Inserta nombres de productos\n" +
                    "[2] Ordena nombres de productos\n" +
                    "[3] Visualiza todos los nombres de productos\n" +
                    "[4] Búsqueda de un nombre de producto\n" +
                    "[5] Salir\n" +
                    "> ");
            try {
                ans = sc.nextInt();
                if (ans > 0 && ans < 6) {
                    return ans;
                } else {
                    System.out.println("bad format");
                }
            } catch (Exception e) {
                System.out.println("forbidden");
            }
        } while (true);
    }}