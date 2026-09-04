package com.igexin.push.util;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.igexin.push.core.CoreConsts;
import com.igexin.push.core.x;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    public static void a(Context context, Intent intent) {
        try {
            if (intent.hasExtra("us")) {
                String strB = com.igexin.a.b.a.b(intent.getStringExtra("us"), "");
                String str = (String) c(context, "us", "", new String[0]);
                if (!str.equals(strB)) {
                    if (!CoreConsts.f63466p.equals(strB)) {
                        a(context, "us", strB, new String[0]);
                    } else if (!TextUtils.isEmpty(str)) {
                        a(context, "us", "", new String[0]);
                    }
                }
            }
            if (intent.hasExtra("uis")) {
                String str2 = (String) c(context, "uis", "", new String[0]);
                String strB2 = com.igexin.a.b.a.b(intent.getStringExtra("uis"), "");
                if (!str2.equals(strB2)) {
                    a(context, "uis", strB2, new String[0]);
                }
            }
            if (intent.hasExtra("ua")) {
                String strD = x.a().d(context);
                String strB3 = com.igexin.a.b.a.b(intent.getStringExtra("ua"), "");
                if (strD.equals(strB3)) {
                    return;
                }
                a(context, "ua", strB3, new String[0]);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, String str, Object obj, String... strArr) {
        SharedPreferences.Editor editorEdit = context.getApplicationContext().getSharedPreferences((strArr == null || strArr.length != 1) ? "getui_sp" : strArr[0], 0).edit();
        if (obj instanceof String) {
            editorEdit.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            editorEdit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editorEdit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            editorEdit.putLong(str, ((Long) obj).longValue());
        }
        editorEdit.apply();
    }

    public static boolean a(Context context) {
        try {
            String str = (String) c(context, "us", "", new String[0]);
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Class.forName(str);
            return true;
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a("SpUtils|" + e10.toString(), new Object[0]);
            return false;
        }
    }

    public static void b(Context context, String str, Object obj, String... strArr) {
        SharedPreferences.Editor editorEdit = context.getApplicationContext().getSharedPreferences((strArr == null || strArr.length != 1) ? "getui_sp" : strArr[0], 0).edit();
        if (obj instanceof String) {
            editorEdit.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            editorEdit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editorEdit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            editorEdit.putLong(str, ((Long) obj).longValue());
        }
        editorEdit.commit();
    }

    public static Object c(Context context, String str, Object obj, String... strArr) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences((strArr == null || strArr.length != 1) ? "getui_sp" : strArr[0], 0);
        if (obj instanceof String) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        return obj instanceof Long ? Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue())) : obj;
    }
}
