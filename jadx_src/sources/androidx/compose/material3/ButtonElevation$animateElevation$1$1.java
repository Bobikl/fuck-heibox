package androidx.compose.material3;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.ButtonElevation$animateElevation$1$1", f = "Button.kt", i = {}, l = {bb.c.b.Ec}, m = "invokeSuspend", n = {}, s = {})
public final class ButtonElevation$animateElevation$1$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.e f8886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.d> f8887d;

    /* JADX INFO: compiled from: Button.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements kotlinx.coroutines.flow.f<androidx.compose.foundation.interaction.d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.d> f8888b;

        a(SnapshotStateList<androidx.compose.foundation.interaction.d> snapshotStateList) {
            this.f8888b = snapshotStateList;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@dl.d androidx.compose.foundation.interaction.d dVar, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
            if (dVar instanceof androidx.compose.foundation.interaction.c.a) {
                this.f8888b.add(dVar);
            } else if (dVar instanceof androidx.compose.foundation.interaction.c.b) {
                this.f8888b.remove(((androidx.compose.foundation.interaction.c.b) dVar).getEnter());
            } else if (dVar instanceof androidx.compose.foundation.interaction.b.a) {
                this.f8888b.add(dVar);
            } else if (dVar instanceof androidx.compose.foundation.interaction.b.C0047b) {
                this.f8888b.remove(((androidx.compose.foundation.interaction.b.C0047b) dVar).getFocus());
            } else if (dVar instanceof androidx.compose.foundation.interaction.i.b) {
                this.f8888b.add(dVar);
            } else if (dVar instanceof androidx.compose.foundation.interaction.i.c) {
                this.f8888b.remove(((androidx.compose.foundation.interaction.i.c) dVar).getPress());
            } else if (dVar instanceof androidx.compose.foundation.interaction.i.a) {
                this.f8888b.remove(((androidx.compose.foundation.interaction.i.a) dVar).getPress());
            }
            return kotlin.b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonElevation$animateElevation$1$1(androidx.compose.foundation.interaction.e eVar, SnapshotStateList<androidx.compose.foundation.interaction.d> snapshotStateList, kotlin.coroutines.c<? super ButtonElevation$animateElevation$1$1> cVar) {
        super(2, cVar);
        this.f8886c = eVar;
        this.f8887d = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new ButtonElevation$animateElevation$1$1(this.f8886c, this.f8887d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((ButtonElevation$animateElevation$1$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f8885b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.flow.e<androidx.compose.foundation.interaction.d> eVarC = this.f8886c.c();
            a aVar = new a(this.f8887d);
            this.f8885b = 1;
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
