package com.max.network.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import okhttp3.d0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: HBNetworkExecutorBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
@d(c = "com.max.network.utils.HBNetworkExecutorBuilder$buildDownload$runBlock$1", f = "HBNetworkExecutorBuilder.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
public final class HBNetworkExecutorBuilder$buildDownload$runBlock$1 extends SuspendLambda implements l<c<? super d0>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ p<T, c<? super d0>, Object> $apiBlock;
    int label;
    final /* synthetic */ HBNetworkExecutorBuilder<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HBNetworkExecutorBuilder$buildDownload$runBlock$1(p<? super T, ? super c<? super d0>, ? extends Object> pVar, HBNetworkExecutorBuilder<T> hBNetworkExecutorBuilder, c<? super HBNetworkExecutorBuilder$buildDownload$runBlock$1> cVar) {
        super(1, cVar);
        this.$apiBlock = pVar;
        this.this$0 = hBNetworkExecutorBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.m.f34844kg, new Class[]{c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new HBNetworkExecutorBuilder$buildDownload$runBlock$1(this.$apiBlock, this.this$0, cVar);
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ Object invoke(c<? super d0> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.m.f34890mg, new Class[]{Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@e c<? super d0> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.m.f34867lg, new Class[]{c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HBNetworkExecutorBuilder$buildDownload$runBlock$1) create(cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.max.network.utils.HBNetworkExecutorBuilder$buildDownload$runBlock$1 for r8v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r9
            com.meituan.robust.ChangeQuickRedirect r3 = com.max.network.utils.HBNetworkExecutorBuilder$buildDownload$runBlock$1.changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r6[r2] = r4
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r4 = 0
            r5 = 12031(0x2eff, float:1.6859E-41)
            r2 = r8
            com.meituan.robust.PatchProxyResult r1 = com.meituan.robust.PatchProxy.proxy(r1, r2, r3, r4, r5, r6, r7)
            boolean r2 = r1.isSupported
            if (r2 == 0) goto L1f
            java.lang.Object r9 = r1.result
            return r9
        L1f:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r8.label
            if (r2 == 0) goto L35
            if (r2 != r0) goto L2d
            kotlin.t0.n(r9)
            goto L53
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            kotlin.t0.n(r9)
            yh.p<T, kotlin.coroutines.c<? super okhttp3.d0>, java.lang.Object> r9 = r8.$apiBlock
            com.max.network.holder.ServiceHolder$Companion r2 = com.max.network.holder.ServiceHolder.Companion
            com.max.network.holder.ServiceHolder r2 = r2.getInstance()
            com.max.network.utils.HBNetworkExecutorBuilder<T> r3 = r8.this$0
            java.lang.String r3 = com.max.network.utils.HBNetworkExecutorBuilder.access$getGroup$p(r3)
            com.max.network.interfaces.ApiService r2 = r2.getApiService(r3)
            r8.label = r0
            java.lang.Object r9 = r9.invoke(r2, r8)
            if (r9 != r1) goto L53
            return r1
        L53:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.network.utils.HBNetworkExecutorBuilder$buildDownload$runBlock$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
