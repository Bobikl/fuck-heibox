package com.max.hbcustomview.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.core.view.j1;
import androidx.transition.Visibility;
import androidx.transition.q;
import androidx.transition.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: ObliqueSlide.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends Visibility {
    private static final int G2 = 1;
    private static final String K3 = "android:slide:screenPosition";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f69672p3 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private i f69673p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f69674p2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private int f69675x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private i f69676x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f69677y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private i f69678y2;
    private static final TimeInterpolator G3 = new DecelerateInterpolator();
    private static final TimeInterpolator J3 = new AccelerateInterpolator();
    private static final i L3 = new a();
    private static final i M3 = new C0565b();
    private static final i N3 = new c();
    private static final i O3 = new d();
    private static final i P3 = new e();
    private static final i Q3 = new f();

    /* JADX INFO: compiled from: ObliqueSlide.java */
    public class a extends j {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(null);
        }

        @Override // com.max.hbcustomview.transition.b.i
        public float b(ViewGroup viewGroup, View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view}, this, changeQuickRedirect, false, bb.c.f.Cv, new Class[]{ViewGroup.class, View.class}, Float.TYPE);
            return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: com.max.hbcustomview.transition.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ObliqueSlide.java */
    public class C0565b extends j {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0565b() {
            super(null);
        }

        @Override // com.max.hbcustomview.transition.b.i
        public float b(ViewGroup viewGroup, View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view}, this, changeQuickRedirect, false, bb.c.f.Dv, new Class[]{ViewGroup.class, View.class}, Float.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Float) patchProxyResultProxy.result).floatValue();
            }
            return j1.Z(viewGroup) == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: compiled from: ObliqueSlide.java */
    public class c extends k {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(null);
        }

        @Override // com.max.hbcustomview.transition.b.i
        public float a(ViewGroup viewGroup, View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view}, this, changeQuickRedirect, false, bb.c.f.Ev, new Class[]{ViewGroup.class, View.class}, Float.TYPE);
            return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* JADX INFO: compiled from: ObliqueSlide.java */
    public class d extends j {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(null);
        }

        @Override // com.max.hbcustomview.transition.b.i
        public float b(ViewGroup viewGroup, View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view}, this, changeQuickRedirect, false, bb.c.f.Fv, new Class[]{ViewGroup.class, View.class}, Float.TYPE);
            return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: compiled from: ObliqueSlide.java */
    public class e extends j {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(null);
        }

        @Override // com.max.hbcustomview.transition.b.i
        public float b(ViewGroup viewGroup, View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view}, this, changeQuickRedirect, false, bb.c.f.Gv, new Class[]{ViewGroup.class, View.class}, Float.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Float) patchProxyResultProxy.result).floatValue();
            }
            return j1.Z(viewGroup) == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: compiled from: ObliqueSlide.java */
    public class f extends k {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
            super(null);
        }

        @Override // com.max.hbcustomview.transition.b.i
        public float a(ViewGroup viewGroup, View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view}, this, changeQuickRedirect, false, bb.c.f.Hv, new Class[]{ViewGroup.class, View.class}, Float.TYPE);
            return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* JADX INFO: compiled from: ObliqueSlide.java */
    public class g extends l {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcustomview.transition.b.i
        public float a(ViewGroup viewGroup, View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view}, this, changeQuickRedirect, false, bb.c.f.Jv, new Class[]{ViewGroup.class, View.class}, Float.TYPE);
            return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : view.getTranslationY() + b.this.f69674p2;
        }

        @Override // com.max.hbcustomview.transition.b.i
        public float b(ViewGroup viewGroup, View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view}, this, changeQuickRedirect, false, bb.c.f.Iv, new Class[]{ViewGroup.class, View.class}, Float.TYPE);
            return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : view.getTranslationX() + b.this.f69677y1;
        }
    }

    /* JADX INFO: compiled from: ObliqueSlide.java */
    public class h extends l {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcustomview.transition.b.i
        public float a(ViewGroup viewGroup, View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view}, this, changeQuickRedirect, false, bb.c.f.Lv, new Class[]{ViewGroup.class, View.class}, Float.TYPE);
            return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : view.getTranslationY() - b.this.f69674p2;
        }

        @Override // com.max.hbcustomview.transition.b.i
        public float b(ViewGroup viewGroup, View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view}, this, changeQuickRedirect, false, bb.c.f.Kv, new Class[]{ViewGroup.class, View.class}, Float.TYPE);
            return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : view.getTranslationX() - b.this.f69677y1;
        }
    }

    /* JADX INFO: compiled from: ObliqueSlide.java */
    public interface i {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* JADX INFO: compiled from: ObliqueSlide.java */
    public static abstract class j implements i {
        public static ChangeQuickRedirect changeQuickRedirect;

        private j() {
        }

        /* synthetic */ j(a aVar) {
            this();
        }

        @Override // com.max.hbcustomview.transition.b.i
        public float a(ViewGroup viewGroup, View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view}, this, changeQuickRedirect, false, bb.c.f.Mv, new Class[]{ViewGroup.class, View.class}, Float.TYPE);
            return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : view.getTranslationY();
        }
    }

    /* JADX INFO: compiled from: ObliqueSlide.java */
    public static abstract class k implements i {
        public static ChangeQuickRedirect changeQuickRedirect;

        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.max.hbcustomview.transition.b.i
        public float b(ViewGroup viewGroup, View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view}, this, changeQuickRedirect, false, bb.c.f.Nv, new Class[]{ViewGroup.class, View.class}, Float.TYPE);
            return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : view.getTranslationX();
        }
    }

    /* JADX INFO: compiled from: ObliqueSlide.java */
    public static abstract class l implements i {
        protected l() {
        }
    }

    /* JADX INFO: compiled from: ObliqueSlide.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface m {
    }

    public b() {
        this.f69673p1 = Q3;
        this.f69675x1 = 80;
        this.f69677y1 = -1;
        this.f69674p2 = -1;
        this.f69676x2 = new g();
        this.f69678y2 = new h();
        U0(80);
    }

    public b(int i10) {
        this.f69673p1 = Q3;
        this.f69675x1 = 80;
        this.f69677y1 = -1;
        this.f69674p2 = -1;
        this.f69676x2 = new g();
        this.f69678y2 = new h();
        U0(i10);
    }

    public b(int i10, int i11, int i12) {
        this.f69673p1 = Q3;
        this.f69675x1 = 80;
        this.f69677y1 = -1;
        this.f69674p2 = -1;
        this.f69676x2 = new g();
        this.f69678y2 = new h();
        U0(i10);
        this.f69677y1 = i11;
        this.f69674p2 = i12;
    }

    private void I0(z zVar) {
        if (PatchProxy.proxy(new Object[]{zVar}, this, changeQuickRedirect, false, bb.c.f.wv, new Class[]{z.class}, Void.TYPE).isSupported) {
            return;
        }
        int[] iArr = new int[2];
        zVar.f27974b.getLocationOnScreen(iArr);
        zVar.f27973a.put(K3, iArr);
    }

    @Override // androidx.transition.Visibility
    public Animator M0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view, zVar, zVar2}, this, changeQuickRedirect, false, bb.c.f.Av, new Class[]{ViewGroup.class, View.class, z.class, z.class}, Animator.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animator) patchProxyResultProxy.result;
        }
        if (zVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) zVar2.f27973a.get(K3);
        return com.max.hbcustomview.transition.c.a(view, zVar2, iArr[0], iArr[1], this.f69673p1.b(viewGroup, view), this.f69673p1.a(viewGroup, view), view.getTranslationX(), view.getTranslationY(), G3, this);
    }

    @Override // androidx.transition.Visibility
    public Animator O0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view, zVar, zVar2}, this, changeQuickRedirect, false, bb.c.f.Bv, new Class[]{ViewGroup.class, View.class, z.class, z.class}, Animator.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animator) patchProxyResultProxy.result;
        }
        if (zVar == null) {
            return null;
        }
        int[] iArr = (int[]) zVar.f27973a.get(K3);
        return com.max.hbcustomview.transition.c.a(view, zVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f69673p1.b(viewGroup, view), this.f69673p1.a(viewGroup, view), J3, this);
    }

    public int T0() {
        return this.f69675x1;
    }

    public void U0(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.zv, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 1) {
            this.f69673p1 = this.f69676x2;
        } else if (i10 == 2) {
            this.f69673p1 = this.f69678y2;
        } else if (i10 == 3) {
            this.f69673p1 = L3;
        } else if (i10 == 5) {
            this.f69673p1 = O3;
        } else if (i10 == 48) {
            this.f69673p1 = N3;
        } else if (i10 == 80) {
            this.f69673p1 = Q3;
        } else if (i10 == 8388611) {
            this.f69673p1 = M3;
        } else {
            if (i10 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f69673p1 = P3;
        }
        this.f69675x1 = i10;
        q qVar = new q();
        qVar.k(i10);
        B0(qVar);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void j(@n0 z zVar) {
        if (PatchProxy.proxy(new Object[]{zVar}, this, changeQuickRedirect, false, bb.c.f.yv, new Class[]{z.class}, Void.TYPE).isSupported) {
            return;
        }
        super.j(zVar);
        I0(zVar);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void m(@n0 z zVar) {
        if (PatchProxy.proxy(new Object[]{zVar}, this, changeQuickRedirect, false, bb.c.f.xv, new Class[]{z.class}, Void.TYPE).isSupported) {
            return;
        }
        super.m(zVar);
        I0(zVar);
    }
}
