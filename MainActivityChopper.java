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

    private RadioGroup groupOperations;
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
        etxtNumeroB = (EditText) findViewById(R.id.etxtNumeroB);
        groupOperations = (RadioGroup) findViewById(R.id.groupOperations);

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Toast.makeText(MainActivityChopper.this, "okk::" + groupOperations.getCheckedRadioButtonId() + "---" + R.id.rSuma, Toast.LENGTH_SHORT).show();

                int operacion = groupOperations.getCheckedRadioButtonId();

                switch (operacion) {
                    case R.id.rSuma:
                        suma();
                        break;
                    case R.id.rResta:
                        resta();
                        break;
                    case R.id.rMultiplicacion:
                        multiplicacion();
                        break;
                    case R.id.rDivision:
                        division();
                        break;
                }
                mostrar(resultado);
            }
        });
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
        Toast.makeText(MainActivityChopper.this,"Resultado: " + resultado, Toast.LENGTH_LONG).show();
    }

}
