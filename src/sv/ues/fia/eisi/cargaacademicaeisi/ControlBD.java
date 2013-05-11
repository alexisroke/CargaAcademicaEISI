package sv.ues.fia.eisi.cargaacademicaeisi;

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
	private static final String[] ACTIVIDAD_ACADEMICA = new String[] {
			"IDACTACAD", "IDMODALIDAD", "NOM_ACT_ACAD", "CARGO" };
	private static final String[] AREA_MATERIA = new String[] { "", "", "", "",
			"" };
	private static final String[] CARGA_ACADEMICA = new String[] { "", "", "",
			"", "" };
	private static final String[] CARGO = new String[] { "", "", "", "", "" };

	private static final String[] CICLO = new String[] { "", "", "", "", "" };
	private static final String[] DEPARTAMENTO = new String[] { "", "", "", "",
			"" };
	private static final String[] DETALLE_CARGA_ACT_ACAD = new String[] { "",
			"", "", "", "" };
	private static final String[] DETALLE_CARGA_MAT = new String[] { "", "",
			"", "", "" };

	private static final String[] DETALLE_GRUPO_ASIGNADO = new String[] { "",
			"", "", "", "" };
	private static final String[] DOCENTE = new String[] { "", "", "", "", "" };
	private static final String[] DOCENTE_CARGO = new String[] { "", "", "",
			"", "" };
	private static final String[] DOCENTE_DPTO = new String[] { "", "", "", "",
			"" };

	private static final String[] LOCALES = new String[] { "", "", "", "", "" };
	private static final String[] MATERIA = new String[] { "CODIGOMATERIA", "NOM_MATERIA", "NUMERO_ALUMNOS"};
	private static final String[] MAT_AREA_PUEDE_IMPARTIR = new String[] { "",
			"", "", "", "" };
	private static final String[] MODALIDAD_ACT_ACAD = new String[] { "", "",
			"", "", "" };

	private static final String[] MODALIDAD_CURSO = new String[] { "", "", "",
			"", "" };
	private static final String[] PERIODO = new String[] { "", "", "", "", "" };
	private static final String[] TIPO_CONTRATO = new String[] { "IDCONTRATO", "TIPO", "HORAS"};

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

				/** ASIGNACION 1 */
				db.execSQL("CREATE TABLE ACTIVIDAD_ACADEMICA();");
				db.execSQL("CREATE TABLE AREA_MATERIA();");
				db.execSQL("CREATE TABLE CARGA_ACADEMICA();");
				db.execSQL("CREATE TABLE CARGO();");
				/** ASIGNACION 2 */
				db.execSQL("CREATE TABLE CICLO();");
				db.execSQL("CREATE TABLE DEPARTAMENTO();");
				db.execSQL("CREATE TABLE DETALLE_CARGA_ACT_ACAD();");
				db.execSQL("CREATE TABLE DETALLE_CARGA_MAT();");
				/** ASIGNACION 3 */
				db.execSQL("CREATE TABLE DETALLE_GRUPO_ASIGNADO();");
				db.execSQL("CREATE TABLE DOCENTE();");
				db.execSQL("CREATE TABLE DOCENTE_CARGO();");
				db.execSQL("CREATE TABLE DOCENTE_DPTO();");
				/** ASIGNACION 4 */
				db.execSQL("CREATE TABLE LOCALES();");
				db.execSQL("CREATE TABLE MATERIA();");
				db.execSQL("CREATE TABLE MAT_AREA_PUEDE_IMPARTIR();");
				db.execSQL("CREATE TABLE MODALIDAD_ACT_ACAD();");
				/** ASIGNACION 5 */
				db.execSQL("CREATE TABLE MODALIDAD_CURSO();");
				db.execSQL("CREATE TABLE PERIODO();");
				db.execSQL("CREATE TABLE TIPO_CONTRATO();");

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

	/** TODO EL CODIGO DE CONTROL DE DCONTROLD DE BD ASIGNACION mario */

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
