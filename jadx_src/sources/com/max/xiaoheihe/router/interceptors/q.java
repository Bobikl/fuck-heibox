package com.max.xiaoheihe.router.interceptors;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WritePostConvertInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class q implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f95001b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95002a = q.class.getSimpleName();

    @Override // com.sankuai.waimai.router.core.h
    @SuppressLint({"CheckResult"})
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48199, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        String str = this.f95002a;
        f0.m(path);
        Log.d(str, path);
        int iC = m.c(request, "appid", -1);
        if (iC == -1) {
            iC = m.c(request, "app_id", -1);
        }
        m.l(request, "appid", String.valueOf(iC));
        callback.a();
    }

    public final String b() {
        return this.f95002a;
    }
}
