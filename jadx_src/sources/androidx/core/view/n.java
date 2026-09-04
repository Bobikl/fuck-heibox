package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: compiled from: GravityCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21700a = 8388608;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21701b = 8388611;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21702c = 8388613;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21703d = 8388615;

    /* JADX INFO: compiled from: GravityCompat.java */
    @androidx.annotation.w0(17)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(int i10, int i11, int i12, Rect rect, int i13, int i14, Rect rect2, int i15) {
            Gravity.apply(i10, i11, i12, rect, i13, i14, rect2, i15);
        }

        @androidx.annotation.u
        static void b(int i10, int i11, int i12, Rect rect, Rect rect2, int i13) {
            Gravity.apply(i10, i11, i12, rect, rect2, i13);
        }

        @androidx.annotation.u
        static void c(int i10, Rect rect, Rect rect2, int i11) {
            Gravity.applyDisplay(i10, rect, rect2, i11);
        }
    }

    private n() {
    }

    public static void a(int i10, int i11, int i12, @androidx.annotation.n0 Rect rect, int i13, int i14, @androidx.annotation.n0 Rect rect2, int i15) {
        a.a(i10, i11, i12, rect, i13, i14, rect2, i15);
    }

    public static void b(int i10, int i11, int i12, @androidx.annotation.n0 Rect rect, @androidx.annotation.n0 Rect rect2, int i13) {
        a.b(i10, i11, i12, rect, rect2, i13);
    }

    public static void c(int i10, @androidx.annotation.n0 Rect rect, @androidx.annotation.n0 Rect rect2, int i11) {
        a.c(i10, rect, rect2, i11);
    }

    public static int d(int i10, int i11) {
        return Gravity.getAbsoluteGravity(i10, i11);
    }
}
