package uk.co.bimrose.android.extras;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Other extends Activity {
	
	public static final String EXTRA_MESSAGE = "msg";
	
	@Override
	public void onCreate(Bundle b){
		super.onCreate(b);
		setContentView(R.layout.other);
		
		TextView tv = (TextView)findViewById(R.id.msg);
		
		tv.setText(getIntent().getStringExtra(EXTRA_MESSAGE));
	}
	
}