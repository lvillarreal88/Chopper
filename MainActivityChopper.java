package com.trafalgar.app.chopper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityChopper extends AppCompatActivity {


   private Button btnResultado;
   private EditText etxtNumeroA;
   private EditText etxtNumeroB;
   private int resultado;
  /*  private EditText etxtNombre, etxtApellidos;
    private TextView txtvNombreCompleto;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chopper);

        btnResultado = (Button) findViewById(R.id.btnResultado);
        etxtNumeroA = (EditText) findViewById(R.id.etxtNumeroA);
        etxtNumeroB = (EditText) findViewById(R.id.etxtNumeroB) ;

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.rSuma: suma();
                        break;
                    case R.id.rResta: resta();
                        break;
                    case R.id.rMultiplicacion: multiplicacion();
                        break;
                    case R.id.rDivision: division();
                        break;
                }
                mostrar(resultado);
            }
        });
       /*  etxtNombre = (EditText) findViewById(R.id.etxtNombre);
        etxtApellidos = (EditText) findViewById(R.id.etxtApellidos);
        txtvNombreCompleto = (TextView) findViewById(R.id.txtvNombreCompleto);

        btnMostrarMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarMensaje();
            }
        });*/

    }

    /*@Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.rSuma: suma();
                    break;
                case R.id.rResta: resta();
                    break;
                case R.id.rMultiplicacion: multiplicacion();
                    break;
                case R.id.rDivision: division();
                    break;
            }
    }*/

/*    public void onMostrarMensaje(View view) {
        Toast.makeText(MainActivityChopper.this, ":: vaina canalla android ::", Toast.LENGTH_LONG).show();
    }*/

    public void mostrarMensaje() {
        String msj=":: eppa! mostro mensaje ::";
        //String msj="::".concat(etxtNombre.getText().toString()).concat(" ").concat(etxtApellidos.getText().toString()).concat("::");
       //txtvNombreCompleto.setText(msj);
        Toast.makeText(MainActivityChopper.this, msj, Toast.LENGTH_LONG).show();
    }

    public void suma(){
        int numA=Integer.parseInt(etxtNumeroA.getText().toString());
        int numB= Integer.parseInt(etxtNumeroB.getText().toString());
        resultado=numA+numB;

    }

    public void resta(){
        int numA=Integer.parseInt(etxtNumeroA.getText().toString());
        int numB= Integer.parseInt(etxtNumeroB.getText().toString());
        resultado=numA-numB;

    }

    public void multiplicacion(){
        int numA=Integer.parseInt(etxtNumeroA.getText().toString());
        int numB= Integer.parseInt(etxtNumeroB.getText().toString());
        resultado=numA*numB;
    }

    public void division(){
        int numA=Integer.parseInt(etxtNumeroA.getText().toString());
        int numB= Integer.parseInt(etxtNumeroB.getText().toString());
        resultado=numA/numB;
    }

    public void mostrar(int result){
        Toast.makeText(MainActivityChopper.this,resultado, Toast.LENGTH_LONG).show();
    }

}
