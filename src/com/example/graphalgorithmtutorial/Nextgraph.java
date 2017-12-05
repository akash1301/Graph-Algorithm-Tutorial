package com.example.graphalgorithmtutorial;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Nextgraph extends Activity {
	
	
	int graph[][],dis[][],nod,vis[],flag;
	
	Button cycle,tree,sh;
	EditText shortpath;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nextgraph);
		
		String n=getIntent().getExtras().getString("node");
		String e=getIntent().getExtras().getString("edge");
		String d=getIntent().getExtras().getString("des");
		nod=Integer.parseInt(n);
		int ed=Integer.parseInt(e);
		graph=new int[nod+10][nod+10];
		dis=new int[nod+10][nod+10];
		for(int i=0;i<=nod;i++){
			for(int j=0;j<=nod;j++){
				graph[i][j]=0;
				if(i==j)
					dis[i][j]=0;
				else
					dis[i][j]=10000005;
			}
		}
		
		String []ele= d.split(" ");
		int cnt=0;
		for(int i=0;i<ed;i++){
			int p=Integer.parseInt(ele[cnt++]);
			int q=Integer.parseInt(ele[cnt++]);
			int w=Integer.parseInt(ele[cnt++]);
			graph[p][q]=1;
			dis[p][q]=w;
		}
		
		vis=new int[nod+10];
		for(int i=1;i<=nod;i++){
			vis[i]=0;
		}
		flag=0;
		
		for(int i=1;i<=nod;i++){
			if(vis[i]==0)
			dfs(i);
		}
		shortestPath();
		cycle=(Button)findViewById(R.id.butcycle);
		tree=(Button)findViewById(R.id.buttree);
		sh=(Button)findViewById(R.id.butshow);
		shortpath=(EditText)findViewById(R.id.editTextgraph);
		cycle.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(flag==1){
				Toast.makeText(getApplicationContext(), "The Graph has Cycle", Toast.LENGTH_LONG).show();
				}
				else{
					Toast.makeText(getApplicationContext(), "The Graph has no Cycle", Toast.LENGTH_LONG).show();
				}				
				
			}
		});
		
		tree.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(flag==1){
					Toast.makeText(getApplicationContext(), "The Graph is not a Tree", Toast.LENGTH_LONG).show();
					}
					else{
						Toast.makeText(getApplicationContext(), "The Graph is a Tree", Toast.LENGTH_LONG).show();
					}
			}
		});
		
		sh.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String tmp=shortpath.getText().toString();
				String [] xx=tmp.split(" ");
				int src=Integer.parseInt(xx[0]);
				int des=Integer.parseInt(xx[1]);
				if(dis[src][des]==10000005){
					Toast.makeText(getApplicationContext(), "There is no Path between "+src+" and "+des, Toast.LENGTH_LONG).show();
				}
				else
				Toast.makeText(getApplicationContext(), "The Shortest path between "+src+" and "+des+" is "+dis[src][des], Toast.LENGTH_LONG).show();
			}
		});
		
		
			
		
	}
	
	public void dfs(int u){
		vis[u]=1;
		for(int i=1;i<=nod;i++){
			if(graph[u][i]==1){
				
				if(vis[i]==0){
					dfs(i);
				}
				else
					flag=1;
					
			}
			
		}
	}
	
	public void shortestPath(){
		for(int k=1;k<=nod;k++){
			for(int i=1;i<=nod;i++){
				for(int j=1;j<=nod;j++){
					if(dis[i][j]>(dis[i][k]+dis[k][j]))
						dis[i][j]=dis[i][k]+dis[k][j];
				}
			}
		}
	}
	
	

}
