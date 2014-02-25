package com.example.drt;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class Fragment1 extends Fragment {
	
	    
		final String mimetype = "text/html";
	    final String encoding = "utf-8";
	    WebView myBrowser;
		View v;
		@Override
		public void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			v = inflater.inflate(R.layout.webview, container, false);         
			myBrowser = (WebView)v.findViewById(R.id.webView1);
	        WebSettings websettings = myBrowser.getSettings();  
	        websettings.setSupportZoom(true);  
	        websettings.setBuiltInZoomControls(true);   
	        websettings.setJavaScriptEnabled(true);  
	        
	        myBrowser.setBackgroundColor(Color.parseColor("#000000"));   
	        myBrowser.setWebViewClient(new WebViewClient());  
	        myBrowser.loadData("<img src=\"http://www.cwb.gov.tw/V7/observe/rainfall/Data/hk.jpg\" />", mimetype, encoding);
		
	        return v;
		}
	
		
	}
