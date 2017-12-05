package com.example.graphalgorithmtutorial;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AlgorithmList extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_algorithmlist);
		makeList();
		listClick();
		
	}
	
	public void makeList(){
		String[] mes={"Depth First Search","Breadth First Search","Floyd-Warshall","Basic Graph","About"};
		ArrayAdapter<String> adap=new ArrayAdapter<String>(this, R.layout.list_item, mes);
		ListView list=(ListView) findViewById(R.id.listView1);
		list.setAdapter(adap);
		
	}
	
	public void listClick(){
		ListView list=(ListView)findViewById(R.id.listView1);
		
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				if(position==0){
					Intent it=new Intent(AlgorithmList.this,DFS_list.class);
					startActivity(it);
					
				}
				else if(position==1)
				{
					Intent it=new Intent(AlgorithmList.this,BFS_list.class);
					startActivity(it);
					
				}
				else if(position==2)
				{
					Intent it=new Intent(AlgorithmList.this,Floyd_list.class);
					startActivity(it);
				}
				else if(position==3){
					Intent it=new Intent(AlgorithmList.this,GraphBasic.class);
					startActivity(it);
				}
				else if(position==4)
				{
					Intent it=new Intent(AlgorithmList.this,About.class);
					startActivity(it);
				}
					
				
			}
			
			
		});
		
	}
	
	@Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Exit Application?");
        alertDialogBuilder
                .setMessage("Click yes to exit!")
                .setCancelable(false)
                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                moveTaskToBack(true);
                                android.os.Process.killProcess(android.os.Process.myPid());
                                System.exit(1);
                            }
                        })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
	
	

}
