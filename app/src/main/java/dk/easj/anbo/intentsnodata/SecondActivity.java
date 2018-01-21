package dk.easj.anbo.intentsnodata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void gotoThirdActivityClicked(View view) {
        ThirdActivity.start(this);
    }

    public void goBackClicked(View view) {
        finish();
    }
}
