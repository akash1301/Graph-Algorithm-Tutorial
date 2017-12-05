package com.example.graphalgorithmtutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BFS_list extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bfs_list);
		
		makeList();
		listClick();
		
	}
	
	public void makeList(){
		
		String [] mes={"Explanation","Visualization"};
		ArrayAdapter<String> adap=new ArrayAdapter<String>(this,  R.layout.list_item_bfs,mes);
		ListView list=(ListView) findViewById(R.id.listView2);
		list.setAdapter(adap);
	}
	
	public void listClick(){
		
		ListView list=(ListView) findViewById(R.id.listView2);
		
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				if(position==1){
					Intent it=new Intent(BFS_list.this,BFS.class);
					startActivity(it);
				}
				else{
					Intent it=new Intent(BFS_list.this,BFS_expln.class);
					startActivity(it);
				}
				
				
				
			}
			
		});
	}
	
	

}
