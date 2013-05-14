package sv.ues.fia.eisi.cargaacademicaeisi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class CargaAcademicaActivity extends Activity {
	private Button boton1 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_carga_academica);

		boton1 = (Button) findViewById(R.id.Button1);

		// alexis
		boton1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				boton1.setBackgroundColor(Color.GREEN);
				
				Intent menu = new Intent(getApplicationContext(),
						MenuPrincipalActivity.class);
				startActivity(menu);	
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
