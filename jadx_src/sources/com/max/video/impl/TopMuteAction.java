package com.max.video.impl;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;

/* JADX INFO: compiled from: TopMuteAction.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class TopMuteAction implements com.max.video.ui.widget.f {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final j<Boolean> f76034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final u<Boolean> f76035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private ze.a f76036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView f76037d;

    public TopMuteAction() {
        j<Boolean> jVarA = v.a(Boolean.FALSE);
        this.f76034a = jVarA;
        this.f76035b = jVarA;
    }

    @Override // com.max.video.ui.widget.f
    public void a(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.zn, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        this.f76037d = new ImageView(context);
        LifecycleCoroutineScope lifecycleCoroutineScopeC = ye.a.f141789a.c(context);
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new TopMuteAction$initExtView$1(this, context, null));
        }
    }

    @Override // com.max.video.ui.widget.f
    public void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.xn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = this.f76037d;
        if (imageView == null) {
            f0.S("actionView");
            imageView = null;
        }
        imageView.setVisibility(8);
    }

    @Override // com.max.video.ui.widget.f
    @dl.d
    public View c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.An, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f76037d;
        if (imageView != null) {
            return imageView;
        }
        f0.S("actionView");
        return null;
    }

    @Override // com.max.video.ui.widget.f
    public void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.yn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = this.f76037d;
        if (imageView == null) {
            f0.S("actionView");
            imageView = null;
        }
        imageView.setVisibility(0);
    }

    public final void g(@dl.d Context context, @dl.d u<Boolean> state) {
        if (PatchProxy.proxy(new Object[]{context, state}, this, changeQuickRedirect, false, bb.c.m.Bn, new Class[]{Context.class, u.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(state, "state");
        LifecycleCoroutineScope lifecycleCoroutineScopeC = ye.a.f141789a.c(context);
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new TopMuteAction$bindMuteState$1(state, this, null));
        }
    }

    @dl.e
    public final ze.a h() {
        return this.f76036c;
    }

    @dl.d
    public final u<Boolean> i() {
        return this.f76035b;
    }

    public final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Cn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f76034a.setValue(Boolean.TRUE);
    }

    public final void k(@dl.e ze.a aVar) {
        this.f76036c = aVar;
    }

    public final void l() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Dn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f76034a.setValue(Boolean.FALSE);
    }
}
