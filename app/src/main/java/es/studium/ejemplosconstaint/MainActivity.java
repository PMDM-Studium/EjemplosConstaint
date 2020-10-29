package es.studium.ejemplosconstaint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener
{
    Button btnBoton1;
    Button btnBoton2;
    Button btnBoton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBoton1 = findViewById(R.id.button1);
        btnBoton2 = findViewById(R.id.button2);
        btnBoton3 = findViewById(R.id.button3);
        btnBoton1.setOnClickListener(this);
        btnBoton2.setOnClickListener(this);
        btnBoton3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        int boton =0;
        switch (v.getId()){
            case R.id.button1:
                boton=1;
                break;
            case R.id.button2:
                boton=2;
                break;
            case R.id.button3:
                boton=3;
                break;
        }
        Toast.makeText(MainActivity.this, "Pulsaste el boton "+boton, Toast.LENGTH_LONG).show();
    }
}