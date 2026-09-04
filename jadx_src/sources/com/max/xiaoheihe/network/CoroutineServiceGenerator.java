package com.max.xiaoheihe.network;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.z;
import okhttp3.u;

/* JADX INFO: compiled from: CoroutineServiceGenerator.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class CoroutineServiceGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final CoroutineServiceGenerator f94823a = new CoroutineServiceGenerator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final z f94824b = b0.c(new yh.a<b>() { // from class: com.max.xiaoheihe.network.CoroutineServiceGenerator$GlobalCoroutineHeyBoxService$2
        public static ChangeQuickRedirect changeQuickRedirect;

        public final b a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47647, new Class[0], b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            com.max.hbcommon.network.b bVarG = com.max.hbcommon.network.b.g();
            return (b) bVarG.k(bVarG.l(), bVarG.j(com.max.hbcommon.network.e.f68061a, true, new u[0])).g(b.class);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.network.b, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ b invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47648, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f94825c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    private CoroutineServiceGenerator() {
    }

    @dl.d
    public final b a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47646, new Class[0], b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        Object value = f94824b.getValue();
        f0.o(value, "<get-GlobalCoroutineHeyBoxService>(...)");
        return (b) value;
    }
}
