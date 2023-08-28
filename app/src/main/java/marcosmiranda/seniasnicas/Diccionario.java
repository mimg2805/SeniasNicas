package marcosmiranda.seniasnicas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.marcosmiranda.seniasnicas.R;

public class Diccionario extends AppCompatActivity {
    public static final String EXTRA_CATEGORY = String.valueOf(R.string.extra_category);
    //public static String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diccionario);
    }

    public void anatomia(View view) {
        Intent intent = new Intent(this, AnatomiaWordList.class);
        //category = String.valueOf(R.string.categoria_anatomia).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent);
    }

    public void animales(View view) {
        Intent intent = new Intent(this, AnimalesWordList.class);
        //category = String.valueOf(R.string.categoria_animales).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent);
    }

    public void colores(View view) {
        Intent intent = new Intent(this, ColoresWordList.class);
        //category = String.valueOf(R.string.categoria_colores).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent);
    }

    public void comida(View view) {
        Intent intent = new Intent(this, ComidaWordList.class);
        //category = String.valueOf(R.string.categoria_comida).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent);
    }

    public void direcciones(View view) {
        Intent intent = new Intent(this, DireccionesWordList.class);
        //category = String.valueOf(R.string.categoria_direcciones).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent);
    }

    public void emergencias(View view) {
        Intent intent = new Intent(this, EmergenciasWordList.class);
        //category = String.valueOf(R.string.categoria_emergencias).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent);
    }

    public void familia(View view) {
        Intent intent = new Intent(this, FamiliaWordList.class);
        //category = String.valueOf(R.string.categoria_familia).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent);
    }

    public void geografia(View view) {
        Intent intent = new Intent(this, GeografiaWordList.class);
        //category = String.valueOf(R.string.categoria_geografia).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent);
    }

    public void numeros(View view) {
        Intent intent = new Intent(this, NumerosWordList.class);
        //category = String.valueOf(R.string.categoria_numeros).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent);
    }

    public void ropa(View view) {
        Intent intent = new Intent(this, RopaWordList.class);
        //category = String.valueOf(R.string.categoria_ropa).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent);
    }

    public void saludos(View view) {
        Intent intent = new Intent(this, SaludosWordList.class);
        //category = String.valueOf(R.string.categoria_saludos).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent);
    }

    public void tiempo(View view) {
        Intent intent = new Intent(this, TiempoWordList.class);
        //category = String.valueOf(R.string.categoria_tiempo).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent);
    }

    public void trabajos(View view) {
        Intent intent = new Intent(this, TrabajosWordList.class);
        //category = String.valueOf(R.string.categoria_trabajos).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent);
    }

    public void transporte(View view) {
        Intent intent = new Intent(this, TransporteWordList.class);
        //category = String.valueOf(R.string.categoria_transporte).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent);
    }

    public void verbos(View view) {
        Intent intent = new Intent(this, VerbosWordList.class);
        //category = String.valueOf(R.string.categoria_verbos).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent);
    }
}