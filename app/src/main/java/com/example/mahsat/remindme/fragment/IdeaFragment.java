package com.example.mahsat.remindme.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mahsat.remindme.R;

public class IdeaFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.example_layout;

    public static IdeaFragment getInstance(Context context){
        Bundle args = new Bundle();
        IdeaFragment fragment = new IdeaFragment();
        fragment.setArguments(args);

        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_idea));

        return fragment;
    }


    public void setContext(Context context) {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(LAYOUT, container, false);

        return view;
    }
}
