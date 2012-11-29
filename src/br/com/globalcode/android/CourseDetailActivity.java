package br.com.globalcode.android;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

public class CourseDetailActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {

			finish();
		} else {

			setContentView(R.layout.course_detail_activity);
		
			Bundle extras = getIntent().getExtras();
			if (extras != null) {
				String s = extras.getString("value");
				((TextView) findViewById(R.id.textViewCourseDetail)).setText(s);
			}
		}
	}

}
