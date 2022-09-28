package mx.edu.tesoem.itics.p47t2120222;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    Handler manejador = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manejador.postDelayed(autocargar,5000);
    }

    Runnable autocargar = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(MainActivity.this,PrincipalActivity.class);
            startActivity(intent);
            finish();
        }
    };
}