package com.max.network.model;

import com.google.android.gms.common.internal.s;
import com.max.heybox.hblog.g;
import com.max.network.entities.ApiEmptyResponse;
import com.max.network.entities.ApiErrorResponse;
import com.max.network.entities.ApiFailedResponse;
import com.max.network.entities.ApiResponse;
import com.max.network.entities.ApiSuccessResponse;
import com.max.network.interfaces.DataSource;
import com.max.network.interfaces.ResultHandler;
import com.max.network.utils.DownloadResultBuilder;
import com.max.network.utils.HBResultHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.List;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.u;
import kotlin.t0;
import kotlinx.coroutines.e1;
import okhttp3.d0;
import yh.l;

/* JADX INFO: compiled from: RemoteDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public class RemoteDataSource implements DataSource {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private final ResultHandler handler;

    /* JADX INFO: renamed from: com.max.network.model.RemoteDataSource$downloadFile$1, reason: invalid class name */
    /* JADX INFO: compiled from: RemoteDataSource.kt */
    @d(c = "com.max.network.model.RemoteDataSource", f = "RemoteDataSource.kt", i = {0, 0}, l = {73, 112}, m = "downloadFile", n = {"outputPath", s.a.f52543a}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public static ChangeQuickRedirect changeQuickRedirect;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f34773he, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteDataSource.this.downloadFile(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.max.network.model.RemoteDataSource$executeHttp$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: RemoteDataSource.kt */
    @d(c = "com.max.network.model.RemoteDataSource", f = "RemoteDataSource.kt", i = {0}, l = {62}, m = "executeHttp", n = {"this"}, s = {"L$0"})
    public static final class C13041<T> extends ContinuationImpl {
        public static ChangeQuickRedirect changeQuickRedirect;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C13041(c<? super C13041> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f35156ye, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteDataSource.this.executeHttp(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteDataSource() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public RemoteDataSource(@e ResultHandler resultHandler) {
        this.handler = resultHandler;
    }

    public /* synthetic */ RemoteDataSource(ResultHandler resultHandler, int i10, u uVar) {
        this((i10 & 1) != 0 ? new HBResultHandler() : resultHandler);
    }

    private final <D> ApiResponse<D> getHttpSuccessResponse(ApiResponse<D> apiResponse) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{apiResponse}, this, changeQuickRedirect, false, bb.c.m.f34704ee, new Class[]{ApiResponse.class}, ApiResponse.class);
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.m.f34657ce, new Class[]{Throwable.class}, ApiErrorResponse.class);
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{apiResponse}, this, changeQuickRedirect, false, bb.c.m.f34681de, new Class[]{ApiResponse.class}, ApiResponse.class);
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

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    @e
    public final Object downloadFile(@dl.d String str, @dl.d DownloadResultBuilder<String> downloadResultBuilder, @dl.d l<? super c<? super d0>, ? extends Object> lVar, @dl.d c<? super b2> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object objB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, downloadResultBuilder, lVar, cVar}, this, changeQuickRedirect, false, bb.c.m.f34750ge, new Class[]{String.class, DownloadResultBuilder.class, l.class, c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objInvoke = anonymousClass1.result;
        Object objH = b.h();
        int i11 = anonymousClass1.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    downloadResultBuilder = (DownloadResultBuilder) anonymousClass1.L$1;
                    str = (String) anonymousClass1.L$0;
                    t0.n(objInvoke);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(objInvoke);
                }
                return b2.f124493a;
            }
            t0.n(objInvoke);
            Result.a aVar = Result.f124476c;
            anonymousClass1.L$0 = str;
            anonymousClass1.L$1 = downloadResultBuilder;
            anonymousClass1.label = 1;
            objInvoke = lVar.invoke(anonymousClass1);
            if (objInvoke == objH) {
                return objH;
            }
            objB = Result.b((d0) objInvoke);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        if (!Result.j(objB)) {
            Throwable thE = Result.e(objB);
            if (thE != null) {
                downloadResultBuilder.getOnError().invoke(thE);
                return b2.f124493a;
            }
            downloadResultBuilder.getOnDataEmpty();
            return b2.f124493a;
        }
        kotlinx.coroutines.flow.e eVarN0 = kotlinx.coroutines.flow.g.N0(kotlinx.coroutines.flow.g.I0(new RemoteDataSource$downloadFile$3$1((d0) objB, str, downloadResultBuilder, null)), e1.c());
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        if (kotlinx.coroutines.flow.g.x(eVarN0, anonymousClass1) == objH) {
            return objH;
        }
        return b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    @e
    public final <T> Object executeHttp(@dl.d l<? super c<? super ApiResponse<T>>, ? extends Object> lVar, @dl.d c<? super ApiResponse<T>> cVar) throws Throwable {
        C13041 c13041;
        RemoteDataSource remoteDataSource;
        Object objB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{lVar, cVar}, this, changeQuickRedirect, false, bb.c.m.f34727fe, new Class[]{l.class, c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof C13041) {
            c13041 = (C13041) cVar;
            int i10 = c13041.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13041.label = i10 - Integer.MIN_VALUE;
            } else {
                c13041 = new C13041(cVar);
            }
        } else {
            c13041 = new C13041(cVar);
        }
        Object objInvoke = c13041.result;
        Object objH = b.h();
        int i11 = c13041.label;
        if (i11 == 0) {
            t0.n(objInvoke);
            try {
                Result.a aVar = Result.f124476c;
                c13041.L$0 = this;
                c13041.label = 1;
                objInvoke = lVar.invoke(c13041);
                if (objInvoke == objH) {
                    return objH;
                }
                remoteDataSource = this;
            } catch (Throwable th2) {
                th = th2;
                remoteDataSource = this;
                Result.a aVar2 = Result.f124476c;
                objB = Result.b(t0.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteDataSource = (RemoteDataSource) c13041.L$0;
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
            return remoteDataSource.handleHttpOk((ApiResponse) objB);
        }
        Throwable thE = Result.e(objB);
        return thE != null ? remoteDataSource.handleHttpError(thE) : new ApiEmptyResponse(null, 1, null);
    }
}
