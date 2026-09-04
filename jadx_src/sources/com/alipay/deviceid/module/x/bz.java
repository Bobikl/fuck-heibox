package com.alipay.deviceid.module.x;

import android.content.Context;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: SecurityStorageUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public final class bz {
    public static String a(Context context, String str, String str2) {
        if (context == null || e.a(str) || e.a(str2)) {
            return null;
        }
        try {
            String strA = t.a(context, str, str2, "");
            if (e.a(strA)) {
                return null;
            }
            return i.b(i.a(), strA);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str, String str2) {
        if (!e.a(str) && !e.a(str2)) {
            try {
                String strA = r.a(str);
                if (e.a(strA)) {
                    return null;
                }
                String string = new JSONObject(strA).getString(str2);
                if (e.a(string)) {
                    return null;
                }
                return i.b(i.a(), string);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (e.a(str) || e.a(str2) || context == null) {
            return;
        }
        try {
            String strA = i.a(i.a(), str3);
            HashMap map = new HashMap();
            map.put(str2, strA);
            t.a(context, str, map);
        } catch (Exception unused) {
        }
    }
}
