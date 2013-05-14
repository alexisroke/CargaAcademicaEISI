package sv.ues.fia.eisi.cargaacademicaeisi;

public class DETALLE_CARGA_ACT_ACAD {
	private String iddocente;
	private String anio;
	private String numero;
	private String idactacad;
	
	public DETALLE_CARGA_ACT_ACAD() {
		// TODO Auto-generated constructor stub
	}
	
	public DETALLE_CARGA_ACT_ACAD(String iddocente, String anio, String numero,
			String idactacad) {
		super();
		this.iddocente = iddocente;
		this.anio = anio;
		this.numero = numero;
		this.idactacad = idactacad;
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

	public String getIdactacad() {
		return idactacad;
	}

	public void setIdactacad(String idactacad) {
		this.idactacad = idactacad;
	}
	
		
}//fin clase principal
