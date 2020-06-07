package com.rafaelct.meudimdim;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import java.util.*;

import android.webkit.WebSettings.*;

public class MainActivity extends Activity
{

	WebView w;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
		Date dt = new Date();

		w = new WebView(this);
		w.getSettings().setJavaScriptEnabled(true);
		w.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

		w.getSettings().setPluginState( PluginState.ON);
		w.getSettings().setAllowFileAccess(true);
		w.getSettings().setAllowContentAccess(true);
		w.getSettings().setAllowFileAccessFromFileURLs(true);
		w.getSettings().setAllowUniversalAccessFromFileURLs(true);
		w.getSettings().setDomStorageEnabled(true);
		
		w.addJavascriptInterface( new WebAppInterface(this),"Android" );
		w.setWebViewClient( new WebViewClient());
		//w.setWebChromeClient( new WebChromeClient() );
		w.setWebViewClient( new MyAppWebclient() );

		w.loadUrl("file:///android_asset/www/index.html");
		//w.loadUrl("http://www.novadinapoli.com.br");
		setContentView(w);
    }

	@Override
	public void onBackPressed() {
		if (w.canGoBack()) {
			w.goBack();
		} else {
			this.finish();
		}
	}
}
