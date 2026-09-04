package androidx.compose.foundation.interaction;

import androidx.compose.runtime.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: FocusInteraction.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", f = "FocusInteraction.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
public final class FocusInteractionKt$collectIsFocusedAsState$1$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f5842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ a1<Boolean> f5843d;

    /* JADX INFO: compiled from: FocusInteraction.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements kotlinx.coroutines.flow.f<d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<b.a> f5844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a1<Boolean> f5845c;

        a(List<b.a> list, a1<Boolean> a1Var) {
            this.f5844b = list;
            this.f5845c = a1Var;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@dl.d d dVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            if (dVar instanceof b.a) {
                this.f5844b.add(dVar);
            } else if (dVar instanceof b.C0047b) {
                this.f5844b.remove(((b.C0047b) dVar).getFocus());
            }
            this.f5845c.setValue(kotlin.coroutines.jvm.internal.a.a(!this.f5844b.isEmpty()));
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusInteractionKt$collectIsFocusedAsState$1$1(e eVar, a1<Boolean> a1Var, kotlin.coroutines.c<? super FocusInteractionKt$collectIsFocusedAsState$1$1> cVar) {
        super(2, cVar);
        this.f5842c = eVar;
        this.f5843d = a1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new FocusInteractionKt$collectIsFocusedAsState$1$1(this.f5842c, this.f5843d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FocusInteractionKt$collectIsFocusedAsState$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5841b;
        if (i10 == 0) {
            t0.n(obj);
            ArrayList arrayList = new ArrayList();
            kotlinx.coroutines.flow.e<d> eVarC = this.f5842c.c();
            a aVar = new a(arrayList, this.f5843d);
            this.f5841b = 1;
            if (eVarC.a(aVar, this) == objH) {
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
