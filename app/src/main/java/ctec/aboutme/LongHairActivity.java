package ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;


public class LongHairActivity extends AppCompatActivity
{

    private ImageButton ToTilt;
    private TextView Blondie;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_hair);


        ToTilt = (ImageButton) findViewById(R.id.ToTilted);
        Blondie = (TextView) findViewById(R.id.Blondie);

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_long_hair, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void setupListeners()
    {
       ToTilt.setOnClickListener(new View.OnClickListener()
       {
           public void onClick(View buttonView)
           {
               Intent changeScreen = new Intent(buttonView.getContext(), TiltedActivity.class);
               startActivityForResult(changeScreen, 0);
           }
       });
    }
}
