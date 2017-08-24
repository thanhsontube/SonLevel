package nt.son.sonlevel;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by sonnt on 8/24/17.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
