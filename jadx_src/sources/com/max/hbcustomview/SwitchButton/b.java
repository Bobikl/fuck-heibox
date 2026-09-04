package com.max.hbcustomview.SwitchButton;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: Configuration.java */
/* JADX INFO: loaded from: classes10.dex */
public class b implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f68960o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Rect f68964s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f68947b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f68948c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f68949d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f68950e = a.f68966b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f68951f = a.f68965a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f68952g = a.f68967c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f68953h = a.f68968d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f68954i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f68955j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f68956k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f68957l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f68958m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f68959n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f68961p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f68962q = -1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f68963r = 0.0f;

    /* JADX INFO: compiled from: Configuration.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static int f68965a = Color.parseColor("#E3E3E3");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static int f68966b = Color.parseColor("#02BFE7");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static int f68967c = Color.parseColor("#FFFFFF");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static int f68968d = Color.parseColor("#fafafa");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static int f68969e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static int f68970f = 999;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static float f68971g = 2.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static int f68972h = 0;

        a() {
        }
    }

    /* JADX INFO: renamed from: com.max.hbcustomview.SwitchButton.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Configuration.java */
    public static class C0558b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static int f68973a = 24;

        C0558b() {
        }
    }

    private b() {
    }

    public static b a(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, null, changeQuickRedirect, true, c.f.Hc, new Class[]{Float.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        b bVar = new b();
        bVar.f68960o = f10;
        bVar.Z(bVar.b());
        int i10 = a.f68972h;
        bVar.f68964s = new Rect(i10, i10, i10, i10);
        return bVar;
    }

    private Drawable d(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Xc, new Class[]{Integer.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(o());
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    public int B() {
        return this.f68961p;
    }

    public boolean C() {
        Rect rect = this.f68964s;
        return ((rect.left + rect.right) + rect.top) + rect.bottom != 0;
    }

    public void D(Drawable drawable, Drawable drawable2) {
        if (PatchProxy.proxy(new Object[]{drawable, drawable2}, this, changeQuickRedirect, false, c.f.Ic, new Class[]{Drawable.class, Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (drawable2 == null && drawable == null) {
            throw new IllegalArgumentException("back drawable can not be null");
        }
        if (drawable != null) {
            this.f68948c = drawable;
            if (drawable2 != null) {
                this.f68947b = drawable2;
            } else {
                this.f68947b = drawable;
            }
        }
    }

    public void E(int i10) {
        if (i10 > 0) {
            i10 = -i10;
        }
        this.f68964s.bottom = i10;
    }

    public void F(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Uc, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        G(i10);
        J(i11);
        H(i12);
        E(i13);
    }

    public void G(int i10) {
        if (i10 > 0) {
            i10 = -i10;
        }
        this.f68964s.left = i10;
    }

    public void H(int i10) {
        if (i10 > 0) {
            i10 = -i10;
        }
        this.f68964s.right = i10;
    }

    public void J(int i10) {
        if (i10 > 0) {
            i10 = -i10;
        }
        this.f68964s.top = i10;
    }

    public void K(float f10) {
        if (f10 <= 0.0f) {
            this.f68963r = a.f68971g;
        }
        this.f68963r = f10;
    }

    public void M(int i10) {
        this.f68951f = i10;
    }

    void O(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.f.Jc, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (drawable == null) {
            throw new IllegalArgumentException("off drawable can not be null");
        }
        this.f68948c = drawable;
    }

    public void P(int i10) {
        this.f68950e = i10;
    }

    void Q(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.f.Kc, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (drawable == null) {
            throw new IllegalArgumentException("on drawable can not be null");
        }
        this.f68947b = drawable;
    }

    public void R(float f10) {
        this.f68962q = f10;
    }

    public void S(int i10) {
        this.f68952g = i10;
    }

    public void T(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.f.Lc, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (drawable == null) {
            throw new IllegalArgumentException("thumb drawable can not be null");
        }
        this.f68949d = drawable;
    }

    public void U(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Oc, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Y(i10, i10, i10, i10);
    }

    public void V(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Nc, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Y(i10, i10, i11, i11);
    }

    public void X(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Mc, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Y(i10, i11, i12, i12);
    }

    public void Y(int i10, int i11, int i12, int i13) {
        float f10 = this.f68960o;
        this.f68954i = (int) (i10 * f10);
        this.f68955j = (int) (i11 * f10);
        this.f68956k = (int) (i12 * f10);
        this.f68957l = (int) (i13 * f10);
    }

    public void Z(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Pc, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        b0(i10, i10, i10, i10);
    }

    public int b() {
        return (int) (a.f68969e * this.f68960o);
    }

    public void b0(int i10, int i11, int i12, int i13) {
        this.f68954i = i10;
        this.f68955j = i11;
        this.f68956k = i12;
        this.f68957l = i13;
    }

    public float c() {
        return this.f68960o;
    }

    public void c0(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Qc, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        float f10 = this.f68960o;
        d0((int) (i10 * f10), (int) (i11 * f10));
    }

    public void d0(int i10, int i11) {
        if (i10 > 0) {
            this.f68958m = i10;
        }
        if (i11 > 0) {
            this.f68959n = i11;
        }
    }

    public Rect e() {
        return this.f68964s;
    }

    public void e0(int i10) {
        this.f68961p = i10;
    }

    public int f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Vc, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : p() / 2;
    }

    public int g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Wc, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : q() / 2;
    }

    public float h() {
        if (this.f68963r <= 0.0f) {
            this.f68963r = a.f68971g;
        }
        return this.f68963r;
    }

    public int i() {
        return this.f68951f;
    }

    public Drawable j() {
        return this.f68948c;
    }

    public Drawable k() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Rc, new Class[0], Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        Drawable drawable = this.f68948c;
        return drawable != null ? drawable : d(this.f68951f);
    }

    public int l(int i10) {
        return this.f68950e;
    }

    public Drawable m() {
        return this.f68947b;
    }

    public Drawable n() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Sc, new Class[0], Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        Drawable drawable = this.f68947b;
        return drawable != null ? drawable : d(this.f68950e);
    }

    public float o() {
        float f10 = this.f68962q;
        return f10 < 0.0f ? a.f68970f : f10;
    }

    public int p() {
        Rect rect = this.f68964s;
        return rect.left + rect.right;
    }

    public int q() {
        Rect rect = this.f68964s;
        return rect.top + rect.bottom;
    }

    public int r() {
        return this.f68952g;
    }

    public Drawable s() {
        return this.f68949d;
    }

    public Drawable t() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Tc, new Class[0], Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        Drawable drawable = this.f68949d;
        if (drawable != null) {
            return drawable;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawableD = d(this.f68952g);
        Drawable drawableD2 = d(this.f68953h);
        int[] iArr = null;
        try {
            Field declaredField = View.class.getDeclaredField("PRESSED_ENABLED_STATE_SET");
            declaredField.setAccessible(true);
            iArr = (int[]) declaredField.get(null);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (iArr != null) {
            stateListDrawable.addState(iArr, drawableD2);
        }
        stateListDrawable.addState(new int[0], drawableD);
        return stateListDrawable;
    }

    int u() {
        int intrinsicHeight;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Zc, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = this.f68959n;
        if (i10 >= 0) {
            return i10;
        }
        Drawable drawable = this.f68949d;
        if (drawable != null && (intrinsicHeight = drawable.getIntrinsicHeight()) > 0) {
            return intrinsicHeight;
        }
        float f10 = this.f68960o;
        if (f10 > 0.0f) {
            return (int) (C0558b.f68973a * f10);
        }
        throw new IllegalArgumentException("density must be a positive number");
    }

    public int v() {
        return this.f68955j;
    }

    public int w() {
        return this.f68956k;
    }

    public int x() {
        return this.f68957l;
    }

    public int y() {
        return this.f68954i;
    }

    int z() {
        int intrinsicWidth;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Yc, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = this.f68958m;
        if (i10 >= 0) {
            return i10;
        }
        Drawable drawable = this.f68949d;
        if (drawable != null && (intrinsicWidth = drawable.getIntrinsicWidth()) > 0) {
            return intrinsicWidth;
        }
        float f10 = this.f68960o;
        if (f10 > 0.0f) {
            return (int) (C0558b.f68973a * f10);
        }
        throw new IllegalArgumentException("density must be a positive number");
    }
}
