package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: RoomDatabaseExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/q0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.room.RoomDatabaseKt$withTransaction$2", f = "RoomDatabaseExt.kt", i = {0}, l = {59}, m = "invokeSuspend", n = {"transactionElement"}, s = {"L$0"})
public final class RoomDatabaseKt$withTransaction$2<R> extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super R>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f27016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f27017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ RoomDatabase f27018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.l<kotlin.coroutines.c<? super R>, Object> f27019e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RoomDatabaseKt$withTransaction$2(RoomDatabase roomDatabase, yh.l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar, kotlin.coroutines.c<? super RoomDatabaseKt$withTransaction$2> cVar) {
        super(2, cVar);
        this.f27018d = roomDatabase;
        this.f27019e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        RoomDatabaseKt$withTransaction$2 roomDatabaseKt$withTransaction$2 = new RoomDatabaseKt$withTransaction$2(this.f27018d, this.f27019e, cVar);
        roomDatabaseKt$withTransaction$2.f27017c = obj;
        return roomDatabaseKt$withTransaction$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super R> cVar) {
        return ((RoomDatabaseKt$withTransaction$2) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Throwable th2;
        g2 g2Var;
        g2 g2VarH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f27016b;
        try {
            if (i10 == 0) {
                kotlin.t0.n(obj);
                CoroutineContext.a aVarF = ((kotlinx.coroutines.q0) this.f27017c).getCoroutineContext().f(g2.INSTANCE);
                kotlin.jvm.internal.f0.m(aVarF);
                g2 g2Var2 = (g2) aVarF;
                g2Var2.c();
                try {
                    this.f27018d.e();
                    try {
                        yh.l<kotlin.coroutines.c<? super R>, Object> lVar = this.f27019e;
                        this.f27017c = g2Var2;
                        this.f27016b = 1;
                        Object objInvoke = lVar.invoke(this);
                        if (objInvoke == g2VarH) {
                            return g2VarH;
                        }
                        g2Var = g2Var2;
                        obj = objInvoke;
                    } catch (Throwable th3) {
                        th2 = th3;
                        this.f27018d.k();
                        throw th2;
                    }
                } catch (Throwable th4) {
                    g2VarH = g2Var2;
                    th = th4;
                    g2VarH.j();
                    throw th;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g2Var = (g2) this.f27017c;
                try {
                    kotlin.t0.n(obj);
                } catch (Throwable th5) {
                    th2 = th5;
                    this.f27018d.k();
                    throw th2;
                }
            }
            this.f27018d.O();
            this.f27018d.k();
            g2Var.j();
            return obj;
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
