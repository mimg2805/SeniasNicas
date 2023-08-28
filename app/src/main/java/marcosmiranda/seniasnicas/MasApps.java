package marcosmiranda.seniasnicas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.marcosmiranda.seniasnicas.R;

public class MasApps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mas_apps);

        ConstraintLayout cursoestadisticabasicaLayout = findViewById(R.id.cursoestadisticabasicaLayout);
        cursoestadisticabasicaLayout.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.marcosmiranda.cursoestadisticabasica"))));

        ConstraintLayout nicaroadrageLayout = findViewById(R.id.nicaroadrageLayout);
        nicaroadrageLayout.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.marcosmiranda.nicaroadrage"))));

        ConstraintLayout purisimaLayout = findViewById(R.id.purisimaLayout);
        purisimaLayout.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.marcosmiranda.purisima"))));
    }
}
