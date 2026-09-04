package com.google.android.material.slider;

import androidx.annotation.n0;
import java.util.Locale;

/* JADX INFO: compiled from: BasicLabelFormatter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f55321e = 1000000000000L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f55322f = 1000000000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f55323g = 1000000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f55324h = 1000;

    @Override // com.google.android.material.slider.d
    @n0
    public String a(float f10) {
        if (f10 >= 1.0E12f) {
            return String.format(Locale.US, "%.1fT", Float.valueOf(f10 / 1.0E12f));
        }
        if (f10 >= 1.0E9f) {
            return String.format(Locale.US, "%.1fB", Float.valueOf(f10 / 1.0E9f));
        }
        if (f10 >= 1000000.0f) {
            return String.format(Locale.US, "%.1fM", Float.valueOf(f10 / 1000000.0f));
        }
        return f10 >= 1000.0f ? String.format(Locale.US, "%.1fK", Float.valueOf(f10 / 1000.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(f10));
    }
}
