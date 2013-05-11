package sv.ues.fia.eisi.cargaacademicaeisi;

public class TIPO_CONTRATO {
	private String idcontrato;
	private String tipo;
	private Integer horas;

	public TIPO_CONTRATO() {

		// TODO Auto-generated constructor stub
	}

	public TIPO_CONTRATO(String idcontrato, String tipo, Integer horas) {
		this.idcontrato = idcontrato;
		this.tipo = tipo;
		this.horas = horas;
	}

	public String getIdcontrato() {
		return idcontrato;
	}

	public void setIdcontrato(String idcontrato) {
		this.idcontrato = idcontrato;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

}
