package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: TypefaceCompatApi21Impl.java */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class x0 extends c1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f20764d = "TypefaceCompatApi21Impl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20765e = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f20766f = "addFontWeightStyle";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f20767g = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Class<?> f20768h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Constructor<?> f20769i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Method f20770j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Method f20771k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f20772l = false;

    x0() {
    }

    private static boolean o(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException {
        r();
        try {
            return ((Boolean) f20770j.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface p(Object obj) throws NoSuchMethodException {
        r();
        try {
            Object objNewInstance = Array.newInstance(f20768h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f20771k.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File q(@androidx.annotation.n0 ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void r() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f20772l) {
            return;
        }
        f20772l = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName(f20765e);
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod(f20766f, String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod(f20767g, Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e(f20764d, e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f20769i = constructor;
        f20768h = cls;
        f20770j = method2;
        f20771k = method;
    }

    private static Object s() throws NoSuchMethodException {
        r();
        try {
            return f20769i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.c1
    public Typeface b(Context context, androidx.core.content.res.f.d dVar, Resources resources, int i10) throws NoSuchMethodException {
        Object objS = s();
        for (androidx.core.content.res.f.e eVar : dVar.a()) {
            File fileE = d1.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!d1.c(fileE, resources, eVar.b())) {
                    return null;
                }
                if (!o(objS, fileE.getPath(), eVar.e(), eVar.f())) {
                    return null;
                }
                fileE.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return p(objS);
    }

    @Override // androidx.core.graphics.c1
    public Typeface d(Context context, CancellationSignal cancellationSignal, @androidx.annotation.n0 androidx.core.provider.j.c[] cVarArr, int i10) {
        if (cVarArr.length < 1) {
            return null;
        }
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
                File fileQ = q(parcelFileDescriptorOpenFileDescriptor);
                if (fileQ != null && fileQ.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileQ);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceE = super.e(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceE;
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException unused) {
            return null;
        }
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
