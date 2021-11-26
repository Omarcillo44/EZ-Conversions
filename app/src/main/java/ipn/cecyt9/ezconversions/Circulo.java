package ipn.cecyt9.ezconversions;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Circulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
    }

    Double resultado;
    Double resultado2;
    Double numero1;
    Double numero2;

    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.numeros) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClicksuma(View miView)
    {
        onClickOperacionCapturaNumero1(miView);
        TextView tv = (TextView) findViewById(R.id.numeros) ;

        try {
            resultado = numero1 * 0.047;

            tv.setText(resultado.toString());
        }catch(NumberFormatException nfe){
            Toast.makeText(this,"Numero Incorrecto", LENGTH_SHORT).show();
        }

    }

    public void onClickButtonborrar(View miView)
    {
        numero1=0.0;
        TextView tv = (TextView) findViewById(R.id.numeros) ;
        tv.setText("");
    }


    public void onClickOperacionCapturaNumero2(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.numeros2) ;
        numero2 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClicksuma2(View miView)
    {
        onClickOperacionCapturaNumero2(miView);
        TextView tv = (TextView) findViewById(R.id.numeros2) ;

        try {
            resultado2 = numero2 / 0.048;

            tv.setText(resultado2.toString());
        }catch(NumberFormatException nfe){
            Toast.makeText(this,"Numero Incorrecto", LENGTH_SHORT).show();
        }

    }

    public void onClickButtonborrar2(View miView)
    {
        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.numeros2) ;
        tv.setText("");
    }

}