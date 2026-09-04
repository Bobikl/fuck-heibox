package com.max.hbcommon.base.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: BigBrotherAdapterWrapper.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nBigBrotherAdapterWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigBrotherAdapterWrapper.kt\ncom/max/hbcommon/base/adapter/BigBrotherAdapterWrapper$preLoadDataList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,393:1\n1864#2,3:394\n*S KotlinDebug\n*F\n+ 1 BigBrotherAdapterWrapper.kt\ncom/max/hbcommon/base/adapter/BigBrotherAdapterWrapper$preLoadDataList$2\n*L\n111#1:394,3\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper$preLoadDataList$2", f = "BigBrotherAdapterWrapper.kt", i = {0}, l = {112}, m = "invokeSuspend", n = {"index$iv"}, s = {"I$0"})
public final class BigBrotherAdapterWrapper$preLoadDataList$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f66680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f66681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f66682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f66683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ BigBrotherAdapterWrapper<T> f66684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ List<T> f66685g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BigBrotherAdapterWrapper$preLoadDataList$2(BigBrotherAdapterWrapper<T> bigBrotherAdapterWrapper, List<? extends T> list, kotlin.coroutines.c<? super BigBrotherAdapterWrapper$preLoadDataList$2> cVar) {
        super(2, cVar);
        this.f66684f = bigBrotherAdapterWrapper;
        this.f66685g = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.gy, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new BigBrotherAdapterWrapper$preLoadDataList$2(this.f66684f, this.f66685g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.iy, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.hy, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BigBrotherAdapterWrapper$preLoadDataList$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Iterator it;
        BigBrotherAdapterWrapper bigBrotherAdapterWrapper;
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.fy, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = this.f66683e;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            if (((BigBrotherAdapterWrapper) this.f66684f).f66665d == null) {
                return b2.f124493a;
            }
            Collection collection = this.f66685g;
            BigBrotherAdapterWrapper bigBrotherAdapterWrapper2 = this.f66684f;
            it = collection.iterator();
            bigBrotherAdapterWrapper = bigBrotherAdapterWrapper2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = this.f66682d;
            it = (Iterator) this.f66681c;
            bigBrotherAdapterWrapper = (BigBrotherAdapterWrapper) this.f66680b;
            kotlin.t0.n(obj);
            i10 = i12;
        }
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            this.f66680b = bigBrotherAdapterWrapper;
            this.f66681c = it;
            this.f66682d = i13;
            this.f66683e = 1;
            if (bigBrotherAdapterWrapper.C(i10, next, this) == objH) {
                return objH;
            }
            i10 = i13;
        }
        return b2.f124493a;
    }
}
