package sv.ues.fia.eisi.cargaacademicaeisi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuCicloActivity extends Activity {

	private Button boton_insertar=null;
	private Button boton_eliminar=null;
	private Button boton_actualizar=null;
	private Button boton_consultar=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_ciclo);
		boton_insertar = (Button) findViewById(R.id.button1_ciclo_insertar);
		boton_eliminar = (Button) findViewById(R.id.button2_ciclo_eliminar);
		 boton_actualizar= (Button) findViewById(R.id.button3_ciclo_actualizar);
		 boton_consultar= (Button) findViewById(R.id.button4_ciclo_consultar);
		 
		 boton_insertar.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					Intent insertar_ciclo = new Intent(getApplicationContext(),CicloInsertarActivity.class);
					startActivity(insertar_ciclo);
				}
			});
		 boton_eliminar.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					//Intent menu1 = new Intent(getApplicationContext(),MenuCicloActivity.class);
					//startActivity(menu1);
				}
			});
		 boton_actualizar.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					//Intent menu1 = new Intent(getApplicationContext(),MenuCicloActivity.class);
					//startActivity(menu1);
				}
			});
		 boton_consultar.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					//Intent menu1 = new Intent(getApplicationContext(),MenuCicloActivity.class);
					//startActivity(menu1);
				}
			});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_ciclo, menu);
		return true;
	}

}
