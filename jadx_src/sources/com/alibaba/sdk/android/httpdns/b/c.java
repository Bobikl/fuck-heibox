package com.alibaba.sdk.android.httpdns.b;

import android.text.TextUtils;
import com.max.hbutils.utils.w;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SimpleDateFormat f37902a = new SimpleDateFormat(w.f73604k);

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Exception unused) {
            return 0L;
        }
    }

    static String c(String str) {
        try {
            return f37902a.format(Long.valueOf(a(str) * 1000));
        } catch (Exception unused) {
            return f37902a.format(Long.valueOf(System.currentTimeMillis()));
        }
    }

    static String d(String str) {
        try {
            return String.valueOf(f37902a.parse(str).getTime() / 1000);
        } catch (Exception unused) {
            return String.valueOf(System.currentTimeMillis() / 1000);
        }
    }
}
