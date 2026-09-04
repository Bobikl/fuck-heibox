package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: RemoteMediatorAccessor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", f = "RemoteMediatorAccessor.kt", i = {}, l = {bb.c.b.f31075z3}, m = "invokeSuspend", n = {}, s = {})
public final class RemoteMediatorAccessImpl$launchBoundary$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f26219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ RemoteMediatorAccessImpl f26220c;

    /* JADX INFO: renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: RemoteMediatorAccessor.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", f = "RemoteMediatorAccessor.kt", i = {0}, l = {bb.c.b.E3}, m = "invokeSuspend", n = {"loadType"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f26221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f26222c;

        AnonymousClass1(kotlin.coroutines.c cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            return RemoteMediatorAccessImpl$launchBoundary$1.this.new AnonymousClass1(completion);
        }

        @Override // yh.l
        public final Object invoke(kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(cVar)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0034  */
        /* JADX WARN: Code duplicated, block: B:13:0x0052 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0053  */
        /* JADX WARN: Code duplicated, block: B:17:0x005d  */
        /* JADX WARN: Code duplicated, block: B:18:0x006e  */
        /* JADX WARN: Code duplicated, block: B:20:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0053 -> B:15:0x0057). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
                int r1 = r7.f26222c
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r7.f26221b
                androidx.paging.LoadType r1 = (androidx.paging.LoadType) r1
                kotlin.t0.n(r8)
                r3 = r1
                r1 = r0
                r0 = r7
                goto L57
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                kotlin.t0.n(r8)
                r8 = r7
            L22:
                androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1 r1 = androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.this
                androidx.paging.RemoteMediatorAccessImpl r1 = r1.f26220c
                androidx.paging.b r1 = androidx.paging.RemoteMediatorAccessImpl.d(r1)
                androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1 r3 = new yh.l<androidx.paging.AccessorState<Key, Value>, kotlin.Pair<? extends androidx.paging.LoadType, ? extends androidx.paging.PagingState<Key, Value>>>() { // from class: androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.1
                    static {
                        /*
                            androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1 r0 = new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1
                            r0.<init>()
                            
                            // error: 0x0005: SPUT (r0 I:androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1) androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.1.b androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.AnonymousClass1.C01981.<clinit>():void");
                    }

                    {
                        /*
                            r1 = this;
                            r0 = 1
                            r1.<init>(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.AnonymousClass1.C01981.<init>():void");
                    }

                    @Override // yh.l
                    @dl.e
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final kotlin.Pair<androidx.paging.LoadType, androidx.paging.PagingState<Key, Value>> invoke(@dl.d androidx.paging.AccessorState<Key, Value> r2) {
                        /*
                            r1 = this;
                            java.lang.String r0 = "it"
                            kotlin.jvm.internal.f0.p(r2, r0)
                            kotlin.Pair r2 = r2.g()
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.AnonymousClass1.C01981.invoke(androidx.paging.AccessorState):kotlin.Pair");
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                        /*
                            r0 = this;
                            androidx.paging.AccessorState r1 = (androidx.paging.AccessorState) r1
                            kotlin.Pair r1 = r0.invoke(r1)
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.AnonymousClass1.C01981.invoke(java.lang.Object):java.lang.Object");
                    }
                }
                java.lang.Object r1 = r1.b(r3)
                kotlin.Pair r1 = (kotlin.Pair) r1
                if (r1 == 0) goto L85
                java.lang.Object r3 = r1.a()
                androidx.paging.LoadType r3 = (androidx.paging.LoadType) r3
                java.lang.Object r1 = r1.b()
                androidx.paging.t0 r1 = (androidx.paging.PagingState) r1
                androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1 r4 = androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.this
                androidx.paging.RemoteMediatorAccessImpl r4 = r4.f26220c
                androidx.paging.RemoteMediator r4 = androidx.paging.RemoteMediatorAccessImpl.f(r4)
                r8.f26221b = r3
                r8.f26222c = r2
                java.lang.Object r1 = r4.c(r3, r1, r8)
                if (r1 != r0) goto L53
                return r0
            L53:
                r6 = r0
                r0 = r8
                r8 = r1
                r1 = r6
            L57:
                androidx.paging.RemoteMediator$a r8 = (androidx.paging.RemoteMediator.a) r8
                boolean r4 = r8 instanceof androidx.paging.RemoteMediator.a.b
                if (r4 == 0) goto L6e
                androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1 r4 = androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.this
                androidx.paging.RemoteMediatorAccessImpl r4 = r4.f26220c
                androidx.paging.b r4 = androidx.paging.RemoteMediatorAccessImpl.d(r4)
                androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$2 r5 = new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$2
                r5.<init>()
                r4.b(r5)
                goto L82
            L6e:
                boolean r4 = r8 instanceof androidx.paging.RemoteMediator.a.C0197a
                if (r4 == 0) goto L82
                androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1 r4 = androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.this
                androidx.paging.RemoteMediatorAccessImpl r4 = r4.f26220c
                androidx.paging.b r4 = androidx.paging.RemoteMediatorAccessImpl.d(r4)
                androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$3 r5 = new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$3
                r5.<init>()
                r4.b(r5)
            L82:
                r8 = r0
                r0 = r1
                goto L22
            L85:
                kotlin.b2 r8 = kotlin.b2.f124493a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteMediatorAccessImpl$launchBoundary$1(RemoteMediatorAccessImpl remoteMediatorAccessImpl, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f26220c = remoteMediatorAccessImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new RemoteMediatorAccessImpl$launchBoundary$1(this.f26220c, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((RemoteMediatorAccessImpl$launchBoundary$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26219b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            SingleRunner singleRunner = this.f26220c.isolationRunner;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.f26219b = 1;
            if (singleRunner.b(1, anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
