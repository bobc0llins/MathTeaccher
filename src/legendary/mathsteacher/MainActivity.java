package legendary.mathsteacher;

import java.util.Timer;
import java.util.TimerTask;

import legendary.mathsteacher.R;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.text.Selection;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {
	ImageView anim;
	MediaPlayer song;
	AnimationDrawable animate;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*
Thread thr = new Thread(){
			
			public void run(){
					
							
				try{
					sleep(4000);
				} catch (InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent crowservices = new Intent(getApplicationContext(), ActivitySelection.class);
					startActivity(crowservices);
					
					
				}
			
			}//end of public void run()
			
		};//end of thread
		thr.start();*/
		
		/***** start of image background
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		song = MediaPlayer.create(getApplicationContext(), R.raw.song);
		song.start();
		
		anim=(ImageView)findViewById(R.id.animate);
		BitmapDrawable frame0=(BitmapDrawable)getResources().getDrawable(R.drawable.baba1);
		BitmapDrawable frame1=(BitmapDrawable)getResources().getDrawable(R.drawable.pxa);
		BitmapDrawable frame2=(BitmapDrawable)getResources().getDrawable(R.drawable.pxb);
		BitmapDrawable frame3=(BitmapDrawable)getResources().getDrawable(R.drawable.pxc);
		BitmapDrawable frame4=(BitmapDrawable)getResources().getDrawable(R.drawable.pxd);
		BitmapDrawable frame5=(BitmapDrawable)getResources().getDrawable(R.drawable.pxe);
		BitmapDrawable frame6=(BitmapDrawable)getResources().getDrawable(R.drawable.pxf);
		BitmapDrawable frame7=(BitmapDrawable)getResources().getDrawable(R.drawable.pxg);
		BitmapDrawable frame8=(BitmapDrawable)getResources().getDrawable(R.drawable.pxh);
		BitmapDrawable frame9=(BitmapDrawable)getResources().getDrawable(R.drawable.pxi);
		BitmapDrawable frame10=(BitmapDrawable)getResources().getDrawable(R.drawable.pxj);
		BitmapDrawable frame11=(BitmapDrawable)getResources().getDrawable(R.drawable.pxk);
		BitmapDrawable frame12=(BitmapDrawable)getResources().getDrawable(R.drawable.pxl);
		BitmapDrawable frame13=(BitmapDrawable)getResources().getDrawable(R.drawable.pxm);
	
		//Animate frames
	animate=new AnimationDrawable();
	animate.addFrame(frame0, 1500);
	animate.addFrame(frame1, 700);
	animate.addFrame(frame2, 700);
	animate.addFrame(frame3, 700);
	animate.addFrame(frame4, 700);
	animate.addFrame(frame5, 700);
	animate.addFrame(frame6, 700);
	animate.addFrame(frame7, 700);
	animate.addFrame(frame8, 700);
	animate.addFrame(frame9, 700);
	animate.addFrame(frame10, 700);
	animate.addFrame(frame11, 700);
	animate.addFrame(frame12, 700);
	animate.addFrame(frame13, 700);
	
	animate.setOneShot(true);
	//aniamtion to happen inside imageview
	anim.setBackgroundDrawable(animate);
	Handler handler=new Handler();
	handler.postDelayed(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
		animate.start();	
		}
	}, 3000);
		
		
		
		
		/****end of image background
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	
	
	  int duration = 0;
      for(int i = 0; i < animate.getNumberOfFrames(); i++){
          duration += animate.getDuration(i);
         }
      Timer timer = new Timer();
      MyTimerTask myTimerTask = new MyTimerTask();
      timer.schedule(myTimerTask, duration);





            
	
	            }
	
				 class MyTimerTask extends TimerTask {
			         @Override
			        public void run() {
			// findViewById(R.id.main_page_layout).post
			                        runOnUiThread(new Runnable(){
			@Override
			                                     public void run() {
				//cp=new CoolParallel();
			
			Intent i = new Intent(getApplicationContext(), ActivitySelection.class);
			startActivity(i);
			
			
			                                   }});
			
			                             }  
			                    }
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		song.release();
		
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
