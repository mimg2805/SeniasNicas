package marcosmiranda.seniasnicas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static marcosmiranda.seniasnicas.Helper.gallery;

public class AnatomiaWordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anatomia_word_list);
    }

    public void cuerpo(View view) {
        gallery(this, R.string.anatomia_cuerpo, R.drawable.anatomia_cuerpo, R.raw.anatomia_cuerpo);
    }

    public void hombre(View view) {
        gallery(this, R.string.anatomia_hombre, R.drawable.anatomia_hombre, R.raw.anatomia_hombre);
    }

    public void mujer(View view) {
        gallery(this, R.string.anatomia_mujer, R.drawable.anatomia_mujer, R.raw.anatomia_mujer);
    }

    public void cabeza(View view) {
        gallery(this, R.string.anatomia_cabeza, R.drawable.anatomia_cabeza, R.raw.anatomia_cabeza);
    }

    public void cabello(View view) {
        gallery(this, R.string.anatomia_cabello, R.drawable.anatomia_cabello, R.raw.anatomia_cabello);
    }

    public void ojos(View view) {
        gallery(this, R.string.anatomia_ojos, R.drawable.anatomia_ojos, R.raw.anatomia_ojos);
    }

    public void nariz(View view) {
        gallery(this, R.string.anatomia_nariz, R.drawable.anatomia_nariz, R.raw.anatomia_nariz);
    }

    public void oreja(View view) {
        gallery(this, R.string.anatomia_oreja, R.drawable.anatomia_oreja, R.raw.anatomia_oreja);
    }

    public void boca(View view) {
        gallery(this, R.string.anatomia_boca, R.drawable.anatomia_boca, R.raw.anatomia_boca);
    }

    public void pecho(View view) {
        gallery(this, R.string.anatomia_pecho, R.drawable.anatomia_pecho, R.raw.anatomia_pecho);
    }

    public void brazo(View view) {
        gallery(this, R.string.anatomia_brazo, R.drawable.anatomia_brazo, R.raw.anatomia_brazo);
    }

    public void mano(View view) {
        gallery(this, R.string.anatomia_mano, R.drawable.anatomia_mano, R.raw.anatomia_mano);
    }

    public void estomago(View view) {
        gallery(this, R.string.anatomia_estomago, R.drawable.anatomia_estomago, R.raw.anatomia_estomago);
    }

    public void pierna(View view) {
        gallery(this, R.string.anatomia_pierna, R.drawable.anatomia_pierna, R.raw.anatomia_pierna);
    }

    public void pie(View view) {
        gallery(this, R.string.anatomia_pies, R.drawable.anatomia_pies, R.raw.anatomia_pies);
    }
}