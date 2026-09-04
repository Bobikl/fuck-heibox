package com.max.hbsearch;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: SearchMiniProgramInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class q implements com.sankuai.waimai.router.core.h {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f72367a = q.class.getSimpleName();

    private final Bundle b(com.sankuai.waimai.router.core.i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.k.f33792q2, new Class[]{com.sankuai.waimai.router.core.i.class}, Bundle.class);
        return patchProxyResultProxy.isSupported ? (Bundle) patchProxyResultProxy.result : (Bundle) iVar.e(Bundle.class, com.sankuai.waimai.router.components.a.f96452b, null);
    }

    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, bb.c.k.f33769p2, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(request, "request");
        kotlin.jvm.internal.f0.p(callback, "callback");
        Uri uriM = request.m();
        kotlin.jvm.internal.f0.o(uriM, "getUri(...)");
        String path = uriM.getPath();
        Context contextB = request.b();
        kotlin.jvm.internal.f0.o(contextB, "getContext(...)");
        com.max.hbcommon.utils.d.b(this.f72367a, "Path: " + path + ", uri: " + uriM + ", request.fields : " + request.f());
        Bundle bundleB = b(request);
        String string = bundleB != null ? bundleB.getString("q") : null;
        Bundle bundle = new Bundle();
        bundle.putString("q", string);
        bundle.putBundle(SearchNewFragment.f72179c4, bundleB);
        if (path == null) {
            callback.a();
        } else {
            if (ob.a.j().a(contextB, path, bundle)) {
                return;
            }
            callback.a();
        }
    }

    public final String c() {
        return this.f72367a;
    }
}
