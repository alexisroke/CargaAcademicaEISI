package sv.ues.fia.eisi.cargaacademicaeisi;

public class DEPARTAMENTO {
	private String iddepartamento;
	private String nom_depto;

	public DEPARTAMENTO() {

	}

	public DEPARTAMENTO(String iddepartamento, String nom_depto) {
		this.iddepartamento = iddepartamento;
		this.nom_depto = nom_depto;
	}

	public String getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(String iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public String getNom_depto() {
		return nom_depto;
	}

	public void setNom_depto(String nom_depto) {
		this.nom_depto = nom_depto;
	}

}
