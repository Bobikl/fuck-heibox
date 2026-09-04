package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import androidx.appcompat.resources.R;
import androidx.collection.j2;
import androidx.collection.l2;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ResourceManagerInternal.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class m0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f2839h = "ResourceManagerInternal";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f2840i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f2842k = "appcompat_skip_skip";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f2843l = "android.graphics.drawable.VectorDrawable";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static m0 f2844m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, l2<ColorStateList>> f2846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j2<String, e> f2847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l2<String> f2848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, androidx.collection.x0<WeakReference<Drawable.ConstantState>>> f2849d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f2850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f2852g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final PorterDuff.Mode f2841j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final c f2845n = new c(6);

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.m0.e
        public Drawable a(@androidx.annotation.n0 Context context, @androidx.annotation.n0 XmlPullParser xmlPullParser, @androidx.annotation.n0 AttributeSet attributeSet, @androidx.annotation.p0 Resources.Theme theme) {
            try {
                return androidx.appcompat.graphics.drawable.a.C(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.m0.e
        public Drawable a(@androidx.annotation.n0 Context context, @androidx.annotation.n0 XmlPullParser xmlPullParser, @androidx.annotation.n0 AttributeSet attributeSet, @androidx.annotation.p0 Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.c.e(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public static class c extends androidx.collection.z0<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }

        private static int s(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter t(int i10, PorterDuff.Mode mode) {
            return f(Integer.valueOf(s(i10, mode)));
        }

        PorterDuffColorFilter u(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return j(Integer.valueOf(s(i10, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.m0.e
        public Drawable a(@androidx.annotation.n0 Context context, @androidx.annotation.n0 XmlPullParser xmlPullParser, @androidx.annotation.n0 AttributeSet attributeSet, @androidx.annotation.p0 Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    c0.a.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public interface e {
        Drawable a(@androidx.annotation.n0 Context context, @androidx.annotation.n0 XmlPullParser xmlPullParser, @androidx.annotation.n0 AttributeSet attributeSet, @androidx.annotation.p0 Resources.Theme theme);
    }

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface f {
        @androidx.annotation.p0
        Drawable a(@androidx.annotation.n0 m0 m0Var, @androidx.annotation.n0 Context context, @androidx.annotation.v int i10);

        @androidx.annotation.p0
        ColorStateList b(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10);

        @androidx.annotation.p0
        PorterDuff.Mode c(int i10);

        boolean d(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10, @androidx.annotation.n0 Drawable drawable);

        boolean e(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10, @androidx.annotation.n0 Drawable drawable);
    }

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.m0.e
        public Drawable a(@androidx.annotation.n0 Context context, @androidx.annotation.n0 XmlPullParser xmlPullParser, @androidx.annotation.n0 AttributeSet attributeSet, @androidx.annotation.p0 Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.i.e(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    private void a(@androidx.annotation.n0 String str, @androidx.annotation.n0 e eVar) {
        if (this.f2847b == null) {
            this.f2847b = new j2<>();
        }
        this.f2847b.put(str, eVar);
    }

    private synchronized boolean b(@androidx.annotation.n0 Context context, long j10, @androidx.annotation.n0 Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        androidx.collection.x0<WeakReference<Drawable.ConstantState>> x0Var = this.f2849d.get(context);
        if (x0Var == null) {
            x0Var = new androidx.collection.x0<>();
            this.f2849d.put(context, x0Var);
        }
        x0Var.m(j10, new WeakReference<>(constantState));
        return true;
    }

    private void c(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10, @androidx.annotation.n0 ColorStateList colorStateList) {
        if (this.f2846a == null) {
            this.f2846a = new WeakHashMap<>();
        }
        l2<ColorStateList> l2Var = this.f2846a.get(context);
        if (l2Var == null) {
            l2Var = new l2<>();
            this.f2846a.put(context, l2Var);
        }
        l2Var.a(i10, colorStateList);
    }

    private void d(@androidx.annotation.n0 Context context) {
        if (this.f2851f) {
            return;
        }
        this.f2851f = true;
        Drawable drawableJ = j(context, R.drawable.abc_vector_test);
        if (drawableJ == null || !q(drawableJ)) {
            this.f2851f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable f(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10) {
        if (this.f2850e == null) {
            this.f2850e = new TypedValue();
        }
        TypedValue typedValue = this.f2850e;
        context.getResources().getValue(i10, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        f fVar = this.f2852g;
        Drawable drawableA = fVar == null ? null : fVar.a(this, context, i10);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, jE, drawableA);
        }
        return drawableA;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized m0 h() {
        if (f2844m == null) {
            m0 m0Var = new m0();
            f2844m = m0Var;
            p(m0Var);
        }
        return f2844m;
    }

    private synchronized Drawable i(@androidx.annotation.n0 Context context, long j10) {
        androidx.collection.x0<WeakReference<Drawable.ConstantState>> x0Var = this.f2849d.get(context);
        if (x0Var == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceG = x0Var.g(j10);
        if (weakReferenceG != null) {
            Drawable.ConstantState constantState = weakReferenceG.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            x0Var.p(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterT;
        c cVar = f2845n;
        porterDuffColorFilterT = cVar.t(i10, mode);
        if (porterDuffColorFilterT == null) {
            porterDuffColorFilterT = new PorterDuffColorFilter(i10, mode);
            cVar.u(i10, mode, porterDuffColorFilterT);
        }
        return porterDuffColorFilterT;
    }

    private ColorStateList n(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10) {
        l2<ColorStateList> l2Var;
        WeakHashMap<Context, l2<ColorStateList>> weakHashMap = this.f2846a;
        if (weakHashMap == null || (l2Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return l2Var.g(i10);
    }

    private static void p(@androidx.annotation.n0 m0 m0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m0Var.a("vector", new g());
            m0Var.a("animated-vector", new b());
            m0Var.a("animated-selector", new a());
            m0Var.a("drawable", new d());
        }
    }

    private static boolean q(@androidx.annotation.n0 Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.i) || f2843l.equals(drawable.getClass().getName());
    }

    private Drawable r(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10) {
        int next;
        j2<String, e> j2Var = this.f2847b;
        if (j2Var == null || j2Var.isEmpty()) {
            return null;
        }
        l2<String> l2Var = this.f2848c;
        if (l2Var != null) {
            String strG = l2Var.g(i10);
            if (f2842k.equals(strG) || (strG != null && this.f2847b.get(strG) == null)) {
                return null;
            }
        } else {
            this.f2848c = new l2<>();
        }
        if (this.f2850e == null) {
            this.f2850e = new TypedValue();
        }
        TypedValue typedValue = this.f2850e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f2848c.a(i10, name);
                e eVar = this.f2847b.get(name);
                if (eVar != null) {
                    drawableI = eVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, jE, drawableI);
                }
            } catch (Exception e10) {
                Log.e(f2839h, "Exception while inflating drawable", e10);
            }
        }
        if (drawableI == null) {
            this.f2848c.a(i10, f2842k);
        }
        return drawableI;
    }

    private Drawable v(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10, boolean z10, @androidx.annotation.n0 Drawable drawable) {
        ColorStateList colorStateListM = m(context, i10);
        if (colorStateListM == null) {
            f fVar = this.f2852g;
            if ((fVar == null || !fVar.d(context, i10, drawable)) && !x(context, i10, drawable) && z10) {
                return null;
            }
            return drawable;
        }
        if (b0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableR = androidx.core.graphics.drawable.d.r(drawable);
        androidx.core.graphics.drawable.d.o(drawableR, colorStateListM);
        PorterDuff.Mode modeO = o(i10);
        if (modeO == null) {
            return drawableR;
        }
        androidx.core.graphics.drawable.d.p(drawableR, modeO);
        return drawableR;
    }

    static void w(Drawable drawable, v0 v0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (b0.a(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                Log.d(f2839h, "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = v0Var.f2943d;
        if (z10 || v0Var.f2942c) {
            drawable.setColorFilter(g(z10 ? v0Var.f2940a : null, v0Var.f2942c ? v0Var.f2941b : f2841j, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10) {
        return k(context, i10, false);
    }

    synchronized Drawable k(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10, boolean z10) {
        Drawable drawableR;
        d(context);
        drawableR = r(context, i10);
        if (drawableR == null) {
            drawableR = f(context, i10);
        }
        if (drawableR == null) {
            drawableR = androidx.core.content.d.i(context, i10);
        }
        if (drawableR != null) {
            drawableR = v(context, i10, z10, drawableR);
        }
        if (drawableR != null) {
            b0.b(drawableR);
        }
        return drawableR;
    }

    synchronized ColorStateList m(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10) {
        ColorStateList colorStateListN;
        colorStateListN = n(context, i10);
        if (colorStateListN == null) {
            f fVar = this.f2852g;
            colorStateListN = fVar == null ? null : fVar.b(context, i10);
            if (colorStateListN != null) {
                c(context, i10, colorStateListN);
            }
        }
        return colorStateListN;
    }

    PorterDuff.Mode o(int i10) {
        f fVar = this.f2852g;
        if (fVar == null) {
            return null;
        }
        return fVar.c(i10);
    }

    public synchronized void s(@androidx.annotation.n0 Context context) {
        androidx.collection.x0<WeakReference<Drawable.ConstantState>> x0Var = this.f2849d.get(context);
        if (x0Var != null) {
            x0Var.b();
        }
    }

    synchronized Drawable t(@androidx.annotation.n0 Context context, @androidx.annotation.n0 g1 g1Var, @androidx.annotation.v int i10) {
        Drawable drawableR = r(context, i10);
        if (drawableR == null) {
            drawableR = g1Var.a(i10);
        }
        if (drawableR == null) {
            return null;
        }
        return v(context, i10, false, drawableR);
    }

    public synchronized void u(f fVar) {
        this.f2852g = fVar;
    }

    boolean x(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10, @androidx.annotation.n0 Drawable drawable) {
        f fVar = this.f2852g;
        return fVar != null && fVar.e(context, i10, drawable);
    }
}
