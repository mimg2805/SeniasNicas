package marcosmiranda.seniasnicas;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.marcosmiranda.seniasnicas.R;
import static marcosmiranda.seniasnicas.Helper.gallery;

public class RopaWordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ropa_word_list);
    }

    public void blusa(View view) {
        gallery(this, R.string.ropa_blusa, R.drawable.ropa_blusa, R.raw.ropa_blusa);
    }

    public void calcetines(View view) {
        gallery(this, R.string.ropa_calcetines, R.drawable.ropa_calcetines, R.raw.ropa_calcetines);
    }

    public void calzon(View view) {
        gallery(this, R.string.ropa_calzon, R.drawable.ropa_calzon, R.raw.ropa_calzon);
    }

    public void calzoncillo(View view) {
        gallery(this, R.string.ropa_calzoncillo, R.drawable.ropa_calzoncillo, R.raw.ropa_calzoncillo);
    }

    public void camisa(View view) {
        gallery(this, R.string.ropa_camisa, R.drawable.ropa_camisa, R.raw.ropa_camisa);
    }

    public void falda(View view) {
        gallery(this, R.string.ropa_falda, R.drawable.ropa_falda, R.raw.ropa_falda);
    }

    public void gorra(View view) {
        gallery(this, R.string.ropa_gorra, R.drawable.ropa_gorra, R.raw.ropa_gorra);
    }

    public void pantalon(View view) {
        gallery(this, R.string.ropa_pantalon, R.drawable.ropa_pantalon, R.raw.ropa_pantalon);
    }

    public void shorts(View view) {
        gallery(this, R.string.ropa_shorts, R.drawable.ropa_shorts, R.raw.ropa_shorts);
    }

    public void sombrero(View view) {
        gallery(this, R.string.ropa_sombrero, R.drawable.ropa_sombrero, R.raw.ropa_sombrero);
    }

    public void tacones(View view) {
        gallery(this, R.string.ropa_tacones, R.drawable.ropa_tacones, R.raw.ropa_tacones);
    }

    public void tenis(View view) {
        gallery(this, R.string.ropa_tenis, R.drawable.ropa_tenis, R.raw.ropa_tenis);
    }

    public void trajedebanio(View view) {
        gallery(this, R.string.ropa_trajedebaño, R.drawable.ropa_trajedebanio, R.raw.ropa_trajedebanio);
    }

    public void vestido(View view) {
        gallery(this, R.string.ropa_vestido, R.drawable.ropa_vestido, R.raw.ropa_vestido);
    }

    public void zapatos(View view) {
        gallery(this, R.string.ropa_zapatos, R.drawable.ropa_zapatos, R.raw.ropa_zapatos);
    }
}