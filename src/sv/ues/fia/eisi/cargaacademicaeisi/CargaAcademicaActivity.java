package sv.ues.fia.eisi.cargaacademicaeisi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class CargaAcademicaActivity extends Activity {
	private ImageButton boton1 = null;
	private ImageButton boton2 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_carga_academica);

		boton1 = (ImageButton) findViewById(R.id.imageButton1);
		boton2 = (ImageButton) findViewById(R.id.imageButton2);

		boton1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {

				// Intent activarmapas = new
				// Intent(getApplicationContext(),Activity.class);
				// startActivity(activarmapas);

			}
		});

		boton2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// Intent a = new Intent(getApplicationContext(),
				// ActivarVozActivity.class);
				// startActivity(a);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.carga_academica, menu);
		return true;
	}

}
