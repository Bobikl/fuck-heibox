package androidx.compose.material3;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.CardElevation$animateElevation$1$1", f = "Card.kt", i = {}, l = {bb.c.b.V8}, m = "invokeSuspend", n = {}, s = {})
public final class CardElevation$animateElevation$1$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.e f8974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.d> f8975d;

    /* JADX INFO: compiled from: Card.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements kotlinx.coroutines.flow.f<androidx.compose.foundation.interaction.d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.d> f8976b;

        a(SnapshotStateList<androidx.compose.foundation.interaction.d> snapshotStateList) {
            this.f8976b = snapshotStateList;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@dl.d androidx.compose.foundation.interaction.d dVar, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
            if (dVar instanceof androidx.compose.foundation.interaction.c.a) {
                this.f8976b.add(dVar);
            } else if (dVar instanceof androidx.compose.foundation.interaction.c.b) {
                this.f8976b.remove(((androidx.compose.foundation.interaction.c.b) dVar).getEnter());
            } else if (dVar instanceof androidx.compose.foundation.interaction.b.a) {
                this.f8976b.add(dVar);
            } else if (dVar instanceof androidx.compose.foundation.interaction.b.C0047b) {
                this.f8976b.remove(((androidx.compose.foundation.interaction.b.C0047b) dVar).getFocus());
            } else if (dVar instanceof androidx.compose.foundation.interaction.i.b) {
                this.f8976b.add(dVar);
            } else if (dVar instanceof androidx.compose.foundation.interaction.i.c) {
                this.f8976b.remove(((androidx.compose.foundation.interaction.i.c) dVar).getPress());
            } else if (dVar instanceof androidx.compose.foundation.interaction.i.a) {
                this.f8976b.remove(((androidx.compose.foundation.interaction.i.a) dVar).getPress());
            } else if (dVar instanceof androidx.compose.foundation.interaction.a.b) {
                this.f8976b.add(dVar);
            } else if (dVar instanceof androidx.compose.foundation.interaction.a.c) {
                this.f8976b.remove(((androidx.compose.foundation.interaction.a.c) dVar).getStart());
            } else if (dVar instanceof androidx.compose.foundation.interaction.a.C0046a) {
                this.f8976b.remove(((androidx.compose.foundation.interaction.a.C0046a) dVar).getStart());
            }
            return kotlin.b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardElevation$animateElevation$1$1(androidx.compose.foundation.interaction.e eVar, SnapshotStateList<androidx.compose.foundation.interaction.d> snapshotStateList, kotlin.coroutines.c<? super CardElevation$animateElevation$1$1> cVar) {
        super(2, cVar);
        this.f8974c = eVar;
        this.f8975d = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new CardElevation$animateElevation$1$1(this.f8974c, this.f8975d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((CardElevation$animateElevation$1$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f8973b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.flow.e<androidx.compose.foundation.interaction.d> eVarC = this.f8974c.c();
            a aVar = new a(this.f8975d);
            this.f8973b = 1;
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
