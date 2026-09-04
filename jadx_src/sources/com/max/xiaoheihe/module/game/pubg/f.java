package com.max.xiaoheihe.module.game.pubg;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.i;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PubgPlayerOverViewInterceptor.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class f implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f88171b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88172a = f.class.getSimpleName();

    private final Bundle b(i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, 38339, new Class[]{i.class}, Bundle.class);
        return patchProxyResultProxy.isSupported ? (Bundle) patchProxyResultProxy.result : (Bundle) iVar.e(Bundle.class, com.sankuai.waimai.router.components.a.f96452b, null);
    }

    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 38338, new Class[]{i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        Context contextB = request.b();
        f0.o(contextB, "request.context");
        com.max.hbcommon.utils.d.b(this.f88172a, "Path: " + path + ", uri: " + uriM + ", request.fields : " + request.f());
        if (path == null) {
            callback.a();
        } else {
            if (com.max.xiaoheihe.module.littleprogram.b.f88740a.l(contextB, path, b(request))) {
                return;
            }
            callback.a();
        }
    }

    public final String c() {
        return this.f88172a;
    }
}
