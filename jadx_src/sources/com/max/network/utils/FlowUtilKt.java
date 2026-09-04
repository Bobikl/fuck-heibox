package com.max.network.utils;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import com.max.network.entities.ApiResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import yh.a;
import yh.l;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: FlowUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FlowUtilKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.network.utils.FlowUtilKt$launchAndCollectIn$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowUtil.kt */
    @d(c = "com.max.network.utils.FlowUtilKt$launchAndCollectIn$1", f = "FlowUtil.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ l<ResultBuilder<T>, b2> $listenerBuilder;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ y $owner;
        final /* synthetic */ e<ApiResponse<T>> $this_launchAndCollectIn;
        int label;

        /* JADX INFO: renamed from: com.max.network.utils.FlowUtilKt$launchAndCollectIn$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: FlowUtil.kt */
        @d(c = "com.max.network.utils.FlowUtilKt$launchAndCollectIn$1$1", f = "FlowUtil.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06121 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ l<ResultBuilder<T>, b2> $listenerBuilder;
            final /* synthetic */ e<ApiResponse<T>> $this_launchAndCollectIn;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C06121(e<? extends ApiResponse<T>> eVar, l<? super ResultBuilder<T>, b2> lVar, c<? super C06121> cVar) {
                super(2, cVar);
                this.$this_launchAndCollectIn = eVar;
                this.$listenerBuilder = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final c<b2> create(@dl.e Object obj, @dl.d c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Ne, new Class[]{Object.class, c.class}, c.class);
                return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new C06121(this.$this_launchAndCollectIn, this.$listenerBuilder, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Pe, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @dl.e c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Oe, new Class[]{q0.class, c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C06121) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to com.max.network.utils.FlowUtilKt$launchAndCollectIn$1$1 for r8v1 'this'  kotlin.coroutines.c
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
                    com.meituan.robust.ChangeQuickRedirect r3 = com.max.network.utils.FlowUtilKt.AnonymousClass1.C06121.changeQuickRedirect
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                    r6[r2] = r4
                    java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                    r4 = 0
                    r5 = 11956(0x2eb4, float:1.6754E-41)
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
                    goto L4a
                L2d:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L35:
                    kotlin.t0.n(r9)
                    kotlinx.coroutines.flow.e<com.max.network.entities.ApiResponse<T>> r9 = r8.$this_launchAndCollectIn
                    com.max.network.utils.FlowUtilKt$launchAndCollectIn$1$1$1 r2 = new com.max.network.utils.FlowUtilKt$launchAndCollectIn$1$1$1
                    yh.l<com.max.network.utils.ResultBuilder<T>, kotlin.b2> r3 = r8.$listenerBuilder
                    r2.<init>()
                    r8.label = r0
                    java.lang.Object r9 = r9.a(r2, r8)
                    if (r9 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.b2 r9 = kotlin.b2.f124493a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.max.network.utils.FlowUtilKt.AnonymousClass1.C06121.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(y yVar, Lifecycle.State state, e<? extends ApiResponse<T>> eVar, l<? super ResultBuilder<T>, b2> lVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$owner = yVar;
            this.$minActiveState = state;
            this.$this_launchAndCollectIn = eVar;
            this.$listenerBuilder = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@dl.e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Je, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass1(this.$owner, this.$minActiveState, this.$this_launchAndCollectIn, this.$listenerBuilder, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Le, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Ke, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Ie, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                y viewLifecycleOwner = ((Fragment) this.$owner).getViewLifecycleOwner();
                f0.o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = this.$minActiveState;
                C06121 c06121 = new C06121(this.$this_launchAndCollectIn, this.$listenerBuilder, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.b(viewLifecycleOwner, state, c06121, this) == objH) {
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

    /* JADX INFO: renamed from: com.max.network.utils.FlowUtilKt$launchAndCollectIn$2, reason: invalid class name */
    /* JADX INFO: compiled from: FlowUtil.kt */
    @d(c = "com.max.network.utils.FlowUtilKt$launchAndCollectIn$2", f = "FlowUtil.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ l<ResultBuilder<T>, b2> $listenerBuilder;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ y $owner;
        final /* synthetic */ e<ApiResponse<T>> $this_launchAndCollectIn;
        int label;

        /* JADX INFO: renamed from: com.max.network.utils.FlowUtilKt$launchAndCollectIn$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: FlowUtil.kt */
        @d(c = "com.max.network.utils.FlowUtilKt$launchAndCollectIn$2$1", f = "FlowUtil.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ l<ResultBuilder<T>, b2> $listenerBuilder;
            final /* synthetic */ e<ApiResponse<T>> $this_launchAndCollectIn;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(e<? extends ApiResponse<T>> eVar, l<? super ResultBuilder<T>, b2> lVar, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$this_launchAndCollectIn = eVar;
                this.$listenerBuilder = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final c<b2> create(@dl.e Object obj, @dl.d c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Xe, new Class[]{Object.class, c.class}, c.class);
                return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass1(this.$this_launchAndCollectIn, this.$listenerBuilder, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Ze, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @dl.e c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Ye, new Class[]{q0.class, c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to com.max.network.utils.FlowUtilKt$launchAndCollectIn$2$1 for r8v1 'this'  kotlin.coroutines.c
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
                    com.meituan.robust.ChangeQuickRedirect r3 = com.max.network.utils.FlowUtilKt.AnonymousClass2.AnonymousClass1.changeQuickRedirect
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                    r6[r2] = r4
                    java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                    r4 = 0
                    r5 = 11966(0x2ebe, float:1.6768E-41)
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
                    goto L4a
                L2d:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L35:
                    kotlin.t0.n(r9)
                    kotlinx.coroutines.flow.e<com.max.network.entities.ApiResponse<T>> r9 = r8.$this_launchAndCollectIn
                    com.max.network.utils.FlowUtilKt$launchAndCollectIn$2$1$1 r2 = new com.max.network.utils.FlowUtilKt$launchAndCollectIn$2$1$1
                    yh.l<com.max.network.utils.ResultBuilder<T>, kotlin.b2> r3 = r8.$listenerBuilder
                    r2.<init>()
                    r8.label = r0
                    java.lang.Object r9 = r9.a(r2, r8)
                    if (r9 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.b2 r9 = kotlin.b2.f124493a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.max.network.utils.FlowUtilKt.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(y yVar, Lifecycle.State state, e<? extends ApiResponse<T>> eVar, l<? super ResultBuilder<T>, b2> lVar, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$owner = yVar;
            this.$minActiveState = state;
            this.$this_launchAndCollectIn = eVar;
            this.$listenerBuilder = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@dl.e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Te, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass2(this.$owner, this.$minActiveState, this.$this_launchAndCollectIn, this.$listenerBuilder, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Ve, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Ue, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Se, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                y yVar = this.$owner;
                Lifecycle.State state = this.$minActiveState;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_launchAndCollectIn, this.$listenerBuilder, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.b(yVar, state, anonymousClass1, this) == objH) {
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

    /* JADX INFO: renamed from: com.max.network.utils.FlowUtilKt$launchRequest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FlowUtil.kt */
    @d(c = "com.max.network.utils.FlowUtilKt$launchRequest$1", f = "FlowUtil.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13051 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ l<c<? super b2>, Object> $requestBlock;
        int label;

        /* JADX INFO: renamed from: com.max.network.utils.FlowUtilKt$launchRequest$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: FlowUtil.kt */
        @d(c = "com.max.network.utils.FlowUtilKt$launchRequest$1$1", f = "FlowUtil.kt", i = {}, l = {29, 29}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06151 extends SuspendLambda implements p<f<? super b2>, c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ l<c<? super b2>, Object> $requestBlock;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C06151(l<? super c<? super b2>, ? extends Object> lVar, c<? super C06151> cVar) {
                super(2, cVar);
                this.$requestBlock = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final c<b2> create(@dl.e Object obj, @dl.d c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.f34774hf, new Class[]{Object.class, c.class}, c.class);
                if (patchProxyResultProxy.isSupported) {
                    return (c) patchProxyResultProxy.result;
                }
                C06151 c06151 = new C06151(this.$requestBlock, cVar);
                c06151.L$0 = obj;
                return c06151;
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(f<? super b2> fVar, c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, bb.c.m.f34820jf, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(fVar, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d f<? super b2> fVar, @dl.e c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, bb.c.m.f12if, new Class[]{f.class, c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C06151) create(fVar, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                f fVar;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f34751gf, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = b.h();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        fVar = (f) this.L$0;
                        t0.n(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t0.n(obj);
                    }
                    return b2.f124493a;
                }
                t0.n(obj);
                f fVar2 = (f) this.L$0;
                l<c<? super b2>, Object> lVar = this.$requestBlock;
                this.L$0 = fVar2;
                this.label = 1;
                if (lVar.invoke(this) == objH) {
                    return objH;
                }
                fVar = fVar2;
                b2 b2Var = b2.f124493a;
                this.L$0 = null;
                this.label = 2;
                if (fVar.emit(b2Var, this) == objH) {
                    return objH;
                }
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13051(l<? super c<? super b2>, ? extends Object> lVar, c<? super C13051> cVar) {
            super(2, cVar);
            this.$requestBlock = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@dl.e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.f34682df, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new C13051(this.$requestBlock, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f34728ff, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f34705ef, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13051) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f34658cf, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                e eVarI0 = g.I0(new C06151(this.$requestBlock, null));
                this.label = 1;
                if (g.x(eVarI0, this) == objH) {
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

    /* JADX INFO: renamed from: com.max.network.utils.FlowUtilKt$launchRequest$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FlowUtil.kt */
    @d(c = "com.max.network.utils.FlowUtilKt$launchRequest$2", f = "FlowUtil.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13062 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ l<ResultBuilder<T>, b2> $listenerBuilder;
        final /* synthetic */ l<c<? super ApiResponse<T>>, Object> $requestBlock;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13062(l<? super c<? super ApiResponse<T>>, ? extends Object> lVar, l<? super ResultBuilder<T>, b2> lVar2, c<? super C13062> cVar) {
            super(2, cVar);
            this.$requestBlock = lVar;
            this.$listenerBuilder = lVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@dl.e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.f34866lf, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new C13062(this.$requestBlock, this.$listenerBuilder, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f34912nf, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f34889mf, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13062) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f34843kf, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                e eVarLaunchRequestFlow$default = FlowUtilKt.launchRequestFlow$default(this.$requestBlock, null, null, 6, null);
                final l<ResultBuilder<T>, b2> lVar = this.$listenerBuilder;
                f fVar = new f() { // from class: com.max.network.utils.FlowUtilKt.launchRequest.2.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @dl.e
                    public final Object emit(@dl.d ApiResponse<T> apiResponse, @dl.d c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{apiResponse, cVar}, this, changeQuickRedirect, false, bb.c.m.f34935of, new Class[]{ApiResponse.class, c.class}, Object.class);
                        if (patchProxyResultProxy2.isSupported) {
                            return patchProxyResultProxy2.result;
                        }
                        KtUtilKt.parseData(apiResponse, lVar);
                        return b2.f124493a;
                    }

                    @Override // kotlinx.coroutines.flow.f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{obj2, cVar}, this, changeQuickRedirect, false, bb.c.m.f34958pf, new Class[]{Object.class, c.class}, Object.class);
                        return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : emit((ApiResponse) obj2, (c<? super b2>) cVar);
                    }
                };
                this.label = 1;
                if (eVarLaunchRequestFlow$default.a(fVar, this) == objH) {
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

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.max.network.utils.FlowUtilKt$launchRequestFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FlowUtil.kt */
    @d(c = "com.max.network.utils.FlowUtilKt$launchRequestFlow$1", f = "FlowUtil.kt", i = {}, l = {15, 15}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13071<T> extends SuspendLambda implements p<f<? super ApiResponse<T>>, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ l<c<? super ApiResponse<T>>, Object> $requestBlock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13071(l<? super c<? super ApiResponse<T>>, ? extends Object> lVar, c<? super C13071> cVar) {
            super(2, cVar);
            this.$requestBlock = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@dl.e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.f35003rf, new Class[]{Object.class, c.class}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            C13071 c13071 = new C13071(this.$requestBlock, cVar);
            c13071.L$0 = obj;
            return c13071;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.f35047tf, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke((f) obj, cVar);
        }

        @dl.e
        public final Object invoke(@dl.d f<? super ApiResponse<T>> fVar, @dl.e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, bb.c.m.f35025sf, new Class[]{f.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13071) create(fVar, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            f fVar;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f34981qf, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    f fVar2 = (f) this.L$0;
                    t0.n(obj);
                    fVar = fVar2;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                return b2.f124493a;
            }
            t0.n(obj);
            f fVar3 = (f) this.L$0;
            l<c<? super ApiResponse<T>>, Object> lVar = this.$requestBlock;
            this.L$0 = fVar3;
            this.label = 1;
            Object objInvoke = lVar.invoke(this);
            if (objInvoke == objH) {
                return objH;
            }
            fVar = fVar3;
            obj = objInvoke;
            this.L$0 = null;
            this.label = 2;
            if (fVar.emit(obj, this) == objH) {
                return objH;
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.max.network.utils.FlowUtilKt$launchRequestFlow$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FlowUtil.kt */
    @d(c = "com.max.network.utils.FlowUtilKt$launchRequestFlow$2", f = "FlowUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13082<T> extends SuspendLambda implements p<f<? super ApiResponse<T>>, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a<b2> $startCallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13082(a<b2> aVar, c<? super C13082> cVar) {
            super(2, cVar);
            this.$startCallback = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@dl.e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.f35091vf, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new C13082(this.$startCallback, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.f35135xf, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke((f) obj, cVar);
        }

        @dl.e
        public final Object invoke(@dl.d f<? super ApiResponse<T>> fVar, @dl.e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, bb.c.m.f35113wf, new Class[]{f.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13082) create(fVar, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f35069uf, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            b.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            a<b2> aVar = this.$startCallback;
            if (aVar != null) {
                aVar.invoke();
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.max.network.utils.FlowUtilKt$launchRequestFlow$3, reason: invalid class name */
    /* JADX INFO: compiled from: FlowUtil.kt */
    @d(c = "com.max.network.utils.FlowUtilKt$launchRequestFlow$3", f = "FlowUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3<T> extends SuspendLambda implements q<f<? super ApiResponse<T>>, Throwable, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a<b2> $completeCallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(a<b2> aVar, c<? super AnonymousClass3> cVar) {
            super(3, cVar);
            this.$completeCallback = aVar;
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th2, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, th2, cVar}, this, changeQuickRedirect, false, bb.c.m.Af, new Class[]{Object.class, Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke((f) obj, th2, cVar);
        }

        @dl.e
        public final Object invoke(@dl.d f<? super ApiResponse<T>> fVar, @dl.e Throwable th2, @dl.e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, th2, cVar}, this, changeQuickRedirect, false, bb.c.m.f35179zf, new Class[]{f.class, Throwable.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : new AnonymousClass3(this.$completeCallback, cVar).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f35157yf, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            b.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            a<b2> aVar = this.$completeCallback;
            if (aVar != null) {
                aVar.invoke();
            }
            return b2.f124493a;
        }
    }

    @dl.d
    public static final <T> d2 launchAndCollectIn(@dl.d e<? extends ApiResponse<T>> eVar, @dl.d y owner, @dl.d Lifecycle.State minActiveState, @dl.d l<? super ResultBuilder<T>, b2> listenerBuilder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, owner, minActiveState, listenerBuilder}, null, changeQuickRedirect, true, bb.c.m.Ge, new Class[]{e.class, y.class, Lifecycle.State.class, l.class}, d2.class);
        if (patchProxyResultProxy.isSupported) {
            return (d2) patchProxyResultProxy.result;
        }
        f0.p(eVar, "<this>");
        f0.p(owner, "owner");
        f0.p(minActiveState, "minActiveState");
        f0.p(listenerBuilder, "listenerBuilder");
        if (!(owner instanceof Fragment)) {
            return k.f(z.a(owner), null, null, new AnonymousClass2(owner, minActiveState, eVar, listenerBuilder, null), 3, null);
        }
        y viewLifecycleOwner = ((Fragment) owner).getViewLifecycleOwner();
        f0.o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return k.f(z.a(viewLifecycleOwner), null, null, new AnonymousClass1(owner, minActiveState, eVar, listenerBuilder, null), 3, null);
    }

    public static /* synthetic */ d2 launchAndCollectIn$default(e eVar, y yVar, Lifecycle.State state, l lVar, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, yVar, state, lVar, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.m.He, new Class[]{e.class, y.class, Lifecycle.State.class, l.class, Integer.TYPE, Object.class}, d2.class);
        if (patchProxyResultProxy.isSupported) {
            return (d2) patchProxyResultProxy.result;
        }
        if ((i10 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return launchAndCollectIn(eVar, yVar, state, lVar);
    }

    @dl.d
    public static final d2 launchRequest(@dl.d y yVar, @dl.d l<? super c<? super b2>, ? extends Object> requestBlock) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{yVar, requestBlock}, null, changeQuickRedirect, true, bb.c.m.Ee, new Class[]{y.class, l.class}, d2.class);
        if (patchProxyResultProxy.isSupported) {
            return (d2) patchProxyResultProxy.result;
        }
        f0.p(yVar, "<this>");
        f0.p(requestBlock, "requestBlock");
        return k.f(z.a(yVar), null, null, new C13051(requestBlock, null), 3, null);
    }

    @dl.d
    public static final <T> d2 launchRequest(@dl.d y yVar, @dl.d l<? super c<? super ApiResponse<T>>, ? extends Object> requestBlock, @dl.d l<? super ResultBuilder<T>, b2> listenerBuilder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{yVar, requestBlock, listenerBuilder}, null, changeQuickRedirect, true, bb.c.m.Fe, new Class[]{y.class, l.class, l.class}, d2.class);
        if (patchProxyResultProxy.isSupported) {
            return (d2) patchProxyResultProxy.result;
        }
        f0.p(yVar, "<this>");
        f0.p(requestBlock, "requestBlock");
        f0.p(listenerBuilder, "listenerBuilder");
        return k.f(z.a(yVar), null, null, new C13062(requestBlock, listenerBuilder, null), 3, null);
    }

    @dl.d
    public static final <T> e<ApiResponse<T>> launchRequestFlow(@dl.d l<? super c<? super ApiResponse<T>>, ? extends Object> requestBlock, @dl.e a<b2> aVar, @dl.e a<b2> aVar2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{requestBlock, aVar, aVar2}, null, changeQuickRedirect, true, bb.c.m.Ce, new Class[]{l.class, a.class, a.class}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        f0.p(requestBlock, "requestBlock");
        return g.d1(g.l1(g.I0(new C13071(requestBlock, null)), new C13082(aVar, null)), new AnonymousClass3(aVar2, null));
    }

    public static /* synthetic */ e launchRequestFlow$default(l lVar, a aVar, a aVar2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{lVar, aVar, aVar2, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.m.De, new Class[]{l.class, a.class, a.class, Integer.TYPE, Object.class}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        if ((i10 & 4) != 0) {
            aVar2 = null;
        }
        return launchRequestFlow(lVar, aVar, aVar2);
    }
}
