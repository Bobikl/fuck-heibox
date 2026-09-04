package kotlin.sequences;

import java.util.Iterator;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1}, l = {bb.c.d.f31131b4, bb.c.d.f31224f4}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator"}, s = {"L$0", "L$0", "L$1"})
public final class SequencesKt___SequencesKt$runningFold$1<R> extends RestrictedSuspendLambda implements yh.p<o<? super R>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f128397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f128398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ R f128399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ m<T> f128400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ yh.p<R, T, R> f128401i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$runningFold$1(R r10, m<? extends T> mVar, yh.p<? super R, ? super T, ? extends R> pVar, kotlin.coroutines.c<? super SequencesKt___SequencesKt$runningFold$1> cVar) {
        super(2, cVar);
        this.f128399g = r10;
        this.f128400h = mVar;
        this.f128401i = pVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d o<? super R> oVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SequencesKt___SequencesKt$runningFold$1) create(oVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.f128399g, this.f128400h, this.f128401i, cVar);
        sequencesKt___SequencesKt$runningFold$1.f128398f = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:15:0x004d->B:24:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        o oVar;
        Object objInvoke;
        o oVar2;
        Iterator it;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f128397e;
        if (i10 != 0) {
            if (i10 == 1) {
                oVar = (o) this.f128398f;
                t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f128396d;
                Object obj2 = this.f128395c;
                oVar2 = (o) this.f128398f;
                t0.n(obj);
                objInvoke = obj2;
            }
            while (it.hasNext()) {
                objInvoke = this.f128401i.invoke((R) objInvoke, (T) it.next());
                this.f128398f = oVar2;
                this.f128395c = objInvoke;
                this.f128396d = it;
                this.f128397e = 2;
                if (oVar2.a(objInvoke, this) == objH) {
                    return objH;
                }
            }
            return b2.f124493a;
        }
        t0.n(obj);
        oVar = (o) this.f128398f;
        R r10 = this.f128399g;
        this.f128398f = oVar;
        this.f128397e = 1;
        if (oVar.a(r10, this) == objH) {
            return objH;
        }
        objInvoke = this.f128399g;
        oVar2 = oVar;
        it = this.f128400h.iterator();
        while (it.hasNext()) {
            objInvoke = this.f128401i.invoke((R) objInvoke, (T) it.next());
            this.f128398f = oVar2;
            this.f128395c = objInvoke;
            this.f128396d = it;
            this.f128397e = 2;
            if (oVar2.a(objInvoke, this) == objH) {
                return objH;
            }
        }
        return b2.f124493a;
    }
}
