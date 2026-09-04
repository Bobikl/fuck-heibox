package com.max.hbcommon.component.segmentfilters;

import android.content.Context;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: SecondaryWindowSegmentFilterView.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.component.segmentfilters.SecondaryWindowSegmentFilterView$addViews$1$onBindViewHolder$1$1", f = "SecondaryWindowSegmentFilterView.kt", i = {}, l = {bb.c.b.J7}, m = "invokeSuspend", n = {}, s = {})
public final class SecondaryWindowSegmentFilterView$addViews$1$onBindViewHolder$1$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f67856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SecondaryWindowSegmentFilterView f67857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ FilterGroup f67858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.max.hbcommon.base.adapter.s.e f67859e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecondaryWindowSegmentFilterView$addViews$1$onBindViewHolder$1$1(SecondaryWindowSegmentFilterView secondaryWindowSegmentFilterView, FilterGroup filterGroup, com.max.hbcommon.base.adapter.s.e eVar, kotlin.coroutines.c<? super SecondaryWindowSegmentFilterView$addViews$1$onBindViewHolder$1$1> cVar) {
        super(2, cVar);
        this.f67857c = secondaryWindowSegmentFilterView;
        this.f67858d = filterGroup;
        this.f67859e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.e.f32018t3, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new SecondaryWindowSegmentFilterView$addViews$1$onBindViewHolder$1$1(this.f67857c, this.f67858d, this.f67859e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.f32052v3, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.f32035u3, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((SecondaryWindowSegmentFilterView$addViews$1$onBindViewHolder$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.f32001s3, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f67856b;
        if (i10 == 0) {
            t0.n(obj);
            long delayShowSecondaryWindowTime = this.f67857c.getDelayShowSecondaryWindowTime();
            this.f67856b = 1;
            if (DelayKt.b(delayShowSecondaryWindowTime, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        SecondaryWindowSegmentFilterView secondaryWindowSegmentFilterView = this.f67857c;
        Context context = secondaryWindowSegmentFilterView.getContext();
        f0.o(context, "getContext(...)");
        SecondaryWindowSegmentFilterView.e(secondaryWindowSegmentFilterView, context, this.f67857c, this.f67858d, this.f67859e);
        return b2.f124493a;
    }
}
