package com.max.hbcommon.base.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: BigBrotherAdapterWrapper.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper", f = "BigBrotherAdapterWrapper.kt", i = {0, 0, 0, 0}, l = {bb.c.b.f31028x0}, m = "preLoadItem", n = {"this", "createViewHolder", UCropPlusActivity.ARG_INDEX, "layoutIdByType"}, s = {"L$0", "L$1", "I$0", "I$1"})
public final class BigBrotherAdapterWrapper$preLoadItem$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f66690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f66691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f66692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f66693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f66694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ BigBrotherAdapterWrapper<T> f66695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f66696h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BigBrotherAdapterWrapper$preLoadItem$1(BigBrotherAdapterWrapper<T> bigBrotherAdapterWrapper, kotlin.coroutines.c<? super BigBrotherAdapterWrapper$preLoadItem$1> cVar) {
        super(cVar);
        this.f66695g = bigBrotherAdapterWrapper;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper$preLoadItem$1 for r9v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r8 = 0
            r1[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r3 = com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper$preLoadItem$1.changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r6[r8] = r0
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r4 = 0
            r5 = 1932(0x78c, float:2.707E-42)
            r2 = r9
            com.meituan.robust.PatchProxyResult r0 = com.meituan.robust.PatchProxy.proxy(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r0.isSupported
            if (r1 == 0) goto L1f
            java.lang.Object r10 = r0.result
            return r10
        L1f:
            r9.f66694f = r10
            int r10 = r9.f66696h
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r0
            r9.f66696h = r10
            com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper<T> r10 = r9.f66695g
            r0 = 0
            java.lang.Object r10 = r10.C(r8, r0, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper$preLoadItem$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
