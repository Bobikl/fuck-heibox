package com.max.xiaoheihe.router.interceptors;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.max.xiaoheihe.module.mall.cart.ui.FragmentID;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FragmentContainerInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class d implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94967b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94968a = d.class.getSimpleName();

    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48115, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        Log.d(this.f94968a, "Path: " + path);
        if (f0.g(lb.d.f131172h2, path)) {
            m.k(request, "arg_fragment_id", FragmentID.MallCart.f90270c);
            callback.a();
            return;
        }
        if (f0.g(lb.d.Y1, path)) {
            m.k(request, "arg_fragment_id", FragmentID.MallOrderConfirm.f90272c);
            if (!com.max.hbcommon.utils.c.u(m.g(request, "order_id"))) {
                Bundle bundle = new Bundle();
                bundle.putString("order_id", m.g(request, "order_id"));
                m.j(request, "arg_bundle", bundle);
            }
            callback.a();
            return;
        }
        if (!f0.g(lb.d.f131137c2, path)) {
            callback.a();
            return;
        }
        m.k(request, "arg_fragment_id", FragmentID.MallSteamOrder.f90274c);
        if (!com.max.hbcommon.utils.c.u(m.g(request, "order_id"))) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("order_id", m.g(request, "order_id"));
            m.j(request, "arg_bundle", bundle2);
        }
        callback.a();
    }

    public final String b() {
        return this.f94968a;
    }
}
