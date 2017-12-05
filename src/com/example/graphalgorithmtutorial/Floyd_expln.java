package com.example.graphalgorithmtutorial;

import android.app.Activity;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class Floyd_expln extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.floyd_expln);
		TextView prob =(TextView)findViewById(R.id.floyd_algo);
        prob.setPaintFlags(prob.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
	}
	
	

}
