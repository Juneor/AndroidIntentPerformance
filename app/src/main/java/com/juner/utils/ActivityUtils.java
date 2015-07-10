package com.juner.utils;

import android.content.Context;
import android.content.Intent;

/**
 * Created by admin on 2015/7/10.
 */
public class ActivityUtils {

    private static Intent intent = null;

    public static final void startActivity(final Context context,final Class clazz){
        if (intent == null){
            intent = new Intent();
        }
        intent.setClass(context,clazz);
        context.startActivity(intent);
    }

}
