package marcosmiranda.seniasnicas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class WordList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Diccionario.EXTRA_CATEGORY);
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
