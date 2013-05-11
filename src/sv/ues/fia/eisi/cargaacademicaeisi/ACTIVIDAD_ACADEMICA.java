package sv.ues.fia.eisi.cargaacademicaeisi;

public class ACTIVIDAD_ACADEMICA {
	// DECLARACION DE VARIABLES SEGUN TABLA
	// TIPO DE DATO SEGUN TABLA
	private String IDACTACAD;
	private String IDMODALIDAD;
	private String NOM_ACT_ACAD;
	private String CARGO;

	// CONSTRUCTOR DE LA CLASE
	public ACTIVIDAD_ACADEMICA() {
		// TODO Auto-generated constructor stub
	}
	
	public ACTIVIDAD_ACADEMICA(String iDACTACAD, String iDMODALIDAD,String nOM_ACT_ACAD, String cARGO) {
		this.IDACTACAD = iDACTACAD;
		this.IDMODALIDAD = iDMODALIDAD;
		this.NOM_ACT_ACAD = nOM_ACT_ACAD;
		this.CARGO = cARGO;
	}
	
	// METODOS SET Y GET
	//CUANDO LOS AUTOGENEREN AGREGUE EL this. EN LOS SET.
	//porque automaticamente no lo agrega
	public String getIDACTACAD() {
		return IDACTACAD;
	}
	
	public void setIDACTACAD(String iDACTACAD) {
		this.IDACTACAD = iDACTACAD;
	}

	public String getIDMODALIDAD() {
		return IDMODALIDAD;
	}

	public void setIDMODALIDAD(String iDMODALIDAD) {
		this.IDMODALIDAD = iDMODALIDAD;
	}

	public String getNOM_ACT_ACAD() {
		return NOM_ACT_ACAD;
	}

	public void setNOM_ACT_ACAD(String nOM_ACT_ACAD) {
		this.NOM_ACT_ACAD = nOM_ACT_ACAD;
	}

	public String getCARGO() {
		return CARGO;
	}

	public void setCARGO(String cARGO) {
		this.CARGO = cARGO;
	}

}// FIN CLASE PRINCIPAL
