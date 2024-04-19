package Sprint_M4;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
    private List<Asesoria> asesorias;
    private List<Capacitacion> capacitaciones;

    // Constructor
    public Contenedor() {
        this.asesorias = new ArrayList<>();
        this.capacitaciones = new ArrayList<>();
    }

    // Método para agregar una asesoría
    public void agregarAsesoria(Asesoria asesoria) {
        asesorias.add(asesoria);
    }

    // Método para agregar una capacitación
    public void agregarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }
    
 // Método para almacenar un nuevo cliente
    public void almacenarCliente(Cliente cliente) {
        asesorias.add(cliente);
    }

    // Método para almacenar un nuevo profesional
    public void almacenarProfesional(Profesional profesional) {
        asesorias.add(profesional);
    }

    // Método para almacenar un nuevo administrativo
    public void almacenarAdministrativo(Administrativo administrativo) {
        asesorias.add(administrativo);
    }

    // Método para almacenar una nueva capacitación
    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

    // Método para eliminar un usuario por RUN
    public void eliminarUsuario(int run) {
        asesorias.removeIf(usuario -> usuario.getRun() == run);
    }

    // Método para listar todos los usuarios
    public void listarUsuarios() {
        for (Asesoria asesoria : asesorias) {
            System.out.println(asesoria.toString());
        }
    }

    // Método para listar usuarios por tipo
    public void listarUsuariosPorTipo(String tipo) {
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Usuario) {
                Usuario usuario = (Usuario) asesoria;
                if (tipo.equalsIgnoreCase("cliente") && usuario instanceof Cliente) {
                    System.out.println(usuario.toString());
                } else if (tipo.equalsIgnoreCase("administrativo") && usuario instanceof Administrativo) {
                    System.out.println(usuario.toString());
                } else if (tipo.equalsIgnoreCase("profesional") && usuario instanceof Profesional) {
                    System.out.println(usuario.toString());
                }
            }
        }
    }

    // Método para listar todas las capacitaciones con los datos del cliente asociado
    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : capacitaciones) {
            System.out.println("Capacitación:");
            System.out.println(capacitacion.mostrarDetalle());
            for (Asesoria asesoria : asesorias) {
                if (asesoria instanceof Cliente) {
                    Cliente cliente = (Cliente) asesoria;
                    if (cliente.getRut() == capacitacion.getRutCliente()) {
                        System.out.println("Cliente asociado:");
                        System.out.println(cliente.toString());
                    }
                }
            }
            System.out.println("----------------------");
        }
    }
}