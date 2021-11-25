package ipn.cecyt9.ezconversions;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonPesosDolar;
    private Button buttonOnzas;
    private Button buttonCirculo;
    private Button buttonWatts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPesosDolar = findViewById(R.id.ButtonPesosDolar);


        buttonPesosDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPesosDolar();
            }
        });



    }

    private void abrirPesosDolar() {
        Intent intent = new Intent(this , PesosDolar.class);
        startActivity(intent);
    }


}
