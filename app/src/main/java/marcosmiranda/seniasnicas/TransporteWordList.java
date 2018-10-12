package marcosmiranda.seniasnicas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static marcosmiranda.seniasnicas.Helper.gallery;

public class TransporteWordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte_word_list);
    }

    public void avion(View view) {
        gallery(this, R.string.transporte_avion, R.drawable.transporte_avion, R.raw.transporte_avion);
    }

    public void bus(View view) {
        gallery(this, R.string.transporte_bus, R.drawable.transporte_bus, R.raw.transporte_bus);
    }

    public void carro(View view) {
        gallery(this, R.string.transporte_carro, R.drawable.transporte_carro, R.raw.transporte_carro);
    }

    public void camion(View view) {
        gallery(this, R.string.transporte_camion, R.drawable.transporte_camion, R.raw.transporte_camion);
    }

    public void carretilla(View view) {
        gallery(this, R.string.transporte_carretilla, R.drawable.transporte_carretilla, R.raw.transporte_carretilla);
    }

    public void helicoptero(View view) {
        gallery(this, R.string.transporte_helicoptero, R.drawable.transporte_helicoptero, R.raw.transporte_helicoptero);
    }

    public void microbus(View view) {
        gallery(this, R.string.transporte_microbus, R.drawable.transporte_microbus, R.raw.transporte_microbus);
    }

    public void moto(View view) {
        gallery(this, R.string.transporte_moto, R.drawable.transporte_moto, R.raw.transporte_moto);
    }

    public void taxi(View view) {
        gallery(this, R.string.transporte_taxi, R.drawable.transporte_taxi, R.raw.transporte_taxi);
    }

    public void tren(View view) {
        gallery(this, R.string.transporte_tren, R.drawable.transporte_tren, R.raw.transporte_tren);
    }
}