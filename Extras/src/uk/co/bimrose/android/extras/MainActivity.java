package uk.co.bimrose.android.extras;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void showOther(View v){
		Intent other = new Intent(this, Other.class);
		
		other.putExtra(Other.EXTRA_MESSAGE, getString(R.string.other));
		startActivity(other);
	}
	
}
