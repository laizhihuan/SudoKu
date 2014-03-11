package com.example.sudoku;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class SudoKu extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		//Set up click listener for all the buttons
		View continueButton = findViewById(R.id.continue_button);
		continueButton.setOnClickListener(this);
		
		View newGameButton = findViewById(R.id.new_button);
		newGameButton.setOnClickListener(this);
		
		View aboutButton = findViewById(R.id.about_button);
		aboutButton.setOnClickListener(this);
		
		View exitButton = findViewById(R.id.exit_button);
		exitButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()) {
		case R.id.action_settings:
			Intent intent = new Intent(this,Prefs.class);
			startActivity(intent);
			return true;
		}
		return false;
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.about_button:
			Intent intent = new Intent(this,About.class);
			startActivity(intent);
			break;
		}
	}
	
	
}
