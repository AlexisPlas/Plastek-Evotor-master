package com.plastek.plastekloyalty;

//import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ru.evotor.framework.core.IntegrationAppCompatActivity;
import ru.evotor.framework.navigation.NavigationApi;

public class MainActivity extends IntegrationAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(getApplicationContext().getPackageName());

        findViewById(R.id.btnPrefs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(NavigationApi.createIntentForCashReceiptSettings());
            }
        });
    }
}
