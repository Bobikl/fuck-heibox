package androidx.room;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.h3;

/* JADX INFO: compiled from: RoomDatabaseExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "RoomDatabaseKt")
@Metadata(bv = {}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\b*\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"R", "Landroidx/room/RoomDatabase;", "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "", "block", "e", "(Landroidx/room/RoomDatabase;Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "d", "(Landroidx/room/RoomDatabase;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/d2;", "controlJob", "Lkotlin/coroutines/d;", ak.aF, "(Ljava/util/concurrent/Executor;Lkotlinx/coroutines/d2;Lkotlin/coroutines/c;)Ljava/lang/Object;", "room-ktx_release"}, k = 2, mv = {1, 7, 1})
public final class RoomDatabaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(Executor executor, final kotlinx.coroutines.d2 d2Var, kotlin.coroutines.c<? super kotlin.coroutines.d> cVar) {
        final kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        qVar.L(new yh.l<Throwable, kotlin.b2>() { // from class: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$1
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
                invoke2(th2);
                return kotlin.b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.e Throwable th2) {
                kotlinx.coroutines.d2.a.b(d2Var, null, 1, null);
            }
        });
        try {
            executor.execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2

                /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: RoomDatabaseExt.kt */
                @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
                @kotlin.coroutines.jvm.internal.d(c = "androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1", f = "RoomDatabaseExt.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f27003b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private /* synthetic */ Object f27004c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.p<kotlin.coroutines.d> f27005d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.d2 f27006e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(kotlinx.coroutines.p<? super kotlin.coroutines.d> pVar, kotlinx.coroutines.d2 d2Var, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.f27005d = pVar;
                        this.f27006e = d2Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27005d, this.f27006e, cVar);
                        anonymousClass1.f27004c = obj;
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
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i10 = this.f27003b;
                        if (i10 == 0) {
                            kotlin.t0.n(obj);
                            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f27004c;
                            kotlinx.coroutines.p<kotlin.coroutines.d> pVar = this.f27005d;
                            Result.a aVar = Result.f124476c;
                            CoroutineContext.a aVarF = q0Var.getCoroutineContext().f(kotlin.coroutines.d.f124698w1);
                            kotlin.jvm.internal.f0.m(aVarF);
                            pVar.resumeWith(Result.b(aVarF));
                            kotlinx.coroutines.d2 d2Var = this.f27006e;
                            this.f27003b = 1;
                            if (d2Var.g0(this) == objH) {
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

                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    kotlinx.coroutines.j.b(null, new AnonymousClass1(qVar, d2Var, null), 1, null);
                }
            });
        } catch (RejectedExecutionException e10) {
            qVar.b(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(RoomDatabase roomDatabase, kotlin.coroutines.c<? super CoroutineContext> cVar) throws Throwable {
        RoomDatabaseKt$createTransactionContext$1 roomDatabaseKt$createTransactionContext$1;
        RoomDatabase roomDatabase2;
        kotlinx.coroutines.b0 b0Var;
        if (cVar instanceof RoomDatabaseKt$createTransactionContext$1) {
            roomDatabaseKt$createTransactionContext$1 = (RoomDatabaseKt$createTransactionContext$1) cVar;
            int i10 = roomDatabaseKt$createTransactionContext$1.f27010e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                roomDatabaseKt$createTransactionContext$1.f27010e = i10 - Integer.MIN_VALUE;
            } else {
                roomDatabaseKt$createTransactionContext$1 = new RoomDatabaseKt$createTransactionContext$1(cVar);
            }
        } else {
            roomDatabaseKt$createTransactionContext$1 = new RoomDatabaseKt$createTransactionContext$1(cVar);
        }
        Object obj = roomDatabaseKt$createTransactionContext$1.f27009d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = roomDatabaseKt$createTransactionContext$1.f27010e;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            final kotlinx.coroutines.b0 b0VarC = kotlinx.coroutines.i2.c(null, 1, null);
            kotlinx.coroutines.d2 d2Var = (kotlinx.coroutines.d2) roomDatabaseKt$createTransactionContext$1.getContext().f(kotlinx.coroutines.d2.INSTANCE);
            if (d2Var != null) {
                d2Var.K(new yh.l<Throwable, kotlin.b2>() { // from class: androidx.room.RoomDatabaseKt$createTransactionContext$2
                    {
                        super(1);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
                        invoke2(th2);
                        return kotlin.b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@dl.e Throwable th2) {
                        kotlinx.coroutines.d2.a.b(b0VarC, null, 1, null);
                    }
                });
            }
            Executor executorX = roomDatabase.x();
            roomDatabaseKt$createTransactionContext$1.f27007b = roomDatabase;
            roomDatabaseKt$createTransactionContext$1.f27008c = b0VarC;
            roomDatabaseKt$createTransactionContext$1.f27010e = 1;
            Object objC = c(executorX, b0VarC, roomDatabaseKt$createTransactionContext$1);
            if (objC == objH) {
                return objH;
            }
            roomDatabase2 = roomDatabase;
            b0Var = b0VarC;
            obj = objC;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b0Var = (kotlinx.coroutines.b0) roomDatabaseKt$createTransactionContext$1.f27008c;
            roomDatabase2 = (RoomDatabase) roomDatabaseKt$createTransactionContext$1.f27007b;
            kotlin.t0.n(obj);
        }
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj;
        g2 g2Var = new g2(b0Var, dVar);
        return dVar.I(g2Var).I(h3.a(roomDatabase2.w(), kotlin.coroutines.jvm.internal.a.f(System.identityHashCode(b0Var))));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x007b A[PHI: r7
  0x007b: PHI (r7v11 java.lang.Object) = (r7v8 java.lang.Object), (r7v1 java.lang.Object) binds: [B:26:0x0078, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <R> Object e(@dl.d RoomDatabase roomDatabase, @dl.d yh.l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar, @dl.d kotlin.coroutines.c<? super R> cVar) throws Throwable {
        RoomDatabaseKt$withTransaction$1 roomDatabaseKt$withTransaction$1;
        if (cVar instanceof RoomDatabaseKt$withTransaction$1) {
            roomDatabaseKt$withTransaction$1 = (RoomDatabaseKt$withTransaction$1) cVar;
            int i10 = roomDatabaseKt$withTransaction$1.f27015e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                roomDatabaseKt$withTransaction$1.f27015e = i10 - Integer.MIN_VALUE;
            } else {
                roomDatabaseKt$withTransaction$1 = new RoomDatabaseKt$withTransaction$1(cVar);
            }
        } else {
            roomDatabaseKt$withTransaction$1 = new RoomDatabaseKt$withTransaction$1(cVar);
        }
        Object objD = roomDatabaseKt$withTransaction$1.f27014d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = roomDatabaseKt$withTransaction$1.f27015e;
        if (i11 != 0) {
            if (i11 == 1) {
                lVar = (yh.l) roomDatabaseKt$withTransaction$1.f27013c;
                roomDatabase = (RoomDatabase) roomDatabaseKt$withTransaction$1.f27012b;
                kotlin.t0.n(objD);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(objD);
            }
            return objD;
        }
        kotlin.t0.n(objD);
        g2 g2Var = (g2) roomDatabaseKt$withTransaction$1.getContext().f(g2.INSTANCE);
        if (g2Var == null || (transactionDispatcher = g2Var.getTransactionDispatcher()) == null) {
            roomDatabaseKt$withTransaction$1.f27012b = roomDatabase;
            roomDatabaseKt$withTransaction$1.f27013c = lVar;
            roomDatabaseKt$withTransaction$1.f27015e = 1;
            objD = d(roomDatabase, roomDatabaseKt$withTransaction$1);
            if (objD == objH) {
                return objH;
            }
        }
        RoomDatabaseKt$withTransaction$2 roomDatabaseKt$withTransaction$2 = new RoomDatabaseKt$withTransaction$2(roomDatabase, lVar, null);
        roomDatabaseKt$withTransaction$1.f27012b = null;
        roomDatabaseKt$withTransaction$1.f27013c = null;
        roomDatabaseKt$withTransaction$1.f27015e = 2;
        objD = kotlinx.coroutines.i.h(transactionDispatcher, roomDatabaseKt$withTransaction$2, roomDatabaseKt$withTransaction$1);
        if (objD == objH) {
            return objH;
        }
        return objD;
        CoroutineContext transactionDispatcher = (CoroutineContext) objD;
        RoomDatabaseKt$withTransaction$2 roomDatabaseKt$withTransaction$3 = new RoomDatabaseKt$withTransaction$2(roomDatabase, lVar, null);
        roomDatabaseKt$withTransaction$1.f27012b = null;
        roomDatabaseKt$withTransaction$1.f27013c = null;
        roomDatabaseKt$withTransaction$1.f27015e = 2;
        objD = kotlinx.coroutines.i.h(transactionDispatcher, roomDatabaseKt$withTransaction$3, roomDatabaseKt$withTransaction$1);
        if (objD == objH) {
            return objH;
        }
        return objD;
    }
}
