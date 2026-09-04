package com.max.network.model;

import com.max.network.utils.DownloadResultBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.q0;
import okhttp3.d0;
import yh.p;

/* JADX INFO: compiled from: RemoteDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@t0({"SMAP\nRemoteDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteDataSource.kt\ncom/max/network/model/RemoteDataSource$downloadFile$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
@d(c = "com.max.network.model.RemoteDataSource$downloadFile$3$1", f = "RemoteDataSource.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3}, l = {92, 91, 101, 100, 107, 106}, m = "invokeSuspend", n = {"$this$flow", "inputStream", "outputStream", "buffer", "bufferedInputStream", "currentLength", "readLength", "contentLength", "bufferSize", "$this$flow", "inputStream", "outputStream", "buffer", "bufferedInputStream", "currentLength", "readLength", "contentLength", "bufferSize", "$this$flow", "$this$flow"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "I$0", "L$0", "L$0"})
public final class RemoteDataSource$downloadFile$3$1 extends SuspendLambda implements p<f<? super b2>, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ d0 $body;
    final /* synthetic */ DownloadResultBuilder<String> $listener;
    final /* synthetic */ String $outputPath;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;

    /* JADX INFO: renamed from: com.max.network.model.RemoteDataSource$downloadFile$3$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: RemoteDataSource.kt */
    @d(c = "com.max.network.model.RemoteDataSource$downloadFile$3$1$2", f = "RemoteDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ long $contentLength;
        final /* synthetic */ Ref.IntRef $currentLength;
        final /* synthetic */ DownloadResultBuilder<String> $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DownloadResultBuilder<String> downloadResultBuilder, Ref.IntRef intRef, long j10, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$listener = downloadResultBuilder;
            this.$currentLength = intRef;
            this.$contentLength = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.f34911ne, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass2(this.$listener, this.$currentLength, this.$contentLength, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f34957pe, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f34934oe, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f34888me, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            b.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            this.$listener.getOnLoading().invoke(a.g(this.$currentLength.f124889b), a.g(this.$contentLength));
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: com.max.network.model.RemoteDataSource$downloadFile$3$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: RemoteDataSource.kt */
    @d(c = "com.max.network.model.RemoteDataSource$downloadFile$3$1$3", f = "RemoteDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ DownloadResultBuilder<String> $listener;
        final /* synthetic */ String $outputPath;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(DownloadResultBuilder<String> downloadResultBuilder, String str, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$listener = downloadResultBuilder;
            this.$outputPath = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.f35002re, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass3(this.$listener, this.$outputPath, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f35046te, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f35024se, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f34980qe, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            b.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            this.$listener.getOnSuccess().invoke(this.$outputPath);
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: com.max.network.model.RemoteDataSource$downloadFile$3$1$4, reason: invalid class name */
    /* JADX INFO: compiled from: RemoteDataSource.kt */
    @d(c = "com.max.network.model.RemoteDataSource$downloadFile$3$1$4", f = "RemoteDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Exception $e;
        final /* synthetic */ DownloadResultBuilder<String> $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(DownloadResultBuilder<String> downloadResultBuilder, Exception exc, c<? super AnonymousClass4> cVar) {
            super(2, cVar);
            this.$listener = downloadResultBuilder;
            this.$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.f35090ve, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass4(this.$listener, this.$e, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f35134xe, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f35112we, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass4) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f35068ue, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            b.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            this.$listener.getOnError().invoke(this.$e);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteDataSource$downloadFile$3$1(d0 d0Var, String str, DownloadResultBuilder<String> downloadResultBuilder, c<? super RemoteDataSource$downloadFile$3$1> cVar) {
        super(2, cVar);
        this.$body = d0Var;
        this.$outputPath = str;
        this.$listener = downloadResultBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.f34819je, new Class[]{Object.class, c.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        RemoteDataSource$downloadFile$3$1 remoteDataSource$downloadFile$3$1 = new RemoteDataSource$downloadFile$3$1(this.$body, this.$outputPath, this.$listener, cVar);
        remoteDataSource$downloadFile$3$1.L$0 = obj;
        return remoteDataSource$downloadFile$3$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(f<? super b2> fVar, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, bb.c.m.f34865le, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(fVar, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d f<? super b2> fVar, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, bb.c.m.f34842ke, new Class[]{f.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((RemoteDataSource$downloadFile$3$1) create(fVar, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0114 A[Catch: Exception -> 0x01f3, TRY_LEAVE, TryCatch #8 {Exception -> 0x01f3, blocks: (B:34:0x010b, B:36:0x0114), top: B:96:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0161 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0162  */
    /* JADX WARN: Code duplicated, block: B:47:0x018c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x018d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [kotlinx.coroutines.flow.f] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlinx.coroutines.flow.f] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r2v11, types: [kotlinx.coroutines.flow.f] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v7, types: [kotlinx.coroutines.flow.f] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x018d -> B:49:0x0193). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.network.model.RemoteDataSource$downloadFile$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
