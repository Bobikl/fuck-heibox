package com.igexin.a.a.c;

import android.util.Log;
import com.igexin.push.config.o;
import com.igexin.push.core.d;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f63207a = o.f63450a.equals("debug");

    public static void a(String str, String str2) {
        if (f63207a) {
            Log.d(str, str2);
        }
    }

    public static void a(String str, Object... objArr) {
        if (f63207a || (d.M && d.N >= System.currentTimeMillis())) {
            if (objArr != null && objArr.length > 0) {
                str = String.format(str, objArr);
            }
            com.igexin.push.f.a.i().a(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.getDefault()).format(new Date()) + "|" + str);
        }
    }

    public static void b(String str, String str2) {
        if (f63207a) {
            Log.w(str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (f63207a) {
            Log.e(str, str2);
        }
    }
}
