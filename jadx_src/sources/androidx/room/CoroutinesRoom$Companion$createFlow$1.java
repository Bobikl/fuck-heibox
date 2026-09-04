package androidx.room;

import com.umeng.analytics.pro.ak;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: CoroutinesRoom.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/flow/f;", "Lxh/n;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
public final class CoroutinesRoom$Companion$createFlow$1<R> extends SuspendLambda implements yh.p<kotlinx.coroutines.flow.f<R>, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f26917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f26918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f26919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ RoomDatabase f26920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String[] f26921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Callable<R> f26922g;

    /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutinesRoom.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f26923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f26924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f26925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ RoomDatabase f26926e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.f<R> f26927f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String[] f26928g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Callable<R> f26929h;

        /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: CoroutinesRoom.kt */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @kotlin.coroutines.jvm.internal.d(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", i = {}, l = {127, 129}, m = "invokeSuspend", n = {}, s = {})
        public static final class C02121 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f26930b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f26931c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ RoomDatabase f26932d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f26933e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.k<kotlin.b2> f26934f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Callable<R> f26935g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.k<R> f26936h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02121(RoomDatabase roomDatabase, a aVar, kotlinx.coroutines.channels.k<kotlin.b2> kVar, Callable<R> callable, kotlinx.coroutines.channels.k<R> kVar2, kotlin.coroutines.c<? super C02121> cVar) {
                super(2, cVar);
                this.f26932d = roomDatabase;
                this.f26933e = aVar;
                this.f26934f = kVar;
                this.f26935g = callable;
                this.f26936h = kVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                return new C02121(this.f26932d, this.f26933e, this.f26934f, this.f26935g, this.f26936h, cVar);
            }

            @Override // yh.p
            @dl.e
            public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                return ((C02121) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0048 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:20:0x0049  */
            /* JADX WARN: Code duplicated, block: B:23:0x0054 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:17:0x003e, B:21:0x004c, B:23:0x0054), top: B:35:0x003e }] */
            /* JADX WARN: Code duplicated, block: B:25:0x0069 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:26:0x006a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006a -> B:35:0x003e). Please report as a decompilation issue!!! */
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
                    int r1 = r7.f26931c
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L29
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r7.f26930b
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    kotlin.t0.n(r8)     // Catch: java.lang.Throwable -> L7c
                    r8 = r1
                    goto L3d
                L17:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1f:
                    java.lang.Object r1 = r7.f26930b
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    kotlin.t0.n(r8)     // Catch: java.lang.Throwable -> L7c
                    r4 = r1
                    r1 = r7
                    goto L4c
                L29:
                    kotlin.t0.n(r8)
                    androidx.room.RoomDatabase r8 = r7.f26932d
                    androidx.room.f0 r8 = r8.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a r1 = r7.f26933e
                    r8.b(r1)
                    kotlinx.coroutines.channels.k<kotlin.b2> r8 = r7.f26934f     // Catch: java.lang.Throwable -> L7c
                    kotlinx.coroutines.channels.ChannelIterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L7c
                L3d:
                    r1 = r7
                L3e:
                    r1.f26930b = r8     // Catch: java.lang.Throwable -> L7a
                    r1.f26931c = r3     // Catch: java.lang.Throwable -> L7a
                    java.lang.Object r4 = r8.b(r1)     // Catch: java.lang.Throwable -> L7a
                    if (r4 != r0) goto L49
                    return r0
                L49:
                    r6 = r4
                    r4 = r8
                    r8 = r6
                L4c:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L7a
                    boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L7a
                    if (r8 == 0) goto L6c
                    r4.next()     // Catch: java.lang.Throwable -> L7a
                    java.util.concurrent.Callable<R> r8 = r1.f26935g     // Catch: java.lang.Throwable -> L7a
                    java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L7a
                    kotlinx.coroutines.channels.k<R> r5 = r1.f26936h     // Catch: java.lang.Throwable -> L7a
                    r1.f26930b = r4     // Catch: java.lang.Throwable -> L7a
                    r1.f26931c = r2     // Catch: java.lang.Throwable -> L7a
                    java.lang.Object r8 = r5.X(r8, r1)     // Catch: java.lang.Throwable -> L7a
                    if (r8 != r0) goto L6a
                    return r0
                L6a:
                    r8 = r4
                    goto L3e
                L6c:
                    androidx.room.RoomDatabase r8 = r1.f26932d
                    androidx.room.f0 r8 = r8.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a r0 = r1.f26933e
                    r8.s(r0)
                    kotlin.b2 r8 = kotlin.b2.f124493a
                    return r8
                L7a:
                    r8 = move-exception
                    goto L7e
                L7c:
                    r8 = move-exception
                    r1 = r7
                L7e:
                    androidx.room.RoomDatabase r0 = r1.f26932d
                    androidx.room.f0 r0 = r0.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a r1 = r1.f26933e
                    r0.s(r1)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1.C02121.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a */
        /* JADX INFO: compiled from: CoroutinesRoom.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/room/CoroutinesRoom$Companion$createFlow$1$1$a", "Landroidx/room/f0$c;", "", "", "tables", "Lkotlin/b2;", ak.aF, "room-ktx_release"}, k = 1, mv = {1, 7, 1})
        public static final class a extends f0.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.k<kotlin.b2> f26937b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String[] strArr, kotlinx.coroutines.channels.k<kotlin.b2> kVar) {
                super(strArr);
                this.f26937b = kVar;
            }

            @Override // androidx.room.f0.c
            public void c(@dl.d Set<String> tables) {
                kotlin.jvm.internal.f0.p(tables, "tables");
                this.f26937b.v(kotlin.b2.f124493a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z10, RoomDatabase roomDatabase, kotlinx.coroutines.flow.f<R> fVar, String[] strArr, Callable<R> callable, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f26925d = z10;
            this.f26926e = roomDatabase;
            this.f26927f = fVar;
            this.f26928g = strArr;
            this.f26929h = callable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26925d, this.f26926e, this.f26927f, this.f26928g, this.f26929h, cVar);
            anonymousClass1.f26924c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlin.coroutines.d dVarB;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f26923b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f26924c;
                kotlinx.coroutines.channels.k kVarD = kotlinx.coroutines.channels.m.d(-1, null, null, 6, null);
                a aVar = new a(this.f26928g, kVarD);
                kVarD.v(kotlin.b2.f124493a);
                g2 g2Var = (g2) q0Var.getCoroutineContext().f(g2.INSTANCE);
                if (g2Var == null || (dVarB = g2Var.getTransactionDispatcher()) == null) {
                    dVarB = this.f26925d ? g.b(this.f26926e) : g.a(this.f26926e);
                }
                kotlinx.coroutines.channels.k kVarD2 = kotlinx.coroutines.channels.m.d(0, null, null, 7, null);
                kotlinx.coroutines.k.f(q0Var, dVarB, null, new C02121(this.f26926e, aVar, kVarD, this.f26929h, kVarD2, null), 2, null);
                kotlinx.coroutines.flow.f<R> fVar = this.f26927f;
                this.f26923b = 1;
                if (kotlinx.coroutines.flow.g.l0(fVar, kVarD2, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return kotlin.b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$createFlow$1(boolean z10, RoomDatabase roomDatabase, String[] strArr, Callable<R> callable, kotlin.coroutines.c<? super CoroutinesRoom$Companion$createFlow$1> cVar) {
        super(2, cVar);
        this.f26919d = z10;
        this.f26920e = roomDatabase;
        this.f26921f = strArr;
        this.f26922g = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.f26919d, this.f26920e, this.f26921f, this.f26922g, cVar);
        coroutinesRoom$Companion$createFlow$1.f26918c = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.flow.f<R> fVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((CoroutinesRoom$Companion$createFlow$1) create(fVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26917b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26919d, this.f26920e, (kotlinx.coroutines.flow.f) this.f26918c, this.f26921f, this.f26922g, null);
            this.f26917b = 1;
            if (kotlinx.coroutines.r0.g(anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return kotlin.b2.f124493a;
    }
}
