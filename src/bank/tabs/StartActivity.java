package bank.tabs;

import bank.general.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


		setContentView(R.layout.startscreen);
	
		

	}
	public void LaunchProjectScreen(View v){
		Intent intent = new Intent().setClass(this, tabs.projecttabs.Projectscreen_Tabs.class);
		startActivity(intent);
	}
}