package Sprint_M4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Crear instancia de la clase Contenedor
        Contenedor contenedor = new Contenedor();

        // Scanner para entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variable para guardar la opción del menú
        int opcion;

        // Bucle del menú
        do {
            // Mostrar el menú principal
            System.out.println("\nMenú Principal:");
            System.out.println("1. Almacenar Cliente");
            System.out.println("2. Almacenar Profesional");
            System.out.println("3. Almacenar Administrativo");
            System.out.println("4. Almacenar Capacitación");
            System.out.println("5. Eliminar Usuario");
            System.out.println("6. Listar Usuarios");
            System.out.println("7. Listar Usuarios por Tipo");
            System.out.println("8. Listar Capacitaciones");
            System.out.println("9. Salir");
            System.out.print("Ingrese la opción deseada: ");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Realizar la acción según la opción seleccionada
            switch (opcion) {
                case 1:
                	 // Almacenar Cliente
                    Scanner scannerCliente = new Scanner(System.in);

                    System.out.println("Ingrese el nombre del cliente:");
                    String nombreCliente = scannerCliente.nextLine();

                    System.out.println("Ingrese los apellidos del cliente:");
                    String apellidosCliente = scannerCliente.nextLine();

                    System.out.println("Ingrese la fecha de nacimiento del cliente (en formato DD/MM/AAAA):");
                    String fechaNacimientoClienteStr = scannerCliente.nextLine();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date fechaNacimientoCliente = null;
                    try {
                        fechaNacimientoCliente = dateFormat.parse(fechaNacimientoClienteStr);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Ingrese el RUN del cliente:");
                    int runCliente = scannerCliente.nextInt();
                    scannerCliente.nextLine(); // Limpiar el buffer del scanner

                    System.out.println("Ingrese el RUT del cliente:");
                    int rutCliente = scannerCliente.nextInt();
                    scannerCliente.nextLine(); // Limpiar el buffer del scanner

                    System.out.println("Ingrese la dirección del cliente:");
                    String direccionCliente = scannerCliente.nextLine();

                    System.out.println("Ingrese la comuna del cliente:");
                    String comunaCliente = scannerCliente.nextLine();

                    System.out.println("Ingrese el sistema de salud del cliente (1 para Fonasa, 2 para Isapre):");
                    int sistemaSaludCliente = scannerCliente.nextInt();

                    Cliente nuevoCliente = new Cliente(nombreCliente, apellidosCliente, fechaNacimientoCliente, runCliente, rutCliente, direccionCliente, 
                    		comunaCliente, sistemaSaludCliente);
                    contenedor.almacenarCliente(nuevoCliente);

                    System.out.println("Cliente almacenado correctamente.");
                    break;
                case 2:
                    // Almacenar Profesional
                    Scanner scannerProfesional = new Scanner(System.in);

                    System.out.println("Ingrese el nombre del profesional:");
                    String nombreProfesional = scannerProfesional.nextLine();

                    System.out.println("Ingrese los apellidos del profesional:");
                    String apellidosProfesional = scannerProfesional.nextLine();

                    System.out.println("Ingrese la fecha de nacimiento del profesional (en formato DD/MM/AAAA):");
                    String fechaNacimientoProfesionalStr = scannerProfesional.nextLine();
                    SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
                    Date fechaNacimientoProfesional = null;
                    try {
                        fechaNacimientoProfesional = dateFormat1.parse(fechaNacimientoProfesionalStr);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Ingrese el RUN del profesional:");
                    int runProfesional = scannerProfesional.nextInt();
                    scannerProfesional.nextLine(); // Limpiar el buffer del scanner

                    System.out.println("Ingrese el título del profesional:");
                    String tituloProfesional = scannerProfesional.nextLine();

                    System.out.println("Ingrese la fecha de ingreso del profesional (en formato DD/MM/AAAA):");
                    String fechaIngresoProfesionalStr = scannerProfesional.nextLine();
                    Date fechaIngresoProfesional = null;
                    try {
                        fechaIngresoProfesional = dateFormat1.parse(fechaIngresoProfesionalStr);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    Profesional nuevoProfesional = new Profesional(nombreProfesional, apellidosProfesional, fechaNacimientoProfesional, runProfesional, 
                    		tituloProfesional, fechaIngresoProfesional);
                    contenedor.almacenarProfesional(nuevoProfesional);

                    System.out.println("Profesional almacenado correctamente.");

                    break;
                case 3:
                    // Almacenar Administrativo
                    Scanner scannerAdmin = new Scanner(System.in);

                    System.out.println("Ingrese el nombre del administrativo:");
                    String nombreAdmin = scannerAdmin.nextLine();

                    System.out.println("Ingrese los apellidos del administrativo:");
                    String apellidosAdmin = scannerAdmin.nextLine();

                    System.out.println("Ingrese la fecha de nacimiento del administrativo (en formato DD/MM/AAAA):");
                    String fechaNacimientoAdminStr = scannerAdmin.nextLine();
                    SimpleDateFormat dateFormat11 = new SimpleDateFormat("dd/MM/yyyy");
                    Date fechaNacimientoAdmin = null;
                    try {
                        fechaNacimientoAdmin = dateFormat11.parse(fechaNacimientoAdminStr);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Ingrese el RUN del administrativo:");
                    int runAdmin = scannerAdmin.nextInt();
                    scannerAdmin.nextLine(); // Limpiar el buffer del scanner

                    System.out.println("Ingrese el área del administrativo:");
                    String areaAdmin = scannerAdmin.nextLine();

                    System.out.println("Ingrese la experiencia previa del administrativo:");
                    String experienciaPrevAdmin = scannerAdmin.nextLine();

                    Administrativo nuevoAdmin = new Administrativo(nombreAdmin, apellidosAdmin, fechaNacimientoAdmin, runAdmin, 
                    		areaAdmin, experienciaPrevAdmin);
                    contenedor.almacenarAdministrativo(nuevoAdmin);

                    System.out.println("Administrativo almacenado correctamente.");

                    break;

                case 4:
                    // Almacenar Capacitación
                    Scanner scannerCapacitacion = new Scanner(System.in);

                    System.out.println("Ingrese el identificador de la capacitación:");
                    int identificadorCapacitacion = scannerCapacitacion.nextInt();
                    scannerCapacitacion.nextLine(); // Limpiar el buffer del scanner

                    System.out.println("Ingrese el RUT del cliente asociado:");
                    int rutClienteCapacitacion = scannerCapacitacion.nextInt();
                    scannerCapacitacion.nextLine(); // Limpiar el buffer del scanner

                    System.out.println("Ingrese el día de la capacitación (en formato día de la semana, ej. Lunes):");
                    String diaCapacitacion = scannerCapacitacion.nextLine();

                    System.out.println("Ingrese la hora de la capacitación (en formato HH:MM):");
                    String horaCapacitacion = scannerCapacitacion.nextLine();

                    System.out.println("Ingrese el lugar de la capacitación:");
                    String lugarCapacitacion = scannerCapacitacion.nextLine();

                    System.out.println("Ingrese la duración de la capacitación:");
                    String duracionCapacitacion = scannerCapacitacion.nextLine();

                    System.out.println("Ingrese la cantidad de asistentes:");
                    int cantidadAsistentes = scannerCapacitacion.nextInt();
                    scannerCapacitacion.nextLine(); // Limpiar el buffer del scanner

                    Capacitacion nuevaCapacitacion = new Capacitacion(identificadorCapacitacion, rutClienteCapacitacion, diaCapacitacion, horaCapacitacion, lugarCapacitacion, duracionCapacitacion, cantidadAsistentes);
                    contenedor.almacenarCapacitacion(nuevaCapacitacion);

                    System.out.println("Capacitación almacenada correctamente.");

                    break;

                case 5:
                    // Eliminar Usuario
                    Scanner scannerEliminarUsuario = new Scanner(System.in);

                    System.out.println("Ingrese el RUN del usuario que desea eliminar:");
                    int runUsuarioEliminar = scannerEliminarUsuario.nextInt();
                    scannerEliminarUsuario.nextLine(); // Limpiar el buffer del scanner

                    contenedor.eliminarUsuario(runUsuarioEliminar);

                    System.out.println("Usuario eliminado correctamente.");

                    break;

                case 6:
                    // Listar Usuarios
                    System.out.println("Lista de Usuarios:");
                    contenedor.listarUsuarios();
                    break;

                case 7:
                    // Listar Usuarios por Tipo
                    Scanner scannerTipoUsuario = new Scanner(System.in);

                    System.out.println("Ingrese el tipo de usuario que desea listar (cliente, administrativo o profesional):");
                    String tipoUsuario = scannerTipoUsuario.nextLine();

                    System.out.println("Lista de Usuarios de tipo " + tipoUsuario + ":");
                    contenedor.listarUsuariosPorTipo(tipoUsuario);
                    break;

                case 8:
                    // Listar Capacitaciones
                    System.out.println("Lista de Capacitaciones:");
                    contenedor.listarCapacitaciones();
                    break;

                case 9:
                    // Salir del programa
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    // Opción incorrecta
                    System.out.println("Opción incorrecta. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 9); // Salir del bucle cuando se seleccione la opción de salida (9)

        // Cerrar el scanner
        scanner.close();
    }
}
