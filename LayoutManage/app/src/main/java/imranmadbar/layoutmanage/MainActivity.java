package imranmadbar.layoutmanage;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String msg = "This is Main Activity: ";
    Button linearActivity;
    Button relativeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        linearActivity = (Button) findViewById(R.id.btnLinearLayout);
        linearActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(MainActivity.this, LinearLayoutActivity.class);
                inten.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(inten);
            }
        });

        relativeActivity = (Button) findViewById(R.id.btnRelativeLayout);
        relativeActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                inten.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(inten);
            }
        });

        Log.d(msg, "Linear Activity");
        Toast.makeText(this,msg+"Linear Activity", Toast.LENGTH_SHORT).show();





    }




}
