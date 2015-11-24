package legendary.mathsteacher;

import legendary.mathsteacher.CalculationActivity; 
import legendary.mathsteacher.R;
import android.app.Activity; 
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class ActivitySelection extends Activity{
	
	TextView add, sub, multiply, divide;
	ImageButton exit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.selection_activity);
		
		add= (TextView)findViewById(R.id.add);
		sub= (TextView)findViewById(R.id.subtract);
		multiply= (TextView)findViewById(R.id.multiply);
		divide= (TextView)findViewById(R.id.divide);
		exit= (ImageButton) findViewById(R.id.exitt);
		
		
	
	add.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View arg0) {
			// Switching to Login Screen/closing register screen
			Intent i = new Intent(getApplicationContext(), CalculationActivity.class);
			
			Bundle b = new Bundle();
			b.putString("sign", "a");
			i.putExtras(b);
				startActivity(i);
				finish();
;
									
				
		}
	});
	
	
	
	sub.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View arg0) {
			// Switching to Login Screen/closing register screen
			Intent i = new Intent(getApplicationContext(), CalculationActivity.class);
			
			Bundle b = new Bundle();
			b.putString("sign", "s");
			i.putExtras(b);
				startActivity(i);
				finish();

									
				
		}
	});
				
	//divide
	
	divide.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View arg0) {
			// Switching to Login Screen/closing register screen
			Intent i = new Intent(getApplicationContext(), CalculationActivity.class);
			
			Bundle b = new Bundle();
			b.putString("sign", "d");
			i.putExtras(b);
				startActivity(i);
				finish();

									
				
		}
	});//end of division
	
	
	// start of multiplication
	
	
	multiply.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View arg0) {
			// Switching to Login Screen/closing register screen
			Intent i = new Intent(getApplicationContext(), CalculationActivity.class);
			
			Bundle b = new Bundle();
			b.putString("sign", "m");
			i.putExtras(b);
				startActivity(i);
				finish();
									
				
		}
	});// end of mulltiplication
	
	exit.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            finish();
            System.exit(0);
        }
    });
				}//end oncreate
		
		
	

}
