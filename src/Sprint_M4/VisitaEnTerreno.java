package Sprint_M4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VisitaEnTerreno {
    private int identificadorVisita;
    private int rutCliente;
    private Date dia;
    private String hora;
    private String lugar;
    private String comentarios;
    
    public VisitaEnTerreno() {
    	
    }

    public VisitaEnTerreno(int identificadorVisita, int rutCliente, String dia, String hora, String lugar, String comentarios) {
        this.identificadorVisita = identificadorVisita;
        this.rutCliente = rutCliente;
        this.dia = parseFecha(dia);
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    // Implementa los métodos de validación de manera similar a la clase Accidente

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
		return "VisitaEnTerreno [identificadorVisita=" + identificadorVisita + ", rutCliente=" + rutCliente + ", dia="
				+ dia + ", hora=" + hora + ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	}

	public int getIdentificadorVisita() {
		return identificadorVisita;
	}

	public void setIdentificadorVisita(int identificadorVisita) {
		this.identificadorVisita = identificadorVisita;
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

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
    
}