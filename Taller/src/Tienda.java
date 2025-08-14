import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tipo de prenda (camisa, pantalon, chaqueta): ");
        String tipoPrenda = sc.next().toLowerCase();

        System.out.print("Ingrese la cantidad de prendas: ");
        int cantidad = sc.nextInt();

        double precio;

        switch (tipoPrenda) {
            case "camisa":
                precio = 20000;
                break;
            case "pantalon":
                precio = 40000;
                break;
            case "chaqueta":
                precio = 60000;
                break;
            default:
                System.out.println("Prenda no valida.");
                sc.close();
                return;
        }

        double total = precio * cantidad;

        if (cantidad > 5) {
            total *= 0.85;
        }

        System.out.printf("Total a pagar: $%.2f%n", total);
        sc.close();
    }
}
