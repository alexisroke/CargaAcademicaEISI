package sv.ues.fia.eisi.cargaacademicaeisi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ControlBD {
	// confirmacion de mario
	// DECLARACION DE STRING con los campos de cada tabla de la BD
	// a quien le toca cada tabala agreguele los campos necesarios entre las
	// comillas
	private static final String[] ACTIVIDAD_ACADEMICA = new String[] { "", "",
			"", "" };

	/** ASIGNACIONM ALEXIS */
	private static final String[] CARGA_ACADEMICA = new String[] { "iddocente",
			"anio", "numero" };
	private static final String[] CICLO = new String[] { "anio", "numero",
			"fechaini", "fechafin" };
	private static final String[] DETALLE_CARGA_MAT = new String[] {
			"iddocente", "anio", "numero", "iddetallecurso" };
	private static final String[] DETALLE_CARGA_ACT_ACAD = new String[] {
			"iddocente", "anio", "numero", "idactacad" };
	/** FIN */

	private static final String[] CARGO = new String[] { "", "", "", "", "" };

	/** Mario start */
	private static final String[] camposDepto = new String[] {
			"IDDEPARTAMENTO", "NOM_DEPTO" };
	private static final String[] camposMat = new String[] { "CODIGOMATERIA",
			"NOM_MATERIA" };
	private static final String[] camposAreaMat = new String[] { "IDAREAMAT",
			"IDDEPARTAMENTO", "CODIGOMATERIA" };
	private static final String[] camposDetGpoAsig = new String[] {
			"IDDETALLECURSO", "CODIGOMATERIA", "IDMODALIDAD", "IDLOCAL" };
	/** Mario end */

	private static final String[] DOCENTE = new String[] { "", "", "", "", "" };
	private static final String[] DOCENTE_CARGO = new String[] { "", "", "",
			"", "" };
	private static final String[] DOCENTE_DPTO = new String[] { "", "", "", "",
			"" };

	private static final String[] LOCALES = new String[] { "", "", "", "", "" };

	private static final String[] MAT_AREA_PUEDE_IMPARTIR = new String[] { "",
			"", "", "", "" };
	private static final String[] MODALIDAD_ACT_ACAD = new String[] { "", "",
			"", "", "" };

	private static final String[] MODALIDAD_CURSO = new String[] { "", "", "",
			"", "" };
	private static final String[] PERIODO = new String[] { "", "", "", "", "" };
	private static final String[] TIPO_CONTRATO = new String[] { "", "", "" };

	private final Context context;
	private DatabaseHelper DBHelper;
	private SQLiteDatabase db;

	public ControlBD(Context ctx) {
		this.context = ctx;
		DBHelper = new DatabaseHelper(context);
	}

	private static class DatabaseHelper extends SQLiteOpenHelper {

		private static final String BASE_DATOS = "Asignacion_Carga.s3db";
		private static final int VERSION = 1;

		public DatabaseHelper(Context context) {
			super(context, BASE_DATOS, null, VERSION);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			try {
				// SENTENCIAS DE CREACION DE TABLAS BD
				// entre parentesis agreguenle los campos de la tabla con sutipo
				// de dato y primary key:
				db.execSQL("CREATE TABLE ACTIVIDAD_ACADEMICA();");
				db.execSQL("CREATE TABLE AREA_MATERIA();");
				/** alexis */
				db.execSQL("CREATE TABLE CARGA_ACADEMICA( iddocente VARCHAR(8) NOT NULL, anio VARCHAR(4) NOT NULL, numero VARCHAR(2) NOT NULL, PRIMARY KEY (iddocente,anio,numero) );");
				db.execSQL("CREATE TABLE CARGO();");
				/** alexis */
				db.execSQL("CREATE TABLE CICLO ( anio VARCHAR(4) NOT NULL, numero VARCHAR(2) NOT NULL, fechaini DATE DEFAULT CURRENT_DATE NULL, fechafin DATE NULL, PRIMARY KEY (anio,numero) );");
				db.execSQL("CREATE TABLE DEPARTAMENTO();");
				/** alexis */
				db.execSQL("CREATE TABLE DETALLE_CARGA_ACT_ACAD ( iddocente VARCHAR(8) NULL, anio VARCHAR(4) NULL, numero VARCHAR(2) NULL,idactacad VARCHAR(6) NULL );");
				/** alexis */
				db.execSQL("CREATE TABLE DETALLE_CARGA_MAT ( iddocente VARCHAR(8) NULL, anio VARCHAR(4) NULL, numero VARCHAR(2) NULL, iddetallecurso VARCHAR(6) NULL );");
				db.execSQL("CREATE TABLE DETALLE_GRUPO_ASIGNADO();");
				db.execSQL("CREATE TABLE DOCENTE();");
				db.execSQL("CREATE TABLE DOCENTE_CARGO();");
				db.execSQL("CREATE TABLE DOCENTE_DPTO();");
				db.execSQL("CREATE TABLE LOCALES();");
				db.execSQL("CREATE TABLE MATERIA ();");
				db.execSQL("CREATE TABLE MAT_AREA_PUEDE_IMPARTIR();");
				db.execSQL("CREATE TABLE MODALIDAD_ACT_ACAD();");
				db.execSQL("CREATE TABLE MODALIDAD_CURSO();");
				db.execSQL("CREATE TABLE PERIODO();");
				db.execSQL("CREATE TABLE TIPO_CONTRATO(); ");
				/** TRIGGER alexis */
				db.execSQL("CREATE TRIGGER fk_carga_ciclo BEFORE INSERT ON CARGA_ACADEMICA FOR EACH ROW BEGIN SELECT CASE WHEN ((SELECT ANIO FROM CICLO WHERE (ANIO = NEW.ANIO AND NUMERO = NEW.NUMERO)) IS NULL) THEN RAISE(ABORT, 'No existe el Ciclo') END; END;");
				db.execSQL("CREATE TRIGGER fk_carga_docente BEFORE INSERT ON CARGA_ACADEMICA FOR EACH ROW BEGIN SELECT CASE WHEN ((SELECT IDDOCENTE FROM DOCENTE WHERE IDDOCENTE = NEW.IDDOCENTE) IS NULL) THEN RAISE(ABORT, 'No existe el Docente') END; END;");
				db.execSQL("CREATE TRIGGER fk_detalle_carga_mat BEFORE INSERT ON DETALLE_CARGA_MAT FOR EACH ROW BEGIN SELECT CASE WHEN ((SELECT IDDOCENTE FROM CARGA_ACADEMICA WHERE IDDOCENTE = NEW.IDDOCENTE AND ANIO = NEW.ANIO AND NUMERO = NEW.NUMERO) IS NULL) THEN RAISE(ABORT, 'No existe esta informacion de Carga Academica') END; END;");
				db.execSQL("CREATE TRIGGER fk_detalle_curso BEFORE INSERT ON DETALLE_CARGA_MAT FOR EACH ROW BEGIN SELECT CASE WHEN ((SELECT IDDETALLECURSO FROM DETALLE_GRUPO_ASIGNADO WHERE IDDETALLECURSO = NEW.IDDETALLECURSO) IS NULL) THEN RAISE(ABORT, 'No existe esta informacion de este Curso') END; END;");
				db.execSQL("CREATE TRIGGER fk_detalle_carga_acad BEFORE INSERT ON DETALLE_CARGA_ACT_ACAD FOR EACH ROW BEGIN SELECT CASE WHEN ((SELECT IDDOCENTE FROM CARGA_ACADEMICA WHERE IDDOCENTE = NEW.IDDOCENTE AND ANIO = NEW.ANIO AND NUMERO = NEW.NUMERO) IS NULL) THEN RAISE(ABORT, 'No existe esta informacion de Carga Academica') END; END;");
				db.execSQL("CREATE TRIGGER fk_detalle_actividad BEFORE INSERT ON DETALLE_CARGA_ACT_ACAD FOR EACH ROW BEGIN SELECT CASE WHEN ((SELECT IDACTACAD FROM ACTIVIDAD_ACADEMICA WHERE IDACTACAD = NEW.IDACTACAD) IS NULL) THEN RAISE(ABORT, 'No existe esta Actividad Academica') END; END;");
				/** FIN TRIGGER alexis */
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub

		}

	}

	public void abrir() throws SQLException {
		db = DBHelper.getWritableDatabase();
		return;
	}

	public void cerrar() {
		DBHelper.close();
	}

	/** TODO EL CODIGO DE CONTROL DE DCONTROLD DE BD ASIGNACION alexis */
	public String insertar(CICLO ciclo) {
		String regInsertados = "Registro Insertado Nº= ";
		long contador = 0;

		ContentValues cicl = new ContentValues();
		cicl.put("anio", ciclo.getAnio());
		cicl.put("numero", ciclo.getNumero());
		cicl.put("fechaini", ciclo.getFechaini());
		cicl.put("fechafin", ciclo.getFechafin());
		contador = db.insert("ciclo", null, cicl);

		if (contador == -1 || contador == 0) {
			regInsertados = "Error al Insertar el registro, Registro Duplicado. Verificar inserción";
		} else {
			regInsertados = regInsertados + contador;
		}
		return regInsertados;
	}

	/** TODO EL CODIGO DE CONTROL DE DCONTROLD DE BD ASIGNACION mario */
	public String insertar(DEPARTAMENTO departamento) {
		String regInsertados = "Registro insertado en la fila No.=";
		long contador = 0;
		ContentValues depto = new ContentValues();
		depto.put("IDDEPARTAMENTO", departamento.getIddepartamento());
		depto.put("NOM_DEPTO", departamento.getNom_depto());
		contador = db.insert("DEPARTAMENTO", null, depto);
		if (contador == -1 || contador == 0) {
			regInsertados = "Error, registro duplicado. Verificar Insercion";
		} else {
			regInsertados += contador;
		}
		return regInsertados;
	}

	public String insertar(MATERIA materia) {
		String regInsertados = "Registro insertado en la fila No.=";
		long contador = 0;
		ContentValues mat = new ContentValues();
		mat.put("CODIGOMATERIA", materia.getCodigomateria());
		mat.put("NOM_MATERIA", materia.getNom_materia());
		contador = db.insert("MATERIA", null, mat);
		if (contador == -1 || contador == 0) {
			regInsertados = "Error, registro duplicado. Verificar Insercion";
		} else {
			regInsertados += contador;
		}
		return regInsertados;
	}

	public String insertar(AREA_MATERIA area_MATERIA) {
		String regInsertados = "Registro insertado en la fila No.=";
		long contador = 0;
		ContentValues amat = new ContentValues();
		amat.put("IDAREAMAT", area_MATERIA.getIdareamat());
		amat.put("IDDEPARTAMENTO", area_MATERIA.getIddepartamento());
		amat.put("CODIGOMATERIA", area_MATERIA.getCodigomateria());
		contador = db.insert("AREA_MATERIA", null, amat);
		if (contador == -1 || contador == 0) {
			regInsertados = "Error, registro duplicado. Verificar Insercion";
		} else {
			regInsertados += contador;
		}
		return regInsertados;
	}

	public String insertar(DETALLE_GRUPO_ASIGNADO detalle_GRUPO_ASIGNADO) {
		String regInsertados = "Registro insertado en la fila No.=";
		long contador = 0;
		ContentValues dgasig = new ContentValues();
		dgasig.put("IDDETALLECURSO", detalle_GRUPO_ASIGNADO.getIddetallecurso());
		dgasig.put("CODIGOMATERIA", detalle_GRUPO_ASIGNADO.getCodigomateria());
		dgasig.put("IDMODALIDAD", detalle_GRUPO_ASIGNADO.getIdmodalidad());
		dgasig.put("IDLOCAL", detalle_GRUPO_ASIGNADO.getIdlocal());
		contador = db.insert("DETALLE_GRUPO_ASIGNADO", null, dgasig);
		if (contador == -1 || contador == 0) {
			regInsertados = "Error, registro duplicado. Verificar Insercion";
		} else {
			regInsertados += contador;
		}
		return regInsertados;
	}

	public DEPARTAMENTO consultarDepto(String idepto) {
		String[] id = { idepto };
		Cursor cursor = db.query("DEPARTAMENTO", camposDepto,
				"IDDEPARTAMENTO = ?", id, null, null, null);
		if (cursor.moveToFirst()) {
			DEPARTAMENTO departamento = new DEPARTAMENTO();
			departamento.setIddepartamento(cursor.getString(0));
			departamento.setNom_depto(cursor.getString(1));
			return departamento;
		} else {
			return null;
		}
	}

	public MATERIA consultarMate(String codmat) {
		String[] id = { codmat };
		Cursor cursor = db.query("MATERIA", camposMat, "CODIGOMATERIA = ?", id,
				null, null, null);
		if (cursor.moveToFirst()) {
			MATERIA materia = new MATERIA();
			materia.setCodigomateria(cursor.getString(0));
			materia.setNom_materia(cursor.getString(1));
			return materia;
		} else {
			return null;
		}
	}

	public AREA_MATERIA consultarAreaMat(String idaremat, String idepto,
			String codmate) {
		String[] id = { idaremat, idepto, codmate };
		Cursor cursor = db.query("AREA_MATERIA", camposAreaMat,
				"IDAREAMAT = ? AND IDDEPARTAMENTO = ? AND CODIGOMATERIA = ?",
				id, null, null, null);
		if (cursor.moveToFirst()) {
			AREA_MATERIA area = new AREA_MATERIA();
			area.setIdareamat(cursor.getString(0));
			area.setIddepartamento(cursor.getString(1));
			area.setCodigomateria(cursor.getString(2));
			return area;
		} else {
			return null;
		}
	}

	public DETALLE_GRUPO_ASIGNADO consultarDetGpoAsig(String idetcurso,
			String codmate, String idmod, String idlocal) {
		String[] id = { idetcurso, codmate, idmod, idlocal };
		Cursor cursor = db
				.query("DETALLE_GRUPO_ASIGNADO",
						camposDetGpoAsig,
						"IDDETALLECURSO = ? AND CODIGOMATERIA = ? AND IDMODALIDAD = ? AND IDLOCAL = ?",
						id, null, null, null);
		if (cursor.moveToFirst()) {
			DETALLE_GRUPO_ASIGNADO asignado = new DETALLE_GRUPO_ASIGNADO();
			asignado.setIddetallecurso(cursor.getString(0));
			asignado.setCodigomateria(cursor.getString(1));
			asignado.setIdmodalidad(cursor.getString(2));
			asignado.setIdlocal(cursor.getString(3));
			return asignado;
		} else {
			return null;
		}
	}

	/** TODO EL CODIGO DE CONTROL DE DCONTROLD DE BD ASIGNACION emerson */

	/** TODO EL CODIGO DE CONTROL DE DCONTROLD DE BD ASIGNACION agustin */

	/** TODO EL CODIGO DE CONTROL DE DCONTROLD DE BD ASIGNACION sergio */

	// FUNCION DE VERIFICACION DE INTEGRIDAD
	// 1 AL 6 aLEXIS
	// 7 AL 12 MARIO
	// 13 AÑ 18 EMERSON
	// 19 AL 24 AGUSTIN
	// 25 AL 31 SERGIO
	private boolean verificarIntegridad(Object dato, int relacion)
			throws SQLException {

		switch (relacion) {

		case 1: {

			return true;
		}

		case 2: {

			return true;
		}

		case 3: {

			return true;

		}

		case 4: {
			return true;
		}

		case 5: {
			return true;
		}

		case 6: {
			return true;
		}
		case 7: {

			return true;
		}
		case 8: {
			return true;
		}
		case 9: {
			return true;
		}
		case 10: {
			return true;
		}
		case 11: {
			return true;
		}
		case 12: {
			return true;
		}
		case 13: {
			return true;
		}

		default:
			return false;

		}

	}

	public String llenarBDCarnet() {

		return "Guardo Correctamente";
	}

}// FIN CLASE P´RINCIPAL CONTROLBD
