package com.max.xiaoheihe.module.game.adapter.overview;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewVHBParam.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class d implements cb.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f85941g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private Context f85942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private b f85943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private RecyclerView f85944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private BaseGameOverviewObj f85945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private b.InterfaceC0764b f85946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private FragmentManager f85947f;

    public d(@dl.d Context context, @dl.d b adapter, @dl.d RecyclerView rv, @e BaseGameOverviewObj baseGameOverviewObj, @e b.InterfaceC0764b interfaceC0764b, @e FragmentManager fragmentManager) {
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        f0.p(rv, "rv");
        this.f85942a = context;
        this.f85943b = adapter;
        this.f85944c = rv;
        this.f85945d = baseGameOverviewObj;
        this.f85946e = interfaceC0764b;
        this.f85947f = fragmentManager;
    }

    @dl.d
    public final b a() {
        return this.f85943b;
    }

    @dl.d
    public final Context b() {
        return this.f85942a;
    }

    @e
    public final BaseGameOverviewObj c() {
        return this.f85945d;
    }

    @e
    public final FragmentManager d() {
        return this.f85947f;
    }

    @e
    public final b.InterfaceC0764b e() {
        return this.f85946e;
    }

    @dl.d
    public final RecyclerView f() {
        return this.f85944c;
    }

    @e
    public final String g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35732, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f85943b.r().b();
    }

    @e
    public final String h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35733, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f85943b.r().getUserId();
    }

    public final boolean i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35734, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f85943b.r().a();
    }

    public final void j(@dl.d b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 35730, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bVar, "<set-?>");
        this.f85943b = bVar;
    }

    public final void k(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 35729, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f85942a = context;
    }

    public final void l(@e BaseGameOverviewObj baseGameOverviewObj) {
        this.f85945d = baseGameOverviewObj;
    }

    public final void m(@e FragmentManager fragmentManager) {
        this.f85947f = fragmentManager;
    }

    public final void n(@e b.InterfaceC0764b interfaceC0764b) {
        this.f85946e = interfaceC0764b;
    }

    public final void o(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 35731, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "<set-?>");
        this.f85944c = recyclerView;
    }
}
