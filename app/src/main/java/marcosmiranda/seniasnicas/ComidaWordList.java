package marcosmiranda.seniasnicas;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.marcosmiranda.seniasnicas.R;
import static marcosmiranda.seniasnicas.Helper.gallery;

public class ComidaWordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida_word_list);
    }

    public void arroz(View view) {
        gallery(this, R.string.comida_arroz, R.drawable.comida_arroz, R.raw.comida_arroz);
    }

    public void banano(View view) {
        gallery(this, R.string.comida_banano, R.drawable.comida_banano, R.raw.comida_banano);
    }

    public void cafe(View view) {
        gallery(this, R.string.comida_cafe, R.drawable.comida_cafe, R.raw.comida_cafe);
    }

    public void carne(View view) {
        gallery(this, R.string.comida_carne, R.drawable.comida_carne, R.raw.comida_carne);
    }

    public void ensalada(View view) {
        gallery(this, R.string.comida_ensalada, R.drawable.comida_ensalada, R.raw.comida_ensalada);
    }

    public void frijoles(View view) {
        gallery(this, R.string.comida_frijoles, R.drawable.comida_frijoles, R.raw.comida_frijoles);
    }

    public void gaseosa(View view) {
        gallery(this, R.string.comida_gaseosa, R.drawable.comida_gaseosa, R.raw.comida_gaseosa);
    }

    public void hamburguesa(View view) {
        gallery(this, R.string.comida_hamburguesa, R.drawable.comida_hamburguesa, R.raw.comida_hamburguesa);
    }

    public void helado(View view) {
        gallery(this, R.string.comida_helado, R.drawable.comida_helado, R.raw.comida_helado);
    }

    public void huevo(View view) {
        gallery(this, R.string.comida_huevo, R.drawable.comida_huevo, R.raw.comida_huevo);
    }

    public void leche(View view) {
        gallery(this, R.string.comida_leche, R.drawable.comida_leche, R.raw.comida_leche);
    }

    public void manzana(View view) {
        gallery(this, R.string.comida_manzana, R.drawable.comida_manzana, R.raw.comida_manzana);
    }

    public void papasfritas(View view) {
        gallery(this, R.string.comida_papasfritas, R.drawable.comida_papasfritas, R.raw.comida_papasfritas);
    }

    public void pizza(View view) {
        gallery(this, R.string.comida_pizza, R.drawable.comida_pizza, R.raw.comida_pizza);
    }

    public void queso(View view) {
        gallery(this, R.string.comida_queso, R.drawable.comida_queso, R.raw.comida_queso);
    }

    public void salsadetomate(View view) {
        gallery(this, R.string.comida_salsadetomate, R.drawable.comida_salsadetomate, R.raw.comida_salsadetomate);
    }

    public void sandia(View view) {
        gallery(this, R.string.comida_sandia, R.drawable.comida_sandia, R.raw.comida_sandia);
    }

    public void sopa(View view) {
        gallery(this, R.string.comida_sopa, R.drawable.comida_sopa, R.raw.comida_sopa);
    }
}