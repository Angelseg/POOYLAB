import java.util.Scanner;

public class _p80_PrimerExamenParcial {
        
        public static class Totales {
        int totalAlumnos = 0;
        int totalDocentes = 0;
        int totalTrabajadores = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int totalParticipantes = 0;
        double totalDineroAlumnos = 0;
        double totalDineroDocentes = 0;
        double totalDineroTrabajadores = 0;
        double totalDineroGeneral = 0;
        double totalEdades = 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Totales totales = new Totales();

        while (true) {
            String[] datosParticipante = obtenerDatosParticipante(scanner);

            if (datosParticipante == null) {
                break;
            }

            String nombre = datosParticipante[0];
            int edad = Integer.parseInt(datosParticipante[1]);
            char sexo = datosParticipante[2].charAt(0);
            String tipoParticipante = datosParticipante[3];

            if (edad < 18) {
                System.out.println("Lo siento, solo los mayores de edad pueden asistir al curso.");
                continue;
            }

            if (sexo == 'M' || sexo == 'm') {
                totales.totalHombres++;
            } else if (sexo == 'F' || sexo == 'f') {
                totales.totalMujeres++;
            }

            double costoInscripcion = calcularCostoInscripcion(tipoParticipante);
            actualizarTotales(costoInscripcion, tipoParticipante, totales);

            totales.totalAlumnos += tipoParticipante.equalsIgnoreCase("alumno") ? 1 : 0;
            totales.totalDocentes += tipoParticipante.equalsIgnoreCase("docente") ? 1 : 0;
            totales.totalTrabajadores += tipoParticipante.equalsIgnoreCase("trabajador") ? 1 : 0;
            totales.totalParticipantes++;
            totales.totalEdades += edad;

            System.out.print("¿Desea registrar otro participante (S/N)? ");
            String continuar = scanner.next().trim().toLowerCase();

            if (!continuar.equals("s")) {
                break;
            }
        }

        double promedioEdades = totales.totalEdades / totales.totalParticipantes;

        mostrarResumen(totales);
        mostrarMensajeFinal(totales.totalDineroGeneral);

        scanner.close();
    }

    public static String[] obtenerDatosParticipante(Scanner scanner) {
        String[] datosParticipante = new String[4];

        System.out.println("Ingrese los datos del participante (o 'fin' para terminar):");
        System.out.print("Nombre: ");
        String nombre = scanner.next();

        if (nombre.equalsIgnoreCase("fin")) {
            return null;
        }

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Tipo de Participante (Alumno/Docente/Trabajador): ");
        String tipoParticipante = scanner.next();

        datosParticipante[0] = nombre;
        datosParticipante[1] = String.valueOf(edad);
        datosParticipante[2] = String.valueOf(sexo);
        datosParticipante[3] = tipoParticipante;

        return datosParticipante;
    }

    public static double calcularCostoInscripcion(String tipoParticipante) {
        switch (tipoParticipante.toLowerCase()) {
            case "alumno":
                return 50;
            case "docente":
                return 80;
            case "trabajador":
                return 60;
            default:
                return 0;
        }
    }

    public static void actualizarTotales(double costoInscripcion, String tipoParticipante, Totales totales) {
        switch (tipoParticipante.toLowerCase()) {
            case "alumno":
                totales.totalDineroAlumnos += 50;
                break;
            case "docente":
                totales.totalDineroDocentes += 80;
                break;
            case "trabajador":
                totales.totalDineroTrabajadores += 60;
                break;
        }
        totales.totalDineroGeneral += costoInscripcion;
    }

    public static void mostrarResumen(Totales totales) {
        System.out.println("\nResumen de inscripciones:");
        System.out.println("Total de Alumnos: " + totales.totalAlumnos);
        System.out.println("Total de Docentes: " + totales.totalDocentes);
        System.out.println("Total de Trabajadores: " + totales.totalTrabajadores);
        System.out.println("Total de Hombres en general: " + totales.totalHombres);
        System.out.println("Total de Mujeres en general: " + totales.totalMujeres);
        System.out.println("Total de todos los participantes: " + totales.totalParticipantes);
        System.out.println("Promedio de la edad de todos los participantes: " + totales.totalEdades / totales.totalParticipantes);

        System.out.println("\nResumen de dinero recaudado:");
        System.out.println("Total dinero recaudado de Alumnos: " + totales.totalDineroAlumnos);
        System.out.println("Total dinero recaudado de Docentes: " + totales.totalDineroDocentes);
        System.out.println("Total dinero recaudado de Trabajadores: " + totales.totalDineroTrabajadores);
        System.out.println("Total dinero en general: " + totales.totalDineroGeneral);
    }

    public static void mostrarMensajeFinal(double totalDineroGeneral) {
        System.out.println("\nMensaje final:");

        if (totalDineroGeneral < 100) {
            System.out.println("El evento concluye con ganancias BAJAS");
        } else if (totalDineroGeneral >= 100 && totalDineroGeneral < 200) {
            System.out.println("El evento concluye con ganancias MODERADAS");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias");
        }
    }
}