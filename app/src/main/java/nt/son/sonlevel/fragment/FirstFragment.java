package nt.son.sonlevel.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;

import nt.son.sonlevel.MsConst;
import nt.son.sonlevel.R;
import nt.son.sonlevel.base.BaseFragment;
import timber.log.Timber;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends BaseFragment implements View.OnClickListener {


    public static final int CODE_1 = 1001;
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


                requestPermissions((String[]) Arrays.asList(MsConst.PERMISSION_LOCATION).toArray(), CODE_1);

                break;
            }

            case R.id.first_btn2: {
                break;
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        Timber.d(">>>onRequestPermissionsResult:" );
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Timber.d(">>>onActivityResult:" );

    }
}
