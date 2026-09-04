package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.collection.j2;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: TypefaceCompatApi24Impl.java */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(24)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class y0 extends c1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f20773d = "TypefaceCompatApi24Impl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20774e = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f20775f = "addFontWeightStyle";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f20776g = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Class<?> f20777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Constructor<?> f20778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Method f20779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Method f20780k;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName(f20774e);
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod(f20775f, ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod(f20776g, Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e(f20773d, e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f20778i = constructor;
        f20777h = cls;
        f20779j = method2;
        f20780k = method;
    }

    y0() {
    }

    private static boolean o(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f20779j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface p(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f20777h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f20780k.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean q() {
        Method method = f20779j;
        if (method == null) {
            Log.w(f20773d, "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object r() {
        try {
            return f20778i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.c1
    @androidx.annotation.p0
    public Typeface b(Context context, androidx.core.content.res.f.d dVar, Resources resources, int i10) {
        Object objR = r();
        if (objR == null) {
            return null;
        }
        for (androidx.core.content.res.f.e eVar : dVar.a()) {
            ByteBuffer byteBufferB = d1.b(context, resources, eVar.b());
            if (byteBufferB == null || !o(objR, byteBufferB, eVar.c(), eVar.e(), eVar.f())) {
                return null;
            }
        }
        return p(objR);
    }

    @Override // androidx.core.graphics.c1
    @androidx.annotation.p0
    public Typeface d(Context context, @androidx.annotation.p0 CancellationSignal cancellationSignal, @androidx.annotation.n0 androidx.core.provider.j.c[] cVarArr, int i10) {
        Object objR = r();
        if (objR == null) {
            return null;
        }
        j2 j2Var = new j2();
        for (androidx.core.provider.j.c cVar : cVarArr) {
            Uri uriD = cVar.d();
            ByteBuffer byteBufferF = (ByteBuffer) j2Var.get(uriD);
            if (byteBufferF == null) {
                byteBufferF = d1.f(context, cancellationSignal, uriD);
                j2Var.put(uriD, byteBufferF);
            }
            if (byteBufferF == null || !o(objR, byteBufferF, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        Typeface typefaceP = p(objR);
        if (typefaceP == null) {
            return null;
        }
        return Typeface.create(typefaceP, i10);
    }

    @Override // androidx.core.graphics.c1
    @androidx.annotation.n0
    Typeface g(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Typeface typeface, int i10, boolean z10) {
        Typeface typefaceB;
        try {
            typefaceB = f1.b(typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        return typefaceB == null ? super.g(context, typeface, i10, z10) : typefaceB;
    }
}
