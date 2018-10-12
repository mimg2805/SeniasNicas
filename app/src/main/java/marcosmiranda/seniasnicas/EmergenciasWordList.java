package marcosmiranda.seniasnicas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static marcosmiranda.seniasnicas.Helper.gallery;

public class EmergenciasWordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencias_word_list);
    }

    public void ayudame(View view) {
        gallery(this, R.string.emergencias_ayudame, R.drawable.emergencias_ayudame, R.raw.emergencias_ayudame);
    }

    public void ambulancia(View view) {
        gallery(this, R.string.emergencias_ambulancia, R.drawable.emergencias_ambulancia, R.raw.emergencias_ambulancia);
    }

    public void dolor(View view) {
        gallery(this, R.string.emergencias_dolor, R.drawable.emergencias_dolor, R.raw.emergencias_dolor);
    }

    public void dolordecabeza(View view) {
        gallery(this, R.string.emergencias_dolordecabeza, R.drawable.emergencias_dolordecabeza, R.raw.emergencias_dolordecabeza);
    }

    public void hospital(View view) {
        gallery(this, R.string.emergencias_hospital, R.drawable.emergencias_hospital, R.raw.emergencias_hospital);
    }

    public void sangre(View view) {
        gallery(this, R.string.emergencias_sangre, R.drawable.emergencias_sangre, R.raw.emergencias_sangre);
    }

    public void temblor(View view) {
        gallery(this, R.string.emergencias_temblor, R.drawable.emergencias_temblor, R.raw.emergencias_temblor);
    }

    public void terremoto(View view) {
        gallery(this, R.string.emergencias_terremoto, R.drawable.emergencias_terremoto, R.raw.emergencias_terremoto);
    }

    public void vomito(View view) {
        gallery(this, R.string.emergencias_vomito, R.drawable.emergencias_vomito, R.raw.emergencias_vomito);
    }
}