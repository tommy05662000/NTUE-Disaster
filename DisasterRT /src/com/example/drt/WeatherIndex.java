package com.example.drt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;

public class WeatherIndex extends FragmentActivity {
     TabHost mTabHost;
     tabmanager mTabManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.weather);
        mTabHost = (TabHost)findViewById(android.R.id.tabhost);
        mTabHost.setup();
        
        mTabManager = new tabmanager(this, mTabHost, R.id.realtabcontent);
        
        mTabHost.setCurrentTab(0);
        mTabManager.addTab(mTabHost.newTabSpec("累積雨量").setIndicator(
        		"累積雨量"),
        		Fragment1.class, null);
        mTabManager.addTab(mTabHost.newTabSpec("衛星雲圖").setIndicator(
        		"衛星雲圖"),
        		Fragment2.class, null);
        mTabManager.addTab(mTabHost.newTabSpec("降水預報").setIndicator(
        		"降水預報"),
        		Fragment3.class, null);
        mTabManager.addTab(mTabHost.newTabSpec("雷達回波").setIndicator(
        		"雷達回波"),
        		Fragment4.class, null);
      
		   
        DisplayMetrics dm = new DisplayMetrics();   
        getWindowManager().getDefaultDisplay().getMetrics(dm); //������������������������  
        int screenWidth = dm.widthPixels;   //������������������
           
           
        TabWidget tabWidget = mTabHost.getTabWidget();   //������tab���������
        int count = tabWidget.getChildCount();   //������tab������������������
        if (count >= 4) {   //������������������������������������
            for (int i = 0; i < count; i++) {   
                tabWidget.getChildTabViewAt(i).setMinimumWidth((screenWidth) / 4);//������������������������������������   
            }   
        }

        
    //    setupTab(Fragment1.class, R.string.limit, R.string.googlemap, count);  
        
    }
   
}
