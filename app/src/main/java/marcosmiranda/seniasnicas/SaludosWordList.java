package marcosmiranda.seniasnicas;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.marcosmiranda.seniasnicas.R;
import static marcosmiranda.seniasnicas.Helper.gallery;

public class SaludosWordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludos_word_list);
    }

    public void hola(View view) {
        gallery(this, R.string.saludos_hola, R.drawable.saludos_hola, R.raw.saludos_hola);
    }

    public void soysordo(View view) {
        gallery(this, R.string.saludos_soysordo, R.drawable.saludos_soysordo, R.raw.saludos_soysordo);
    }

    public void soyhipoacusico(View view) {
        gallery(this, R.string.saludos_soyhipoacusico, R.drawable.saludos_soyhipoacusico, R.raw.saludos_soyhipoacusico);
    }

    public void bienvenidos(View view) {
        gallery(this, R.string.saludos_bienvenidos, R.drawable.saludos_bienvenidos, R.raw.saludos_bienvenidos);
    }

    public void buenosdias(View view) {
        gallery(this, R.string.saludos_buenosdias, R.drawable.saludos_buenosdias, R.raw.saludos_buenosdias);
    }

    public void buenastardes(View view) {
        gallery(this, R.string.saludos_buenastardes, R.drawable.saludos_buenastardes, R.raw.saludos_buenastardes);
    }

    public void buenasnoches(View view) {
        gallery(this, R.string.saludos_buenasnoches, R.drawable.saludos_buenasnoches, R.raw.saludos_buenasnoches);
    }

    public void comoestas(View view) {
        gallery(this, R.string.saludos_comoestas, R.drawable.saludos_comoestas, R.raw.saludos_comoestas);
    }

    public void bien(View view) {
        gallery(this, R.string.saludos_bien, R.drawable.saludos_bien, R.raw.saludos_bien);
    }

    public void mal(View view) {
        gallery(this, R.string.saludos_mal, R.drawable.saludos_mal, R.raw.saludos_mal);
    }

    public void gracias(View view) {
        gallery(this, R.string.saludos_gracias, R.drawable.saludos_gracias, R.raw.saludos_gracias);
    }

    public void adios(View view) {
        gallery(this, R.string.saludos_adios, R.drawable.saludos_adios, R.raw.saludos_adios);
    }
}