import java.util.Scanner;

public class Parqueadero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tipo de vehículo (auto, moto, bicicleta): ");
        String tipoVehiculo = sc.next().toLowerCase();

        System.out.print("Ingrese la hora de llegada (0-23): ");
        int hora = sc.nextInt();

        double costo;

        switch (tipoVehiculo) {
            case "auto":
                costo = 5000;
                break;
            case "moto":
                costo = 3000;
                break;
            case "bicicleta":
                costo = 1000;
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                sc.close();
                return;
        }

        if (hora > 20) {
            costo *= 1.20;
        }

        System.out.printf("Costo total del parqueadero: $%.2f%n", costo);
        sc.close();
    }
}
