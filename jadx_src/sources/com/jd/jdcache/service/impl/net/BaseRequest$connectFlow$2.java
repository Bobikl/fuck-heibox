package com.jd.jdcache.service.impl.net;

import com.jd.jdcache.service.base.NetState;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: BaseRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.jd.jdcache.service.impl.net.BaseRequest$connectFlow$2", f = "BaseRequest.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
public final class BaseRequest$connectFlow$2<T> extends SuspendLambda implements p<kotlinx.coroutines.flow.f<? super NetState<T>>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f64258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f64259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ BaseRequest<T> f64260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseRequest$connectFlow$2(BaseRequest<T> baseRequest, kotlin.coroutines.c<? super BaseRequest$connectFlow$2> cVar) {
        super(2, cVar);
        this.f64260d = baseRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        BaseRequest$connectFlow$2 baseRequest$connectFlow$2 = new BaseRequest$connectFlow$2(this.f64260d, cVar);
        baseRequest$connectFlow$2.f64259c = obj;
        return baseRequest$connectFlow$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.flow.f<? super NetState<T>> fVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((BaseRequest$connectFlow$2) create(fVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f64258b;
        if (i10 == 0) {
            t0.n(obj);
            kotlinx.coroutines.flow.f fVar = (kotlinx.coroutines.flow.f) this.f64259c;
            NetState.OnStart onStart = new NetState.OnStart(this.f64260d.q());
            this.f64258b = 1;
            if (fVar.emit(onStart, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
