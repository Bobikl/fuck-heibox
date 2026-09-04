package com.max.xiaoheihe.network;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;
import kotlin.jvm.internal.f0;
import okhttp3.c0;
import okhttp3.u;

/* JADX INFO: compiled from: RedirectInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class g implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f94847a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // okhttp3.u
    @dl.d
    public c0 intercept(@dl.d u.a chain) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{chain}, this, changeQuickRedirect, false, 47667, new Class[]{u.a.class}, c0.class);
        if (patchProxyResultProxy.isSupported) {
            return (c0) patchProxyResultProxy.result;
        }
        f0.p(chain, "chain");
        c0 c0VarProceed = chain.proceed(chain.request());
        if (c0VarProceed.x() != 302 || !f0.g(c0VarProceed.getRequest().m(), "POST")) {
            return c0VarProceed;
        }
        com.max.hbcommon.utils.d.b("zzzzgifttest", "intercept redirect");
        return c0VarProceed.P().g(307).c();
    }
}
