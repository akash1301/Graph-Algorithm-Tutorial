package com.example.graphalgorithmtutorial;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class BFS extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bfs);
		Toast.makeText(BFS.this, "Press the graph to start", Toast.LENGTH_LONG).show();
		
		final ImageView iv=(ImageView) findViewById(R.id.imageViewbfs);
		iv.setBackgroundResource(R.animator.bfs_anim);
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
