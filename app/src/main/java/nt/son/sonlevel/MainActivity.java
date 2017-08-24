package nt.son.sonlevel;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;

import nt.son.sonlevel.base.BaseActivity;
import nt.son.sonlevel.fragment.FirstFragment;
import nt.son.sonlevel.fragment.SecondFragment;
import timber.log.Timber;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Timber.d(">>>" + "onCreate");
        setContentView(R.layout.activity_main);

        findViewById(R.id.feature1).setOnClickListener(this);
        findViewById(R.id.feature2).setOnClickListener(this);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.first_container, new FirstFragment(), "1")
                .commit();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.feature1: {
                break;
            }
            case R.id.feature2: {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.second_container, new SecondFragment(), "2")
                        .addToBackStack(null)
                        .commit();
                break;
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        Timber.d(">>>onRequestPermissionsResult main");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Timber.d(">>>onActivityResult main");
    }
}
