package ctec.aboutme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AutoActivity extends AppCompatActivity
{
	private ImageButton ToMusic;
	private TextView Auto;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_auto);

		ToMusic = (ImageButton) findViewById(R.id.Equalizer);
		Auto = (TextView) findViewById(R.id.Auto);


		setupListeners();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_auto, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id)
		{
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	private void setupListeners()
	{
		ToMusic.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View buttonView)
			{
				Intent changeScreen = new Intent(buttonView.getContext(), MusicActivity.class);
				startActivityForResult(changeScreen, 0);
			}
		});
	}
}
