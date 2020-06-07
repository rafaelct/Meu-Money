package com.rafaelct.meudimdim;

	import android.content.*;
	import android.net.*;
	import android.webkit.*;

	public class MyAppWebclient extends WebViewClient
	{

		@Override 
		public boolean shouldOverrideUrlLoading(WebView view, String url) { 

			/*
			 if(Uri.parse(url).getHost().endsWith("html5rocks.com")) { 

			 return false;

			 }   
			 */

			/*
			 Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url)); 
			 view.getContext().startActivity(intent); 
			 */
			return false; 
		} 

	
}
