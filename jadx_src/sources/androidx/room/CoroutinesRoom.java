package androidx.room;

import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: CoroutinesRoom.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/room/CoroutinesRoom;", "", "<init>", "()V", ak.av, "Companion", "room-ktx_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class CoroutinesRoom {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: CoroutinesRoom.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ?\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJL\u0010\u0014\u001a\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00130\u0012\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/room/CoroutinesRoom$Companion;", "", "R", "Landroidx/room/RoomDatabase;", "db", "", com.tekartik.sqflite.b.f98597p, "Ljava/util/concurrent/Callable;", "callable", ak.aF, "(Landroidx/room/RoomDatabase;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "b", "(Landroidx/room/RoomDatabase;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "", "tableNames", "Lkotlinx/coroutines/flow/e;", "Lxh/n;", ak.av, "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lkotlinx/coroutines/flow/e;", "<init>", "()V", "room-ktx_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final <R> kotlinx.coroutines.flow.e<R> a(@dl.d RoomDatabase db2, boolean inTransaction, @dl.d String[] tableNames, @dl.d Callable<R> callable) {
            kotlin.jvm.internal.f0.p(db2, "db");
            kotlin.jvm.internal.f0.p(tableNames, "tableNames");
            kotlin.jvm.internal.f0.p(callable, "callable");
            return kotlinx.coroutines.flow.g.I0(new CoroutinesRoom$Companion$createFlow$1(inTransaction, db2, tableNames, callable, null));
        }

        @dl.e
        @xh.m
        public final <R> Object b(@dl.d RoomDatabase roomDatabase, boolean z10, @dl.d final CancellationSignal cancellationSignal, @dl.d Callable<R> callable, @dl.d kotlin.coroutines.c<? super R> cVar) {
            kotlin.coroutines.d dVarB;
            if (roomDatabase.F() && roomDatabase.z()) {
                return callable.call();
            }
            g2 g2Var = (g2) cVar.getCom.umeng.analytics.pro.d.R java.lang.String().f(g2.INSTANCE);
            if (g2Var == null || (dVarB = g2Var.getTransactionDispatcher()) == null) {
                dVarB = z10 ? g.b(roomDatabase) : g.a(roomDatabase);
            }
            kotlin.coroutines.d dVar = dVarB;
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
            qVar.F0();
            final kotlinx.coroutines.d2 d2VarF = kotlinx.coroutines.k.f(kotlinx.coroutines.v1.f130503b, dVar, null, new CoroutinesRoom$Companion$execute$4$job$1(callable, qVar, null), 2, null);
            qVar.L(new yh.l<Throwable, kotlin.b2>() { // from class: androidx.room.CoroutinesRoom$Companion$execute$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    j3.c.a.a(cancellationSignal);
                    kotlinx.coroutines.d2.a.b(d2VarF, null, 1, null);
                }
            });
            Object objT = qVar.t();
            if (objT == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return objT;
        }

        @dl.e
        @xh.m
        public final <R> Object c(@dl.d RoomDatabase roomDatabase, boolean z10, @dl.d Callable<R> callable, @dl.d kotlin.coroutines.c<? super R> cVar) {
            kotlin.coroutines.d dVarB;
            if (roomDatabase.F() && roomDatabase.z()) {
                return callable.call();
            }
            g2 g2Var = (g2) cVar.getCom.umeng.analytics.pro.d.R java.lang.String().f(g2.INSTANCE);
            if (g2Var == null || (dVarB = g2Var.getTransactionDispatcher()) == null) {
                dVarB = z10 ? g.b(roomDatabase) : g.a(roomDatabase);
            }
            return kotlinx.coroutines.i.h(dVarB, new CoroutinesRoom$Companion$execute$2(callable, null), cVar);
        }
    }

    private CoroutinesRoom() {
    }

    @dl.d
    @xh.m
    public static final <R> kotlinx.coroutines.flow.e<R> a(@dl.d RoomDatabase roomDatabase, boolean z10, @dl.d String[] strArr, @dl.d Callable<R> callable) {
        return INSTANCE.a(roomDatabase, z10, strArr, callable);
    }

    @dl.e
    @xh.m
    public static final <R> Object b(@dl.d RoomDatabase roomDatabase, boolean z10, @dl.d CancellationSignal cancellationSignal, @dl.d Callable<R> callable, @dl.d kotlin.coroutines.c<? super R> cVar) {
        return INSTANCE.b(roomDatabase, z10, cancellationSignal, callable, cVar);
    }

    @dl.e
    @xh.m
    public static final <R> Object c(@dl.d RoomDatabase roomDatabase, boolean z10, @dl.d Callable<R> callable, @dl.d kotlin.coroutines.c<? super R> cVar) {
        return INSTANCE.c(roomDatabase, z10, callable, cVar);
    }
}
