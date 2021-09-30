package comercial.web.guiaturistica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DestinyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destiny);

        TextView destinyNameTextView = findViewById(R.id.destinyNameTextView);

        if(getIntent().hasExtra("destinyName")){
            String destinyName = getIntent().getStringExtra("destinyName");
            destinyNameTextView.setText(destinyName);
        }

    }
}