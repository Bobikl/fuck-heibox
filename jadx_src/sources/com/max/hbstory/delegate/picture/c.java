package com.max.hbstory.delegate.picture;

import android.os.Handler;
import android.os.Looper;
import androidx.viewpager2.widget.ViewPager2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: PictureViewPager2Delegate.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nPictureViewPager2Delegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureViewPager2Delegate.kt\ncom/max/hbstory/delegate/picture/BannerController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n1#2:252\n*E\n"})
public final class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private ViewPager2 f72905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Handler f72906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private Runnable f72907c;

    /* JADX INFO: compiled from: PictureViewPager2Delegate.kt */
    public static final class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f72908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f72909c;

        a(h hVar, c cVar) {
            this.f72908b = hVar;
            this.f72909c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33553fg, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f72908b.run();
            this.f72909c.f72906b.postDelayed(this, this.f72908b.a());
        }
    }

    public c(@dl.d ViewPager2 viewPager) {
        f0.p(viewPager, "viewPager");
        this.f72905a = viewPager;
        this.f72906b = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ void e(c cVar, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{cVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.k.f33507dg, new Class[]{c.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        cVar.d(z10);
    }

    @dl.d
    public final ViewPager2 b() {
        return this.f72905a;
    }

    public final void c(@dl.d ViewPager2 viewPager2) {
        if (PatchProxy.proxy(new Object[]{viewPager2}, this, changeQuickRedirect, false, bb.c.k.f33460bg, new Class[]{ViewPager2.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewPager2, "<set-?>");
        this.f72905a = viewPager2;
    }

    public final void d(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.f33483cg, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f();
        h hVar = new h(this.f72905a, z10);
        a aVar = new a(hVar, this);
        this.f72906b.postDelayed(aVar, hVar.a());
        this.f72907c = aVar;
    }

    public final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33530eg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Runnable runnable = this.f72907c;
        if (runnable != null) {
            this.f72906b.removeCallbacks(runnable);
        }
        this.f72907c = null;
    }
}
