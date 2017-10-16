package com.example.housie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.os.Bundle;
import android.view.animation.Animation;


public class GridviewActivity extends Activity {
static int k=0;
static List<Integer> hs1 = new ArrayList<Integer>(90);

	public void onCreate(Bundle savedInstanceState) {
		int flag= getIntent().getIntExtra("flag1",0);
		setTitle("Housie");
		if(flag==1)
		{
			hs1.clear();
		}
		super.onCreate(savedInstanceState);
		 getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#87ceeb")));

		setContentView(R.layout.demo);
		

			int c= getIntent().getIntExtra("c",0);
			GridView g=(GridView)findViewById(R.id.gridView1);
		
		
		
		ArrayList<Integer> hs = getIntent().getIntegerArrayListExtra("hs");
		
		/*TextView resp01 = (TextView) this.findViewById(R.id.textViewdemo);
		int cc = hs.size();
		resp01.setText("size = "+cc);
		TextView resp001 = (TextView) this.findViewById(R.id.textViewdemo1);
		
		resp001.setText("size = "+c);
		for(int j=0;j<90;j++){
			hm.put(j, 1);
		}
		
		for(int i=1;i<=c;i++)
		{
			hm.put(hs.get(i), hs.get(i));
		}
		List<Integer> hs1 = new ArrayList<Integer>(hm.values());
		ArrayAdapter<Integer>arr=new ArrayAdapter<Integer>(this,android.R.layout.simple_list_item_1,hs1);
		g.setAdapter(arr);
	}*/
		for(int j=1;j<=90;j++){
			hs1.add(0);
		}
		
		for(int i=k;i<c;i++)
		{
			
			hs1.set(hs.get(i)-1,hs.get(i));
			
			
			k++;
			
		}
		
		ArrayAdapter<Integer>arr=new ArrayAdapter<Integer>(this,android.R.layout.simple_list_item_1,hs1);
		g.setAdapter(arr);
	

	

	


	


		
	}
	
}

