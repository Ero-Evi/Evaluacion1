package com.evi.evaluacion1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Random random = new Random();
        int delay = (random.nextInt(5) + 1) * 1000;

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this, MenuPrincipal.class); // Redirigir a MainActivity
            startActivity(intent);
            finish();
        }, delay);
    }
}
