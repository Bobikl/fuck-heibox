package com.jd.jdcache.service.impl.net;

import com.jd.jdcache.service.base.NetState;
import com.jd.jdcache.util.JDCacheLog;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import yh.q;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: BaseRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nBaseRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRequest.kt\ncom/jd/jdcache/service/impl/net/BaseRequest$connectFlow$3\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n*L\n1#1,280:1\n9#2,4:281\n*S KotlinDebug\n*F\n+ 1 BaseRequest.kt\ncom/jd/jdcache/service/impl/net/BaseRequest$connectFlow$3\n*L\n96#1:281,4\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.jd.jdcache.service.impl.net.BaseRequest$connectFlow$3", f = "BaseRequest.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class BaseRequest$connectFlow$3<T> extends SuspendLambda implements q<kotlinx.coroutines.flow.f<? super NetState<T>>, Throwable, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f64261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f64262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f64263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ BaseRequest<T> f64264e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseRequest$connectFlow$3(BaseRequest<T> baseRequest, kotlin.coroutines.c<? super BaseRequest$connectFlow$3> cVar) {
        super(3, cVar);
        this.f64264e = baseRequest;
    }

    @Override // yh.q
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.flow.f<? super NetState<T>> fVar, @dl.d Throwable th2, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        BaseRequest$connectFlow$3 baseRequest$connectFlow$3 = new BaseRequest$connectFlow$3(this.f64264e, cVar);
        baseRequest$connectFlow$3.f64262c = fVar;
        baseRequest$connectFlow$3.f64263d = th2;
        return baseRequest$connectFlow$3.invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f64261b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.flow.f fVar = (kotlinx.coroutines.flow.f) this.f64262c;
            Throwable th2 = (Throwable) this.f64263d;
            BaseRequest<T> baseRequest = this.f64264e;
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.e(baseRequest.s(), th2);
            }
            NetState.Error error = new NetState.Error(-1, th2);
            this.f64262c = null;
            this.f64261b = 1;
            if (fVar.emit(error, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
