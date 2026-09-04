package com.max.xiaoheihe.module.bbs.adapter.viewholderbinder;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.u;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.module.bbs.adapter.m;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.umeng.socialize.UMShareListener;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LinkViewHolderBinder.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public abstract class c extends cb.c<BBSLinkObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f80669k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private b f80670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Context f80671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private u<?> f80672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private String f80673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f80674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private UMShareListener f80675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f80676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private l0.h<?> f80677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f80678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private m.b f80679j;

    public c(@dl.d b param) {
        f0.p(param, "param");
        this.f80670a = param;
        this.f80671b = param.n();
        this.f80672c = this.f80670a.l();
        this.f80673d = this.f80670a.q();
        this.f80674e = this.f80670a.t();
        this.f80675f = this.f80670a.r();
        this.f80676g = this.f80670a.o();
        this.f80677h = this.f80670a.m();
        this.f80678i = this.f80670a.s();
        this.f80679j = this.f80670a.p();
    }

    @dl.d
    public final u<?> f() {
        return this.f80672c;
    }

    @dl.e
    public final l0.h<?> g() {
        return this.f80677h;
    }

    @dl.d
    public final Context h() {
        return this.f80671b;
    }

    @dl.e
    public final String i() {
        return this.f80676g;
    }

    @dl.e
    public final m.b j() {
        return this.f80679j;
    }

    @dl.d
    public final String k() {
        return this.f80673d;
    }

    @dl.d
    public final b l() {
        return this.f80670a;
    }

    @dl.e
    public final UMShareListener m() {
        return this.f80675f;
    }

    public final boolean n() {
        return this.f80678i;
    }

    public final boolean o() {
        return this.f80674e;
    }

    public final void p(@dl.d u<?> uVar) {
        if (PatchProxy.proxy(new Object[]{uVar}, this, changeQuickRedirect, false, 27544, new Class[]{u.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uVar, "<set-?>");
        this.f80672c = uVar;
    }

    public final void q(@dl.e l0.h<?> hVar) {
        this.f80677h = hVar;
    }

    public final void r(boolean z10) {
        this.f80674e = z10;
    }

    public final void s(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 27543, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f80671b = context;
    }

    public final void t(@dl.e String str) {
        this.f80676g = str;
    }

    public final void u(@dl.e m.b bVar) {
        this.f80679j = bVar;
    }

    public final void v(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27545, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f80673d = str;
    }

    public final void w(@dl.d b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 27542, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bVar, "<set-?>");
        this.f80670a = bVar;
    }

    public final void x(@dl.e UMShareListener uMShareListener) {
        this.f80675f = uMShareListener;
    }

    public final void y(boolean z10) {
        this.f80678i = z10;
    }
}
