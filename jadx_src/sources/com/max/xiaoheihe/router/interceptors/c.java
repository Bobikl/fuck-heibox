package com.max.xiaoheihe.router.interceptors;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FavourHistoryIntetceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class c implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f94966a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48114, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        if (f0.g(path, lb.d.F1)) {
            m.k(request, "prefer_page", 1);
        } else if (f0.g(path, lb.d.f131290y1)) {
            m.k(request, "prefer_page", 0);
        }
        callback.a();
    }
}
