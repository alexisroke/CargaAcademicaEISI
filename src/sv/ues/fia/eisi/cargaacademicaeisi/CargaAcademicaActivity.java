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
	private ImageButton boton3 = null;
	private ImageButton boton4 = null;
	private ImageButton boton5 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_carga_academica);

		boton1 = (ImageButton) findViewById(R.id.imageButton1);
		boton2 = (ImageButton) findViewById(R.id.imageButton2);
		boton3 = (ImageButton) findViewById(R.id.imageButton3);
		boton4 = (ImageButton) findViewById(R.id.imageButton4);
		boton5 = (ImageButton) findViewById(R.id.imageButton5);

		//alexis
		boton1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {

				// Intent activarmapas = new
				// Intent(getApplicationContext(),Activity.class);
				// startActivity(activarmapas);

			}
		});
		//mario
		boton2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// Intent a = new Intent(getApplicationContext(),
				// ActivarVozActivity.class);
				// startActivity(a);
			}
		});
		//emersson
		boton3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// Intent a = new Intent(getApplicationContext(),
				// ActivarVozActivity.class);
				// startActivity(a);
			}
		});
		//agustin
		boton4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// Intent a = new Intent(getApplicationContext(),
				// ActivarVozActivity.class);
				// startActivity(a);
			}
		});
		//sergio
		boton5.setOnClickListener(new OnClickListener() {
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
