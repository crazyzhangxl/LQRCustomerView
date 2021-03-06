package com.lqr.customerview.ui.practice6;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PracticeDrawFragment6 extends Fragment {

    private int mLayoutRes;

    public static PracticeDrawFragment6 newInstance(int layoutRes) {
        PracticeDrawFragment6 fragment = new PracticeDrawFragment6();
        Bundle bundle = new Bundle();
        bundle.putInt("layoutRes", layoutRes);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            mLayoutRes = args.getInt("layoutRes");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(mLayoutRes, container, false);
        return view;
    }
}
