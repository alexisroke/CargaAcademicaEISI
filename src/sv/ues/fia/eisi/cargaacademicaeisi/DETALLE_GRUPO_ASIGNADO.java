package sv.ues.fia.eisi.cargaacademicaeisi;

public class DETALLE_GRUPO_ASIGNADO {
	private String iddetallecurso;
	private String codigomateria;
	private String idmodalidad;
	private String idlocal;

	public DETALLE_GRUPO_ASIGNADO() {

	}

	public DETALLE_GRUPO_ASIGNADO(String iddetallecurso, String codigomateria,
			String idmodalidad, String idlocal) {
		this.iddetallecurso = iddetallecurso;
		this.codigomateria = codigomateria;
		this.idmodalidad = idmodalidad;
		this.idlocal = idlocal;
	}

	public String getIddetallecurso() {
		return iddetallecurso;
	}

	public void setIddetallecurso(String iddetallecurso) {
		this.iddetallecurso = iddetallecurso;
	}

	public String getCodigomateria() {
		return codigomateria;
	}

	public void setCodigomateria(String codigomateria) {
		this.codigomateria = codigomateria;
	}

	public String getIdmodalidad() {
		return idmodalidad;
	}

	public void setIdmodalidad(String idmodalidad) {
		this.idmodalidad = idmodalidad;
	}

	public String getIdlocal() {
		return idlocal;
	}

	public void setIdlocal(String idlocal) {
		this.idlocal = idlocal;
	}

}
