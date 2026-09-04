package com.google.android.material.color;

import androidx.annotation.e1;
import androidx.annotation.n0;
import com.google.android.material.R;

/* JADX INFO: compiled from: HarmonizedColorAttributes.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f53740c = {R.attr.colorError, R.attr.colorOnError, R.attr.colorErrorContainer, R.attr.colorOnErrorContainer};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f53741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e1
    private final int f53742b;

    private i(@n0 @androidx.annotation.f int[] iArr, @e1 int i10) {
        if (i10 != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.f53741a = iArr;
        this.f53742b = i10;
    }

    @n0
    public static i a(@n0 @androidx.annotation.f int[] iArr) {
        return new i(iArr, 0);
    }

    @n0
    public static i b(@n0 @androidx.annotation.f int[] iArr, @e1 int i10) {
        return new i(iArr, i10);
    }

    @n0
    public static i c() {
        return b(f53740c, R.style.ThemeOverlay_Material3_HarmonizedColors);
    }

    @n0
    public int[] d() {
        return this.f53741a;
    }

    @e1
    public int e() {
        return this.f53742b;
    }
}
