package skcc.fresh.backup;

import skccc.fresh.honeypot.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Backup2Activity extends Activity {
	Intent intent = null;

	View.OnClickListener bHandler = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btn_prev_backup2:
				finish();
				break;
			case R.id.bnt_next_backup2:
				intent = new Intent(getBaseContext(),
						Backup3Activity.class);
				startActivity(intent);
				break;
			case R.id.btn_googleDrive:
				intent = new Intent(getBaseContext(),
						Backup3Activity.class);
				startActivity(intent);
				break;
			case R.id.btn_naverNDrive:
				break;
			case R.id.btn_googleGMail:
				break;
			case R.id.btn_tCloud:
				break;
			}
		}
	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_backup2);

		findViewById(R.id.btn_prev_backup2).setOnClickListener(bHandler);
		findViewById(R.id.bnt_next_backup2).setOnClickListener(bHandler);

		findViewById(R.id.btn_googleDrive).setOnClickListener(bHandler);
		findViewById(R.id.btn_naverNDrive).setOnClickListener(bHandler);
		findViewById(R.id.btn_googleGMail).setOnClickListener(bHandler);
		findViewById(R.id.btn_tCloud).setOnClickListener(bHandler);

	}

}
