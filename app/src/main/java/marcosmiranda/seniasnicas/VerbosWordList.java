package marcosmiranda.seniasnicas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static marcosmiranda.seniasnicas.Helper.gallery;

public class VerbosWordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbos_word_list);
    }

    public void amar(View view) {
        gallery(this, R.string.verbos_amar, R.drawable.verbos_amar, R.raw.verbos_amar);
    }

    public void aprender(View view) {
        gallery(this, R.string.verbos_aprender, R.drawable.verbos_aprender, R.raw.verbos_aprender);
    }

    public void baniar(View view) {
        gallery(this, R.string.verbos_bañar, R.drawable.verbos_baniar, R.raw.verbos_baniar);
    }

    public void beber(View view) {
        gallery(this, R.string.verbos_beber, R.drawable.verbos_beber, R.raw.verbos_beber);
    }

    public void caminar(View view) {
        gallery(this, R.string.verbos_caminar, R.drawable.verbos_caminar, R.raw.verbos_caminar);
    }

    public void cantar(View view) {
        gallery(this, R.string.verbos_cantar, R.drawable.verbos_cantar, R.raw.verbos_cantar);
    }

    public void comer(View view) {
        gallery(this, R.string.verbos_comer, R.drawable.verbos_comer, R.raw.verbos_comer);
    }

    public void comprar(View view) {
        gallery(this, R.string.verbos_comprar, R.drawable.verbos_comprar, R.raw.verbos_comprar);
    }

    public void dormir(View view) {
        gallery(this, R.string.verbos_dormir, R.drawable.verbos_dormir, R.raw.verbos_dormir);
    }

    public void enseniar(View view) {
        gallery(this, R.string.verbos_enseñar, R.drawable.verbos_enseniar, R.raw.verbos_enseniar);
    }

    public void escribir(View view) {
        gallery(this, R.string.verbos_escribir, R.drawable.verbos_escribir, R.raw.verbos_escribir);
    }

    public void escuchar(View view) {
        gallery(this, R.string.verbos_escuchar, R.drawable.verbos_escuchar, R.raw.verbos_escuchar);
    }

    public void estudiar(View view) {
        gallery(this, R.string.verbos_estudiar, R.drawable.verbos_estudiar, R.raw.verbos_estudiar);
    }

    public void gritar(View view) {
        gallery(this, R.string.verbos_gritar, R.drawable.verbos_gritar, R.raw.verbos_gritar);
    }

    public void hacer(View view) {
        gallery(this, R.string.verbos_hacer, R.drawable.verbos_hacer, R.raw.verbos_hacer);
    }

    public void leer(View view) {
        gallery(this, R.string.verbos_leer, R.drawable.verbos_leer, R.raw.verbos_leer);
    }

    public void llamar(View view) {
        gallery(this, R.string.verbos_llamar, R.drawable.verbos_llamar, R.raw.verbos_llamar);
    }

    public void trabajar(View view) {
        gallery(this, R.string.verbos_trabajar, R.drawable.verbos_trabajar, R.raw.verbos_trabajar);
    }

    public void ver(View view) {
        gallery(this, R.string.verbos_ver, R.drawable.verbos_ver, R.raw.verbos_ver);
    }

    public void vender(View view) {
        gallery(this, R.string.verbos_vender, R.drawable.verbos_vender, R.raw.verbos_vender);
    }
}