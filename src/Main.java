import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] vectorS = new String[5];
        int indiceSiguiente = 0;

        boolean continuar = true;
        Scanner sc;

        do {
            sc = new Scanner(System.in);
            int opt = getOption();
            switch(opt) {
                case 1:
                    System.out.print("Introduzca frase a introducir:\n> ");
                    vectorS[indiceSiguiente] = sc.nextLine();
                    System.out.println(Arrays.toString(vectorS));
                    System.out.println(indiceSiguiente);
                    indiceSiguiente++;
                    break;
                case 2:
                    ordenaNombres(vectorS, indiceSiguiente);
                    System.out.println(Arrays.toString(vectorS));
                    break;
            }

        } while(continuar);
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
    }

    public static void ordenaNombres(String[] a, int ind) {
        String temp = "";
        int i = 0;
        while(i < ind-1) {
            if(a[i].compareToIgnoreCase(a[i+1]) > 0) {
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                i = -1;
            }
            i++;
        }
    }

}