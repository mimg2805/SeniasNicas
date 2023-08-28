package marcosmiranda.seniasnicas;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.marcosmiranda.seniasnicas.R;
import static marcosmiranda.seniasnicas.Helper.gallery;

public class GeografiaWordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geografia_word_list);
    }

    public void belice(View view) {
        gallery(this, R.string.geografia_belice, R.drawable.geografia_belice, R.raw.geografia_belice);
    }

    public void centroamerica(View view) {
        gallery(this, R.string.geografia_centroamerica, R.drawable.geografia_centroamerica, R.raw.geografia_centroamerica);
    }

    public void costarica(View view) {
        gallery(this, R.string.geografia_costarica, R.drawable.geografia_costarica, R.raw.geografia_costarica);
    }

    public void cuba(View view) {
        gallery(this, R.string.geografia_cuba, R.drawable.geografia_cuba, R.raw.geografia_cuba);
    }

    public void elsalvador(View view) {
        gallery(this, R.string.geografia_elsalvador, R.drawable.geografia_elsalvador, R.raw.geografia_elsalvador);
    }

    public void eeuu(View view) {
        gallery(this, R.string.geografia_eeuu, R.drawable.geografia_eeuu, R.raw.geografia_eeuu);
    }

    public void guatemala(View view) {
        gallery(this, R.string.geografia_guatemala, R.drawable.geografia_guatemala, R.raw.geografia_guatemala);
    }

    public void honduras(View view) {
        gallery(this, R.string.geografia_honduras, R.drawable.geografia_honduras, R.raw.geografia_honduras);
    }

    public void nicaragua(View view) {
        gallery(this, R.string.geografia_nicaragua, R.drawable.geografia_nicaragua, R.raw.geografia_nicaragua);
    }

    public void panama(View view) {
        gallery(this, R.string.geografia_panama, R.drawable.geografia_panama, R.raw.geografia_panama);
    }

    public void repdom(View view) {
        gallery(this, R.string.geografia_repdom, R.drawable.geografia_repdom, R.raw.geografia_repdom);
    }
}