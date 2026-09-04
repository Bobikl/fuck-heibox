package com.tencent.thumbplayer.tcmedia.g.h;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f102787a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f102788b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f102789c = new a() { // from class: com.tencent.thumbplayer.tcmedia.g.h.b.1
        @Override // com.tencent.thumbplayer.tcmedia.g.h.a
        public final void d(String str, String str2) {
            Log.d(str, str2);
        }

        @Override // com.tencent.thumbplayer.tcmedia.g.h.a
        public final void e(String str, String str2, Throwable th2) {
            Log.e(str, str2, th2);
        }

        @Override // com.tencent.thumbplayer.tcmedia.g.h.a
        public final void i(String str, String str2) {
            Log.i(str, str2);
        }

        @Override // com.tencent.thumbplayer.tcmedia.g.h.a
        public final void v(String str, String str2) {
            Log.v(str, str2);
        }

        @Override // com.tencent.thumbplayer.tcmedia.g.h.a
        public final void w(String str, String str2, Throwable th2) {
            Log.w(str, str2, th2);
        }
    };

    public static void a(a aVar) {
        f102789c = aVar;
    }

    public static void a(String str, String str2) {
        if (a(2)) {
            f102789c.v("TMediaCodec.".concat(String.valueOf(str)), str2);
        }
    }

    public static void a(String str, String str2, Throwable th2) {
        if (a(5)) {
            f102789c.w("TMediaCodec.".concat(String.valueOf(str)), str2, th2);
        }
    }

    public static void a(boolean z10) {
        f102788b = z10;
    }

    public static boolean a() {
        return f102788b;
    }

    public static boolean a(int i10) {
        return f102788b && i10 >= f102787a;
    }

    public static void b(String str, String str2) {
        if (a(3)) {
            f102789c.d("TMediaCodec.".concat(String.valueOf(str)), str2);
        }
    }

    public static void b(String str, String str2, Throwable th2) {
        if (a(6)) {
            f102789c.e("TMediaCodec.".concat(String.valueOf(str)), str2, th2);
        }
    }

    public static void c(String str, String str2) {
        if (a(4)) {
            f102789c.i("TMediaCodec.".concat(String.valueOf(str)), str2);
        }
    }

    public static void d(String str, String str2) {
        if (a(5)) {
            f102789c.w("TMediaCodec.".concat(String.valueOf(str)), str2, null);
        }
    }

    public static void e(String str, String str2) {
        if (a(6)) {
            f102789c.e("TMediaCodec.".concat(String.valueOf(str)), str2, null);
        }
    }
}
