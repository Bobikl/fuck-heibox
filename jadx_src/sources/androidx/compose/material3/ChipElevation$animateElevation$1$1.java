package androidx.compose.material3;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.ChipElevation$animateElevation$1$1", f = "Chip.kt", i = {}, l = {bb.c.b.Xp}, m = "invokeSuspend", n = {}, s = {})
public final class ChipElevation$animateElevation$1$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f9087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.e f9088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.d> f9089d;

    /* JADX INFO: compiled from: Chip.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements kotlinx.coroutines.flow.f<androidx.compose.foundation.interaction.d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.d> f9090b;

        a(SnapshotStateList<androidx.compose.foundation.interaction.d> snapshotStateList) {
            this.f9090b = snapshotStateList;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@dl.d androidx.compose.foundation.interaction.d dVar, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
            if (dVar instanceof androidx.compose.foundation.interaction.c.a) {
                this.f9090b.add(dVar);
            } else if (dVar instanceof androidx.compose.foundation.interaction.c.b) {
                this.f9090b.remove(((androidx.compose.foundation.interaction.c.b) dVar).getEnter());
            } else if (dVar instanceof androidx.compose.foundation.interaction.b.a) {
                this.f9090b.add(dVar);
            } else if (dVar instanceof androidx.compose.foundation.interaction.b.C0047b) {
                this.f9090b.remove(((androidx.compose.foundation.interaction.b.C0047b) dVar).getFocus());
            } else if (dVar instanceof androidx.compose.foundation.interaction.i.b) {
                this.f9090b.add(dVar);
            } else if (dVar instanceof androidx.compose.foundation.interaction.i.c) {
                this.f9090b.remove(((androidx.compose.foundation.interaction.i.c) dVar).getPress());
            } else if (dVar instanceof androidx.compose.foundation.interaction.i.a) {
                this.f9090b.remove(((androidx.compose.foundation.interaction.i.a) dVar).getPress());
            } else if (dVar instanceof androidx.compose.foundation.interaction.a.b) {
                this.f9090b.add(dVar);
            } else if (dVar instanceof androidx.compose.foundation.interaction.a.c) {
                this.f9090b.remove(((androidx.compose.foundation.interaction.a.c) dVar).getStart());
            } else if (dVar instanceof androidx.compose.foundation.interaction.a.C0046a) {
                this.f9090b.remove(((androidx.compose.foundation.interaction.a.C0046a) dVar).getStart());
            }
            return kotlin.b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChipElevation$animateElevation$1$1(androidx.compose.foundation.interaction.e eVar, SnapshotStateList<androidx.compose.foundation.interaction.d> snapshotStateList, kotlin.coroutines.c<? super ChipElevation$animateElevation$1$1> cVar) {
        super(2, cVar);
        this.f9088c = eVar;
        this.f9089d = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new ChipElevation$animateElevation$1$1(this.f9088c, this.f9089d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((ChipElevation$animateElevation$1$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f9087b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.flow.e<androidx.compose.foundation.interaction.d> eVarC = this.f9088c.c();
            a aVar = new a(this.f9089d);
            this.f9087b = 1;
            if (eVarC.a(aVar, this) == objH) {
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
