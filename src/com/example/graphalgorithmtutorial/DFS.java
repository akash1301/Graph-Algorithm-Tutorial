package com.example.graphalgorithmtutorial;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class DFS extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dfs);
		Toast.makeText(getApplicationContext(), "Press The Graph to Start", Toast.LENGTH_LONG).show();
		
		final ImageView iv=(ImageView)findViewById(R.id.imageViewdfs);
		
		iv.setBackgroundResource(R.animator.dfs_anim);
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
