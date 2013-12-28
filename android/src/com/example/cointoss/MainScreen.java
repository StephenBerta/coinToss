package com.example.cointoss;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainScreen extends Activity {

	public Spinner tossSelectionSpinner;
	public static String[] stringSelect = {"Quarter", "Elliot", "Jimmy", "Centaur"};
	public static String[] stringSelectDescription = {"Ole fashion Americana" , "aka dingleberry", "super dingleberry", "a domesticated centaur"};
	public int arr_images[] = {R.drawable.quarter,
			R.drawable.elliot,
			R.drawable.elliot,
			R.drawable.centaur};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_screen);
		
		Spinner tossSelectionSpinner = (Spinner)findViewById(R.id.tossSelectionSpinner);
		tossSelectionSpinner.setAdapter(new MyAdapter(MainScreen.this, R.layout.row, stringSelect));
		tossSelectionSpinner.setOnItemSelectedListener(new SpinnerActivity());

	}
	
	//class to handle spinner display
	public class MyAdapter extends ArrayAdapter<String> {
		 public MyAdapter(Context context, int textViewResourceId,   String[] objects) {
		         super(context, textViewResourceId, objects);
		     }
			 @Override
		        public View getDropDownView(int position, View convertView,ViewGroup parent) {
		            return getCustomView(position, convertView, parent);
		        }
		 
		        @Override
		        public View getView(int position, View convertView, ViewGroup parent) {
		            return getCustomView(position, convertView, parent);
		        }
		 
		        public View getCustomView(int position, View convertView, ViewGroup parent) {
		 
		            LayoutInflater inflater=getLayoutInflater();
		            View row=inflater.inflate(R.layout.row, parent, false);
		            TextView label=(TextView)row.findViewById(R.id.company);
		            label.setText(stringSelect[position]);
		 
		            TextView sub=(TextView)row.findViewById(R.id.sub);
		            sub.setText(stringSelectDescription[position]);
		 
		            ImageView icon=(ImageView)row.findViewById(R.id.image);
		            icon.setImageResource(arr_images[position]);
		 
		            return row;
		            }
	}
}


	        

	        
	



//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main_screen, menu);
//		return true;
//	}
//	
//	 
// 
// public void addItemsOntossSelectionSpinner() {
//          
//         tossSelectionSpinner = (Spinner) findViewById(R.id.tossSelectionSpinner);
//         ArrayAdapter<CharSequence> dataAdapter = ArrayAdapter.createFromResource(this, R.array.spinnerArraySelection, android.R.layout.simple_spinner_dropdown_item);
//         dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//         tossSelectionSpinner.setAdapter(dataAdapter);
//   }
 
// public void addListenerOnSpinnerItemSelection() {
//         
//         tossSelectionSpinner.setOnItemSelectedListener(new SpinnerActivity());
//   }
//}
 
//  public void addListenerOnButton() {
          
//                 tossSelectionSpinner = (Spinner) findViewById(R.id.tossSelectionSpinner);
          
//                 tossSelectionSpinner.setOnClickListener(new OnClickListener() {
//                         
//                   @Override
//                   public void onClick(View v) {
//                           
//                     Toast.makeText(MainScreen.this,
//                         "OnClickListener : " + 
//                         "\nDifficulty : " + String.valueOf(tossSelectionSpinner.getSelectedItem()), Toast.LENGTH_SHORT).show();
//                   }
//          
//                 });
//  }
//

