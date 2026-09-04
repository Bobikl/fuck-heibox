package com.tencent.cos.xml.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
public class SharePreferenceUtils {
    private static SharePreferenceUtils instance;
    private SharedPreferences sharedPreferences;

    private SharePreferenceUtils(Context context) {
        this.sharedPreferences = context.getSharedPreferences("upload_download", 0);
    }

    public static SharePreferenceUtils instance(Context context) {
        synchronized (SharePreferenceUtils.class) {
            if (instance == null) {
                instance = new SharePreferenceUtils(context);
            }
        }
        return instance;
    }

    public synchronized boolean clear(String str) {
        if (str == null) {
            return false;
        }
        return this.sharedPreferences.edit().remove(str).commit();
    }

    public synchronized String getValue(String str) {
        if (str == null) {
            return null;
        }
        return this.sharedPreferences.getString(str, null);
    }

    public synchronized boolean updateValue(String str, String str2) {
        if (str == null) {
            return false;
        }
        return this.sharedPreferences.edit().putString(str, str2).commit();
    }
}
