package sv.ues.fia.eisi.cargaacademicaeisi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class CicloInsertarActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ciclo_insertar);
		/** codigo llenado de spinner años */
		Spinner sp = (Spinner) findViewById(R.id.spinner_anio_ciclo);
		ArrayAdapter adapter = ArrayAdapter.createFromResource(this,
				R.array.anios_ciclo, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp.setAdapter(adapter);

		sp.setOnItemSelectedListener(new OnItemSelectedListener() {

			public void onItemSelected(AdapterView<?> parentView,
					View selectedItemView, int position, long id) {
			/*	Toast.makeText(
						parentView.getContext(),
						"Has seleccionado "
								+ parentView.getItemAtPosition(position)
										.toString(), Toast.LENGTH_LONG).show();*/

			}

			public void onNothingSelected(AdapterView<?> parentView) {

			}
		});
		/** codigo llenado de spinner ciclos */
		Spinner sp2 = (Spinner) findViewById(R.id.spinner_ciclo);
		ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,
				R.array.ciclos, android.R.layout.simple_spinner_item);
		adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp2.setAdapter(adapter2);

		sp2.setOnItemSelectedListener(new OnItemSelectedListener() {

			public void onItemSelected(AdapterView<?> parentView,
					View selectedItemView, int position, long id) {
				/*
				Toast.makeText(
						parentView.getContext(),
						"Has seleccionado "
								+ parentView.getItemAtPosition(position)
										.toString(), Toast.LENGTH_LONG).show();*/

			}

			public void onNothingSelected(AdapterView<?> parentView) {

			}
		});

	}// fin metodo oncreate

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ciclo_insertar, menu);
		return true;
	}

}
