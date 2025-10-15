import java.util.Scanner;

class Funciones {
    public static void main(String[] args) {
        Suma();
    }

    public static void Suma () {
        int n1, n2;
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        n1 = sn.nextInt();

        System.out.println("Ingresa otro valor: ");
        n2 = sn.nextInt();

        System.out.println(n1 + n2);
    }
}