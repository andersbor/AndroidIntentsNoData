package dk.easj.anbo.intentsnodata;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    /**
     * Implements the starter pattern (without extra data)
     * https://hackernoon.com/object-oriented-tricks-4-starter-pattern-android-edition-1844e1a8522d
     * Android Notes for Professionals, section 6.4, Starter Pattern, page 84-85
     * @param context the context of the calling activity
     */
    public static void start(Context context) {
        Intent intent = new Intent(context, ThirdActivity.class);
        context.startActivity(intent);
    }

    public void goBackClicked(View view) {
        finish();
    }
}
