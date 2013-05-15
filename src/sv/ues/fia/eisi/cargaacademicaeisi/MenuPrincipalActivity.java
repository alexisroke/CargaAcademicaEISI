package sv.ues.fia.eisi.cargaacademicaeisi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MenuPrincipalActivity extends Activity {
	private ImageButton boton_catalogos = null;
	private ImageButton boton_docentes = null;
	private ImageButton boton_materias = null;
	private ImageButton boton_actacademica=null;
	private ImageButton boton_cargaacad = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_principal);
		boton_catalogos = (ImageButton) findViewById(R.id.imageButton1);
		boton_docentes = (ImageButton) findViewById(R.id.imageButton2);
		boton_materias = (ImageButton) findViewById(R.id.imageButton3);
		boton_actacademica = (ImageButton) findViewById(R.id.imageButton4);
		boton_cargaacad = (ImageButton) findViewById(R.id.imageButton5);
		
	boton_catalogos.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent menu1 = new Intent(getApplicationContext(),
						MenuPrincipalActivity.class);
				startActivity(menu1);
			}
		});
		
	boton_docentes.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			Intent menu1 = new Intent(getApplicationContext(),
					MenuPrincipalActivity.class);
			startActivity(menu1);
		}
	});
	boton_materias.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			Intent menu1 = new Intent(getApplicationContext(),
					MenuPrincipalActivity.class);
			startActivity(menu1);
		}
	});
	boton_actacademica.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			Intent menu1 = new Intent(getApplicationContext(),
					MenuPrincipalActivity.class);
			startActivity(menu1);
		}
	});
	boton_cargaacad.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			Intent menu5 = new Intent(getApplicationContext(),
					MenuGestionCargaAcademicaActivity.class);
			startActivity(menu5);
		}
	});
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_principal, menu);
		return true;
	}

}
