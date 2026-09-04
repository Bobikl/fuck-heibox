package com.max.xiaoheihe.router.interceptors;

import android.net.Uri;
import android.util.Log;
import com.max.xiaoheihe.module.littleprogram.MiniProgramContainerActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MiniProgramFragmentContainerInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class l implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94990b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94991a = l.class.getSimpleName();

    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48138, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        Log.d(this.f94991a, "Path: " + path);
        m.l(request, MiniProgramContainerActivity.N, path);
        callback.a();
    }

    public final String b() {
        return this.f94991a;
    }
}
