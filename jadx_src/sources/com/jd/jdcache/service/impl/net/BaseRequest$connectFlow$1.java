package com.jd.jdcache.service.impl.net;

import com.jd.jdcache.service.base.NetState;
import java.net.URL;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: BaseRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.jd.jdcache.service.impl.net.BaseRequest$connectFlow$1", f = "BaseRequest.kt", i = {}, l = {92, 92}, m = "invokeSuspend", n = {}, s = {})
public final class BaseRequest$connectFlow$1<T> extends SuspendLambda implements p<kotlinx.coroutines.flow.f<? super NetState<T>>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f64255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f64256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ BaseRequest<T> f64257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseRequest$connectFlow$1(BaseRequest<T> baseRequest, kotlin.coroutines.c<? super BaseRequest$connectFlow$1> cVar) {
        super(2, cVar);
        this.f64257d = baseRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        BaseRequest$connectFlow$1 baseRequest$connectFlow$1 = new BaseRequest$connectFlow$1(this.f64257d, cVar);
        baseRequest$connectFlow$1.f64256c = obj;
        return baseRequest$connectFlow$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.flow.f<? super NetState<T>> fVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((BaseRequest$connectFlow$1) create(fVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Exception {
        kotlinx.coroutines.flow.f fVar;
        kotlinx.coroutines.flow.f fVar2;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f64255b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlinx.coroutines.flow.f fVar3 = (kotlinx.coroutines.flow.f) this.f64256c;
                t0.n(obj);
                fVar2 = fVar3;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        fVar = (kotlinx.coroutines.flow.f) this.f64256c;
        ((BaseRequest) this.f64257d).f64253n = fVar;
        URL url = new URL(this.f64257d.q());
        BaseRequest<T> baseRequest = this.f64257d;
        this.f64256c = fVar;
        this.f64255b = 1;
        obj = baseRequest.b(url, this);
        if (obj == objH) {
            fVar2 = fVar;
            return objH;
        }
        fVar2 = fVar;
        this.f64256c = null;
        this.f64255b = 2;
        if (fVar2.emit(obj, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
