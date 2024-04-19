package Sprint_M4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Profesional extends Usuario {
    private String titulo;
    private Date fechaIngreso;

    // Constructor sin parámetros
    public Profesional() {}

    // Constructor con parámetros
    public Profesional(String nombre, Date fechaNacimiento, int run, String titulo, Date fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }
    public Profesional(String nombreProfesional, String apellidosProfesional, Date fechaNacimientoProfesional,
			int runProfesional, String tituloProfesional, Date fechaIngresoProfesional) {
		// TODO Auto-generated constructor stub
	}

	public boolean validarTitulo() {
        return titulo != null && titulo.length() >= 10 && titulo.length() <= 50;
    }

    public boolean validarFechaIngreso() {
        return fechaIngreso != null;
    }

    private Date parseFecha(String fecha) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.parse(fecha);
        } catch (ParseException e) {
            return null;
        }
    }

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	// Implementación del método analizarUsuario de la interfaz Asesoria
    @Override
    public void analizarUsuario() {
        super.analizarUsuario(); // Llama al método de la clase padre
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
    
    
}