package com.max.xiaoheihe.module.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: StaticResourceManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.StaticResourceManager$downloadStaticPak$1", f = "StaticResourceManager.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
public final class StaticResourceManager$downloadStaticPak$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f80081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f80082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f80083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StaticResourceManager$downloadStaticPak$1(String str, String str2, kotlin.coroutines.c<? super StaticResourceManager$downloadStaticPak$1> cVar) {
        super(2, cVar);
        this.f80082c = str;
        this.f80083d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 26835, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new StaticResourceManager$downloadStaticPak$1(this.f80082c, this.f80083d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 26837, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 26836, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((StaticResourceManager$downloadStaticPak$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26834, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f80081b;
        try {
            if (i10 == 0) {
                t0.n(obj);
                StaticResourceManager staticResourceManager = StaticResourceManager.f80064a;
                String str = this.f80082c;
                String str2 = this.f80083d;
                this.f80081b = 1;
                if (staticResourceManager.a(str, str2, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            com.max.heybox.hblog.g.f74531b.q(StaticResourceManager.f80064a.f() + ", download pak " + this.f80082c);
        } catch (Exception e10) {
            com.max.heybox.hblog.g.f74531b.q(StaticResourceManager.f80064a.f() + ", downloadEmojiAssets got " + e10);
        }
        return b2.f124493a;
    }
}
