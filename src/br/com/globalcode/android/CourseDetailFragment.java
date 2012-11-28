package br.com.globalcode.android;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CourseDetailFragment extends Fragment {
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		final View view = inflater.inflate(R.layout.course_detail_fragment, container, false);
		
		TextView textViewCourseDetail = (TextView) view.findViewById(R.id.textViewCourseDetail);
		
		textViewCourseDetail.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				showSimpleTextDialogFragment();
			}
		});
		
		return view;
	}
	
	private void showSimpleTextDialogFragment() {
		
		FragmentManager fragmentManager = getFragmentManager();
		SimpleTextDialogFragment dialog = SimpleTextDialogFragment.newInstance();
		dialog.show(fragmentManager, "simple_text_dialog_fragment");
	}
	
}
