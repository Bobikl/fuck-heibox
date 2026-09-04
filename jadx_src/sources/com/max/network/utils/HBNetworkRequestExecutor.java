package com.max.network.utils;

import com.max.heybox.hblog.g;
import com.max.network.entities.ApiEmptyResponse;
import com.max.network.entities.ApiErrorResponse;
import com.max.network.entities.ApiFailedResponse;
import com.max.network.entities.ApiResponse;
import com.max.network.entities.ApiSuccessResponse;
import com.max.network.interfaces.HBNetworkExecutor;
import com.max.network.interfaces.ResultHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tekartik.sqflite.b;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: HBNetworkExecutorImp.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HBNetworkRequestExecutor<D> implements HBNetworkExecutor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final l<c<? super ApiResponse<D>>, Object> block;

    @e
    private final ResultHandler handler;

    /* JADX INFO: renamed from: com.max.network.utils.HBNetworkRequestExecutor$execute$1, reason: invalid class name */
    /* JADX INFO: compiled from: HBNetworkExecutorImp.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.network.utils.HBNetworkRequestExecutor", f = "HBNetworkExecutorImp.kt", i = {0}, l = {31}, m = b.f98590i, n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public static ChangeQuickRedirect changeQuickRedirect;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ HBNetworkRequestExecutor<D> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HBNetworkRequestExecutor<D> hBNetworkRequestExecutor, c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = hBNetworkRequestExecutor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f35048tg, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.execute(this);
        }
    }

    /* JADX INFO: renamed from: com.max.network.utils.HBNetworkRequestExecutor$executeWithCoroutine$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: HBNetworkExecutorImp.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.network.utils.HBNetworkRequestExecutor$executeWithCoroutine$1", f = "HBNetworkExecutorImp.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13101 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ l<ResultBuilder<D>, b2> $listenerBuilder;
        int label;
        final /* synthetic */ HBNetworkRequestExecutor<D> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13101(HBNetworkRequestExecutor<D> hBNetworkRequestExecutor, l<? super ResultBuilder<D>, b2> lVar, c<? super C13101> cVar) {
            super(2, cVar);
            this.this$0 = hBNetworkRequestExecutor;
            this.$listenerBuilder = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final c<b2> create(@e Object obj, @d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.f35092vg, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new C13101(this.this$0, this.$listenerBuilder, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f35136xg, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f35114wg, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13101) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f35070ug, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                HBNetworkRequestExecutor<D> hBNetworkRequestExecutor = this.this$0;
                this.label = 1;
                obj = hBNetworkRequestExecutor.execute(this);
                if (obj == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            KtUtilKt.parseData((ApiResponse) obj, this.$listenerBuilder);
            return b2.f124493a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HBNetworkRequestExecutor(@e ResultHandler resultHandler, @d l<? super c<? super ApiResponse<D>>, ? extends Object> block) {
        f0.p(block, "block");
        this.handler = resultHandler;
        this.block = block;
    }

    public static /* synthetic */ d2 executeWithCoroutine$default(HBNetworkRequestExecutor hBNetworkRequestExecutor, CoroutineDispatcher coroutineDispatcher, l lVar, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBNetworkRequestExecutor, coroutineDispatcher, lVar, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.m.f34936og, new Class[]{HBNetworkRequestExecutor.class, CoroutineDispatcher.class, l.class, Integer.TYPE, Object.class}, d2.class);
        if (patchProxyResultProxy.isSupported) {
            return (d2) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            coroutineDispatcher = e1.c();
        }
        return hBNetworkRequestExecutor.executeWithCoroutine(coroutineDispatcher, lVar);
    }

    private final <D> ApiResponse<D> getHttpSuccessResponse(ApiResponse<D> apiResponse) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{apiResponse}, this, changeQuickRedirect, false, bb.c.m.f35026sg, new Class[]{ApiResponse.class}, ApiResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (ApiResponse) patchProxyResultProxy.result;
        }
        D result = apiResponse.getResult();
        if (result != null && (!(result instanceof List) || !((List) result).isEmpty())) {
            return new ApiSuccessResponse(result, apiResponse);
        }
        ResultHandler resultHandler = this.handler;
        if (resultHandler != null) {
            resultHandler.handlingEmptyExceptions();
        }
        return new ApiEmptyResponse(apiResponse);
    }

    private final <D> ApiErrorResponse<D> handleHttpError(Throwable th2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.m.f34982qg, new Class[]{Throwable.class}, ApiErrorResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (ApiErrorResponse) patchProxyResultProxy.result;
        }
        g gVarZ = g.f74531b.z();
        if (gVarZ != null) {
            gVarZ.K(th2);
        }
        ResultHandler resultHandler = this.handler;
        if (resultHandler != null) {
            resultHandler.handlingExceptions(th2);
        }
        return new ApiErrorResponse<>(th2);
    }

    private final <D> ApiResponse<D> handleHttpOk(ApiResponse<D> apiResponse) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{apiResponse}, this, changeQuickRedirect, false, bb.c.m.f35004rg, new Class[]{ApiResponse.class}, ApiResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (ApiResponse) patchProxyResultProxy.result;
        }
        if (apiResponse.isSuccess()) {
            return getHttpSuccessResponse(apiResponse);
        }
        ResultHandler resultHandler = this.handler;
        if (resultHandler != null) {
            resultHandler.handlingApiExceptions(apiResponse.getMsg());
        }
        return new ApiFailedResponse(apiResponse.getMsg());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    @e
    public final Object execute(@d c<? super ApiResponse<D>> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        HBNetworkRequestExecutor<D> hBNetworkRequestExecutor;
        Object objB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.m.f34959pg, new Class[]{c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, cVar);
        }
        Object objInvoke = anonymousClass1.result;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t0.n(objInvoke);
            try {
                Result.a aVar = Result.f124476c;
                l<c<? super ApiResponse<D>>, Object> lVar = this.block;
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                objInvoke = lVar.invoke(anonymousClass1);
                if (objInvoke == objH) {
                    return objH;
                }
                hBNetworkRequestExecutor = this;
            } catch (Throwable th2) {
                th = th2;
                hBNetworkRequestExecutor = this;
                Result.a aVar2 = Result.f124476c;
                objB = Result.b(t0.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hBNetworkRequestExecutor = (HBNetworkRequestExecutor) anonymousClass1.L$0;
            try {
                t0.n(objInvoke);
            } catch (Throwable th3) {
                th = th3;
                Result.a aVar3 = Result.f124476c;
                objB = Result.b(t0.a(th));
            }
        }
        objB = Result.b((ApiResponse) objInvoke);
        if (Result.j(objB)) {
            return hBNetworkRequestExecutor.handleHttpOk((ApiResponse) objB);
        }
        Throwable thE = Result.e(objB);
        return thE != null ? hBNetworkRequestExecutor.handleHttpError(thE) : new ApiEmptyResponse(null, 1, null);
    }

    @d
    public final d2 executeWithCoroutine(@d CoroutineDispatcher dispatcher, @d l<? super ResultBuilder<D>, b2> listenerBuilder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dispatcher, listenerBuilder}, this, changeQuickRedirect, false, bb.c.m.f34913ng, new Class[]{CoroutineDispatcher.class, l.class}, d2.class);
        if (patchProxyResultProxy.isSupported) {
            return (d2) patchProxyResultProxy.result;
        }
        f0.p(dispatcher, "dispatcher");
        f0.p(listenerBuilder, "listenerBuilder");
        return k.f(r0.a(dispatcher), null, null, new C13101(this, listenerBuilder, null), 3, null);
    }
}
