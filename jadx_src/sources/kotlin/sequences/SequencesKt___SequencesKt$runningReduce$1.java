package kotlin.sequences;

import java.util.Iterator;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [S] */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {bb.c.d.f31271h5, bb.c.d.f31340k5}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
public final class SequencesKt___SequencesKt$runningReduce$1<S> extends RestrictedSuspendLambda implements yh.p<o<? super S>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f128412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f128413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ m<T> f128414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ yh.p<S, T, S> f128415h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$runningReduce$1(m<? extends T> mVar, yh.p<? super S, ? super T, ? extends S> pVar, kotlin.coroutines.c<? super SequencesKt___SequencesKt$runningReduce$1> cVar) {
        super(2, cVar);
        this.f128414g = mVar;
        this.f128415h = pVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d o<? super S> oVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SequencesKt___SequencesKt$runningReduce$1) create(oVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SequencesKt___SequencesKt$runningReduce$1 sequencesKt___SequencesKt$runningReduce$1 = new SequencesKt___SequencesKt$runningReduce$1(this.f128414g, this.f128415h, cVar);
        sequencesKt___SequencesKt$runningReduce$1.f128413f = obj;
        return sequencesKt___SequencesKt$runningReduce$1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        o oVar;
        Object next;
        Iterator it;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f128412e;
        if (i10 == 0) {
            t0.n(obj);
            oVar = (o) this.f128413f;
            Iterator it2 = this.f128414g.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                this.f128413f = oVar;
                this.f128410c = it2;
                this.f128411d = next;
                this.f128412e = 1;
                if (oVar.a(next, this) == objH) {
                    return objH;
                }
                it = it2;
            }
            return b2.f124493a;
        }
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        next = this.f128411d;
        it = (Iterator) this.f128410c;
        oVar = (o) this.f128413f;
        t0.n(obj);
        while (it.hasNext()) {
            next = this.f128415h.invoke((S) next, (T) it.next());
            this.f128413f = oVar;
            this.f128410c = it;
            this.f128411d = next;
            this.f128412e = 2;
            if (oVar.a(next, this) == objH) {
                return objH;
            }
        }
        return b2.f124493a;
    }
}
