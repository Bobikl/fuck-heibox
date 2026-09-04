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

/* JADX INFO: compiled from: WeightTypefaceApi26.java */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(26)
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20733a = "WeightTypeface";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f20734b = "native_instance";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f20735c = "nativeCreateFromTypefaceWithExactStyle";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Field f20736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f20737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Constructor<Typeface> f20738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("sWeightCacheLock")
    private static final androidx.collection.x0<SparseArray<Typeface>> f20739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f20740h;

    static {
        Method declaredMethod;
        Constructor<Typeface> declaredConstructor;
        Field field = null;
        try {
            Field declaredField = Typeface.class.getDeclaredField(f20734b);
            Class cls = Long.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod(f20735c, cls, Integer.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
            field = declaredField;
        } catch (NoSuchFieldException | NoSuchMethodException e10) {
            Log.e(f20733a, e10.getClass().getName(), e10);
            declaredMethod = null;
            declaredConstructor = null;
        }
        f20736d = field;
        f20737e = declaredMethod;
        f20738f = declaredConstructor;
        f20739g = new androidx.collection.x0<>(3);
        f20740h = new Object();
    }

    private g1() {
    }

    @androidx.annotation.p0
    private static Typeface a(long j10) {
        try {
            return f20738f.newInstance(Long.valueOf(j10));
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
        synchronized (f20740h) {
            long jC = c(typeface);
            androidx.collection.x0<SparseArray<Typeface>> x0Var = f20739g;
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
            Typeface typefaceA = a(e(jC, i10, z10));
            sparseArrayG.put(i11 == true ? 1 : 0, typefaceA);
            return typefaceA;
        }
    }

    private static long c(@androidx.annotation.n0 Typeface typeface) {
        try {
            return f20736d.getLong(typeface);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static boolean d() {
        return f20736d != null;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long e(long j10, int i10, boolean z10) {
        try {
            return ((Long) f20737e.invoke(null, Long.valueOf(j10), Integer.valueOf(i10), Boolean.valueOf(z10))).longValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
