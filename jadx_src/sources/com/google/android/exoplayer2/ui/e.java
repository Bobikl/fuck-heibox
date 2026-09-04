package com.google.android.exoplayer2.ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.core.view.j1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: CaptionStyleCompat.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f50711g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f50712h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f50713i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f50714j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f50715k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f50716l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f50717m = new e(-1, j1.f21601t, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f50722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    public final Typeface f50723f;

    /* JADX INFO: compiled from: CaptionStyleCompat.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public e(int i10, int i11, int i12, int i13, int i14, @androidx.annotation.p0 Typeface typeface) {
        this.f50718a = i10;
        this.f50719b = i11;
        this.f50720c = i12;
        this.f50721d = i13;
        this.f50722e = i14;
        this.f50723f = typeface;
    }

    @androidx.annotation.w0(19)
    public static e a(CaptioningManager.CaptionStyle captionStyle) {
        return com.google.android.exoplayer2.util.u0.f51536a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    @androidx.annotation.w0(19)
    private static e b(CaptioningManager.CaptionStyle captionStyle) {
        return new e(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @androidx.annotation.w0(21)
    private static e c(CaptioningManager.CaptionStyle captionStyle) {
        return new e(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f50717m.f50718a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f50717m.f50719b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f50717m.f50720c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f50717m.f50721d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f50717m.f50722e, captionStyle.getTypeface());
    }
}
