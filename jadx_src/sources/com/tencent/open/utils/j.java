package com.tencent.open.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.open.log.SLog;
import java.lang.ref.WeakReference;
import java.net.URL;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f101184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile WeakReference<SharedPreferences> f101185b = null;

    public static synchronized j a() {
        if (f101184a == null) {
            f101184a = new j();
        }
        return f101184a;
    }

    public String a(Context context, String str) {
        if (this.f101185b == null || this.f101185b.get() == null) {
            this.f101185b = new WeakReference<>(context.getSharedPreferences("ServerPrefs", 0));
        }
        try {
            String host = new URL(str).getHost();
            if (host == null) {
                SLog.e("openSDK_LOG.ServerSetting", "Get host error. url=" + str);
                return str;
            }
            String string = this.f101185b.get().getString(host, null);
            if (string != null && !host.equals(string)) {
                String strReplace = str.replace(host, string);
                SLog.v("openSDK_LOG.ServerSetting", "return environment url : " + strReplace);
                return strReplace;
            }
            SLog.v("openSDK_LOG.ServerSetting", "host=" + host + ", envHost=" + string);
            return str;
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.ServerSetting", "getEnvUrl url=" + str + "error.: " + e10.getMessage());
            return str;
        }
    }
}
