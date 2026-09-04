package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: WeightTypefaceApi21.java */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(21)
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20721a = "WeightTypeface";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f20722b = "native_instance";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f20723c = "nativeCreateFromTypeface";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f20724d = "nativeCreateWeightAlias";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Field f20725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Method f20726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Method f20727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Constructor<Typeface> f20728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0("sWeightCacheLock")
    private static final androidx.collection.x0<SparseArray<Typeface>> f20729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f20730j;

    static {
        Method declaredMethod;
        Method declaredMethod2;
        Constructor<Typeface> declaredConstructor;
        Field field = null;
        try {
            Field declaredField = Typeface.class.getDeclaredField(f20722b);
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod(f20723c, cls, cls2);
            declaredMethod.setAccessible(true);
            declaredMethod2 = Typeface.class.getDeclaredMethod(f20724d, cls, cls2);
            declaredMethod2.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
            field = declaredField;
        } catch (NoSuchFieldException | NoSuchMethodException e10) {
            Log.e(f20721a, e10.getClass().getName(), e10);
            declaredMethod = null;
            declaredMethod2 = null;
            declaredConstructor = null;
        }
        f20725e = field;
        f20726f = declaredMethod;
        f20727g = declaredMethod2;
        f20728h = declaredConstructor;
        f20729i = new androidx.collection.x0<>(3);
        f20730j = new Object();
    }

    private f1() {
    }

    @androidx.annotation.p0
    private static Typeface a(long j10) {
        try {
            return f20728h.newInstance(Long.valueOf(j10));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @androidx.annotation.p0
    static Typeface b(@androidx.annotation.n0 Typeface typeface, int i10, boolean z10) {
        if (!d()) {
            return null;
        }
        int i11 = (i10 << 1) | (z10 ? 1 : 0);
        synchronized (f20730j) {
            long jC = c(typeface);
            androidx.collection.x0<SparseArray<Typeface>> x0Var = f20729i;
            SparseArray<Typeface> sparseArrayG = x0Var.g(jC);
            if (sparseArrayG == null) {
                sparseArrayG = new SparseArray<>(4);
                x0Var.m(jC, sparseArrayG);
            } else {
                Typeface typeface2 = sparseArrayG.get(i11 == true ? 1 : 0);
                if (typeface2 != null) {
                    return typeface2;
                }
            }
            Typeface typefaceA = z10 == typeface.isItalic() ? a(f(jC, i10)) : a(e(jC, i10, z10));
            sparseArrayG.put(i11 == true ? 1 : 0, typefaceA);
            return typefaceA;
        }
    }

    private static long c(@androidx.annotation.n0 Typeface typeface) {
        try {
            return f20725e.getLong(typeface);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static boolean d() {
        return f20725e != null;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long e(long j10, int i10, boolean z10) {
        try {
            return ((Long) f20727g.invoke(null, Long.valueOf(((Long) f20726f.invoke(null, Long.valueOf(j10), Integer.valueOf(z10 ? 2 : 0))).longValue()), Integer.valueOf(i10))).longValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long f(long j10, int i10) {
        try {
            return ((Long) f20727g.invoke(null, Long.valueOf(j10), Integer.valueOf(i10))).longValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
