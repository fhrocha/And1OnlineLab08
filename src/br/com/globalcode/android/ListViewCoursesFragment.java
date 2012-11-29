package br.com.globalcode.android;

import android.support.v4.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewCoursesFragment extends ListFragment {

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		String[] values = new String[] { "Academia Agile", "Academia do Programador", "Academia Android", "Academia Java",
				"Academia Web", "Academia do Arquiteto", "Academia Python", "Academia Scala" };

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, values);
		setListAdapter(adapter);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {

		super.onListItemClick(l, v, position, id);
		
		CourseDetailFragment detailFragment = (CourseDetailFragment) getFragmentManager()
				.findFragmentById(R.id.courseDetailFragment);
		
		String item = (String) getListAdapter().getItem(position);
		if(detailFragment != null && detailFragment.isInLayout()) {

			detailFragment.setText(item);
		} else {
			
			Intent intent = new Intent(getActivity(), CourseDetailActivity.class);
			intent.putExtra("value", item);
			startActivity(intent);
		}
	}
}
