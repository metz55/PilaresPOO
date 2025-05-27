import java.util.Scanner;
public class Implementacion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos del Futbolista:");
        System.out.print("Nombre: ");
        String fnombre = sc.nextLine();
        System.out.print("Apellido: ");
        String fapellido = sc.nextLine();
        System.out.print("Edad: ");
        int fedad = sc.nextInt(); sc.nextLine();
        System.out.print("Posición: ");
        String fposicion = sc.nextLine();

        Futbolista futbolista = new Futbolista(fnombre, fapellido, fedad, fposicion);

        System.out.println("\nIngrese los datos del Entrenador:");
        System.out.print("Nombre: ");
        String enombre = sc.nextLine();
        System.out.print("Apellido: ");
        String eapellido = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt(); sc.nextLine();
        System.out.print("Estrategia: ");
        String estrategia = sc.nextLine();

        Entrenador entrenador = new Entrenador(enombre, eapellido, edad, estrategia);

        System.out.println("\nIngrese los datos del Masajista:");
        System.out.print("Nombre: ");
        String mnombre = sc.nextLine();
        System.out.print("Apellido: ");
        String mapellido = sc.nextLine();
        System.out.print("Edad: ");
        int medad = sc.nextInt(); sc.nextLine();
        System.out.print("Titulación: ");
        String titulacion = sc.nextLine();

        Masajista masajista = new Masajista(mnombre, mapellido, medad, titulacion);

        System.out.println("\n--- Información del equipo ---");
        futbolista.mostrarInformacion();
        entrenador.mostrarInformacion();
        masajista.mostrarInformacion();

        sc.close();

    }
}
