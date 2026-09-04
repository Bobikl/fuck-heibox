package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: PointerIconCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21489b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21490c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21491d = 1001;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21492e = 1002;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f21493f = 1003;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21494g = 1004;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f21495h = 1006;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f21496i = 1007;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f21497j = 1008;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f21498k = 1009;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f21499l = 1010;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f21500m = 1011;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f21501n = 1012;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f21502o = 1013;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f21503p = 1014;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f21504q = 1015;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f21505r = 1016;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f21506s = 1017;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f21507t = 1018;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f21508u = 1019;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f21509v = 1020;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f21510w = 1021;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f21511x = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointerIcon f21512a;

    /* JADX INFO: compiled from: PointerIconCompat.java */
    @androidx.annotation.w0(24)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static PointerIcon a(Bitmap bitmap, float f10, float f11) {
            return PointerIcon.create(bitmap, f10, f11);
        }

        @androidx.annotation.u
        static PointerIcon b(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }

        @androidx.annotation.u
        static PointerIcon c(Resources resources, int i10) {
            return PointerIcon.load(resources, i10);
        }
    }

    private d1(PointerIcon pointerIcon) {
        this.f21512a = pointerIcon;
    }

    @androidx.annotation.n0
    public static d1 a(@androidx.annotation.n0 Bitmap bitmap, float f10, float f11) {
        return Build.VERSION.SDK_INT >= 24 ? new d1(a.a(bitmap, f10, f11)) : new d1(null);
    }

    @androidx.annotation.n0
    public static d1 c(@androidx.annotation.n0 Context context, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? new d1(a.b(context, i10)) : new d1(null);
    }

    @androidx.annotation.n0
    public static d1 d(@androidx.annotation.n0 Resources resources, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? new d1(a.c(resources, i10)) : new d1(null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public Object b() {
        return this.f21512a;
    }
}
