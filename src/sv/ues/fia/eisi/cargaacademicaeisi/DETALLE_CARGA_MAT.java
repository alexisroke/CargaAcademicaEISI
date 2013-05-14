package sv.ues.fia.eisi.cargaacademicaeisi;

public class DETALLE_CARGA_MAT {
	private String iddocente;
	private String anio;
	private String numero;
	private String iddetallecurso;
	
	public DETALLE_CARGA_MAT() {
		// TODO Auto-generated constructor stub
	}

	public DETALLE_CARGA_MAT(String iddocente, String anio, String numero,
			String iddetallecurso) {
		super();
		this.iddocente = iddocente;
		this.anio = anio;
		this.numero = numero;
		this.iddetallecurso = iddetallecurso;
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

	public String getIddetallecurso() {
		return iddetallecurso;
	}

	public void setIddetallecurso(String iddetallecurso) {
		this.iddetallecurso = iddetallecurso;
	}
	
		
}//FIN CLASE PRINCIPAL
