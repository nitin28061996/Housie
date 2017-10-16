package com.example.housie;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;

public class Main1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#87ceeb")));

		setContentView(R.layout.activity_main1);
		Bundle bundle=getIntent().getExtras();
		String disp=bundle.getString("disp");
		TextView displ=(TextView)findViewById(R.id.check1);
		displ.setText(disp);
	setTitle("Housie");
	}
}
