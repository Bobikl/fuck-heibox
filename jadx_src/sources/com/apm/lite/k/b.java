package com.apm.lite.k;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static DateFormat f40051a;

    public static DateFormat a() {
        if (f40051a == null) {
            f40051a = new SimpleDateFormat(com.max.hbutils.utils.w.f73604k, Locale.getDefault());
        }
        return f40051a;
    }
}
