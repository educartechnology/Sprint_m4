package Sprint_M4;

import java.util.Date;

public class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;

    // Constructor sin parámetros
    public Administrativo() {}

    // Constructor con parámetros
    public Administrativo(String nombre, Date fechaNacimiento, int run, String area, String experienciaPrevia) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public Administrativo(String nombreAdmin, String apellidosAdmin, Date fechaNacimientoAdmin, int runAdmin,
			String areaAdmin, String experienciaPrevAdmin) {
		// TODO Auto-generated constructor stub
	}

	public boolean validarArea() {
        return area != null && area.length() >= 5 && area.length() <= 20;
    }

    public boolean validarExperienciaPrevia() {
        return experienciaPrevia == null || experienciaPrevia.length() <= 100;
    }

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}
	
	// Implementación del método analizarUsuario de la interfaz Asesoria
	@Override
    public void analizarUsuario() {
        super.analizarUsuario(); // Llama al método de la clase padre
        System.out.println("Área: " + area);
        System.out.println("Experiencia previa: " + experienciaPrevia);
    }

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
    
    
}
