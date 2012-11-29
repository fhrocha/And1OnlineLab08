package br.com.globalcode.android;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class SimpleTextDialogFragment extends DialogFragment {
	
	static SimpleTextDialogFragment newInstance() {
		return new SimpleTextDialogFragment();
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setStyle(STYLE_NO_TITLE, getTheme());
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.dialog_fragment, container, false);
		
		((TextView)view.findViewById(R.id.dialogTitleTextView)).setText("Aviso");
		((TextView)view.findViewById(R.id.textViewDialog)).setText("It's only a simple dialog fragment");
		
		((Button)view.findViewById(R.id.cancelButton)).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dismiss();
			}
		});
		
		((Button)view.findViewById(R.id.okButton)).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dismiss();
			}
		});
		
		return view;
	}
	
}
