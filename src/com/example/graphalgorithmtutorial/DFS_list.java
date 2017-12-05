package com.example.graphalgorithmtutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DFS_list extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dfs_list);
	    makeList();
	    listClick();
		
	}
	
	public void makeList(){
		String[] mes={"Explanation","Visualization"};
		ArrayAdapter<String> adap=new ArrayAdapter<String>(this, R.layout.list_item_dfs, mes);
		ListView list=(ListView) findViewById(R.id.listView1);
		list.setAdapter(adap);
		
	}
	
	public void listClick(){
		ListView list=(ListView)findViewById(R.id.listView1);
		
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				if(position==1){
					Intent it=new Intent(DFS_list.this,DFS.class);
					startActivity(it);					
				}
					
				else if(position==0){
					Intent it =new Intent(DFS_list.this,DFS_expln.class);
					startActivity(it);
				}
			}
			
			
		});
		
	}
	
	

}
