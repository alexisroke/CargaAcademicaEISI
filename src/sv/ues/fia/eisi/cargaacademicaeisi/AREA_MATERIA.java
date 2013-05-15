package sv.ues.fia.eisi.cargaacademicaeisi;

public class AREA_MATERIA {
	private String idareamat;
	private String iddepartamento;
	private String codigomateria;

	public AREA_MATERIA() {

	}

	public AREA_MATERIA(String idareamat, String iddepartamento,
			String codigomateria) {
		this.idareamat = idareamat;
		this.iddepartamento = iddepartamento;
		this.codigomateria = codigomateria;
	}

	public String getIdareamat() {
		return idareamat;
	}

	public void setIdareamat(String idareamat) {
		this.idareamat = idareamat;
	}

	public String getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(String iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public String getCodigomateria() {
		return codigomateria;
	}

	public void setCodigomateria(String codigomateria) {
		this.codigomateria = codigomateria;
	}

}
