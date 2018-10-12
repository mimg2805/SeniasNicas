package marcosmiranda.seniasnicas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static marcosmiranda.seniasnicas.Helper.gallery;

public class NumerosWordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_word_list);
    }

    public void cero(View view) {
        gallery(this, R.string.num_0, R.drawable.numeros_0, R.raw.numeros_0);
    }

    public void uno(View view) {
        gallery(this, R.string.num_1, R.drawable.numeros_01, R.raw.numeros_01);
    }

    public void dos(View view) {
        gallery(this, R.string.num_2, R.drawable.numeros_02, R.raw.numeros_02);
    }

    public void tres(View view) {
        gallery(this, R.string.num_3, R.drawable.numeros_03, R.raw.numeros_03);
    }

    public void cuatro(View view) {
        gallery(this, R.string.num_4, R.drawable.numeros_04, R.raw.numeros_04);
    }

    public void cinco(View view) {
        gallery(this, R.string.num_5, R.drawable.numeros_05, R.raw.numeros_05);
    }

    public void seis(View view) {
        gallery(this, R.string.num_6, R.drawable.numeros_06, R.raw.numeros_06);
    }

    public void siete(View view) {
        gallery(this, R.string.num_7, R.drawable.numeros_07, R.raw.numeros_07);
    }

    public void ocho(View view) {
        gallery(this, R.string.num_8, R.drawable.numeros_08, R.raw.numeros_08);
    }

    public void nueve(View view) {
        gallery(this, R.string.num_9, R.drawable.numeros_09, R.raw.numeros_09);
    }

    public void diez(View view) {
        gallery(this, R.string.num_10, R.drawable.numeros_10, R.raw.numeros_10);
    }

    public void once(View view) {
        gallery(this, R.string.num_11, R.drawable.numeros_11, R.raw.numeros_11);
    }

    public void doce(View view) {
        gallery(this, R.string.num_12, R.drawable.numeros_12, R.raw.numeros_12);
    }

    public void trece(View view) {
        gallery(this, R.string.num_13, R.drawable.numeros_13, R.raw.numeros_13);
    }

    public void catorce(View view) {
        gallery(this, R.string.num_14, R.drawable.numeros_14, R.raw.numeros_14);
    }

    public void quince(View view) {
        gallery(this, R.string.num_15, R.drawable.numeros_15, R.raw.numeros_15);
    }

    public void dieciseis(View view) {
        gallery(this, R.string.num_16, R.drawable.numeros_16, R.raw.numeros_16);
    }

    public void diecisiete(View view) {
        gallery(this, R.string.num_17, R.drawable.numeros_17, R.raw.numeros_17);
    }

    public void dieciocho(View view) {
        gallery(this, R.string.num_18, R.drawable.numeros_18, R.raw.numeros_18);
    }

    public void diecinueve(View view) {
        gallery(this, R.string.num_19, R.drawable.numeros_19, R.raw.numeros_19);
    }

    public void veinte(View view) {
        gallery(this, R.string.num_20, R.drawable.numeros_20, R.raw.numeros_20);
    }

    public void treinta(View view) {
        gallery(this, R.string.num_30, R.drawable.numeros_30, R.raw.numeros_30);
    }

    public void cuarenta(View view) {
        gallery(this, R.string.num_40, R.drawable.numeros_40, R.raw.numeros_40);
    }

    public void cincuenta(View view) {
        gallery(this, R.string.num_50, R.drawable.numeros_50, R.raw.numeros_50);
    }

    public void sesenta(View view) {
        gallery(this, R.string.num_60, R.drawable.numeros_60, R.raw.numeros_60);
    }

    public void setenta(View view) {
        gallery(this, R.string.num_70, R.drawable.numeros_70, R.raw.numeros_70);
    }

    public void ochenta(View view) {
        gallery(this, R.string.num_80, R.drawable.numeros_80, R.raw.numeros_80);
    }

    public void noventa(View view) {
        gallery(this, R.string.num_90, R.drawable.numeros_90, R.raw.numeros_90);
    }

    public void cien(View view) {
        gallery(this, R.string.num_100, R.drawable.numeros_100, R.raw.numeros_100);
    }

    public void quinientos(View view) {
        gallery(this, R.string.num_500, R.drawable.numeros_500, R.raw.numeros_500);
    }

    public void mil(View view) {
        gallery(this, R.string.num_1000, R.drawable.numeros_1000, R.raw.numeros_1000);
    }

    public void millon(View view) {
        gallery(this, R.string.num_1000000, R.drawable.numeros_1000000, R.raw.numeros_1000000);
    }
}