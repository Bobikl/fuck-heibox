package com.max.network.utils;

import com.google.android.gms.common.internal.s;
import com.max.network.interfaces.HBNetworkExecutor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import okhttp3.d0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: HBNetworkExecutorImp.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HBNetworkDownloadExecutor implements HBNetworkExecutor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final l<c<? super d0>, Object> block;

    /* JADX INFO: renamed from: com.max.network.utils.HBNetworkDownloadExecutor$downloadFile$1, reason: invalid class name */
    /* JADX INFO: compiled from: HBNetworkExecutorImp.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.network.utils.HBNetworkDownloadExecutor", f = "HBNetworkExecutorImp.kt", i = {0, 0}, l = {86, 125}, m = "downloadFile", n = {"outputPath", s.a.f52543a}, s = {"L$0", "L$1"})
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
        public final Object invokeSuspend(@d Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Ef, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HBNetworkDownloadExecutor.this.downloadFile(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.max.network.utils.HBNetworkDownloadExecutor$downloadFileWithCoroutine$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: HBNetworkExecutorImp.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.network.utils.HBNetworkDownloadExecutor$downloadFileWithCoroutine$1", f = "HBNetworkExecutorImp.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13091 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ DownloadResultBuilder<String> $listener;
        final /* synthetic */ String $outputPath;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13091(String str, DownloadResultBuilder<String> downloadResultBuilder, c<? super C13091> cVar) {
            super(2, cVar);
            this.$outputPath = str;
            this.$listener = downloadResultBuilder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final c<b2> create(@e Object obj, @d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Wf, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : HBNetworkDownloadExecutor.this.new C13091(this.$outputPath, this.$listener, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Yf, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Xf, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13091) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Vf, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                HBNetworkDownloadExecutor hBNetworkDownloadExecutor = HBNetworkDownloadExecutor.this;
                String str = this.$outputPath;
                DownloadResultBuilder<String> downloadResultBuilder = this.$listener;
                this.label = 1;
                if (hBNetworkDownloadExecutor.downloadFile(str, downloadResultBuilder, this) == objH) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public HBNetworkDownloadExecutor(@d l<? super c<? super d0>, ? extends Object> block) {
        f0.p(block, "block");
        this.block = block;
    }

    public static /* synthetic */ d2 downloadFileWithCoroutine$default(HBNetworkDownloadExecutor hBNetworkDownloadExecutor, CoroutineDispatcher coroutineDispatcher, String str, l lVar, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBNetworkDownloadExecutor, coroutineDispatcher, str, lVar, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.m.Cf, new Class[]{HBNetworkDownloadExecutor.class, CoroutineDispatcher.class, String.class, l.class, Integer.TYPE, Object.class}, d2.class);
        if (patchProxyResultProxy.isSupported) {
            return (d2) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            coroutineDispatcher = e1.c();
        }
        return hBNetworkDownloadExecutor.downloadFileWithCoroutine(coroutineDispatcher, str, lVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040  */
    @e
    public final Object downloadFile(@d String str, @d DownloadResultBuilder<String> downloadResultBuilder, @d c<? super b2> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object objB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, downloadResultBuilder, cVar}, this, changeQuickRedirect, false, bb.c.m.Df, new Class[]{String.class, DownloadResultBuilder.class, c.class}, Object.class);
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
            l<c<? super d0>, Object> lVar = this.block;
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
        kotlinx.coroutines.flow.e eVarN0 = g.N0(g.I0(new HBNetworkDownloadExecutor$downloadFile$3$1((d0) objB, str, downloadResultBuilder, null)), e1.c());
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        if (g.x(eVarN0, anonymousClass1) == objH) {
            return objH;
        }
        return b2.f124493a;
    }

    @d
    public final d2 downloadFileWithCoroutine(@d CoroutineDispatcher dispatcher, @d String outputPath, @d l<? super DownloadResultBuilder<String>, b2> listenerBuilder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dispatcher, outputPath, listenerBuilder}, this, changeQuickRedirect, false, bb.c.m.Bf, new Class[]{CoroutineDispatcher.class, String.class, l.class}, d2.class);
        if (patchProxyResultProxy.isSupported) {
            return (d2) patchProxyResultProxy.result;
        }
        f0.p(dispatcher, "dispatcher");
        f0.p(outputPath, "outputPath");
        f0.p(listenerBuilder, "listenerBuilder");
        DownloadResultBuilder downloadResultBuilder = new DownloadResultBuilder(null, 1, null);
        listenerBuilder.invoke(downloadResultBuilder);
        return k.f(r0.a(dispatcher), null, null, new C13091(outputPath, downloadResultBuilder, null), 3, null);
    }
}
