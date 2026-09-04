package com.huawei.hms.scankit.p;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.mlsdk.common.AgConnectInfo;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: HaUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62586a = "y3";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Bundle f62587b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f62588c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HashSet<String> f62589d = new HashSet<>();

    public static Bundle a(Context context) {
        if (context == null) {
            return new Bundle();
        }
        if (f62587b == null) {
            Bundle bundle = new Bundle();
            try {
                String string = AGConnectServicesConfig.fromContext(context).getString(AgConnectInfo.AgConnectKey.APPLICATION_ID);
                if (string == null) {
                    string = context.getPackageName();
                }
                bundle.putString("appid", string);
            } catch (RuntimeException unused) {
                Log.e(f62586a, "getAppInfo: RuntimeException");
            } catch (Exception unused2) {
                Log.e(f62586a, "getAppInfo: Exception");
            }
            f62587b = bundle;
        }
        return f62587b;
    }

    public static HashSet<String> a() {
        if (f62589d.size() == 0) {
            f62589d.add("com.huawei.scanner");
            f62589d.add("com.huawei.hitouch");
        }
        return f62589d;
    }

    public static boolean a(String str, HashSet<String> hashSet) {
        if (str.length() == 0) {
            return true;
        }
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static String b(Context context) {
        if (f62588c.length() == 0) {
            f62588c = context.getPackageName();
        }
        return f62588c;
    }
}
