package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: SnapshotFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", i = {}, l = {65, 66}, m = "invokeSuspend", n = {}, s = {})
public final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1<R> extends SuspendLambda implements yh.p<i1<R>, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f12569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f12570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ CoroutineContext f12571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.e<T> f12572e;

    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: SnapshotFlow.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f12573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e<T> f12574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i1<R> f12575d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2$a */
        /* JADX INFO: compiled from: SnapshotFlow.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a<T> implements kotlinx.coroutines.flow.f<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1<R> f12576b;

            a(i1<R> i1Var) {
                this.f12576b = i1Var;
            }

            @Override // kotlinx.coroutines.flow.f
            @dl.e
            public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
                this.f12576b.setValue(t10);
                return kotlin.b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.e<? extends T> eVar, i1<R> i1Var, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.f12574c = eVar;
            this.f12575d = i1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.f12574c, this.f12575d, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
            return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2 for r4v1 'this'  kotlin.coroutines.c
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
                int r1 = r4.f12573b
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.t0.n(r5)
                goto L2c
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.t0.n(r5)
                kotlinx.coroutines.flow.e<T> r5 = r4.f12574c
                androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2$a r1 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2$a
                androidx.compose.runtime.i1<R> r3 = r4.f12575d
                r1.<init>(r3)
                r4.f12573b = r2
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L2c
                return r0
            L2c:
                kotlin.b2 r5 = kotlin.b2.f124493a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SnapshotFlow.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a<T> implements kotlinx.coroutines.flow.f<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1<R> f12577b;

        a(i1<R> i1Var) {
            this.f12577b = i1Var;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
            this.f12577b.setValue(t10);
            return kotlin.b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SnapshotStateKt__SnapshotFlowKt$collectAsState$1(CoroutineContext coroutineContext, kotlinx.coroutines.flow.e<? extends T> eVar, kotlin.coroutines.c<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1> cVar) {
        super(2, cVar);
        this.f12571d = coroutineContext;
        this.f12572e = eVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i1<R> i1Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1) create(i1Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(this.f12571d, this.f12572e, cVar);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1.f12570c = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1<R> for r6v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r6.f12569b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            kotlin.t0.n(r7)
            goto L4f
        L1b:
            kotlin.t0.n(r7)
            java.lang.Object r7 = r6.f12570c
            androidx.compose.runtime.i1 r7 = (androidx.compose.runtime.i1) r7
            kotlin.coroutines.CoroutineContext r1 = r6.f12571d
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.f124694b
            boolean r1 = kotlin.jvm.internal.f0.g(r1, r4)
            if (r1 == 0) goto L3c
            kotlinx.coroutines.flow.e<T> r1 = r6.f12572e
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$a r2 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$a
            r2.<init>(r7)
            r6.f12569b = r3
            java.lang.Object r7 = r1.a(r2, r6)
            if (r7 != r0) goto L4f
            return r0
        L3c:
            kotlin.coroutines.CoroutineContext r1 = r6.f12571d
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2 r3 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2
            kotlinx.coroutines.flow.e<T> r4 = r6.f12572e
            r5 = 0
            r3.<init>(r4, r7, r5)
            r6.f12569b = r2
            java.lang.Object r7 = kotlinx.coroutines.i.h(r1, r3, r6)
            if (r7 != r0) goto L4f
            return r0
        L4f:
            kotlin.b2 r7 = kotlin.b2.f124493a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
