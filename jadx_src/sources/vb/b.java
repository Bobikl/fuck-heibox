package vb;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.n0;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: BannerManager.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f140834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f140835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CompositePageTransformer f140836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MarginPageTransformer f140837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ViewPager2.PageTransformer f140838e;

    public b() {
        c cVar = new c();
        this.f140834a = cVar;
        this.f140835b = new a(cVar);
        this.f140836c = new CompositePageTransformer();
    }

    public void a(@n0 ViewPager2.PageTransformer pageTransformer) {
        if (PatchProxy.proxy(new Object[]{pageTransformer}, this, changeQuickRedirect, false, bb.c.f.Qg, new Class[]{ViewPager2.PageTransformer.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f140836c.addTransformer(pageTransformer);
    }

    public void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Vg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g();
        MarginPageTransformer marginPageTransformer = new MarginPageTransformer(this.f140834a.r());
        this.f140837d = marginPageTransformer;
        this.f140836c.addTransformer(marginPageTransformer);
    }

    public c c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Og, new Class[0], c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        if (this.f140834a == null) {
            this.f140834a = new c();
        }
        return this.f140834a;
    }

    public CompositePageTransformer d() {
        return this.f140836c;
    }

    public void e(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, bb.c.f.Pg, new Class[]{Context.class, AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f140835b.a(context, attributeSet);
    }

    public void f() {
        ViewPager2.PageTransformer pageTransformer;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Tg, new Class[0], Void.TYPE).isSupported || (pageTransformer = this.f140838e) == null) {
            return;
        }
        this.f140836c.removeTransformer(pageTransformer);
    }

    public void g() {
        MarginPageTransformer marginPageTransformer;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Sg, new Class[0], Void.TYPE).isSupported || (marginPageTransformer = this.f140837d) == null) {
            return;
        }
        this.f140836c.removeTransformer(marginPageTransformer);
    }

    public void h(@n0 ViewPager2.PageTransformer pageTransformer) {
        if (PatchProxy.proxy(new Object[]{pageTransformer}, this, changeQuickRedirect, false, bb.c.f.Rg, new Class[]{ViewPager2.PageTransformer.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f140836c.removeTransformer(pageTransformer);
    }

    public void i(boolean z10, float f10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.Wg, new Class[]{Boolean.TYPE, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f();
        if (z10) {
            this.f140838e = new wb.a(this.f140834a.q(), f10, 0.0f, 1.0f, 0.0f);
        } else {
            this.f140838e = new wb.b(f10);
        }
        this.f140836c.addTransformer(this.f140838e);
    }

    public void j(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Ug, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f140834a.W(i10);
    }
}
