package nt.son.sonlevel.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nt.son.sonlevel.R;
import nt.son.sonlevel.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends BaseFragment implements View.OnClickListener {


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View inflate = inflater.inflate(R.layout.fragment_first, container, false);
        inflate.findViewById(R.id.first_btn1).setOnClickListener(this);
        inflate.findViewById(R.id.first_btn2).setOnClickListener(this);
        return inflate;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.first_btn1: {
                break;
            }

            case R.id.first_btn2: {
                break;
            }
        }
    }
}
