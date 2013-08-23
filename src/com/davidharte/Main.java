package com.davidharte;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import com.google.android.gms.maps.MapFragment;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		MapFragment mf = MapFragment.newInstance();
		mf.getMap();
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
