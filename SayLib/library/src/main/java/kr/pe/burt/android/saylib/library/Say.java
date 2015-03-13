package kr.pe.burt.android.saylib.library;

import android.content.res.Resources;

/**
 * Created by burt on 15. 3. 13..
 */
public class Say {
    public String hello(Resources res) {
        return res.getString(R.string.hello);
    }
}
