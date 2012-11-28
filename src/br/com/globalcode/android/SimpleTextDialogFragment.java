package br.com.globalcode.android;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SimpleTextDialogFragment extends DialogFragment {
	
	static SimpleTextDialogFragment newInstance() {
		return new SimpleTextDialogFragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.dialog_fragment, container, false);
		
		return view;
	}
	
}
