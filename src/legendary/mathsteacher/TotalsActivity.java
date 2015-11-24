package legendary.mathsteacher;

import android.app.Activity; 
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import legendary.mathsteacher.CalculationActivity;

public class TotalsActivity extends Activity{
	
	TextView marks;
	ImageButton exit, restart;
	MediaPlayer song;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.totals_act);
		
		song = MediaPlayer.create(getApplicationContext(), R.raw.song);
		marks = (TextView)findViewById(R.id.totals);
		exit = (ImageButton)findViewById(R.id.exitt);
		restart = (ImageButton)findViewById(R.id.restart);
		
		marks.setText("Total Marks = "+CalculationActivity.points);
		song.start();
		
		restart.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(i);
				
			}
			
		 
		});
		
		
		exit.setOnClickListener(new View.OnClickListener() {

	        @Override
	        public void onClick(View v) {
	            // TODO Auto-generated method stub
	            finish();
	            System.exit(0);
	        }
	    });
	}//end of oncreate
	
	
	protected void onPause(){
		
		super.onPause();
		song.release();
	}
	

}
