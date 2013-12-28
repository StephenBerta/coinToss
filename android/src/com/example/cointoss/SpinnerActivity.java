package com.example.cointoss;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class SpinnerActivity extends Activity implements OnItemSelectedListener {

	public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {
		Toast.makeText(parent.getContext(), 
			"Current Flip Selection : " + parent.getItemAtPosition(pos).toString(),
			Toast.LENGTH_SHORT).show();
		
	  }
	 
	  @Override
	  public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
	  }

}
