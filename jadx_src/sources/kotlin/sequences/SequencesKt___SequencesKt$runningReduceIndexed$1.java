package kotlin.sequences;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import java.util.Iterator;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [S] */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {bb.c.d.K5, bb.c.d.O5}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", UCropPlusActivity.ARG_INDEX}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
public final class SequencesKt___SequencesKt$runningReduceIndexed$1<S> extends RestrictedSuspendLambda implements yh.p<o<? super S>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f128418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f128419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f128420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ m<T> f128421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ yh.q<Integer, S, T, S> f128422i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$runningReduceIndexed$1(m<? extends T> mVar, yh.q<? super Integer, ? super S, ? super T, ? extends S> qVar, kotlin.coroutines.c<? super SequencesKt___SequencesKt$runningReduceIndexed$1> cVar) {
        super(2, cVar);
        this.f128421h = mVar;
        this.f128422i = qVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d o<? super S> oVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SequencesKt___SequencesKt$runningReduceIndexed$1) create(oVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SequencesKt___SequencesKt$runningReduceIndexed$1 sequencesKt___SequencesKt$runningReduceIndexed$1 = new SequencesKt___SequencesKt$runningReduceIndexed$1(this.f128421h, this.f128422i, cVar);
        sequencesKt___SequencesKt$runningReduceIndexed$1.f128420g = obj;
        return sequencesKt___SequencesKt$runningReduceIndexed$1;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x008c A[LOOP:0: B:16:0x0060->B:24:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x008b A[SYNTHETIC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        o oVar;
        Iterator it;
        Object next;
        int i10;
        S sInvoke;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = this.f128419f;
        int i12 = 1;
        if (i11 == 0) {
            t0.n(obj);
            oVar = (o) this.f128420g;
            it = this.f128421h.iterator();
            if (it.hasNext()) {
                next = it.next();
                this.f128420g = oVar;
                this.f128416c = it;
                this.f128417d = next;
                this.f128419f = 1;
                if (oVar.a(next, this) == objH) {
                    return objH;
                }
            }
            return b2.f124493a;
        }
        if (i11 == 1) {
            next = this.f128417d;
            it = (Iterator) this.f128416c;
            oVar = (o) this.f128420g;
            t0.n(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = this.f128418e;
            Object obj2 = this.f128417d;
            it = (Iterator) this.f128416c;
            oVar = (o) this.f128420g;
            t0.n(obj);
            i12 = i13;
            next = obj2;
        }
        while (it.hasNext()) {
            yh.q<Integer, S, T, S> qVar = this.f128422i;
            i10 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            sInvoke = qVar.invoke(kotlin.coroutines.jvm.internal.a.f(i12), (S) next, (T) it.next());
            this.f128420g = oVar;
            this.f128416c = it;
            this.f128417d = sInvoke;
            this.f128418e = i10;
            this.f128419f = 2;
            if (oVar.a(sInvoke, this) == objH) {
                return objH;
            }
            next = sInvoke;
            i12 = i10;
        }
        return b2.f124493a;
        while (it.hasNext()) {
            yh.q<Integer, S, T, S> qVar2 = this.f128422i;
            i10 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            sInvoke = qVar2.invoke(kotlin.coroutines.jvm.internal.a.f(i12), (S) next, (T) it.next());
            this.f128420g = oVar;
            this.f128416c = it;
            this.f128417d = sInvoke;
            this.f128418e = i10;
            this.f128419f = 2;
            if (oVar.a(sInvoke, this) == objH) {
                return objH;
            }
            next = sInvoke;
            i12 = i10;
        }
        return b2.f124493a;
    }
}
