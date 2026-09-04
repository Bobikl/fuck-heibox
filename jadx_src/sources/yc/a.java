package yc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.core.f;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.i;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MiniProgramInterceptor.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a implements h {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f141635a = a.class.getSimpleName();

    private final Bundle b(i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, c.i.f33321g1, new Class[]{i.class}, Bundle.class);
        return patchProxyResultProxy.isSupported ? (Bundle) patchProxyResultProxy.result : (Bundle) iVar.e(Bundle.class, com.sankuai.waimai.router.components.a.f96452b, null);
    }

    @Override // com.sankuai.waimai.router.core.h
    public void a(@d i request, @d f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, c.i.f33315f1, new Class[]{i.class, f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "getUri(...)");
        String path = uriM.getPath();
        Context contextB = request.b();
        f0.o(contextB, "getContext(...)");
        com.max.hbcommon.utils.d.b(this.f141635a, "Path: " + path + ", uri: " + uriM + ", request.fields : " + request.f());
        if (path == null) {
            callback.a();
        } else {
            if (ob.a.j().a(contextB, path, b(request))) {
                return;
            }
            callback.a();
        }
    }

    public final String c() {
        return this.f141635a;
    }
}
