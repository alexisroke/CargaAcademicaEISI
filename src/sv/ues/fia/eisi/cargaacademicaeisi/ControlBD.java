package sv.ues.fia.eisi.cargaacademicaeisi;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ControlBD {
	// DECLARACION DE STRING con los campos de cada tabla de la BD
	// private static final String[] camposAlumno = new String[] { "carnet",
	// "nombre", "apellido", "sexo", "matganadas" };
	// private static final String[] camposNota = new String[] { "carnet",
	// "codmateria", "ciclo", "notafinal" };
	// private static final String[] camposMateria = new String[] {
	// "codmateria",
	// "nommateria", "unidadesval" };

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
				// db.execSQL("CREATE TABLE alumno(carnet VARCHAR(7) NOT NULL PRIMARY KEY,nombre VARCHAR(30),apellido VARCHAR(30),sexo VARCHAR(1),matganadas INTEGER);");
				// db.execSQL("CREATE TABLE materia(codmateria VARCHAR(6) NOT NULL PRIMARY KEY,nommateria VARCHAR(30),unidadesval VARCHAR(1));");
				// db.execSQL("CREATE TABLE nota(carnet VARCHAR(7) NOT NULL ,codmateria VARCHAR(6) NOT NULL ,ciclo VARCHAR(5) ,notafinal REAL ,PRIMARY KEY(carnet,codmateria,ciclo));");

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

	
	
	
	
}//FIN CLASE P´RINCIPAL CONTROLBD
