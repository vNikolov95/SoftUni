package com.exercise.AndroidAnimTranslate;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AndroidAnimTranslateActivity extends Activity {
	public static int counter = 0;
	public static int iterations = 200;
	public static int score = 0;
	public static String lblScoreOffset = "        ";
	public static long[] startTime = new long[4];
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Animation animationLine1 = AnimationUtils.loadAnimation(this, R.anim.falling);
        animationLine1.setFillAfter(true);
        final Animation animationLine2 = AnimationUtils.loadAnimation(this, R.anim.falling);
        final Animation animationLine3 = AnimationUtils.loadAnimation(this, R.anim.falling);
        final Animation animationLine4 = AnimationUtils.loadAnimation(this, R.anim.falling);
        final AndroidAnimTranslateActivity app = this;

        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.llMain);
        mainLayout.setOnClickListener(new Button.OnClickListener(){
		    @Override
		    public void onClick(View arg0) {
		    }
        });
        
        
        
        
        Button btnStartGame = (Button)findViewById(R.id.btnStartGame);
        btnStartGame.setOnClickListener(new Button.OnClickListener(){
		    @Override
		    public void onClick(View arg0) {
		    	counter = 0;

    	    	TextView tv = (TextView) findViewById(R.id.textView2);
    	    	tv.setText(lblScoreOffset + Integer.toString(counter));
		    	
		    	RelativeLayout.LayoutParams layoutParameters = setLayoutParams();
		    	
		    	final ImageView img1 = setImageView(animationLine1,
						layoutParameters, R.id.rlLine1, R.drawable.beer1, 0);
		    	
		    	final ImageView img2 = setImageView(animationLine2,
						layoutParameters, R.id.rlLine2, R.drawable.paci1, 1);
		    	
		    	final ImageView img3 = setImageView(animationLine3,
						layoutParameters, R.id.rlLine3, R.drawable.beer2, 2);
		    	
		    	final ImageView img4 = setImageView(animationLine4,
						layoutParameters, R.id.rlLine4, R.drawable.paci2, 3);
		    	
		    	Button btn00 = (Button)findViewById(R.id.Button00);
		        btn00.setOnClickListener(new Button.OnClickListener(){
		        	@Override
		        	public void onClick(View arg0) {
		        		if (System.currentTimeMillis() - startTime[0] > 2800 && System.currentTimeMillis() - startTime[0] < 3100) { //(animationLine1.getDuration() > 1000 || animationLine1.getDuration() < 5000){
		        			counter++;
		        			TextView tv = (TextView) findViewById(R.id.textView2);
			    	    	tv.setText(lblScoreOffset + Integer.toString(counter));
		        		}
		        	}
		        });
		        Button btn01 = (Button)findViewById(R.id.Button01);
		        btn01.setOnClickListener(new Button.OnClickListener(){
		        	@Override
		        	public void onClick(View arg0) {
		        		if (System.currentTimeMillis() - startTime[0] > 2800 && System.currentTimeMillis() - startTime[1] < 3100) { //(animationLine1.getDuration() > 1000 || animationLine1.getDuration() < 5000){
		        			counter++;
		        			TextView tv = (TextView) findViewById(R.id.textView2);
			    	    	tv.setText(lblScoreOffset + Integer.toString(counter));
		        		}
		        	}
		        });
		        Button btn02 = (Button)findViewById(R.id.Button02);
		        btn02.setOnClickListener(new Button.OnClickListener(){
		        	@Override
		        	public void onClick(View arg0) {
		        		if (System.currentTimeMillis() - startTime[2] > 2800 && System.currentTimeMillis() - startTime[2] < 3100) { //(animationLine1.getDuration() > 1000 || animationLine1.getDuration() < 5000){
		        			counter++;
		        			TextView tv = (TextView) findViewById(R.id.textView2);
			    	    	tv.setText(lblScoreOffset + Integer.toString(counter));
		        		}
		        	}
		        });
		        Button btn03 = (Button)findViewById(R.id.Button03);
		        btn03.setOnClickListener(new Button.OnClickListener(){
		        	@Override
		        	public void onClick(View arg0) {
		        		if (System.currentTimeMillis() - startTime[3] > 2800 && System.currentTimeMillis() - startTime[3] < 3100) { //(animationLine1.getDuration() > 1000 || animationLine1.getDuration() < 5000){
		        			counter++;
		        			TextView tv = (TextView) findViewById(R.id.textView2);
			    	    	tv.setText(lblScoreOffset + Integer.toString(counter));
		        		}
		        	}
		        });
		    	
		    	final Random rnd = new Random();
		    	int rnd1 = (int)(rnd.nextFloat()*1000);
		    	int rnd2 = (int)(rnd.nextFloat()*1000);
		    	int rnd3 = (int)(rnd.nextFloat()*1000);
		    	int rnd4 = (int)(rnd.nextFloat()*1000);
		    	
		    	animationLine1.setStartOffset(rnd1+3);
		    	animationLine2.setStartOffset(rnd2+2);
		    	animationLine3.setStartOffset(rnd3+4);
		    	animationLine4.setStartOffset(rnd4+1);
		    	
		    	Animation.AnimationListener listener1 = getAnimationListener(
						animationLine1, img1, rnd, animationLine1, 0);
		    	Animation.AnimationListener listener2 = getAnimationListener(
						animationLine2, img2, rnd, animationLine2, 1);
		    	Animation.AnimationListener listener3 = getAnimationListener(
						animationLine3, img3, rnd, animationLine3, 2);
		    	Animation.AnimationListener listener4 = getAnimationListener(
						animationLine4, img4, rnd, animationLine4, 3);
		    	
		    	animationLine1.setAnimationListener(listener1);
		    	animationLine2.setAnimationListener(listener2);
		    	animationLine3.setAnimationListener(listener3);
		    	animationLine4.setAnimationListener(listener4);
		    }

			private Animation.AnimationListener getAnimationListener(
					final Animation animationLine1, final ImageView firstImage,
					final Random rnd, final Animation anim, final int startTimeIndex) {
				Animation.AnimationListener listener = new Animation.AnimationListener(){
		    	    @Override
		    	    public void onAnimationStart(Animation arg0) {
		    	    	startTime[startTimeIndex] = System.currentTimeMillis() + anim.getStartOffset();
		    	    }           
		    	    @Override
		    	    public void onAnimationRepeat(Animation arg0) {
		    	    }           
		    	    @Override
		    	    public void onAnimationEnd(Animation arg0) {
//		    	    	counter++;
//		    	    	
//		    	    	TextView tv = (TextView) findViewById(R.id.textView2);
//		    	    	tv.setText(lblScoreOffset + Integer.toString(counter));
		    	    	
		    	    	if(counter < iterations) {
					    	firstImage.startAnimation(anim);
					    	startTime[startTimeIndex] = System.currentTimeMillis() + anim.getStartOffset();
		    	    	}
		    	    }
		    	};
		    	
				return listener;
			}

			private ImageView setImageView(final Animation animationFalling,
					RelativeLayout.LayoutParams layoutParameters, int rlLine,
					int icon, int startTimeIndex) {
				final ImageView vi = new ImageView(app);
		    	vi.setImageResource(icon);
		    	RelativeLayout rl = (RelativeLayout) findViewById(rlLine);
		    	rl.addView(vi,1,layoutParameters);
		    	vi.startAnimation(animationFalling);
		    	startTime[startTimeIndex] = System.currentTimeMillis();
				return vi;
			}

			private RelativeLayout.LayoutParams setLayoutParams() {
				RelativeLayout.LayoutParams layoutParameters = new RelativeLayout.LayoutParams(
	    			LayoutParams.WRAP_CONTENT,
	    		    LayoutParams.WRAP_CONTENT
		    	);
		    	
		    	layoutParameters.setMargins(0, -150, 0, 0);
		    	layoutParameters.addRule(RelativeLayout.ALIGN_LEFT);
		    	layoutParameters.addRule(RelativeLayout.ALIGN_LEFT);
				return layoutParameters;
			}
        });
    }
}