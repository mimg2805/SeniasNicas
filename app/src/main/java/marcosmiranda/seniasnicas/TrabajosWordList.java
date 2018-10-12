package marcosmiranda.seniasnicas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static marcosmiranda.seniasnicas.Helper.gallery;

public class TrabajosWordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trabajos_word_list);
    }

    public void abogado(View view) {
        gallery(this, R.string.trabajos_abogado, R.drawable.trabajos_abogado, R.raw.trabajos_abogado);
    }

    public void chofer(View view) {
        gallery(this, R.string.trabajos_chofer, R.drawable.trabajos_chofer, R.raw.trabajos_chofer);
    }

    public void dentista(View view) {
        gallery(this, R.string.trabajos_dentista, R.drawable.trabajos_dentista, R.raw.trabajos_dentista);
    }

    public void doctor(View view) {
        gallery(this, R.string.trabajos_doctor, R.drawable.trabajos_doctor, R.raw.trabajos_doctor);
    }

    public void enfermera(View view) {
        gallery(this, R.string.trabajos_enfermera, R.drawable.trabajos_enfermera, R.raw.trabajos_enfermera);
    }

    public void general(View view) {
        gallery(this, R.string.trabajos_general, R.drawable.trabajos_general, R.raw.trabajos_general);
    }

    public void jefe(View view) {
        gallery(this, R.string.trabajos_jefe, R.drawable.trabajos_jefe, R.raw.trabajos_jefe);
    }

    public void maestro(View view) {
        gallery(this, R.string.trabajos_maestro, R.drawable.trabajos_maestro, R.raw.trabajos_maestro);
    }

    public void pastor(View view) {
        gallery(this, R.string.trabajos_pastor, R.drawable.trabajos_pastor, R.raw.trabajos_pastor);
    }

    public void periodista(View view) {
        gallery(this, R.string.trabajos_periodista, R.drawable.trabajos_periodista, R.raw.trabajos_periodista);
    }

    public void policia(View view) {
        gallery(this, R.string.trabajos_policia, R.drawable.trabajos_policia, R.raw.trabajos_policia);
    }

    public void profesor(View view) {
        gallery(this, R.string.trabajos_profesor, R.drawable.trabajos_profesor, R.raw.trabajos_profesor);
    }

    public void sacerdote(View view) {
        gallery(this, R.string.trabajos_sacerdote, R.drawable.trabajos_sacerdote, R.raw.trabajos_sacerdote);
    }
}