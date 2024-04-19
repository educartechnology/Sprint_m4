package Sprint_M4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Usuario {
    private int rut;
    private List<Capacitacion> capacitaciones;
    private List<Accidente> accidentes;
    private List<VisitaEnTerreno> visitasEnTerreno;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;
    
    // Constructor sin parámetros
    public Cliente() {}

    // Constructor con parámetros
    public Cliente(String nombre, Date fechaNacimiento, int run, int rut, String direccion, String comuna, int sistemaSalud) {
        super(nombre, fechaNacimiento, run);
        this.rut = rut;
        this.capacitaciones = new ArrayList<>();
        this.accidentes = new ArrayList<>();
        this.visitasEnTerreno = new ArrayList<>();
        this.direccion = direccion;
        this.comuna = comuna;
        this.sistemaSalud = sistemaSalud;
    }

    public Cliente(String nombreCliente, String apellidosCliente, Date fechaNacimientoCliente, int runCliente,
			int rutCliente, String direccionCliente, String comunaCliente, int sistemaSaludCliente) {
		// TODO Auto-generated constructor stub
	}

	public boolean validarRut() {
        return rut < 99999999;
    }

    public boolean validarNombres() {
        return nombres != null && nombres.length() >= 5 && nombres.length() <= 30;
    }

    public boolean validarApellidos() {
        return apellidos != null && apellidos.length() >= 5 && apellidos.length() <= 30;
    }

    public boolean validarTelefono() {
        return telefono != null && !telefono.isEmpty();
    }

    public boolean validarAFP() {
        return afp != null && afp.length() >= 4 && afp.length() <= 30;
    }

    public boolean validarSistemaSalud() {
        return sistemaSalud == 1 || sistemaSalud == 2;
    }

    public boolean validarDireccion() {
        return direccion != null && direccion.length() <= 70;
    }

    public boolean validarComuna() {
        return comuna != null && comuna.length() <= 50;
    }

    public boolean validarEdad() {
        return edad >= 0 && edad < 150;
    }
    
	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna
				+ ", edad=" + edad + "]";
	}
	
    // Implementación del método analizarUsuario de la interfaz Asesoria
    @Override
    public void analizarUsuario() {
        super.analizarUsuario(); // Llama al método de la clase padre
        System.out.println("Dirección: " + direccion);
        System.out.println("Comuna: " + comuna);
    }

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public int getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
    
	   // Método para obtener el nombre completo del cliente
    public String obtenerNombre() {
        return nombre + " " + apellidos;
    }

    // Método para obtener el tipo de sistema de salud
    public String obtenerSistemaSalud() {
        return sistemaSalud == 1 ? "Fonasa" : "Isapre";
    }
    
}
     