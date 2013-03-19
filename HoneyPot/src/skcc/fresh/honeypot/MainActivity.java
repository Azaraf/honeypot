package skcc.fresh.honeypot;

import skcc.fresh.backup.Backup1Activity;
import skccc.fresh.honeypot.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	View.OnClickListener bHandler = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btn_backup:
				Intent intent = new Intent(getBaseContext(),
						Backup1Activity.class);
				startActivity(intent);
			}
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		startActivity(new Intent(this, IntroActivity.class));

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btn_backup = (Button) findViewById(R.id.btn_backup);
		btn_backup.setOnClickListener(bHandler);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
