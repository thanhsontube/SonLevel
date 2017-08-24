package nt.son.sonlevel.util;

import timber.log.Timber;

/**
 * Created by sonnt on 8/24/17.
 */

public class Logger {
    public static void debug(String message) {
        Timber.d(">>>" + message);
    }


}
