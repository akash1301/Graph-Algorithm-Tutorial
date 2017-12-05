package com.example.graphalgorithmtutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Floyd_list extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.floyd_list);
		makeList();
		listClick();
		
	}
	
	
public void makeList(){
		
		String [] mes={"Explanation","Visualization"};
		ArrayAdapter<String> adap=new ArrayAdapter<String>(this,  R.layout.list_item_floyd,mes);
		ListView list=(ListView) findViewById(R.id.listViewfloyd);
		list.setAdapter(adap);
	}
	
	public void listClick(){
		
		ListView list=(ListView) findViewById(R.id.listViewfloyd);
		
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				if(position==0){
					Intent it=new Intent(Floyd_list.this,Floyd_expln.class);
					startActivity(it);
				}
				else if(position==1){
					Intent it=new Intent(Floyd_list.this,Floyd_1.class);
					startActivity(it);
				}
				
				
				
			}
			
		});
	}
	
	

}
