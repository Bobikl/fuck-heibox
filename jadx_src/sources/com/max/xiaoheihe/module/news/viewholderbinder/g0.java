package com.max.xiaoheihe.module.news.viewholderbinder;

import android.content.Context;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.module.game.a2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: NewsVHBParam.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class g0 implements cb.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f91426h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private Context f91427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private com.max.hbcommon.base.adapter.u<?> f91428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.news.adapter.a.b f91429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private a2 f91430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f91431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private AbsVideoView f91432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private Boolean f91433g;

    public g0(@dl.d Context context, @dl.d com.max.hbcommon.base.adapter.u<?> adapter, @dl.e com.max.xiaoheihe.module.news.adapter.a.b bVar, @dl.e a2 a2Var, boolean z10, @dl.e AbsVideoView absVideoView, @dl.e Boolean bool) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(adapter, "adapter");
        this.f91427a = context;
        this.f91428b = adapter;
        this.f91429c = bVar;
        this.f91430d = a2Var;
        this.f91431e = z10;
        this.f91432f = absVideoView;
        this.f91433g = bool;
    }

    public /* synthetic */ g0(Context context, com.max.hbcommon.base.adapter.u uVar, com.max.xiaoheihe.module.news.adapter.a.b bVar, a2 a2Var, boolean z10, AbsVideoView absVideoView, Boolean bool, int i10, kotlin.jvm.internal.u uVar2) {
        this(context, uVar, bVar, a2Var, z10, absVideoView, (i10 & 64) != 0 ? Boolean.TRUE : bool);
    }

    @dl.d
    public final com.max.hbcommon.base.adapter.u<?> a() {
        return this.f91428b;
    }

    @dl.e
    public final a2 b() {
        return this.f91430d;
    }

    @dl.d
    public final Context c() {
        return this.f91427a;
    }

    @dl.e
    public final AbsVideoView d() {
        return this.f91432f;
    }

    @dl.e
    public final com.max.xiaoheihe.module.news.adapter.a.b e() {
        return this.f91429c;
    }

    @dl.e
    public final Boolean f() {
        return this.f91433g;
    }

    public final boolean g() {
        return this.f91431e;
    }

    public final void h(@dl.d com.max.hbcommon.base.adapter.u<?> uVar) {
        if (PatchProxy.proxy(new Object[]{uVar}, this, changeQuickRedirect, false, 42769, new Class[]{com.max.hbcommon.base.adapter.u.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(uVar, "<set-?>");
        this.f91428b = uVar;
    }

    public final void i(@dl.e a2 a2Var) {
        this.f91430d = a2Var;
    }

    public final void j(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 42768, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "<set-?>");
        this.f91427a = context;
    }

    public final void k(@dl.e AbsVideoView absVideoView) {
        this.f91432f = absVideoView;
    }

    public final void l(@dl.e com.max.xiaoheihe.module.news.adapter.a.b bVar) {
        this.f91429c = bVar;
    }

    public final void m(@dl.e Boolean bool) {
        this.f91433g = bool;
    }

    public final void n(boolean z10) {
        this.f91431e = z10;
    }
}
