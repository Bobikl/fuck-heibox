package com.max.xiaoheihe.module.mall.adapter;

import android.content.Context;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.module.mall.component.MallProductViewV2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: MallProductAdapterV2.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class j {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f89972i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f89973j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f89974k = 18;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f89975l = 0.49707603f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f89976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final r f89977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final q f89978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final n f89979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final o f89980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final m f89981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final d f89982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final p f89983h;

    /* JADX INFO: compiled from: MallProductAdapterV2.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public j(@dl.d Context context) {
        f0.p(context, "context");
        int iL = ((int) ((ViewUtils.L(context) - ViewUtils.f(context, 31.0f)) / 2.0f)) - com.max.accelworld.c.c(18, context);
        this.f89976a = iL;
        this.f89977b = new r();
        this.f89978c = new q();
        this.f89979d = new n(context);
        this.f89980e = new o(iL);
        this.f89981f = new m();
        this.f89982g = new d();
        this.f89983h = new p();
    }

    public final void a(@dl.d MallProductViewV2 mallProductView, @dl.e MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{mallProductView, mallProductObj}, this, changeQuickRedirect, false, 41150, new Class[]{MallProductViewV2.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallProductView, "mallProductView");
        this.f89982g.a(mallProductView, mallProductObj);
    }

    public final void b(@dl.d MallProductViewV2 mallProductView, @dl.e MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{mallProductView, mallProductObj}, this, changeQuickRedirect, false, 41151, new Class[]{MallProductViewV2.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallProductView, "mallProductView");
        this.f89981f.a(mallProductView, mallProductObj);
    }

    public final void c(@dl.d MallProductViewV2 mallProductView, @dl.e MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{mallProductView, mallProductObj}, this, changeQuickRedirect, false, 41154, new Class[]{MallProductViewV2.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallProductView, "mallProductView");
        this.f89979d.a(mallProductView, mallProductObj);
    }

    public final void d(@dl.d MallProductViewV2 mallProductView, @dl.e MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{mallProductView, mallProductObj}, this, changeQuickRedirect, false, 41155, new Class[]{MallProductViewV2.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallProductView, "mallProductView");
        this.f89980e.a(mallProductView, mallProductObj);
    }

    public final void e(@dl.d MallProductViewV2 mallProductView) {
        if (PatchProxy.proxy(new Object[]{mallProductView}, this, changeQuickRedirect, false, 41156, new Class[]{MallProductViewV2.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallProductView, "mallProductView");
        this.f89983h.a(mallProductView);
    }

    public final void f(@dl.d MallProductViewV2 mallProductView) {
        if (PatchProxy.proxy(new Object[]{mallProductView}, this, changeQuickRedirect, false, 41153, new Class[]{MallProductViewV2.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallProductView, "mallProductView");
        this.f89978c.a(mallProductView);
    }

    public final void g(@dl.d MallProductViewV2 mallProductView, @dl.e MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{mallProductView, mallProductObj}, this, changeQuickRedirect, false, 41152, new Class[]{MallProductViewV2.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallProductView, "mallProductView");
        this.f89977b.a(mallProductView, mallProductObj);
    }
}
