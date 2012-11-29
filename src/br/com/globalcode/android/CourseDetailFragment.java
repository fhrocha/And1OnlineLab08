package br.com.globalcode.android;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class CourseDetailFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		final View view = inflater.inflate(R.layout.course_detail_fragment,
				container, false);

		TextView textViewCourseDetail = (TextView) view
				.findViewById(R.id.textViewCourseDetail);

		textViewCourseDetail.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				showSimpleTextDialogFragment();
			}
		});

		return view;
	}

	private void showSimpleTextDialogFragment() {

		FragmentManager fM = getFragmentManager();
		FragmentTransaction transaction = fM.beginTransaction();
		Fragment target = fM.findFragmentById(R.id.courseDetailFragment);
		DialogFragment dF = SimpleTextDialogFragment.newInstance();
		dF.show(transaction, target.getTag());
	}

	public void setText(String texto) {
		TextView textoTextView = (TextView) getView().findViewById(
				R.id.textViewCourseDetail);
		textoTextView.setText(texto);
	}

}
