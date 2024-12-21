import java.util.Scanner;

public class VisitanteSemana {

    public static void main(String[] args) {

        // Crear un objeto Scanner para leer entrada por teclado
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar la información del visitante
        System.out.print("Ingrese el nombre del visitante: ");
        String nombreVisitante = scanner.nextLine(); // Nombre (String)

        System.out.print("Ingrese la edad del visitante: ");
        int edadVisitante = scanner.nextInt(); // Edad (int)

        System.out.print("Ingrese el número del departamento que visitará: ");
        short numeroDepartamento = scanner.nextShort(); // Número del departamento (short)

        // Variables para cálculos
        int totalVisitas = 0; // Cantidad total de visitas (int)
        double totalTiempoEstadia = 0; // Tiempo total de estadía (double)

        // Leer las visitas realizadas durante la semana
        for (int dia = 1; dia <= 7; dia++) {
            System.out.print("Ingrese el número de visitas realizadas el día " + dia + ": ");
            int visitasDia = scanner.nextInt(); // Visitas en el día
            totalVisitas += visitasDia;

            System.out.print("Ingrese el tiempo total de estadía en horas (día " + dia + "): ");
            double tiempoEstadia = scanner.nextDouble(); // Tiempo de estadía en horas
            totalTiempoEstadia += tiempoEstadia;
        }

        // Calcular el promedio de estadía
        double promedioEstadia = totalVisitas > 0 ? totalTiempoEstadia / totalVisitas : 0;

        // Determinar si el visitante es mayor o menor de edad
        String mayorOMenor = (edadVisitante >= 18) ? "mayor de edad" : "menor de edad";

        // Mostrar la información del visitante y los cálculos
        System.out.println("\n=== Resumen de la Semana ===");
        System.out.println("Nombre del visitante: " + nombreVisitante);
        System.out.println("Edad del visitante: " + edadVisitante + " años (" + mayorOMenor + ")");
        System.out.println("Número del departamento: " + numeroDepartamento);
        System.out.println("Total de visitas realizadas: " + totalVisitas);
        System.out.println("Tiempo promedio de estadía por visita: " + promedioEstadia + " horas");

        // Cerrar el scanner
        scanner.close();
    }
}
