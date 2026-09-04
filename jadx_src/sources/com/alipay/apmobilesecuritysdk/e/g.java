package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class g {
    public static synchronized String a(Context context, String str) {
        String strA = q4.e.a(context, "openapi_file_pri", "openApi" + str, "");
        if (e6.a.c(strA)) {
            return "";
        }
        String strE = d6.c.e(d6.c.a(), strA);
        return e6.a.c(strE) ? "" : strE;
    }

    public static synchronized void a() {
    }

    public static synchronized void a(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("openapi_file_pri", 0).edit();
        if (editorEdit != null) {
            editorEdit.clear();
            editorEdit.commit();
        }
    }

    public static synchronized void a(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (editorEdit != null) {
                editorEdit.putString("openApi" + str, d6.c.b(d6.c.a(), str2));
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }
}
