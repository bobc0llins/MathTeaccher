package legendary.mathsteacher;

import java.util.Random;

import java.util.Scanner;

import legendary.mathsteacher.R;




import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CalculationActivity extends Activity{
	
	Random rand = new Random();
	
	static double  answer, marks, display;
	static int num1, num2, choice, randomanswer ;
	String string1, string2, stringanswer, stringmarks;
	EditText enteranswer;
	static TextView firstnum, secnum, answerview, marksview, sign;
	Button answerentered;
	static int points=0,max = 0, loss=0;
	String signs;
	ImageView bak;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculation_activity);
		
		
		Bundle b = getIntent().getExtras();
		
		signs = b.getString("sign");
		

		firstnum = (TextView)findViewById(R.id.firstnum);
		secnum = (TextView)findViewById(R.id.secndnum);
		answerview= (TextView)findViewById(R.id.answer);
		marksview = (TextView)findViewById(R.id.marks);
		sign = (TextView)findViewById(R.id.sign);
		answerentered = (Button) findViewById(R.id.clicktoanswer);
		
		enteranswer = (EditText) findViewById(R.id.answerentered);
		add();
		
		
		
	}//end oncreate
	
	
	
	public void add(){
		
		bak = (ImageView)findViewById(R.id.animate);
		
		num1 = 1+rand.nextInt(9);
		num2 = 1+rand.nextInt(9);
		if(num1>=num2){
			firstnum.setText(""+num1);
			secnum.setText(""+num2);
			//sign.setText("+");
			}
			else {
				firstnum.setText(""+num2);
				secnum.setText(""+num1);
				
			}
		
		if(signs.equals("a")){
			sign.setText("+");
		answer = num1+num2;
		}
		if(signs.equals("s")){
			sign.setText("-");
			answer = num1-num2;
			}
		if(signs.equals("d")){
			sign.setText("/");
			answer =(double) (num1/num2);
			String.format(" %.2f ",answer );
			
			}
		if(signs.equals("m")){
			sign.setText("x");
			answer = num1*num2;
			}
		
		
		answerentered.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
								
				int disp = 1+rand.nextInt(4);
				
				 if ( ( enteranswer.getText().toString().equals("")) )
	                {
	                    Toast.makeText(getApplicationContext(),
	                            "Answer field empty", Toast.LENGTH_SHORT).show();
	                }
					//begining of else

				
				
				 else if ( (!enteranswer.getText().toString().equals("")) ){	
				
				// TODO Auto-generated method stub
				if(max <=10){
				max++;
				
				String a = enteranswer.getText().toString();
				
				
				
					
						double b = Double.parseDouble(a);
						if(answer==b){
					points += 1;
					
					
					
					switch(disp){
					
					
					case 1:
						
								Toast.makeText(getApplicationContext(), "Keep up the good work!", Toast.LENGTH_LONG).show();
								enteranswer.setText("");
								add();
								break;
					case 2:
						 
								Toast.makeText(getApplicationContext(), "Nice work!", Toast.LENGTH_LONG).show();
								enteranswer.setText("");
								add();
								break;	
					case 3:
						
								Toast.makeText(getApplicationContext(), "Excellent!", Toast.LENGTH_LONG).show();
								enteranswer.setText("");
								add();
								break;
					case 4:
						
								Toast.makeText(getApplicationContext(), "Very good!", Toast.LENGTH_LONG).show();
								enteranswer.setText("");
								add();
								break;
					}// of switch
				}//end of if(answer==b)
				
				else if(answer!=b) {
					loss+=1;
					
					if(loss==1){
						bak.setImageResource(R.drawable.g6);
						
					}
					else if(loss==2) {
						
						bak.setImageResource(R.drawable.g5);
					}
					else if(loss==3) {
						
						bak.setImageResource(R.drawable.g4);
					}
					else if(loss==4) {
						
						bak.setImageResource(R.drawable.g3);
					}
					else if(loss==5) {
	
						bak.setImageResource(R.drawable.g2);
					}
					else if(loss==6) {
						
						bak.setImageResource(R.drawable.g1);
					}
					else if(loss==7) {
											
											//call an intent to show marks and request to start again.
						Intent i = new Intent(getApplicationContext(), TotalsActivity.class);
						startActivity(i);
						finish();
										}
					
							switch(disp){
																		
									case 1:
										
												Toast.makeText(getApplicationContext(), "No. Please try again.", Toast.LENGTH_LONG).show();
												enteranswer.setText("");
												add();
												break;
									case 2:
										 
												Toast.makeText(getApplicationContext(), "Wrong. Try once more.", Toast.LENGTH_LONG).show();
												enteranswer.setText("");
												add();
												break;	
									case 3:
										
												Toast.makeText(getApplicationContext(), "Don't give up!", Toast.LENGTH_LONG).show();
												enteranswer.setText("");
												add();
												break;
									case 4:
										
												Toast.makeText(getApplicationContext(), "No. Keep trying.", Toast.LENGTH_LONG).show();
												enteranswer.setText("");
												add();
												break;
									}// of switch
					
					
				}//end of else if(answer!=b) 
				
				
				else{
					
					Toast.makeText(getApplicationContext(), "Total = "+points, Toast.LENGTH_LONG).show();
					
				}//end of else
				
				
			}//end of if(max <=10)
		
					
		//seting points
		
		answerview.setText("Points "+points);
		
		
				 }//end of else if ( (!enteranswer.getText().toString().equals("")) )
				 
				 
			//	 else if (!enteranswer.getText().toString().matches(".*\\d+.*")){
					 
				//	 Toast.makeText(getApplicationContext(), "Please enter an integer value ", Toast.LENGTH_LONG).show();
					//	enteranswer.setText("");
				 //}
		
		}//end of onclickView
			
			
		
	} //end of onclicklistener
	
	);//onf of setonclick
		
	}//end of add
	
}//end of class CalculationActivity
	


