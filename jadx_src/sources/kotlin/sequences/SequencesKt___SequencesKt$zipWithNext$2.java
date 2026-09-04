package kotlin.sequences;

import java.util.Iterator;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0}, l = {bb.c.d.Ue}, m = "invokeSuspend", n = {"$this$result", "iterator", "next"}, s = {"L$0", "L$1", "L$2"})
public final class SequencesKt___SequencesKt$zipWithNext$2<R> extends RestrictedSuspendLambda implements yh.p<o<? super R>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f128427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f128428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ m<T> f128429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ yh.p<T, T, R> f128430h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$zipWithNext$2(m<? extends T> mVar, yh.p<? super T, ? super T, ? extends R> pVar, kotlin.coroutines.c<? super SequencesKt___SequencesKt$zipWithNext$2> cVar) {
        super(2, cVar);
        this.f128429g = mVar;
        this.f128430h = pVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d o<? super R> oVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SequencesKt___SequencesKt$zipWithNext$2) create(oVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.f128429g, this.f128430h, cVar);
        sequencesKt___SequencesKt$zipWithNext$2.f128428f = obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        o oVar;
        Object next;
        Iterator it;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f128427e;
        if (i10 == 0) {
            t0.n(obj);
            o oVar2 = (o) this.f128428f;
            Iterator it2 = this.f128429g.iterator();
            if (!it2.hasNext()) {
                return b2.f124493a;
            }
            oVar = oVar2;
            next = it2.next();
            it = it2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = this.f128426d;
            it = (Iterator) this.f128425c;
            oVar = (o) this.f128428f;
            t0.n(obj);
            next = obj2;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            R rInvoke = this.f128430h.invoke((T) next, (T) next2);
            this.f128428f = oVar;
            this.f128425c = it;
            this.f128426d = next2;
            this.f128427e = 1;
            if (oVar.a(rInvoke, this) == objH) {
                return objH;
            }
            next = next2;
        }
        return b2.f124493a;
    }
}
