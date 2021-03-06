package skcc.fresh.backup;

import java.util.ArrayList;

import skccc.fresh.honeypot.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Backup1Activity extends Activity {

	private ArrayList<BackupListView> Array_Data;
	private BackupListView data;
	private BackupListViewAdapter adapter;
	
	View.OnClickListener bHandler = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			switch(v.getId()) {
			case R.id.btn_prev_backup1 :
				finish();
				break;
			case R.id.bnt_next_backup1 :
				Intent intent = new Intent(getBaseContext(),	Backup2Activity.class);
				startActivity(intent);
				break;
			}
		}
	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_backup1);
		
		findViewById(R.id.btn_prev_backup1).setOnClickListener(bHandler);
		findViewById(R.id.bnt_next_backup1).setOnClickListener(bHandler);

		execute();
	}

	public void execute() {
		Array_Data = new ArrayList<BackupListView>();

		data = new BackupListView(R.drawable.ic_launcher, "양하나", "바보");
		Array_Data.add(data);
		data = new BackupListView(R.drawable.ic_launcher, "이경수", "바보");
		Array_Data.add(data);
		data = new BackupListView(R.drawable.ic_launcher, "정헌균", "바보");
		Array_Data.add(data);
		data = new BackupListView(R.drawable.ic_launcher, "포리", "바보");
		Array_Data.add(data);

		data = new BackupListView(R.drawable.ic_launcher, "양하나", "바보");
		Array_Data.add(data);
		data = new BackupListView(R.drawable.ic_launcher, "이경수", "바보");
		Array_Data.add(data);
		data = new BackupListView(R.drawable.ic_launcher, "정헌균", "바보");
		Array_Data.add(data);
		data = new BackupListView(R.drawable.ic_launcher, "포리", "바보");
		Array_Data.add(data);

		data = new BackupListView(R.drawable.ic_launcher, "양하나", "바보");
		Array_Data.add(data);
		data = new BackupListView(R.drawable.ic_launcher, "이경수", "바보");
		Array_Data.add(data);
		data = new BackupListView(R.drawable.ic_launcher, "정헌균", "바보");
		Array_Data.add(data);
		data = new BackupListView(R.drawable.ic_launcher, "포리", "바보");
		Array_Data.add(data);

		ListView list = (ListView) findViewById(R.id.backup_list);
		adapter = new BackupListViewAdapter(this,
				android.R.layout.simple_list_item_1, Array_Data);
		list.setAdapter(adapter);
	}
}
