package com.max.hbcommon.base.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: BigBrotherAdapterWrapper.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper$preloadMore$2", f = "BigBrotherAdapterWrapper.kt", i = {0}, l = {159}, m = "invokeSuspend", n = {"i"}, s = {"I$0"})
public final class BigBrotherAdapterWrapper$preloadMore$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f66697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f66698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f66699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ List<T> f66700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ BigBrotherAdapterWrapper<T> f66701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f66702g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BigBrotherAdapterWrapper$preloadMore$2(List<? extends T> list, BigBrotherAdapterWrapper<T> bigBrotherAdapterWrapper, int i10, kotlin.coroutines.c<? super BigBrotherAdapterWrapper$preloadMore$2> cVar) {
        super(2, cVar);
        this.f66700e = list;
        this.f66701f = bigBrotherAdapterWrapper;
        this.f66702g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.my, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new BigBrotherAdapterWrapper$preloadMore$2(this.f66700e, this.f66701f, this.f66702g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.oy, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.ny, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BigBrotherAdapterWrapper$preloadMore$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:18:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
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
            com.meituan.robust.ChangeQuickRedirect r3 = com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper$preloadMore$2.changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r6[r8] = r2
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r4 = 0
            r5 = 1933(0x78d, float:2.709E-42)
            r2 = r9
            com.meituan.robust.PatchProxyResult r1 = com.meituan.robust.PatchProxy.proxy(r1, r2, r3, r4, r5, r6, r7)
            boolean r2 = r1.isSupported
            if (r2 == 0) goto L1f
            java.lang.Object r10 = r1.result
            return r10
        L1f:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r9.f66699d
            if (r2 == 0) goto L3a
            if (r2 != r0) goto L32
            int r2 = r9.f66698c
            int r3 = r9.f66697b
            kotlin.t0.n(r10)
            r10 = r9
            goto L60
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3a:
            kotlin.t0.n(r10)
            java.util.List<T> r10 = r9.f66700e
            int r10 = r10.size()
            r2 = r10
            r10 = r9
        L45:
            if (r8 >= r2) goto L63
            com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper<T> r3 = r10.f66701f
            int r4 = r10.f66702g
            int r4 = r4 + r8
            java.util.List<T> r5 = r10.f66700e
            java.lang.Object r5 = r5.get(r8)
            r10.f66697b = r8
            r10.f66698c = r2
            r10.f66699d = r0
            java.lang.Object r3 = r3.C(r4, r5, r10)
            if (r3 != r1) goto L5f
            return r1
        L5f:
            r3 = r8
        L60:
            int r8 = r3 + 1
            goto L45
        L63:
            kotlin.b2 r10 = kotlin.b2.f124493a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper$preloadMore$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
