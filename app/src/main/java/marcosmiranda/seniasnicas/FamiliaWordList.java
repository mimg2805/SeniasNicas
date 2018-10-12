package marcosmiranda.seniasnicas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static marcosmiranda.seniasnicas.Helper.gallery;

public class FamiliaWordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familia_word_list);
    }

    public void amigo(View view) {
        gallery(this, R.string.familia_amigo, R.drawable.familia_amigo, R.raw.familia_amigo);
    }

    public void cuniado(View view) {
        gallery(this, R.string.familia_cuñado, R.drawable.familia_cuniado, R.raw.familia_cuniado);
    }

    public void esposo(View view) {
        gallery(this, R.string.familia_esposo, R.drawable.familia_esposo, R.raw.familia_esposo);
    }

    public void hermano(View view) {
        gallery(this, R.string.familia_hermano, R.drawable.familia_hermano, R.raw.familia_hermano);
    }

    public void mama(View view) {
        gallery(this, R.string.familia_mama, R.drawable.familia_mama, R.raw.familia_mama);
    }

    public void novio(View view) {
        gallery(this, R.string.familia_novio, R.drawable.familia_novio, R.raw.familia_novio);
    }

    public void papa(View view) {
        gallery(this, R.string.familia_papa, R.drawable.familia_papa, R.raw.familia_papa);
    }

    public void primo(View view) {
        gallery(this, R.string.familia_primo, R.drawable.familia_primo, R.raw.familia_primo);
    }

    public void prima(View view) {
        gallery(this, R.string.familia_prima, R.drawable.familia_prima, R.raw.familia_prima);
    }

    public void sobrino(View view) {
        gallery(this, R.string.familia_sobrino, R.drawable.familia_sobrino, R.raw.familia_sobrino);
    }

    public void tio(View view) {
        gallery(this, R.string.familia_tio, R.drawable.familia_tio, R.raw.familia_tio);
    }
}