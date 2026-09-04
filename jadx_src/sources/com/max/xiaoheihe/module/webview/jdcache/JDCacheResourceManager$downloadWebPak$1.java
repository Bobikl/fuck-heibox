package com.max.xiaoheihe.module.webview.jdcache;

import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: JDCacheResourceManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.max.xiaoheihe.module.webview.jdcache.JDCacheResourceManager$downloadWebPak$1", f = "JDCacheResourceManager.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
public final class JDCacheResourceManager$downloadWebPak$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f94746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f94747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JDCacheResourceManager$downloadWebPak$1(String str, String str2, c<? super JDCacheResourceManager$downloadWebPak$1> cVar) {
        super(2, cVar);
        this.f94746c = str;
        this.f94747d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 47631, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new JDCacheResourceManager$downloadWebPak$1(this.f94746c, this.f94747d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 47633, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 47632, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((JDCacheResourceManager$downloadWebPak$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 47630, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f94745b;
        try {
            if (i10 == 0) {
                t0.n(obj);
                JDCacheResourceManager jDCacheResourceManager = JDCacheResourceManager.f94723a;
                String str = this.f94746c;
                String str2 = this.f94747d;
                this.f94745b = 1;
                if (jDCacheResourceManager.c(str, str2, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            g.f74531b.q(JDCacheResourceManager.f94723a.k() + ", download pak " + this.f94746c);
        } catch (Exception e10) {
            g.f74531b.q(JDCacheResourceManager.f94723a.k() + ", downloadEmojiAssets got " + e10);
        }
        return b2.f124493a;
    }
}
