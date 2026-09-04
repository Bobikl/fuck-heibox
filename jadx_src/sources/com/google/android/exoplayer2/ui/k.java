package com.google.android.exoplayer2.ui;

import android.graphics.Color;

/* JADX INFO: compiled from: HtmlUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k {
    private k() {
    }

    public static String a(String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str).length());
        sb2.append(".");
        sb2.append(str);
        sb2.append(",.");
        sb2.append(str);
        sb2.append(" *");
        return sb2.toString();
    }

    public static String b(@androidx.annotation.l int i10) {
        return com.google.android.exoplayer2.util.u0.H("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(((double) Color.alpha(i10)) / 255.0d));
    }
}
