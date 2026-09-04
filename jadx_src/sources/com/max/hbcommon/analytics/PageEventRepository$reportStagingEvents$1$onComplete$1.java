package com.max.hbcommon.analytics;

import com.max.hbcommon.bean.analytics.PageEventEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: PageEventRepository.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nPageEventRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEventRepository.kt\ncom/max/hbcommon/analytics/PageEventRepository$reportStagingEvents$1$onComplete$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,87:1\n37#2,2:88\n*S KotlinDebug\n*F\n+ 1 PageEventRepository.kt\ncom/max/hbcommon/analytics/PageEventRepository$reportStagingEvents$1$onComplete$1\n*L\n77#1:88,2\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.analytics.PageEventRepository$reportStagingEvents$1$onComplete$1", f = "PageEventRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PageEventRepository$reportStagingEvents$1$onComplete$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f66518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PageEventRepository f66519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ List<PageEventEntity> f66520d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageEventRepository$reportStagingEvents$1$onComplete$1(PageEventRepository pageEventRepository, List<PageEventEntity> list, kotlin.coroutines.c<? super PageEventRepository$reportStagingEvents$1$onComplete$1> cVar) {
        super(2, cVar);
        this.f66519c = pageEventRepository;
        this.f66520d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.mt, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new PageEventRepository$reportStagingEvents$1$onComplete$1(this.f66519c, this.f66520d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.ot, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.nt, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PageEventRepository$reportStagingEvents$1$onComplete$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.lt, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f66518b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        com.max.heybox.hblog.g.f74531b.q("PageEventRepository, reportStagingEvents, onComplete");
        this.f66519c.f66508c.S().e((PageEventEntity[]) this.f66520d.toArray(new PageEventEntity[0]));
        this.f66519c.f66506a.compareAndSet(true, false);
        return b2.f124493a;
    }
}
