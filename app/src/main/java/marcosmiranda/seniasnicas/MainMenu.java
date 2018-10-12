package marcosmiranda.seniasnicas;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
    }

    public void letters(View view) {
        Intent intent = new Intent(this, Letras.class);
        startActivity(intent);
    }

    public void dictionary(View view) {
        Intent intent = new Intent(this, Diccionario.class);
        startActivity(intent);
    }

    public void exit(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask();
        } else {
            finish();
        }
    }
}