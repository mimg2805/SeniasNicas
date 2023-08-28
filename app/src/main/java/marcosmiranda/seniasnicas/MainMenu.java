package marcosmiranda.seniasnicas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.marcosmiranda.seniasnicas.R;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        Button abcBtn = findViewById(R.id.abcBtn);
        abcBtn.setOnClickListener(view -> startActivity(new Intent(this, Letras.class)));

        Button dicBtn = findViewById(R.id.dicBtn);
        dicBtn.setOnClickListener(view -> startActivity(new Intent(this, Diccionario.class)));

        Button masAppsBtn = findViewById(R.id.masAppsBtn);
        masAppsBtn.setOnClickListener(view -> startActivity(new Intent(this, MasApps.class)));

        Button exitBtn = findViewById(R.id.exitBtn);
        exitBtn.setOnClickListener(view -> finish());
    }
}