package marcosmiranda.seniasnicas;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.marcosmiranda.seniasnicas.R;
import static marcosmiranda.seniasnicas.Helper.gallery;

public class AnimalesWordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales_word_list);
    }

    public void animales(View view) {
        gallery(this, R.string.animales_animales, R.drawable.animales_animales, R.raw.animales_animales);
    }

    public void burro(View view) {
        gallery(this, R.string.animales_burro, R.drawable.animales_burro, R.raw.animales_burro);
    }

    public void caballo(View view) {
        gallery(this, R.string.animales_caballo, R.drawable.animales_caballo, R.raw.animales_caballo);
    }

    public void cerdo(View view) {
        gallery(this, R.string.animales_cerdo, R.drawable.animales_cerdo, R.raw.animales_cerdo);
    }

    public void conejo(View view) {
        gallery(this, R.string.animales_conejo, R.drawable.animales_conejo, R.raw.animales_conejo);
    }

    public void culebra(View view) {
        gallery(this, R.string.animales_culebra, R.drawable.animales_culebra, R.raw.animales_culebra);
    }

    public void gallina(View view) {
        gallery(this, R.string.animales_gallina, R.drawable.animales_gallina, R.raw.animales_gallina);
    }

    public void gallo(View view) {
        gallery(this, R.string.animales_gallo, R.drawable.animales_gallo, R.raw.animales_gallo);
    }

    public void gato(View view) {
        gallery(this, R.string.animales_gato, R.drawable.animales_gato, R.raw.animales_gato);
    }

    public void loro(View view) {
        gallery(this, R.string.animales_loro, R.drawable.animales_loro, R.raw.animales_loro);
    }

    public void pajaro(View view) {
        gallery(this, R.string.animales_pajaro, R.drawable.animales_paloma, R.raw.animales_paloma);
    }

    public void paloma(View view) {
        gallery(this, R.string.animales_paloma, R.drawable.animales_paloma, R.raw.animales_paloma);
    }

    public void perro(View view) {
        gallery(this, R.string.animales_perro, R.drawable.animales_perro, R.raw.animales_perro);
    }

    public void pollito(View view) {
        gallery(this, R.string.animales_pollito, R.drawable.animales_pollito, R.raw.animales_pollito);
    }

    public void toro(View view) {
        gallery(this, R.string.animales_toro, R.drawable.animales_toro, R.raw.animales_toro);
    }

    public void tortuga(View view) {
        gallery(this, R.string.animales_tortuga, R.drawable.animales_tortuga, R.raw.animales_tortuga);
    }
}