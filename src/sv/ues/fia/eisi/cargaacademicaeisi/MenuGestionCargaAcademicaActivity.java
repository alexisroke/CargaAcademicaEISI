package sv.ues.fia.eisi.cargaacademicaeisi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuGestionCargaAcademicaActivity extends Activity {
	private Button boton_ciclo = null;
	private Button boton_carga_acad = null;
	private Button boton_det_carga_mat = null;
	private Button boton_det_carga_actacad = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_gestion_carga_academica);
		boton_ciclo = (Button) findViewById(R.id.button1_ciclo_insertar);
		boton_carga_acad = (Button) findViewById(R.id.button2_ciclo_eliminar);
		boton_det_carga_mat = (Button) findViewById(R.id.button3_ciclo_actualizar);
		boton_det_carga_actacad = (Button) findViewById(R.id.button4_tabla_det_carga_actacad);

		boton_ciclo.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent menu1 = new Intent(getApplicationContext(),MenuCicloActivity.class);
				startActivity(menu1);
			}
		});

		boton_carga_acad.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent menu1 = new Intent(getApplicationContext(),
						MenuPrincipalActivity.class);
				startActivity(menu1);
			}
		});
		boton_det_carga_mat.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// Intent menu1 = new Intent(getApplicationContext(),
				// MenuPrincipalActivity.class);
				// startActivity(menu1);
			}
		});
		boton_det_carga_actacad.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// Intent menu1 = new Intent(getApplicationContext(),
				// MenuPrincipalActivity.class);
				// startActivity(menu1);
			}
		});

	}// fin metodo oncreate

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_gestion_carga_academica, menu);
		return true;
	}

}
