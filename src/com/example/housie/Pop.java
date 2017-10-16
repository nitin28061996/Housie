package com.example.housie;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.util.DisplayMetrics;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Pop extends Activity implements  OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 getActionBar().hide();
		 
		setContentView(R.layout.activity_main12);
		Button b = (Button) this.findViewById(R.id.button1);
		b.setOnClickListener(this);
        DisplayMetrics dm=new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		int width=dm.widthPixels;
		int height=dm.heightPixels;
		getWindow().setLayout((int)(width*0.8), (int)(height*0.6));
		
		
	}

	@Override
	public void onClick(View v) {
		  Intent i=new Intent(this, MainActivity.class);
	        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	        startActivity(i);
		
	}
	
}
