import java.util.Scanner;

public class Mascotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tipo de animal (perro, gato, ave, otro): ");
        String tipoAnimal = sc.next().toLowerCase();

        System.out.print("Ingrese la edad de la mascota: ");
        int edad = sc.nextInt();

        String veterinario = "";

        switch (tipoAnimal) {
            case "perro":
                veterinario = "Dr. Canino";
                break;
            case "gato":
                veterinario = "Dr. Felino";
                break;
            case "ave":
                veterinario = "Dr. Aviario";
                break;
            default:
                veterinario = "Dr. General";
                break;
        }

        System.out.println("Veterinario asignado: " + veterinario);

        if ((tipoAnimal.equals("perro") || tipoAnimal.equals("gato")) && edad > 5) {
            System.out.println("Recomendación: Vacunación adicional.");
        }

        sc.close();
    }
}
