//package com.example.cointoss;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//public class MyAdapter extends ArrayAdapter<String> {
//	
//	public int arr_images[] = {R.drawable.quarter,
//			R.drawable.elliot,
//			R.drawable.elliot,
//			R.drawable.elliot};
//	
//		 public MyAdapter(Context context, int textViewResourceId,   String[] objects) {
//	         super(context, textViewResourceId, objects);
//	     }
//		 @Override
//	        public View getDropDownView(int position, View convertView,ViewGroup parent) {
//	            return getCustomView(position, convertView, parent);
//	        }
//	 
//	        @Override
//	        public View getView(int position, View convertView, ViewGroup parent) {
//	            return getCustomView(position, convertView, parent);
//	        }
//	 
//	        public View getCustomView(int position, View convertView, ViewGroup parent) {
//	 
//	            LayoutInflater inflater=getLayoutInflater();
//	            View row=inflater.inflate(R.layout.row, parent, false);
//	            TextView label=(TextView)row.findViewById(R.id.company);
//	            label.setText(MainScreen.stringSelect[position]);
//	 
//	            TextView sub=(TextView)row.findViewById(R.id.sub);
//	            sub.setText(MainScreen.stringSelectDescription[position]);
//	 
//	            ImageView icon=(ImageView)row.findViewById(R.id.image);
//	            icon.setImageResource(arr_images[position]);
//	 
//	            return row;
//	            }
//	        
////			private LayoutInflater getLayoutInflater() {
////				// TODO Auto-generated method stub
////				return null;
////			}
//	        
//	
//}
