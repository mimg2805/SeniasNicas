package marcosmiranda.seniasnicas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static marcosmiranda.seniasnicas.Helper.gallery;

public class ColoresWordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores_word_list);
    }

    public void color(View view) {
        gallery(this, R.string.colores_color, R.drawable.colores_color, R.raw.colores_color);
    }

    public void amarillo(View view) {
        gallery(this, R.string.colores_amarillo, R.drawable.colores_amarillo, R.raw.colores_amarillo);
    }

    public void azul(View view) {
        gallery(this, R.string.colores_azul, R.drawable.colores_azul, R.raw.colores_azul);
    }

    public void blanco(View view) {
        gallery(this, R.string.colores_blanco, R.drawable.colores_blanco, R.raw.colores_blanco);
    }

    public void cafemarron(View view) {
        gallery(this, R.string.colores_cafe, R.drawable.colores_cafe, R.raw.colores_cafe);
    }

    public void celeste(View view) {
        gallery(this, R.string.colores_celeste, R.drawable.colores_celeste, R.raw.colores_celeste);
    }

    public void gris(View view) {
        gallery(this, R.string.colores_gris, R.drawable.colores_gris, R.raw.colores_gris);
    }

    public void lila(View view) {
        gallery(this, R.string.colores_lila, R.drawable.colores_lila, R.raw.colores_lila);
    }

    public void morado(View view) {
        gallery(this, R.string.colores_morado, R.drawable.colores_morado, R.raw.colores_morado);
    }

    public void naranja(View view) {
        gallery(this, R.string.colores_naranja, R.drawable.colores_naranja, R.raw.colores_naranja);
    }

    public void negro(View view) {
        gallery(this, R.string.colores_negro, R.drawable.colores_negro, R.raw.colores_negro);
    }

    public void rojo(View view) {
        gallery(this, R.string.colores_rojo, R.drawable.colores_rojo, R.raw.colores_rojo);
    }

    public void rosa(View view) {
        gallery(this, R.string.colores_rosa, R.drawable.colores_rosa, R.raw.colores_rosa);
    }

    public void verde(View view) {
        gallery(this, R.string.colores_verde, R.drawable.colores_verde, R.raw.colores_verde);
    }
}