package marcosmiranda.seniasnicas;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.marcosmiranda.seniasnicas.R;
import static marcosmiranda.seniasnicas.Helper.gallery;

public class TiempoWordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiempo_word_list);
    }

    public void hoy(View view) {
        gallery(this, R.string.tiempo_hoy, R.drawable.tiempo_hoy, R.raw.tiempo_hoy);
    }

    public void maniana(View view) {
        gallery(this, R.string.tiempo_mañana, R.drawable.tiempo_maniana, R.raw.tiempo_maniana);
    }

    public void ayer(View view) {
        gallery(this, R.string.tiempo_ayer, R.drawable.tiempo_ayer, R.raw.tiempo_ayer);
    }

    public void segundo(View view) {
        gallery(this, R.string.tiempo_segundo, R.drawable.tiempo_segundo, R.raw.tiempo_segundo);
    }

    public void minuto(View view) {
        gallery(this, R.string.tiempo_minuto, R.drawable.tiempo_minuto, R.raw.tiempo_minuto);
    }

    public void hora(View view) {
        gallery(this, R.string.tiempo_hora, R.drawable.tiempo_hora, R.raw.tiempo_hora);
    }

    public void dia(View view) {
        gallery(this, R.string.tiempo_dia, R.drawable.tiempo_dia, R.raw.tiempo_dia);
    }

    public void semana(View view) {
        gallery(this, R.string.tiempo_semana, R.drawable.tiempo_semana, R.raw.tiempo_semana);
    }

    public void mes(View view) {
        gallery(this, R.string.tiempo_mes, R.drawable.tiempo_mes, R.raw.tiempo_mes);
    }

    public void anio(View view) {
        gallery(this, R.string.tiempo_año, R.drawable.tiempo_anio, R.raw.tiempo_anio);
    }

    public void quehoraes(View view) {
        gallery(this, R.string.tiempo_quehoraes, R.drawable.tiempo_quehoraes, R.raw.tiempo_quehoraes);
    }
}