package com.example.graphalgorithmtutorial;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class Floyd_1 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_floyd_1);
		
		Toast.makeText(Floyd_1.this, "Press the graph to start", Toast.LENGTH_LONG).show();
		
		final ImageView iv=(ImageView) findViewById(R.id.imageViewfloyd1);
		iv.setBackgroundResource(R.animator.floyd_anim_1);
		iv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AnimationDrawable anim=(AnimationDrawable) iv.getBackground();
				anim.start();
				
			}
		});
		
	}
	
	

}
