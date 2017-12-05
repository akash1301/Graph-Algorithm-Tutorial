package com.example.graphalgorithmtutorial;


import android.app.Activity;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class DFS_expln extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dfs_expln);
		TextView prob =(TextView)findViewById(R.id.problem);
        prob.setPaintFlags(prob.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        TextView sol =(TextView)findViewById(R.id.solution);
        sol.setPaintFlags(sol.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        TextView algo =(TextView)findViewById(R.id.algo);
        algo.setPaintFlags(algo.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		
	}
	
	

}
