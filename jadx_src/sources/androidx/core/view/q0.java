package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: compiled from: MotionEventCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    @Deprecated
    public static final int A = 17;

    @Deprecated
    public static final int B = 18;

    @Deprecated
    public static final int C = 19;

    @Deprecated
    public static final int D = 20;

    @Deprecated
    public static final int E = 21;

    @Deprecated
    public static final int F = 22;

    @Deprecated
    public static final int G = 23;

    @Deprecated
    public static final int H = 24;

    @Deprecated
    public static final int I = 25;
    public static final int J = 26;
    public static final int K = 27;
    public static final int L = 28;

    @Deprecated
    public static final int M = 32;

    @Deprecated
    public static final int N = 33;

    @Deprecated
    public static final int O = 34;

    @Deprecated
    public static final int P = 35;

    @Deprecated
    public static final int Q = 36;

    @Deprecated
    public static final int R = 37;

    @Deprecated
    public static final int S = 38;

    @Deprecated
    public static final int T = 39;

    @Deprecated
    public static final int U = 40;

    @Deprecated
    public static final int V = 41;

    @Deprecated
    public static final int W = 42;

    @Deprecated
    public static final int X = 43;

    @Deprecated
    public static final int Y = 44;

    @Deprecated
    public static final int Z = 45;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f21782a = 255;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Deprecated
    public static final int f21783a0 = 46;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f21784b = 5;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @Deprecated
    public static final int f21785b0 = 47;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f21786c = 6;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @Deprecated
    public static final int f21787c0 = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f21788d = 7;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f21789e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f21790f = 65280;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f21791g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final int f21792h = 9;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final int f21793i = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f21794j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final int f21795k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f21796l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f21797m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final int f21798n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final int f21799o = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final int f21800p = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final int f21801q = 7;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final int f21802r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f21803s = 9;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f21804t = 10;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final int f21805u = 11;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final int f21806v = 12;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    public static final int f21807w = 13;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Deprecated
    public static final int f21808x = 14;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    public static final int f21809y = 15;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Deprecated
    public static final int f21810z = 16;

    private q0() {
    }

    @Deprecated
    public static int a(MotionEvent motionEvent, int i10) {
        return motionEvent.findPointerIndex(i10);
    }

    @Deprecated
    public static int b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    public static float d(MotionEvent motionEvent, int i10) {
        return motionEvent.getAxisValue(i10);
    }

    @Deprecated
    public static float e(MotionEvent motionEvent, int i10, int i11) {
        return motionEvent.getAxisValue(i10, i11);
    }

    @Deprecated
    public static int f(MotionEvent motionEvent) {
        return motionEvent.getButtonState();
    }

    @Deprecated
    public static int g(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @Deprecated
    public static int h(MotionEvent motionEvent, int i10) {
        return motionEvent.getPointerId(i10);
    }

    @Deprecated
    public static int i(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    @Deprecated
    public static float j(MotionEvent motionEvent, int i10) {
        return motionEvent.getX(i10);
    }

    @Deprecated
    public static float k(MotionEvent motionEvent, int i10) {
        return motionEvent.getY(i10);
    }

    public static boolean l(@androidx.annotation.n0 MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }
}
