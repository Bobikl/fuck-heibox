package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.Constants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f42011a = 31;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f42012b = 17;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f42013c = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f42014d = new char[64];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private static volatile Handler f42015e;

    /* JADX INFO: compiled from: Util.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f42016a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f42016a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42016a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42016a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42016a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42016a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private o() {
    }

    @n0
    public static String A(@n0 byte[] bArr) {
        String strF;
        char[] cArr = f42014d;
        synchronized (cArr) {
            strF = f(bArr, cArr);
        }
        return strF;
    }

    public static void a() {
        if (!u()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void b() {
        if (!v()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean c(@p0 com.bumptech.glide.request.a<?> aVar, @p0 com.bumptech.glide.request.a<?> aVar2) {
        if (aVar == null) {
            return aVar2 == null;
        }
        return aVar.e0(aVar2);
    }

    public static boolean d(@p0 Object obj, @p0 Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj instanceof com.bumptech.glide.load.model.m ? ((com.bumptech.glide.load.model.m) obj).a(obj2) : obj.equals(obj2);
    }

    public static boolean e(@p0 Object obj, @p0 Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @n0
    private static String f(@n0 byte[] bArr, @n0 char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = f42013c;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    @n0
    public static <T> Queue<T> g(int i10) {
        return new ArrayDeque(i10);
    }

    public static int h(int i10, int i11, @p0 Bitmap.Config config) {
        return i10 * i11 * j(config);
    }

    @TargetApi(19)
    public static int i(@n0 Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + Constants.ARRAY_TYPE + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int j(@p0 Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f42016a[config.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        return i10 != 4 ? 4 : 8;
    }

    @Deprecated
    public static int k(@n0 Bitmap bitmap) {
        return i(bitmap);
    }

    @n0
    public static <T> List<T> l(@n0 Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t10 : collection) {
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    private static Handler m() {
        if (f42015e == null) {
            synchronized (o.class) {
                if (f42015e == null) {
                    f42015e = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f42015e;
    }

    public static int n(float f10) {
        return o(f10, 17);
    }

    public static int o(float f10, int i10) {
        return q(Float.floatToIntBits(f10), i10);
    }

    public static int p(int i10) {
        return q(i10, 17);
    }

    public static int q(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    public static int r(@p0 Object obj, int i10) {
        return q(obj == null ? 0 : obj.hashCode(), i10);
    }

    public static int s(boolean z10) {
        return t(z10, 17);
    }

    public static int t(boolean z10, int i10) {
        return q(z10 ? 1 : 0, i10);
    }

    public static boolean u() {
        return !v();
    }

    public static boolean v() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean w(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    public static boolean x(int i10, int i11) {
        return w(i10) && w(i11);
    }

    public static void y(Runnable runnable) {
        m().post(runnable);
    }

    public static void z(Runnable runnable) {
        m().removeCallbacks(runnable);
    }
}
