package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f20640b = "TypefaceCompatBaseImpl";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f20641c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, androidx.core.content.res.f.d> f20642a = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
    public class a implements d<androidx.core.provider.j.c> {
        a() {
        }

        @Override // androidx.core.graphics.c1.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(androidx.core.provider.j.c cVar) {
            return cVar.e();
        }

        @Override // androidx.core.graphics.c1.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(androidx.core.provider.j.c cVar) {
            return cVar.f();
        }
    }

    /* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
    public class b implements d<androidx.core.content.res.f.e> {
        b() {
        }

        @Override // androidx.core.graphics.c1.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(androidx.core.content.res.f.e eVar) {
            return eVar.e();
        }

        @Override // androidx.core.graphics.c1.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(androidx.core.content.res.f.e eVar) {
            return eVar.f();
        }
    }

    /* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
    public class c implements d<androidx.core.content.res.f.e> {
        c() {
        }

        @Override // androidx.core.graphics.c1.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(androidx.core.content.res.f.e eVar) {
            return eVar.e();
        }

        @Override // androidx.core.graphics.c1.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(androidx.core.content.res.f.e eVar) {
            return eVar.f();
        }
    }

    /* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
    public interface d<T> {
        int a(T t10);

        boolean b(T t10);
    }

    c1() {
    }

    private void a(Typeface typeface, androidx.core.content.res.f.d dVar) {
        long jN = n(typeface);
        if (jN != 0) {
            this.f20642a.put(Long.valueOf(jN), dVar);
        }
    }

    private androidx.core.content.res.f.e h(androidx.core.content.res.f.d dVar, int i10) {
        return (androidx.core.content.res.f.e) j(dVar.a(), i10, new b());
    }

    private androidx.core.content.res.f.e i(androidx.core.content.res.f.d dVar, int i10, boolean z10) {
        return (androidx.core.content.res.f.e) k(dVar.a(), i10, z10, new c());
    }

    private static <T> T j(T[] tArr, int i10, d<T> dVar) {
        return (T) k(tArr, (i10 & 1) == 0 ? 400 : 700, (i10 & 2) != 0, dVar);
    }

    private static <T> T k(T[] tArr, int i10, boolean z10, d<T> dVar) {
        T t10 = null;
        int i11 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int iAbs = (Math.abs(dVar.a(t11) - i10) * 2) + (dVar.b(t11) == z10 ? 0 : 1);
            if (t10 == null || i11 > iAbs) {
                t10 = t11;
                i11 = iAbs;
            }
        }
        return t10;
    }

    private static long n(@androidx.annotation.p0 Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e10) {
            Log.e(f20640b, "Could not retrieve font from family.", e10);
            return 0L;
        } catch (NoSuchFieldException e11) {
            Log.e(f20640b, "Could not retrieve font from family.", e11);
            return 0L;
        }
    }

    @androidx.annotation.p0
    public Typeface b(Context context, androidx.core.content.res.f.d dVar, Resources resources, int i10) {
        androidx.core.content.res.f.e eVarH = h(dVar, i10);
        if (eVarH == null) {
            return null;
        }
        Typeface typefaceH = w0.h(context, resources, eVarH.b(), eVarH.a(), 0, i10);
        a(typefaceH, dVar);
        return typefaceH;
    }

    @androidx.annotation.p0
    Typeface c(Context context, androidx.core.content.res.f.d dVar, Resources resources, int i10, boolean z10) {
        androidx.core.content.res.f.e eVarI = i(dVar, i10, z10);
        if (eVarI == null) {
            return null;
        }
        Typeface typefaceH = w0.h(context, resources, eVarI.b(), eVarI.a(), 0, 0);
        a(typefaceH, dVar);
        return typefaceH;
    }

    @androidx.annotation.p0
    public Typeface d(Context context, @androidx.annotation.p0 CancellationSignal cancellationSignal, @androidx.annotation.n0 androidx.core.provider.j.c[] cVarArr, int i10) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(l(cVarArr, i10).d());
            try {
                Typeface typefaceE = e(context, inputStreamOpenInputStream);
                d1.a(inputStreamOpenInputStream);
                return typefaceE;
            } catch (IOException unused) {
                d1.a(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpenInputStream;
                d1.a(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    protected Typeface e(Context context, InputStream inputStream) {
        File fileE = d1.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (d1.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    @androidx.annotation.p0
    public Typeface f(Context context, Resources resources, int i10, String str, int i11) {
        File fileE = d1.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (d1.c(fileE, resources, i10)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    @androidx.annotation.n0
    Typeface g(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Typeface typeface, int i10, boolean z10) {
        Typeface typefaceA;
        try {
            typefaceA = e1.a(this, context, typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceA = null;
        }
        return typefaceA == null ? typeface : typefaceA;
    }

    protected androidx.core.provider.j.c l(androidx.core.provider.j.c[] cVarArr, int i10) {
        return (androidx.core.provider.j.c) j(cVarArr, i10, new a());
    }

    @androidx.annotation.p0
    androidx.core.content.res.f.d m(Typeface typeface) {
        long jN = n(typeface);
        if (jN == 0) {
            return null;
        }
        return this.f20642a.get(Long.valueOf(jN));
    }
}
