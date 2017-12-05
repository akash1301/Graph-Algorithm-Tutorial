package com.example.graphalgorithmtutorial;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class StartupActivity extends Activity {
	
	Thread timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        
        timer=new Thread(){
        	
        	public void run(){
        		
        		try{
        		
        			sleep(3000);
        		}
        		catch(InterruptedException ie){
        		
        			ie.printStackTrace();
        		}
        		finally
        		{
        			Intent it=new Intent(StartupActivity.this,AlgorithmList.class);
        			startActivity(it);
        			finish();
        		}
        	}
        };
        
        timer.start();
        
    }

    
    
    
}

  

