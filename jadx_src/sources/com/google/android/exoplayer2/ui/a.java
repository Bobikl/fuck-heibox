package com.google.android.exoplayer2.ui;

import android.view.View;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: AdOverlayInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f50696d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f50697e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f50698f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f50699g = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f50700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f50702c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdOverlayInfo.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0403a {
    }

    public a(View view, int i10) {
        this(view, i10, null);
    }

    public a(View view, int i10, @androidx.annotation.p0 String str) {
        this.f50700a = view;
        this.f50701b = i10;
        this.f50702c = str;
    }
}
