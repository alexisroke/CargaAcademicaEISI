package sv.ues.fia.eisi.cargaacademicaeisi;

public class MATERIA {
	private String codigomateria;
	private String nom_materia;
	
	
	public MATERIA() {
		
	}

	
	public MATERIA(String codigomateria, String nom_materia) {
		this.codigomateria = codigomateria;
		this.nom_materia = nom_materia;
	}

	
	public String getCodigomateria() {
		return codigomateria;
	}

	public void setCodigomateria(String codigomateria) {
		this.codigomateria = codigomateria;
	}

	public String getNom_materia() {
		return nom_materia;
	}

	public void setNom_materia(String nom_materia) {
		this.nom_materia = nom_materia;
	}
	
		
}
