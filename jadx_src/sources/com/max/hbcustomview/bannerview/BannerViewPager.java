package com.max.hbcustomview.bannerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k0;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.zhpan.indicator.IndicatorView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class BannerViewPager<T> extends RelativeLayout implements x {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f68985t = "SUPER_STATE";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f68986u = "CURRENT_POSITION";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f68987v = "IS_CUSTOM_INDICATOR";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f68988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f68989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f68990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f68991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.zhpan.indicator.base.a f68992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected RelativeLayout f68993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ViewPager2 f68994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected vb.b f68995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler f68996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected d<T> f68997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ViewPager2.OnPageChangeCallback f68998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f68999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f69000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Path f69001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f69002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f69003q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ViewPager2.OnPageChangeCallback f69004r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Lifecycle f69005s;

    public class a extends ViewPager2.OnPageChangeCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32289gg, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageScrollStateChanged(i10);
            BannerViewPager.e(BannerViewPager.this, i10);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32243eg, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageScrolled(i10, f10, i11);
            BannerViewPager.this.H(i10, f10, i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32266fg, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageSelected(i10);
            BannerViewPager.this.I(i10);
        }
    }

    public interface b {
        void a(View view, int i10);
    }

    public BannerViewPager(Context context) {
        this(context, null);
    }

    public BannerViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerViewPager(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68996j = new Handler(Looper.getMainLooper());
        this.f68999m = new Runnable() { // from class: com.max.hbcustomview.bannerview.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f69007b.p();
            }
        };
        this.f69004r = new a();
        r(context, attributeSet);
    }

    private boolean B() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ve, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f68995i.c().y();
    }

    private boolean C() {
        d<T> dVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.We, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        vb.b bVar = this.f68995i;
        return (bVar == null || bVar.c() == null || !this.f68995i.c().z() || (dVar = this.f68997k) == null || dVar.r() <= 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(List list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.f.f32196cg, new Class[]{List.class}, Void.TYPE).isSupported || !isAttachedToWindow() || list == null || this.f68997k == null) {
            return;
        }
        D0();
        this.f68997k.y(list);
        this.f68997k.notifyDataSetChanged();
        Q(getCurrentItem());
        K(list);
        B0();
    }

    private void E(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Be, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (i11 <= i12) {
            if (i12 > i11) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (this.f68995i.c().z()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (this.f68988b != 0 || i10 - this.f69002p <= 0) {
            getParent().requestDisallowInterceptTouchEvent(this.f68988b != getData().size() - 1 || i10 - this.f69002p >= 0);
        } else {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
    }

    private void F(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Ae, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (i12 <= i11) {
            if (i11 > i12) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (this.f68995i.c().z()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (this.f68988b != 0 || i10 - this.f69003q <= 0) {
            getParent().requestDisallowInterceptTouchEvent(this.f68988b != getData().size() - 1 || i10 - this.f69003q >= 0);
        } else {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
    }

    private void G(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Ce, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.zhpan.indicator.base.a aVar = this.f68992f;
        if (aVar != null) {
            aVar.onPageScrollStateChanged(i10);
        }
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f68998l;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrollStateChanged(i10);
        }
    }

    private void K(List<? extends T> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.f.Re, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        setIndicatorValues(list);
        this.f68995i.c().h().q(xb.a.c(this.f68994h.getCurrentItem(), list.size()));
        this.f68992f.a();
    }

    private void Q(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Qe, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (C()) {
            this.f68994h.setCurrentItem(xb.a.b(this.f68997k.r()) + i10, false);
        } else {
            this.f68994h.setCurrentItem(i10, false);
        }
    }

    static /* synthetic */ void e(BannerViewPager bannerViewPager, int i10) {
        if (PatchProxy.proxy(new Object[]{bannerViewPager, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.f.f32220dg, new Class[]{BannerViewPager.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        bannerViewPager.G(i10);
    }

    private int getInterval() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Te, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f68995i.c().l();
    }

    private List<Integer> getIntervalList() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ue, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : this.f68995i.c().m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        d<T> dVar;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Fe, new Class[0], Void.TYPE).isSupported && isAttachedToWindow() && (dVar = this.f68997k) != null && dVar.r() > 1 && B()) {
            ViewPager2 viewPager2 = this.f68994h;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            this.f68996j.postDelayed(this.f68999m, getCurrentInterval());
        }
    }

    private void r(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, bb.c.f.f32583te, new Class[]{Context.class, AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        vb.b bVar = new vb.b();
        this.f68995i = bVar;
        bVar.e(context, attributeSet);
        z();
    }

    private void s() {
        List<? extends T> listP;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ge, new Class[0], Void.TYPE).isSupported || (listP = this.f68997k.p()) == null) {
            return;
        }
        setIndicatorValues(listP);
        setupViewPager(listP);
        y();
    }

    private void setIndicatorValues(List<? extends T> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.f.He, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        vb.c cVarC = this.f68995i.c();
        this.f68993g.setVisibility(cVarC.k());
        cVarC.E();
        if (!this.f68989c || this.f68992f == null) {
            this.f68992f = new IndicatorView(getContext());
        }
        t(cVarC.h(), list);
    }

    private void setupViewPager(List<T> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.f.Ne, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f68997k == null) {
            throw new NullPointerException("You must set adapter for BannerViewPager");
        }
        vb.c cVarC = this.f68995i.c();
        com.max.hbcustomview.bannerview.provider.a.a(this.f68994h, cVarC.x());
        this.f68988b = 0;
        this.f68997k.x(cVarC.z());
        this.f68997k.z(this.f68991e);
        this.f68994h.setAdapter(this.f68997k);
        if (C()) {
            this.f68994h.setCurrentItem(xb.a.b(list.size()), false);
        }
        this.f68994h.unregisterOnPageChangeCallback(this.f69004r);
        this.f68994h.registerOnPageChangeCallback(this.f69004r);
        this.f68994h.setOrientation(cVarC.q());
        this.f68994h.setOffscreenPageLimit(cVarC.p());
        x(cVarC);
        w(cVarC.t());
        B0();
    }

    private void t(ch.b bVar, List<? extends T> list) {
        if (PatchProxy.proxy(new Object[]{bVar, list}, this, changeQuickRedirect, false, bb.c.f.Ie, new Class[]{ch.b.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (((View) this.f68992f).getParent() == null) {
            this.f68993g.removeAllViews();
            this.f68993g.addView((View) this.f68992f);
            v();
            u();
        }
        this.f68992f.setIndicatorOptions(bVar);
        bVar.v(list.size());
        this.f68992f.a();
    }

    private void u() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Je, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((View) this.f68992f).getLayoutParams();
        int iD = this.f68995i.c().d();
        if (iD == 0) {
            layoutParams.addRule(14);
        } else if (iD == 2) {
            layoutParams.addRule(9);
        } else {
            if (iD != 4) {
                return;
            }
            layoutParams.addRule(11);
        }
    }

    private void v() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ke, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) this.f68992f).getLayoutParams();
        vb.c.a aVarF = this.f68995i.c().f();
        if (aVarF != null) {
            marginLayoutParams.setMargins(aVarF.b(), aVarF.d(), aVarF.c(), aVarF.a());
        } else {
            int iA = xb.a.a(10.0f);
            marginLayoutParams.setMargins(iA, iA, iA, iA);
        }
    }

    private void w(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Pe, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        float fS = this.f68995i.c().s();
        if (i10 == 4) {
            this.f68995i.i(true, fS);
        } else if (i10 == 8) {
            this.f68995i.i(false, fS);
        }
    }

    private void x(vb.c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.Oe, new Class[]{vb.c.class}, Void.TYPE).isSupported) {
            return;
        }
        int iU = cVar.u();
        int iN = cVar.n();
        if (iN != -1000 || iU != -1000) {
            RecyclerView recyclerView = (RecyclerView) this.f68994h.getChildAt(0);
            int iQ = cVar.q();
            int iR = cVar.r() + iU;
            int iR2 = cVar.r() + iN;
            if (iQ == 0) {
                recyclerView.setPadding(iR2, 0, iR, 0);
            } else if (iQ == 1) {
                recyclerView.setPadding(0, iR2, 0, iR);
            }
            recyclerView.setClipToPadding(false);
        }
        this.f68995i.b();
    }

    private void y() {
        int iV;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Me, new Class[0], Void.TYPE).isSupported && (iV = this.f68995i.c().v()) > 0) {
            com.max.hbcustomview.bannerview.provider.c.a(this, iV);
        }
    }

    public void A(int i10, T t10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), t10}, this, changeQuickRedirect, false, bb.c.f.Kf, new Class[]{Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        List<? extends T> listP = this.f68997k.p();
        if (!isAttachedToWindow() || i10 < 0 || i10 > listP.size()) {
            return;
        }
        listP.add(i10, t10);
        this.f68997k.notifyDataSetChanged();
        Q(getCurrentItem());
        K(listP);
    }

    public BannerViewPager<T> A0(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32173bg, new Class[]{Boolean.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().g0(z10);
        return this;
    }

    public void B0() {
        d<T> dVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32149af, new Class[0], Void.TYPE).isSupported || this.f68990d || !B() || (dVar = this.f68997k) == null || dVar.r() <= 1) {
            return;
        }
        this.f68996j.postDelayed(this.f68999m, getCurrentInterval());
        this.f68990d = true;
    }

    public void C0() {
        d<T> dVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32172bf, new Class[0], Void.TYPE).isSupported || this.f68990d || !B() || (dVar = this.f68997k) == null || dVar.r() <= 1) {
            return;
        }
        this.f68996j.post(this.f68999m);
        this.f68990d = true;
    }

    public void D0() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32195cf, new Class[0], Void.TYPE).isSupported && this.f68990d) {
            this.f68996j.removeCallbacks(this.f68999m);
            this.f68990d = false;
        }
    }

    public BannerViewPager<T> E0(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32150ag, new Class[]{Boolean.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().e0(z10);
        return this;
    }

    public void H(int i10, float f10, int i11) {
        Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Ee, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported) {
            return;
        }
        int iR = this.f68997k.r();
        this.f68995i.c().z();
        int iC = xb.a.c(i10, iR);
        if (iR > 0) {
            ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f68998l;
            if (onPageChangeCallback != null) {
                onPageChangeCallback.onPageScrolled(iC, f10, i11);
            }
            com.zhpan.indicator.base.a aVar = this.f68992f;
            if (aVar != null) {
                aVar.onPageScrolled(iC, f10, i11);
            }
        }
    }

    public void I(int i10) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.De, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int iR = this.f68997k.r();
        boolean z11 = this.f68995i.c().z();
        int iC = xb.a.c(i10, iR);
        this.f68988b = iC;
        if (iR <= 0 || !z11 || (i10 != 0 && i10 != 999)) {
            z10 = false;
        }
        if (z10) {
            Q(iC);
        }
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f68998l;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageSelected(this.f68988b);
        }
        com.zhpan.indicator.base.a aVar = this.f68992f;
        if (aVar != null) {
            aVar.onPageSelected(this.f68988b);
        }
    }

    public void J(final List<? extends T> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.f.Hf, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        post(new Runnable() { // from class: com.max.hbcustomview.bannerview.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f69008b.D(list);
            }
        });
    }

    public BannerViewPager<T> L(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.f68998l = onPageChangeCallback;
        return this;
    }

    public void M() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32426mf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f68995i.f();
    }

    public void N(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Jf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        List<? extends T> listP = this.f68997k.p();
        if (!isAttachedToWindow() || i10 < 0 || i10 >= listP.size()) {
            return;
        }
        listP.remove(i10);
        this.f68997k.notifyDataSetChanged();
        Q(getCurrentItem());
        K(listP);
    }

    public void O() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32449nf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f68995i.g();
    }

    public void P(@p0 ViewPager2.PageTransformer pageTransformer) {
        if (PatchProxy.proxy(new Object[]{pageTransformer}, this, changeQuickRedirect, false, bb.c.f.f32403lf, new Class[]{ViewPager2.PageTransformer.class}, Void.TYPE).isSupported || pageTransformer == null) {
            return;
        }
        this.f68995i.h(pageTransformer);
    }

    public BannerViewPager<T> R(d<T> dVar) {
        this.f68997k = dVar;
        return this;
    }

    public BannerViewPager<T> S(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32265ff, new Class[]{Boolean.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().F(z10);
        if (B()) {
            this.f68995i.c().G(true);
        }
        return this;
    }

    public BannerViewPager<T> T(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32288gf, new Class[]{Boolean.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().G(z10);
        if (!z10) {
            this.f68995i.c().F(false);
        }
        return this;
    }

    public BannerViewPager<T> U(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32716zf, new Class[]{Integer.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().J(i10);
        return this;
    }

    public BannerViewPager<T> V(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32650wf, new Class[]{Integer.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().K(i10);
        return this;
    }

    public BannerViewPager<T> W(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Sf, new Class[]{cls, cls, cls, cls}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().L(i10, i11, i12, i13);
        return this;
    }

    public BannerViewPager<T> X(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Af, new Class[]{Integer.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().M(i10);
        return this;
    }

    public BannerViewPager<T> Y(@l int i10, @l int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32540rf, new Class[]{cls, cls}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().N(i10, i11);
        return this;
    }

    public BannerViewPager<T> Z(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32672xf, new Class[]{Integer.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().I(i10);
        return this;
    }

    public BannerViewPager<T> a0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32562sf, new Class[]{Integer.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        b0(i10, i10);
        return this;
    }

    public BannerViewPager<T> b0(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32584tf, new Class[]{cls, cls}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().O(i10 * 2, i11 * 2);
        return this;
    }

    public BannerViewPager<T> c0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32606uf, new Class[]{Integer.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        d0(i10, i10);
        return this;
    }

    public BannerViewPager<T> d0(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32628vf, new Class[]{cls, cls}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().O(i10, i11);
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.Le, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        float[] fArrW = this.f68995i.c().w();
        RectF rectF = this.f69000n;
        if (rectF != null && this.f69001o != null && fArrW != null) {
            rectF.right = getWidth();
            this.f69000n.bottom = getHeight();
            this.f69001o.addRoundRect(this.f69000n, fArrW, Path.Direction.CW);
            canvas.clipPath(this.f69001o);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.f32693ye, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f68990d = true;
            D0();
        } else if (action == 1 || action == 3 || action == 4) {
            this.f68990d = false;
            B0();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public BannerViewPager<T> e0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Bf, new Class[]{Integer.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().P(i10);
        return this;
    }

    public void f(List<? extends T> list) {
        d<T> dVar;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.f.If, new Class[]{List.class}, Void.TYPE).isSupported || !isAttachedToWindow() || list == null || (dVar = this.f68997k) == null) {
            return;
        }
        List<? extends T> listP = dVar.p();
        listP.addAll(list);
        this.f68997k.notifyDataSetChanged();
        Q(getCurrentItem());
        K(listP);
    }

    public BannerViewPager<T> f0(com.zhpan.indicator.base.a aVar) {
        if (aVar instanceof View) {
            this.f68989c = true;
            this.f68992f = aVar;
        }
        return this;
    }

    public void g(@n0 RecyclerView.ItemDecoration itemDecoration) {
        if (PatchProxy.proxy(new Object[]{itemDecoration}, this, changeQuickRedirect, false, bb.c.f.Gf, new Class[]{RecyclerView.ItemDecoration.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68994h.addItemDecoration(itemDecoration);
    }

    public BannerViewPager<T> g0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32694yf, new Class[]{Integer.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().Q(i10);
        return this;
    }

    public d<T> getAdapter() {
        return this.f68997k;
    }

    public int getCurrentInterval() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Se, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return (getIntervalList() == null || getIntervalList().size() <= 0 || this.f68988b >= getIntervalList().size()) ? getInterval() : getIntervalList().get(this.f68988b).intValue();
    }

    public int getCurrentItem() {
        return this.f68988b;
    }

    public List<T> getData() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ze, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        d<T> dVar = this.f68997k;
        return dVar != null ? dVar.p() : Collections.emptyList();
    }

    public ViewPager2 getViewPager() {
        return this.f68994h;
    }

    public void h(@n0 RecyclerView.ItemDecoration itemDecoration, int i10) {
        if (PatchProxy.proxy(new Object[]{itemDecoration, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Ff, new Class[]{RecyclerView.ItemDecoration.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!C()) {
            this.f68994h.addItemDecoration(itemDecoration, i10);
            return;
        }
        int iR = this.f68997k.r();
        int currentItem = this.f68994h.getCurrentItem();
        this.f68995i.c().z();
        int iC = xb.a.c(currentItem, iR);
        if (currentItem != i10) {
            if (i10 == 0 && iC == iR - 1) {
                this.f68994h.addItemDecoration(itemDecoration, currentItem + 1);
            } else if (iC == 0 && i10 == iR - 1) {
                this.f68994h.addItemDecoration(itemDecoration, currentItem - 1);
            } else {
                this.f68994h.addItemDecoration(itemDecoration, currentItem + (i10 - iC));
            }
        }
    }

    public BannerViewPager<T> h0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32311hf, new Class[]{Integer.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().R(i10);
        return this;
    }

    public BannerViewPager<T> i(@p0 ViewPager2.PageTransformer pageTransformer) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pageTransformer}, this, changeQuickRedirect, false, bb.c.f.f32380kf, new Class[]{ViewPager2.PageTransformer.class}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        if (pageTransformer != null) {
            this.f68995i.a(pageTransformer);
        }
        return this;
    }

    public BannerViewPager<T> i0(List<Integer> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.f.f6if, new Class[]{List.class}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().S(list);
        return this;
    }

    public BannerViewPager<T> j0(@n0 Lifecycle lifecycle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{lifecycle}, this, changeQuickRedirect, false, bb.c.f.Uf, new Class[]{Lifecycle.class}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f69005s = lifecycle;
        lifecycle.a(this);
        return this;
    }

    public void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Df, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        m(new ArrayList());
    }

    public BannerViewPager<T> k0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Rf, new Class[]{Integer.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().U(i10);
        return this;
    }

    public BannerViewPager<T> l0(b bVar) {
        this.f68991e = bVar;
        return this;
    }

    public void m(List<T> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.f.Cf, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        d<T> dVar = this.f68997k;
        if (dVar == null) {
            throw new NullPointerException("You must set adapter for BannerViewPager");
        }
        dVar.y(list);
        s();
    }

    public BannerViewPager<T> m0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Ef, new Class[]{Integer.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().V(i10);
        return this;
    }

    @Deprecated
    public BannerViewPager<T> n(boolean z10) {
        this.f68995i.c().H(z10);
        return this;
    }

    public BannerViewPager<T> n0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32472of, new Class[]{Integer.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.j(i10);
        return this;
    }

    public BannerViewPager<T> o(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Yf, new Class[]{Boolean.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().H(z10);
        return this;
    }

    public BannerViewPager<T> o0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Nf, new Class[]{Integer.TYPE}, BannerViewPager.class);
        return patchProxyResultProxy.isSupported ? (BannerViewPager) patchProxyResultProxy.result : p0(i10, 0.85f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32671xe, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        vb.b bVar = this.f68995i;
        if (bVar == null || !bVar.c().C()) {
            return;
        }
        B0();
    }

    @k0(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Xf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        D0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32649we, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        vb.b bVar = this.f68995i;
        if (bVar != null && bVar.c().C()) {
            D0();
        }
        Lifecycle lifecycle = this.f69005s;
        if (lifecycle != null) {
            lifecycle.d(this);
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d<T> dVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.f32715ze, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.f68994h.isUserInputEnabled() || ((dVar = this.f68997k) != null && dVar.p().size() <= 1)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f69002p = (int) motionEvent.getX();
            this.f69003q = (int) motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true ^ this.f68995i.c().A());
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (action == 2) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int iAbs = Math.abs(x10 - this.f69002p);
            int iAbs2 = Math.abs(y10 - this.f69003q);
            int iQ = this.f68995i.c().q();
            if (iQ == 1) {
                F(y10, iAbs, iAbs2);
            } else if (iQ == 0) {
                E(x10, iAbs, iAbs2);
            }
        } else if (action == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @k0(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Vf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        D0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.proxy(new Object[]{parcelable}, this, changeQuickRedirect, false, bb.c.f.Ye, new Class[]{Parcelable.class}, Void.TYPE).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable(f68985t));
        this.f68988b = bundle.getInt(f68986u);
        this.f68989c = bundle.getBoolean(f68987v);
        setCurrentItem(this.f68988b, false);
    }

    @k0(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Wf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        B0();
    }

    @Override // android.view.View
    @p0
    public Parcelable onSaveInstanceState() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Xe, new Class[0], Parcelable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Parcelable) patchProxyResultProxy.result;
        }
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable(f68985t, parcelableOnSaveInstanceState);
        bundle.putInt(f68986u, this.f68988b);
        bundle.putBoolean(f68987v, this.f68989c);
        return bundle;
    }

    public BannerViewPager<T> p0(int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.Of, new Class[]{Integer.TYPE, Float.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().Y(i10);
        this.f68995i.c().X(f10);
        return this;
    }

    public BannerViewPager<T> q0(@p0 ViewPager2.PageTransformer pageTransformer) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pageTransformer}, this, changeQuickRedirect, false, bb.c.f.f32357jf, new Class[]{ViewPager2.PageTransformer.class}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        if (pageTransformer != null) {
            this.f68994h.setPageTransformer(pageTransformer);
        }
        return this;
    }

    public BannerViewPager<T> r0(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Zf, new Class[]{Boolean.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68994h.setLayoutDirection(z10 ? 1 : 0);
        this.f68995i.c().c0(z10);
        return this;
    }

    public BannerViewPager<T> s0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Pf, new Class[]{Integer.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        t0(i10, i10);
        return this;
    }

    public void setCurrentItem(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Lf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setCurrentItem(i10, true);
    }

    public void setCurrentItem(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Mf, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!C()) {
            this.f68994h.setCurrentItem(i10, z10);
            return;
        }
        int iR = this.f68997k.r();
        if (i10 >= iR) {
            i10 = iR - 1;
        }
        int currentItem = this.f68994h.getCurrentItem();
        this.f68995i.c().z();
        int iC = xb.a.c(currentItem, iR);
        if (currentItem != i10) {
            if (i10 == 0 && iC == iR - 1) {
                this.f68994h.setCurrentItem(currentItem + 1, z10);
            } else if (iC == 0 && i10 == iR - 1) {
                this.f68994h.setCurrentItem(currentItem - 1, z10);
            } else {
                this.f68994h.setCurrentItem(currentItem + (i10 - iC), z10);
            }
        }
    }

    public void setLayoutHeight(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32605ue, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, i10);
        } else {
            layoutParams.height = i10;
        }
        setLayoutParams(layoutParams);
    }

    public void setViewPagerPageMargin(int i10) {
        ViewPager2 viewPager2;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32495pf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (viewPager2 = this.f68994h) == null) {
            return;
        }
        View childAt = viewPager2.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            childAt.setPadding(i10, 0, i10, 0);
            ((RecyclerView) childAt).setClipToPadding(false);
        }
    }

    public BannerViewPager<T> t0(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Qf, new Class[]{cls, cls}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().Z(i11);
        this.f68995i.c().T(i10);
        return this;
    }

    public BannerViewPager<T> u0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32219df, new Class[]{Integer.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().a0(i10);
        return this;
    }

    public BannerViewPager<T> v0(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32242ef, new Class[]{cls, cls, cls, cls}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f69000n = new RectF();
        this.f69001o = new Path();
        this.f68995i.c().b0(i10, i11, i12, i13);
        return this;
    }

    @Deprecated
    public BannerViewPager<T> w0(int i10) {
        return u0(i10);
    }

    @Deprecated
    public BannerViewPager<T> x0(int i10, int i11, int i12, int i13) {
        return v0(i10, i11, i12, i13);
    }

    public BannerViewPager<T> y0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32518qf, new Class[]{Integer.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().d0(i10);
        return this;
    }

    public void z() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32627ve, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View.inflate(getContext(), R.layout.hbcustomview_bvp_layout, this);
        this.f68994h = (ViewPager2) findViewById(R.id.vp_main);
        this.f68993g = (RelativeLayout) findViewById(R.id.bvp_layout_indicator);
        this.f68994h.setPageTransformer(this.f68995i.d());
    }

    public BannerViewPager<T> z0(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Tf, new Class[]{Boolean.TYPE}, BannerViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (BannerViewPager) patchProxyResultProxy.result;
        }
        this.f68995i.c().f0(z10);
        this.f68994h.setUserInputEnabled(z10);
        return this;
    }
}
