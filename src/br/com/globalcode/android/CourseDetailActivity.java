package br.com.globalcode.android;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

public class CourseDetailActivity extends FragmentActivity {

	private static final String TEXT_VIEW_COURSE_DETAIL_VALUE = "text_view_course_detail_value";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
			finish();
			return;
		}

		setContentView(R.layout.course_detail_activity);

		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			String s = extras.getString("value");
			TextView view = (TextView) findViewById(R.id.textViewCourseDetail);
			view.setText(s);
		}
		
		repairSavedInstanceStateValues(savedInstanceState);
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		
		outState.putCharSequence(TEXT_VIEW_COURSE_DETAIL_VALUE, ((TextView) findViewById(R.id.textViewCourseDetail)).getText());
	}

	private void repairSavedInstanceStateValues(Bundle savedInstanceState) {

		if (savedInstanceState != null) {
			
			((TextView) findViewById(R.id.textViewCourseDetail))
					.setText(savedInstanceState
							.getCharSequence(TEXT_VIEW_COURSE_DETAIL_VALUE));
		}
	}

}
