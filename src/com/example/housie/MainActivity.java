package com.example.housie;

import android.view.View;
import android.view.View.OnClickListener;

import android.annotation.SuppressLint;
import android.app.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import android.widget.Button;
import android.widget.*;
import java.util.*;

public class MainActivity extends Activity implements OnClickListener {
	static List<Integer> hs = new ArrayList<Integer>();
	int flag = 1;
	int flag1=0;
	int col;
	static String disp = " ";
	String disp1 = " ";
	int i = 0;
	static int c = 0;
	int b[] = new int[90];
	int r = b.length;
	static int cc = 0;
	int k = 0;
	static int b1[] = new int[90];
	static int io = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#87ceeb")));

		setContentView(R.layout.activity_maino);
		// c=0;
		while (hs.size() < 90) {
			generate();

		}
		Button b = (Button) this.findViewById(R.id.button1);
		b.setOnClickListener(this);
		Button b1 = (Button) this.findViewById(R.id.button2);
		b1.setOnClickListener(this);
		Button b2 = (Button) this.findViewById(R.id.but1);
		b2.setOnClickListener(this);
		

	}

	public void onClick(View v) {
		if (v.getId() == R.id.button1) {
			display();
		} else if (v.getId() == R.id.button2) {
			Intent Intent12 = new Intent(getApplicationContext(), GridviewActivity.class);
			Intent12.putIntegerArrayListExtra("hs", (ArrayList<Integer>) hs);
			Intent12.putExtra("c", c);
			Intent12.putExtra("flag1", flag1);
			startActivity(Intent12);
		} 
			

			

			
		 else if (v.getId() == R.id.but1) {
			c = 0;
			TextView resp = (TextView) this.findViewById(R.id.textView3);
			resp.setText(" ");
			TextView resp2 = (TextView) this.findViewById(R.id.textView6);

			resp2.setText(Integer.toString(c));
			disp = " ";
			hs.clear();
			i = 0;
			onCreate(null);
			flag1=1;
			
		}
	}

	@SuppressLint("UseValueOf")
	static void generate() {
		// System.out.println("Entered in generate display");
		int flag = 0;
		Random r = new Random();
		int x = r.nextInt(90) + 1;
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			if ((int) (Integer) it.next() == x) {
				flag++;
			}
		}
		if (flag == 0) {
			hs.add(new Integer(x));

		}
		return;

	}

	public void display() {

		try {

			int r = hs.get(c);

			c++;

			TextView resp2 = (TextView) this.findViewById(R.id.textView6);

			resp2.setText(Integer.toString(c));
			TextView resp = (TextView) this.findViewById(R.id.textView3);
			resp.setText(Integer.toString(r));

			display1(r);

			b1[io++] = r;

		} catch (Exception e) {
			c = 0;
			TextView resp = (TextView) this.findViewById(R.id.textView3);
			resp.setText(" ");
			TextView resp2 = (TextView) this.findViewById(R.id.textView6);

			resp2.setText(Integer.toString(c));

			disp = " ";
			hs.clear();
			i = 0;
			onCreate(null);
			Intent Intent4 = new Intent(MainActivity.this, Pop.class);

			startActivity(Intent4);

		}
	}

	public void display1(int a) {

		disp = disp + " " + a;

	}
}