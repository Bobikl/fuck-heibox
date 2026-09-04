package com.max.xiaoheihe.router.interceptors;

import android.net.Uri;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UserNotifyListInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class p implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94999b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95000a = p.class.getSimpleName();

    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48198, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        Log.d(this.f95000a, "Path: " + path);
        if (path != null) {
            int iHashCode = path.hashCode();
            if (iHashCode != -446296260) {
                if (iHashCode != -375814409) {
                    if (iHashCode == 431172923 && path.equals(lb.d.H4)) {
                        m.l(request, "list_type", "3");
                    }
                } else if (path.equals(lb.d.E4)) {
                    m.l(request, "list_type", "1");
                }
            } else if (path.equals(lb.d.f131286x4)) {
                m.l(request, "list_type", "0");
            }
        }
        callback.a();
    }

    public final String b() {
        return this.f95000a;
    }
}
