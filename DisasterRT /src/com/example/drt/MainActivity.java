package com.example.drt;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity implements View.OnClickListener{
    
	ImageButton but1,but2,but3,but4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		but1 = (ImageButton)findViewById(R.id.imageButton1);
		but1.setOnClickListener(this);
		but2 = (ImageButton)findViewById(R.id.imageButton2);
		but2.setOnClickListener(this);
		but3 = (ImageButton)findViewById(R.id.imageButton3);
		but3.setOnClickListener(this);
		but4 = (ImageButton)findViewById(R.id.imageButton4);
		but4.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent nextPage = new Intent();
		if(v == but1)	
		{	nextPage.setClass(MainActivity.this, WeatherIndex.class);
			startActivity(nextPage);
			MainActivity.this.finish();
		}	
	}

}
