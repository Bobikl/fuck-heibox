package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;

/* JADX INFO: compiled from: TypefaceCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c1 f20761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.collection.z0<String, Typeface> f20762b;

    /* JADX INFO: compiled from: TypefaceCompat.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class a extends androidx.core.provider.j.d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.core.content.res.i.g f20763j;

        public a(@androidx.annotation.p0 androidx.core.content.res.i.g gVar) {
            this.f20763j = gVar;
        }

        @Override // androidx.core.provider.j.d
        public void a(int i10) {
            androidx.core.content.res.i.g gVar = this.f20763j;
            if (gVar != null) {
                gVar.f(i10);
            }
        }

        @Override // androidx.core.provider.j.d
        public void b(@androidx.annotation.n0 Typeface typeface) {
            androidx.core.content.res.i.g gVar = this.f20763j;
            if (gVar != null) {
                gVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f20761a = new b1();
        } else if (i10 >= 28) {
            f20761a = new a1();
        } else if (i10 >= 26) {
            f20761a = new z0();
        } else if (i10 < 24 || !y0.q()) {
            f20761a = new x0();
        } else {
            f20761a = new y0();
        }
        f20762b = new androidx.collection.z0<>(16);
    }

    private w0() {
    }

    @j1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void a() {
        f20762b.d();
    }

    @androidx.annotation.n0
    public static Typeface b(@androidx.annotation.n0 Context context, @androidx.annotation.p0 Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @androidx.annotation.n0
    public static Typeface c(@androidx.annotation.n0 Context context, @androidx.annotation.p0 Typeface typeface, @androidx.annotation.f0(from = 1, to = 1000) int i10, boolean z10) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        androidx.core.util.o.g(i10, 1, 1000, "weight");
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return f20761a.g(context, typeface, i10, z10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public static Typeface d(@androidx.annotation.n0 Context context, @androidx.annotation.p0 CancellationSignal cancellationSignal, @androidx.annotation.n0 androidx.core.provider.j.c[] cVarArr, int i10) {
        return f20761a.d(context, cancellationSignal, cVarArr, i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    @Deprecated
    public static Typeface e(@androidx.annotation.n0 Context context, @androidx.annotation.n0 androidx.core.content.res.f.b bVar, @androidx.annotation.n0 Resources resources, int i10, int i11, @androidx.annotation.p0 androidx.core.content.res.i.g gVar, @androidx.annotation.p0 Handler handler, boolean z10) {
        return f(context, bVar, resources, i10, null, 0, i11, gVar, handler, z10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @androidx.annotation.p0
    public static Typeface f(@androidx.annotation.n0 Context context, @androidx.annotation.n0 androidx.core.content.res.f.b bVar, @androidx.annotation.n0 Resources resources, int i10, @androidx.annotation.p0 String str, int i11, int i12, @androidx.annotation.p0 androidx.core.content.res.i.g gVar, @androidx.annotation.p0 Handler handler, boolean z10) {
        Typeface typefaceB;
        if (bVar instanceof androidx.core.content.res.f.C0127f) {
            androidx.core.content.res.f.C0127f c0127f = (androidx.core.content.res.f.C0127f) bVar;
            Typeface typefaceM = m(c0127f.c());
            if (typefaceM != null) {
                if (gVar != null) {
                    gVar.d(typefaceM, handler);
                }
                return typefaceM;
            }
            boolean z11 = !z10 ? gVar != null : c0127f.a() != 0;
            int iD = z10 ? c0127f.d() : -1;
            typefaceB = androidx.core.provider.j.f(context, c0127f.b(), i12, z11, iD, androidx.core.content.res.i.g.e(handler), new a(gVar));
        } else {
            typefaceB = f20761a.b(context, (androidx.core.content.res.f.d) bVar, resources, i12);
            if (gVar != null) {
                if (typefaceB != null) {
                    gVar.d(typefaceB, handler);
                } else {
                    gVar.c(-3, handler);
                }
            }
        }
        if (typefaceB != null) {
            f20762b.j(i(resources, i10, str, i11, i12), typefaceB);
        }
        return typefaceB;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    @Deprecated
    public static Typeface g(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Resources resources, int i10, String str, int i11) {
        return h(context, resources, i10, str, 0, i11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @androidx.annotation.p0
    public static Typeface h(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceF = f20761a.f(context, resources, i10, str, i12);
        if (typefaceF != null) {
            f20762b.j(i(resources, i10, str, i11, i12), typefaceF);
        }
        return typefaceF;
    }

    private static String i(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    @Deprecated
    public static Typeface j(@androidx.annotation.n0 Resources resources, int i10, int i11) {
        return k(resources, i10, null, 0, i11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @androidx.annotation.p0
    public static Typeface k(@androidx.annotation.n0 Resources resources, int i10, @androidx.annotation.p0 String str, int i11, int i12) {
        return f20762b.f(i(resources, i10, str, i11, i12));
    }

    @androidx.annotation.p0
    private static Typeface l(Context context, Typeface typeface, int i10) {
        c1 c1Var = f20761a;
        androidx.core.content.res.f.d dVarM = c1Var.m(typeface);
        if (dVarM == null) {
            return null;
        }
        return c1Var.b(context, dVarM, context.getResources(), i10);
    }

    private static Typeface m(@androidx.annotation.p0 String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
