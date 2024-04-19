package Sprint_M4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Usuario implements Asesoria {
    protected String nombre;
    protected Date fechaNacimiento;
    protected int run;

    // Constructor sin parámetros
    public Usuario() {}

    // Constructor con parámetros
    public Usuario(String nombre, Date fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public boolean validarNombre() {
        return nombre != null && nombre.length() >= 10 && nombre.length() <= 50;
    }

    public boolean validarFechaNacimiento() {
        return fechaNacimiento != null;
    }

    public boolean validarRUN() {
        return run < 99999999;
    }

    private Date parseFecha(String fecha) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.parse(fecha);
        } catch (ParseException e) {
            return null;
        }
    }
    
    // Método para mostrar la edad del usuario
    public String mostrarEdad() {
        // Calcular la edad
        Calendar fechaNacimientoCal = Calendar.getInstance();
        fechaNacimientoCal.setTime(fechaNacimiento);
        Calendar ahora = Calendar.getInstance();
        int edad = ahora.get(Calendar.YEAR) - fechaNacimientoCal.get(Calendar.YEAR);
        if (ahora.get(Calendar.MONTH) < fechaNacimientoCal.get(Calendar.MONTH) ||
                (ahora.get(Calendar.MONTH) == fechaNacimientoCal.get(Calendar.MONTH) &&
                        ahora.get(Calendar.DAY_OF_MONTH) < fechaNacimientoCal.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }
        return "El usuario tiene " + edad + " años";
    }

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + "]";
	}
	
    // Implementación del método analizarUsuario de la interfaz Asesoria
    @Override
    public void analizarUsuario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("RUN: " + run);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}   
    
}