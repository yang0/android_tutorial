package com.example.myfirstapp;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AlbumFragment extends Fragment{
	
	CharSequence mLabel;

    /**
     * Create a new instance of MyFragment that will be initialized
     * with the given arguments.
     */
    static AlbumFragment newInstance(CharSequence label) {
    	AlbumFragment f = new AlbumFragment();
        Bundle b = new Bundle();
        b.putCharSequence("label", label);
        f.setArguments(b);
        return f;
    }

    /**
     * Parse attributes during inflation from a view hierarchy into the
     * arguments we handle.
     */
    @Override public void onInflate(Activity activity, AttributeSet attrs,
            Bundle savedInstanceState) {
        super.onInflate(activity, attrs, savedInstanceState);
/*
        TypedArray a = activity.obtainStyledAttributes(attrs,
                R.styleable.FragmentArguments);
        mLabel = a.getText(R.styleable.FragmentArguments_android_label);
        a.recycle();*/
    }

    /**
     * During creation, if arguments have been supplied to the fragment
     * then parse those out.
     */
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    /**
     * Create the view for this fragment, using the arguments given to it.
     */
    
    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	
        View v = inflater.inflate(R.layout.activity_display_message, container, false);/*
        View tv = v.findViewById(R.id.text);
        ((TextView)tv).setText(mLabel != null ? mLabel : "(no label)");
        tv.setBackgroundDrawable(getResources().getDrawable(android.R.drawable.gallery_thumb));*/
        return v;
    }

}
