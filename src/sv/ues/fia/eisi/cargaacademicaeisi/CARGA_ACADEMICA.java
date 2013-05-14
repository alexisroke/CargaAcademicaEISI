package sv.ues.fia.eisi.cargaacademicaeisi;

public class CARGA_ACADEMICA {
	private String iddocente;
	private String anio;
	private String numero;
	
	
	public CARGA_ACADEMICA() {
		// TODO Auto-generated constructor stub
	}

	public CARGA_ACADEMICA(String iddocente, String anio, String numero) {

		this.iddocente = iddocente;
		this.anio = anio;
		this.numero = numero;
	}

	public String getIddocente() {
		return iddocente;
	}

	public void setIddocente(String iddocente) {
		this.iddocente = iddocente;
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
	
		
}//FIN CLASE PRINCIPAL
