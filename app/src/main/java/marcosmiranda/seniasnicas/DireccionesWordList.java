package marcosmiranda.seniasnicas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static marcosmiranda.seniasnicas.Helper.gallery;

public class DireccionesWordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direcciones_word_list);
    }

    public void arriba(View view) {
        gallery(this, R.string.direcciones_arriba, R.drawable.direcciones_arriba, R.raw.direcciones_arriba);
    }

    public void abajo(View view) {
        gallery(this, R.string.direcciones_abajo, R.drawable.direcciones_abajo, R.raw.direcciones_abajo);
    }

    public void izquierda(View view) {
        gallery(this, R.string.direcciones_izquierda, R.drawable.direcciones_izquierda, R.raw.direcciones_izquierda);
    }

    public void derecha(View view) {
        gallery(this, R.string.direcciones_derecha, R.drawable.direcciones_derecha, R.raw.direcciones_derecha);
    }

    public void norte(View view) {
        gallery(this, R.string.direcciones_norte, R.drawable.direcciones_norte, R.raw.direcciones_norte);
    }

    public void sur(View view) {
        gallery(this, R.string.direcciones_sur, R.drawable.direcciones_sur, R.raw.direcciones_sur);
    }

    public void este(View view) {
        gallery(this, R.string.direcciones_este, R.drawable.direcciones_este, R.raw.direcciones_este);
    }

    public void oeste(View view) {
        gallery(this, R.string.direcciones_oeste, R.drawable.direcciones_oeste, R.raw.direcciones_oeste);
    }
}