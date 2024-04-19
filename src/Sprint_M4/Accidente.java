package Sprint_M4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Accidente {
    private int identificadorAccidente;
    private int rutCliente;
    private Date dia;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;
    
    public Accidente() {
    	
    }

    public Accidente(int identificadorAccidente, int rutCliente, String dia, String hora, String lugar, String origen, String consecuencias) {
        this.identificadorAccidente = identificadorAccidente;
        this.rutCliente = rutCliente;
        this.dia = parseFecha(dia);
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    public boolean validarIdentificadorAccidente() {
        return identificadorAccidente > 0;
    }

    public boolean validarRutCliente() {
        return rutCliente > 0;
    }

    public boolean validarDia() {
        return dia != null;
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

    public boolean validarOrigen() {
        return origen == null || origen.length() <= 100;
    }

    public boolean validarConsecuencias() {
        return consecuencias == null || consecuencias.length() <= 100;
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
		return "Accidente [identificadorAccidente=" + identificadorAccidente + ", rutCliente=" + rutCliente + ", dia="
				+ dia + ", hora=" + hora + ", lugar=" + lugar + ", origen=" + origen + ", consecuencias="
				+ consecuencias + "]";
	}

	public int getIdentificadorAccidente() {
		return identificadorAccidente;
	}

	public void setIdentificadorAccidente(int identificadorAccidente) {
		this.identificadorAccidente = identificadorAccidente;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
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

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}
    
    
}