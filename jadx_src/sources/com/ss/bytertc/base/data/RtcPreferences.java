package com.ss.bytertc.base.data;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.p0;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;
import com.ss.bytertc.engine.utils.LogUtil;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public class RtcPreferences {
    public static final String ONER_RTC_PREFERENCE = "oner_rtc_preference";
    public static final String PREF_CONFIGURE = "pref_configure";
    public static final String PREF_FEEDBACK = "pref_rtc_feedback_data";
    public static final String PREF_HOST_RTT_HISTORY = "pref_host_rtt_history";
    private static final String RTC_PREFERENCE = "rtc_preference";
    private static final String TAG = "RtcPreferences";
    private static volatile RtcPreferences sInstance;
    private final SharedPreferences mSharedPreferences;

    private RtcPreferences(Context context) {
        this.mSharedPreferences = context.getSharedPreferences(RTC_PREFERENCE, 0);
    }

    @CalledByNative
    private void clearCache() {
        this.mSharedPreferences.edit().clear().commit();
    }

    @CalledByNative
    private static RtcPreferences getInstance() {
        return instance(ContextUtils.getApplicationContext());
    }

    public static RtcPreferences instance(@p0 Context context) {
        if (sInstance == null) {
            synchronized (RtcPreferences.class) {
                try {
                    if (context == null) {
                        throw new RuntimeException("unable to init RtcPreferences without context");
                    }
                    if (sInstance == null) {
                        sInstance = new RtcPreferences(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return sInstance;
    }

    @CalledByNative
    public int getInt(String str, int i10) {
        return this.mSharedPreferences.getInt(str, i10);
    }

    @CalledByNative
    public String getString(String str, String str2) {
        String string = this.mSharedPreferences.getString(str, str2);
        try {
            string.getBytes("utf-8");
            return string;
        } catch (UnsupportedEncodingException e10) {
            LogUtil.e(TAG, "Unable to get bytes use utf-8", e10);
            return "";
        }
    }

    @CalledByNative
    public void putInt(String str, int i10) {
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        editorEdit.putInt(str, i10);
        editorEdit.apply();
    }

    @CalledByNative
    public void putString(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    @CalledByNative
    public void remove(String str) {
        if (str == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }
}
