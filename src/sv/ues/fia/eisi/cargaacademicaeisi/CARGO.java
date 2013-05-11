package sv.ues.fia.eisi.cargaacademicaeisi;

public class CARGO {
	private String idcargo;
	private String nom_cargo;

	public CARGO() {
	}

	public CARGO(String idcargo, String nom_cargo) {
		super();
		this.idcargo = idcargo;
		this.nom_cargo = nom_cargo;
	}

	public String getIdcargo() {
		return idcargo;
	}

	public void setIdcargo(String idcargo) {
		this.idcargo = idcargo;
	}

	public String getNom_cargo() {
		return nom_cargo;
	}

	public void setNom_cargo(String nom_cargo) {
		this.nom_cargo = nom_cargo;
	}

}
