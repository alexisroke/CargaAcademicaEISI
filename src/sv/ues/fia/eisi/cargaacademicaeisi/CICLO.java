package sv.ues.fia.eisi.cargaacademicaeisi;

public class CICLO {
	private String anio;
	private String numero;
	private String fechaini;
	private String fechafin;
	
	public CICLO() {
		// TODO Auto-generated constructor stub
	}

	public CICLO(String anio, String numero, String fechaini, String fechafin) {
		this.anio = anio;
		this.numero = numero;
		this.fechaini = fechaini;
		this.fechafin = fechafin;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getFechaini() {
		return fechaini;
	}

	public void setFechaini(String fechaini) {
		this.fechaini = fechaini;
	}

	public String getFechafin() {
		return fechafin;
	}

	public void setFechafin(String fechafin) {
		this.fechafin = fechafin;
	}
	
		
}//fin clase principal
