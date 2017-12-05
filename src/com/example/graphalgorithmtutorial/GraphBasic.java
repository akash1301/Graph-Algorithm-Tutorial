package com.example.graphalgorithmtutorial;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GraphBasic extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.graphbasic);
		final EditText node=(EditText)findViewById(R.id.nodetext);
        final EditText edge=(EditText)findViewById(R.id.edgetext);
        final EditText des=(EditText)findViewById(R.id.des);
        Button but=(Button)findViewById(R.id.continue_but);
        but.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it=new Intent(GraphBasic.this,Nextgraph.class);
				it.putExtra("node", node.getText().toString());
				it.putExtra("edge", edge.getText().toString());
				it.putExtra("des", des.getText().toString());
				startActivity(it);
			}
		});
	}
	
	

}
