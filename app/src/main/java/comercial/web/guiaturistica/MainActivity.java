package comercial.web.guiaturistica;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void goToMonumentos(View view) {
        gotoDestinyActivity("Monumentos");
    }

    public void goToGalerias(View view) {
        gotoDestinyActivity("Galerias");

    }

    public void goToPlazas(View view) {
        gotoDestinyActivity("Plazas");
    }

    private void gotoDestinyActivity(String extraValue){
        Intent intent = new Intent(this, DestinyActivity.class);
        intent.putExtra("destinyName", extraValue);
        startActivity(intent);
    }
}
