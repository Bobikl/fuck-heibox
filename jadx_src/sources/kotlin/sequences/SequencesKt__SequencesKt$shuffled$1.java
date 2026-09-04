package kotlin.sequences;

import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.random.Random;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {145}, m = "invokeSuspend", n = {"$this$sequence", "buffer"}, s = {"L$0", "L$1"})
public final class SequencesKt__SequencesKt$shuffled$1<T> extends RestrictedSuspendLambda implements yh.p<o<? super T>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f128359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ m<T> f128360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Random f128361g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt__SequencesKt$shuffled$1(m<? extends T> mVar, Random random, kotlin.coroutines.c<? super SequencesKt__SequencesKt$shuffled$1> cVar) {
        super(2, cVar);
        this.f128360f = mVar;
        this.f128361g = random;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d o<? super T> oVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SequencesKt__SequencesKt$shuffled$1) create(oVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SequencesKt__SequencesKt$shuffled$1 sequencesKt__SequencesKt$shuffled$1 = new SequencesKt__SequencesKt$shuffled$1(this.f128360f, this.f128361g, cVar);
        sequencesKt__SequencesKt$shuffled$1.f128359e = obj;
        return sequencesKt__SequencesKt$shuffled$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        List listD3;
        o oVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f128358d;
        if (i10 == 0) {
            t0.n(obj);
            o oVar2 = (o) this.f128359e;
            listD3 = SequencesKt___SequencesKt.d3(this.f128360f);
            oVar = oVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listD3 = (List) this.f128357c;
            o oVar3 = (o) this.f128359e;
            t0.n(obj);
            oVar = oVar3;
        }
        while (!listD3.isEmpty()) {
            int iM = this.f128361g.m(listD3.size());
            Object objL0 = kotlin.collections.x.L0(listD3);
            if (iM < listD3.size()) {
                objL0 = listD3.set(iM, objL0);
            }
            this.f128359e = oVar;
            this.f128357c = listD3;
            this.f128358d = 1;
            if (oVar.a(objL0, this) == objH) {
                return objH;
            }
        }
        return b2.f124493a;
    }
}
