package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import androidx.annotation.b0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.annotation.y;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ResourcesCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20584a = "ResourcesCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f20585b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b0("sColorStateCacheLock")
    private static final WeakHashMap<f, SparseArray<e>> f20586c = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f20587d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.c
    public static final int f20588e = 0;

    /* JADX INFO: compiled from: ResourcesCompat.java */
    @w0(15)
    public static class a {
        private a() {
        }

        @u
        static Drawable a(Resources resources, int i10, int i11) {
            return resources.getDrawableForDensity(i10, i11);
        }
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    @w0(21)
    public static class b {
        private b() {
        }

        @u
        static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        @u
        static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    @w0(23)
    public static class c {
        private c() {
        }

        @u
        static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        @n0
        @u
        static ColorStateList b(@n0 Resources resources, @androidx.annotation.n int i10, @p0 Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    @w0(29)
    public static class d {
        private d() {
        }

        @u
        static float a(@n0 Resources resources, @androidx.annotation.q int i10) {
            return resources.getFloat(i10);
        }
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ColorStateList f20589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Configuration f20590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f20591c;

        e(@n0 ColorStateList colorStateList, @n0 Configuration configuration, @p0 Resources.Theme theme) {
            this.f20589a = colorStateList;
            this.f20590b = configuration;
            this.f20591c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Resources f20592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Resources.Theme f20593b;

        f(@n0 Resources resources, @p0 Resources.Theme theme) {
            this.f20592a = resources;
            this.f20593b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f20592a.equals(fVar.f20592a) && androidx.core.util.j.a(this.f20593b, fVar.f20593b);
        }

        public int hashCode() {
            return androidx.core.util.j.b(this.f20592a, this.f20593b);
        }
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static abstract class g {
        @n0
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Handler e(@p0 Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void c(final int i10, @p0 Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20599b.f(i10);
                }
            });
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void d(@n0 final Typeface typeface, @p0 Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20597b.g(typeface);
                }
            });
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i10);

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(@n0 Typeface typeface);
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static final class h {

        /* JADX INFO: compiled from: ResourcesCompat.java */
        @w0(23)
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Object f20594a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static Method f20595b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static boolean f20596c;

            private a() {
            }

            /* JADX WARN: Code duplicated, block: B:30:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @SuppressLint({"BanUncheckedReflection"})
            static void a(@n0 Resources.Theme theme) {
                Method method;
                synchronized (f20594a) {
                    if (f20596c) {
                        method = f20595b;
                        if (method != null) {
                            method.invoke(theme, new Object[0]);
                        }
                    } else {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f20595b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i(i.f20584a, "Failed to retrieve rebase() method", e10);
                        }
                        f20596c = true;
                        method = f20595b;
                        if (method != null) {
                            try {
                                method.invoke(theme, new Object[0]);
                            } catch (IllegalAccessException | InvocationTargetException e11) {
                                Log.i(i.f20584a, "Failed to invoke rebase() method via reflection", e11);
                                f20595b = null;
                            }
                        }
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: compiled from: ResourcesCompat.java */
        @w0(29)
        public static class b {
            private b() {
            }

            @u
            static void a(@n0 Resources.Theme theme) {
                theme.rebase();
            }
        }

        private h() {
        }

        public static void a(@n0 Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private i() {
    }

    private static void a(@n0 f fVar, @androidx.annotation.n int i10, @n0 ColorStateList colorStateList, @p0 Resources.Theme theme) {
        synchronized (f20587d) {
            WeakHashMap<f, SparseArray<e>> weakHashMap = f20586c;
            SparseArray<e> sparseArray = weakHashMap.get(fVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(fVar, sparseArray);
            }
            sparseArray.append(i10, new e(colorStateList, fVar.f20592a.getConfiguration(), theme));
        }
    }

    public static void b(@n0 Resources.Theme theme) {
        synchronized (f20587d) {
            Iterator<f> it = f20586c.keySet().iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next != null && theme.equals(next.f20593b)) {
                    it.remove();
                }
            }
        }
    }

    @p0
    private static ColorStateList c(@n0 f fVar, @androidx.annotation.n int i10) {
        e eVar;
        Resources.Theme theme;
        synchronized (f20587d) {
            SparseArray<e> sparseArray = f20586c.get(fVar);
            if (sparseArray != null && sparseArray.size() > 0 && (eVar = sparseArray.get(i10)) != null) {
                if (eVar.f20590b.equals(fVar.f20592a.getConfiguration()) && (((theme = fVar.f20593b) == null && eVar.f20591c == 0) || (theme != null && eVar.f20591c == theme.hashCode()))) {
                    return eVar.f20589a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    @p0
    public static Typeface d(@n0 Context context, @y int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i10, new TypedValue(), 0, null, null, false, true);
    }

    @androidx.annotation.l
    public static int e(@n0 Resources resources, @androidx.annotation.n int i10, @p0 Resources.Theme theme) throws Resources.NotFoundException {
        return c.a(resources, i10, theme);
    }

    @p0
    public static ColorStateList f(@n0 Resources resources, @androidx.annotation.n int i10, @p0 Resources.Theme theme) throws Resources.NotFoundException {
        f fVar = new f(resources, theme);
        ColorStateList colorStateListC = c(fVar, i10);
        if (colorStateListC != null) {
            return colorStateListC;
        }
        ColorStateList colorStateListN = n(resources, i10, theme);
        if (colorStateListN == null) {
            return c.b(resources, i10, theme);
        }
        a(fVar, i10, colorStateListN, theme);
        return colorStateListN;
    }

    @p0
    public static Drawable g(@n0 Resources resources, @v int i10, @p0 Resources.Theme theme) throws Resources.NotFoundException {
        return b.a(resources, i10, theme);
    }

    @p0
    public static Drawable h(@n0 Resources resources, @v int i10, int i11, @p0 Resources.Theme theme) throws Resources.NotFoundException {
        return b.b(resources, i10, i11, theme);
    }

    public static float i(@n0 Resources resources, @androidx.annotation.q int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(resources, i10);
        }
        TypedValue typedValueM = m();
        resources.getValue(i10, typedValueM, true);
        if (typedValueM.type == 4) {
            return typedValueM.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i10) + " type #0x" + Integer.toHexString(typedValueM.type) + " is not valid");
    }

    @p0
    public static Typeface j(@n0 Context context, @y int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p0
    public static Typeface k(@n0 Context context, @y int i10, @n0 TypedValue typedValue, int i11, @p0 g gVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i10, typedValue, i11, gVar, null, true, false);
    }

    public static void l(@n0 Context context, @y int i10, @n0 g gVar, @p0 Handler handler) throws Resources.NotFoundException {
        androidx.core.util.o.l(gVar);
        if (context.isRestricted()) {
            gVar.c(-4, handler);
        } else {
            p(context, i10, new TypedValue(), 0, gVar, handler, false, false);
        }
    }

    @n0
    private static TypedValue m() {
        ThreadLocal<TypedValue> threadLocal = f20585b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @p0
    private static ColorStateList n(Resources resources, int i10, @p0 Resources.Theme theme) {
        if (o(resources, i10)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w(f20584a, "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    private static boolean o(@n0 Resources resources, @androidx.annotation.n int i10) {
        TypedValue typedValueM = m();
        resources.getValue(i10, typedValueM, true);
        int i11 = typedValueM.type;
        return i11 >= 28 && i11 <= 31;
    }

    private static Typeface p(@n0 Context context, int i10, @n0 TypedValue typedValue, int i11, @p0 g gVar, @p0 Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface typefaceQ = q(context, resources, typedValue, i10, i11, gVar, handler, z10, z11);
        if (typefaceQ != null || gVar != null || z11) {
            return typefaceQ;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    private static Typeface q(@n0 Context context, Resources resources, @n0 TypedValue typedValue, int i10, int i11, @p0 g gVar, @p0 Handler handler, boolean z10, boolean z11) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (gVar != null) {
                gVar.c(-3, handler);
            }
            return null;
        }
        Typeface typefaceK = androidx.core.graphics.w0.k(resources, i10, string, typedValue.assetCookie, i11);
        if (typefaceK != null) {
            if (gVar != null) {
                gVar.d(typefaceK, handler);
            }
            return typefaceK;
        }
        if (z11) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceH = androidx.core.graphics.w0.h(context, resources, i10, string, typedValue.assetCookie, i11);
                if (gVar != null) {
                    if (typefaceH != null) {
                        gVar.d(typefaceH, handler);
                    } else {
                        gVar.c(-3, handler);
                    }
                }
                return typefaceH;
            }
            androidx.core.content.res.f.b bVarB = androidx.core.content.res.f.b(resources.getXml(i10), resources);
            if (bVarB != null) {
                return androidx.core.graphics.w0.f(context, bVarB, resources, i10, string, typedValue.assetCookie, i11, gVar, handler, z10);
            }
            Log.e(f20584a, "Failed to find font-family tag");
            if (gVar != null) {
                gVar.c(-3, handler);
            }
            return null;
        } catch (IOException e10) {
            Log.e(f20584a, "Failed to read xml resource " + string, e10);
            if (gVar != null) {
                gVar.c(-3, handler);
            }
            return null;
        } catch (XmlPullParserException e11) {
            Log.e(f20584a, "Failed to parse xml resource " + string, e11);
            if (gVar != null) {
                gVar.c(-3, handler);
            }
            return null;
        }
    }
}
