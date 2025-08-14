import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = sc.nextDouble();

        System.out.print("¿Cuántos productos compró? ");
        int cantidadProductos = sc.nextInt();

        System.out.print("Cuenta con membresía? (si/no): ");
        String membresia = sc.next().toLowerCase();

        if (membresia.equals("si")) {
            totalCompra *= 0.90;
        }

        if (cantidadProductos > 10) {
            totalCompra *= 0.95;
        }

        System.out.printf("Total a pagar después de descuentos: $%.2f%n", totalCompra);
        sc.close();
    }
}
