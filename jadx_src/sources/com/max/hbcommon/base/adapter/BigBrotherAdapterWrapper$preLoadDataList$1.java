package com.max.hbcommon.base.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.umeng.analytics.AnalyticsConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: BigBrotherAdapterWrapper.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper", f = "BigBrotherAdapterWrapper.kt", i = {0}, l = {107}, m = "preLoadDataList", n = {AnalyticsConfig.RTD_START_TIME}, s = {"J$0"})
public final class BigBrotherAdapterWrapper$preLoadDataList$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f66676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f66677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ BigBrotherAdapterWrapper<T> f66678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f66679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BigBrotherAdapterWrapper$preLoadDataList$1(BigBrotherAdapterWrapper<T> bigBrotherAdapterWrapper, kotlin.coroutines.c<? super BigBrotherAdapterWrapper$preLoadDataList$1> cVar) {
        super(cVar);
        this.f66678d = bigBrotherAdapterWrapper;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper$preLoadDataList$1 for r8v1 'this'  kotlin.coroutines.c
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
            com.meituan.robust.ChangeQuickRedirect r3 = com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper$preLoadDataList$1.changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r6[r2] = r0
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r4 = 0
            r5 = 1926(0x786, float:2.699E-42)
            r2 = r8
            com.meituan.robust.PatchProxyResult r0 = com.meituan.robust.PatchProxy.proxy(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r0.isSupported
            if (r1 == 0) goto L1f
            java.lang.Object r9 = r0.result
            return r9
        L1f:
            r8.f66677c = r9
            int r9 = r8.f66679e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 | r0
            r8.f66679e = r9
            com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper<T> r9 = r8.f66678d
            r0 = 0
            java.lang.Object r9 = r9.B(r0, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper$preLoadDataList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
