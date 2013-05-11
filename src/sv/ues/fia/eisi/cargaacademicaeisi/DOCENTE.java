package sv.ues.fia.eisi.cargaacademicaeisi;

public class DOCENTE {
	private String iddocente;
	private String idcontrato;
	private String nombre;
	private String apellido;
	private String grado_acad;
	private String correo;
	private int horas_asig;
	private String telefono;

	public DOCENTE() {
	}

	public DOCENTE(String iddocente, String idcontrato, String nombre,
			String apellido, String grado_acad, String correo, int horas_asig,
			String telefono) {
		this.iddocente = iddocente;
		this.idcontrato = idcontrato;
		this.nombre = nombre;
		this.apellido = apellido;
		this.grado_acad = grado_acad;
		this.correo = correo;
		this.horas_asig = horas_asig;
		this.telefono = telefono;
	}

	public String getIddocente() {
		return iddocente;
	}

	public void setIddocente(String iddocente) {
		this.iddocente = iddocente;
	}

	public String getIdcontrato() {
		return idcontrato;
	}

	public void setIdcontrato(String idcontrato) {
		this.idcontrato = idcontrato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPellido() {
		return apellido;
	}

	public void setPellido(String pellido) {
		this.apellido = pellido;
	}

	public String getGrado_acad() {
		return grado_acad;
	}

	public void setGrado_acad(String grado_acad) {
		this.grado_acad = grado_acad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getHoras_asig() {
		return horas_asig;
	}

	public void setHoras_asig(int horas_asig) {
		this.horas_asig = horas_asig;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
