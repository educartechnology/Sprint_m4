package Sprint_M4;

public class Capacitacion {
    private int identificador;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadAsistentes;
    
    public Capacitacion() {
    	
    }

    public Capacitacion(int identificador, int rutCliente, String dia, String hora, String lugar, String duracion, int cantidadAsistentes) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public boolean validarDia() {
        return dia != null && (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes") ||
                dia.equalsIgnoreCase("miércoles") || dia.equalsIgnoreCase("jueves") ||
                dia.equalsIgnoreCase("viernes") || dia.equalsIgnoreCase("sábado") ||
                dia.equalsIgnoreCase("domingo"));
    }

    public boolean validarHora() {
        if (hora == null) return false;
        String[] horaMinuto = hora.split(":");
        if (horaMinuto.length != 2) return false;
        try {
            int hora = Integer.parseInt(horaMinuto[0]);
            int minuto = Integer.parseInt(horaMinuto[1]);
            return hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean validarLugar() {
        return lugar != null && lugar.length() >= 10 && lugar.length() <= 50;
    }

    public boolean validarDuracion() {
        return duracion == null || duracion.length() <= 70;
    }

    public boolean validarCantidadAsistentes() {
        return cantidadAsistentes > 0 && cantidadAsistentes < 1000;
    }

	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
				+ cantidadAsistentes + "]";
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}
    
    public String mostrarDetalle() {
        return "La capacitación será en " + lugar + " a las " + hora + " del día " + dia + ", y durará " + duracion + " minutos";
    }
}
