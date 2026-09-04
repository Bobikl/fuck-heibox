package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: WeightTypefaceApi14.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20707a = "WeightTypeface";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f20708b = "native_instance";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Field f20709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("sWeightCacheLock")
    private static final androidx.collection.x0<SparseArray<Typeface>> f20710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f20711e;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField(f20708b);
            declaredField.setAccessible(true);
        } catch (Exception e10) {
            Log.e(f20707a, e10.getClass().getName(), e10);
            declaredField = null;
        }
        f20709c = declaredField;
        f20710d = new androidx.collection.x0<>(3);
        f20711e = new Object();
    }

    private e1() {
    }

    @androidx.annotation.p0
    static Typeface a(@androidx.annotation.n0 c1 c1Var, @androidx.annotation.n0 Context context, @androidx.annotation.n0 Typeface typeface, int i10, boolean z10) {
        if (!d()) {
            return null;
        }
        int i11 = (i10 << 1) | (z10 ? 1 : 0);
        synchronized (f20711e) {
            long jC = c(typeface);
            androidx.collection.x0<SparseArray<Typeface>> x0Var = f20710d;
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
            Typeface typefaceB = b(c1Var, context, typeface, i10, z10);
            if (typefaceB == null) {
                typefaceB = e(typeface, i10, z10);
            }
            sparseArrayG.put(i11 == true ? 1 : 0, typefaceB);
            return typefaceB;
        }
    }

    @androidx.annotation.p0
    private static Typeface b(@androidx.annotation.n0 c1 c1Var, @androidx.annotation.n0 Context context, @androidx.annotation.n0 Typeface typeface, int i10, boolean z10) {
        androidx.core.content.res.f.d dVarM = c1Var.m(typeface);
        if (dVarM == null) {
            return null;
        }
        return c1Var.c(context, dVarM, context.getResources(), i10, z10);
    }

    private static long c(@androidx.annotation.n0 Typeface typeface) {
        try {
            return ((Number) f20709c.get(typeface)).longValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static boolean d() {
        return f20709c != null;
    }

    private static Typeface e(Typeface typeface, int i10, boolean z10) {
        int i11 = 1;
        boolean z11 = i10 >= 600;
        if (!z11 && !z10) {
            i11 = 0;
        } else if (!z11) {
            i11 = 2;
        } else if (z10) {
            i11 = 3;
        }
        return Typeface.create(typeface, i11);
    }
}
