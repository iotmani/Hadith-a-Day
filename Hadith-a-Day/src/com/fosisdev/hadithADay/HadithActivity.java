package com.fosisdev.hadithADay;

import com.fosisdev.hadithADay.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import winterwell.jtwitter.Twitter;

public class HadithActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("io107", "MyHelloWorld launched!");
        //Set content view before attempting to get TextView
        setContentView(R.layout.main);
        
        Twitter twt = new Twitter();
        String str = twt.getStatus(this.getString(R.string.Tweeter)).toString();

        TextView tv =  (TextView) findViewById(R.id.txtTop);
        tv.setText(str);
    }
}