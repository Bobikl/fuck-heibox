package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$Builder;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: compiled from: TypefaceCompatApi26Impl.java */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(26)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class z0 extends x0 {
    private static final int A = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f20781t = "TypefaceCompatApi26Impl";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f20782u = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f20783v = "addFontFromAssetManager";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f20784w = "addFontFromBuffer";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f20785x = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f20786y = "freeze";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f20787z = "abortCreation";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final Class<?> f20788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final Constructor<?> f20789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final Method f20790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final Method f20791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final Method f20792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final Method f20793r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final Method f20794s;

    public z0() throws NoSuchMethodException {
        Method methodB;
        Constructor<?> constructorD;
        Method methodZ;
        Method methodA;
        Method methodE;
        Method methodY;
        Class<?> cls = null;
        try {
            Class<?> clsC = C();
            constructorD = D(clsC);
            methodZ = z(clsC);
            methodA = A(clsC);
            methodE = E(clsC);
            methodY = y(clsC);
            methodB = B(clsC);
            cls = clsC;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e(f20781t, "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            methodB = null;
            constructorD = null;
            methodZ = null;
            methodA = null;
            methodE = null;
            methodY = null;
        }
        this.f20788m = cls;
        this.f20789n = constructorD;
        this.f20790o = methodZ;
        this.f20791p = methodA;
        this.f20792q = methodE;
        this.f20793r = methodY;
        this.f20794s = methodB;
    }

    @androidx.annotation.p0
    private Object s() {
        try {
            return this.f20789n.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void t(Object obj) {
        try {
            this.f20793r.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean u(Context context, Object obj, String str, int i10, int i11, int i12, @androidx.annotation.p0 FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f20790o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean v(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f20791p.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean w(Object obj) {
        try {
            return ((Boolean) this.f20792q.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean x() {
        if (this.f20790o == null) {
            Log.w(f20781t, "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f20790o != null;
    }

    protected Method A(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(f20784w, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method B(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(f20785x, Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> C() throws ClassNotFoundException {
        return Class.forName(f20782u);
    }

    protected Constructor<?> D(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    protected Method E(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f20786y, new Class[0]);
    }

    @Override // androidx.core.graphics.x0, androidx.core.graphics.c1
    @androidx.annotation.p0
    public Typeface b(Context context, androidx.core.content.res.f.d dVar, Resources resources, int i10) {
        if (!x()) {
            return super.b(context, dVar, resources, i10);
        }
        Object objS = s();
        if (objS == null) {
            return null;
        }
        for (androidx.core.content.res.f.e eVar : dVar.a()) {
            if (!u(context, objS, eVar.a(), eVar.c(), eVar.e(), eVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(eVar.d()))) {
                t(objS);
                return null;
            }
        }
        if (w(objS)) {
            return p(objS);
        }
        return null;
    }

    @Override // androidx.core.graphics.x0, androidx.core.graphics.c1
    @androidx.annotation.p0
    public Typeface d(Context context, @androidx.annotation.p0 CancellationSignal cancellationSignal, @androidx.annotation.n0 androidx.core.provider.j.c[] cVarArr, int i10) {
        Typeface typefaceP;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!x()) {
            androidx.core.provider.j.c cVarL = l(cVarArr, i10);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(cVarL.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface$Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(cVarL.e()).setItalic(cVarL.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapH = d1.h(context, cVarArr, cancellationSignal);
        Object objS = s();
        if (objS == null) {
            return null;
        }
        boolean z10 = false;
        for (androidx.core.provider.j.c cVar : cVarArr) {
            ByteBuffer byteBuffer = mapH.get(cVar.d());
            if (byteBuffer != null) {
                if (!v(objS, byteBuffer, cVar.c(), cVar.e(), cVar.f() ? 1 : 0)) {
                    t(objS);
                    return null;
                }
                z10 = true;
            }
        }
        if (!z10) {
            t(objS);
            return null;
        }
        if (w(objS) && (typefaceP = p(objS)) != null) {
            return Typeface.create(typefaceP, i10);
        }
        return null;
    }

    @Override // androidx.core.graphics.c1
    @androidx.annotation.p0
    public Typeface f(Context context, Resources resources, int i10, String str, int i11) {
        if (!x()) {
            return super.f(context, resources, i10, str, i11);
        }
        Object objS = s();
        if (objS == null) {
            return null;
        }
        if (!u(context, objS, str, 0, -1, -1, null)) {
            t(objS);
            return null;
        }
        if (w(objS)) {
            return p(objS);
        }
        return null;
    }

    @Override // androidx.core.graphics.x0, androidx.core.graphics.c1
    @androidx.annotation.n0
    Typeface g(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Typeface typeface, int i10, boolean z10) {
        Typeface typefaceB;
        try {
            typefaceB = g1.b(typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        return typefaceB == null ? super.g(context, typeface, i10, z10) : typefaceB;
    }

    @androidx.annotation.p0
    protected Typeface p(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f20788m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f20794s.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method y(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f20787z, new Class[0]);
    }

    protected Method z(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(f20783v, AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }
}
