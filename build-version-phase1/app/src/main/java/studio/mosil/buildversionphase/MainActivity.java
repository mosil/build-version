package studio.mosil.buildversionphase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView versionName = findViewById(R.id.text_version_name);
        versionName.setText(BuildConfig.VERSION_NAME);
    }
}
