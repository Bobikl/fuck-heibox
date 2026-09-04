package kotlin.sequences;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import java.util.Iterator;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {bb.c.d.D4, bb.c.d.I4}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", UCropPlusActivity.ARG_INDEX}, s = {"L$0", "L$0", "L$1", "I$0"})
public final class SequencesKt___SequencesKt$runningFoldIndexed$1<R> extends RestrictedSuspendLambda implements yh.p<o<? super R>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f128404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f128405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f128406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ R f128407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ m<T> f128408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ yh.q<Integer, R, T, R> f128409j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$runningFoldIndexed$1(R r10, m<? extends T> mVar, yh.q<? super Integer, ? super R, ? super T, ? extends R> qVar, kotlin.coroutines.c<? super SequencesKt___SequencesKt$runningFoldIndexed$1> cVar) {
        super(2, cVar);
        this.f128407h = r10;
        this.f128408i = mVar;
        this.f128409j = qVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d o<? super R> oVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SequencesKt___SequencesKt$runningFoldIndexed$1) create(oVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.f128407h, this.f128408i, this.f128409j, cVar);
        sequencesKt___SequencesKt$runningFoldIndexed$1.f128406g = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x007e A[LOOP:0: B:15:0x0052->B:23:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x007d A[SYNTHETIC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        o oVar;
        int i10;
        o oVar2;
        Object obj2;
        Iterator it;
        int i11;
        R rInvoke;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i12 = this.f128405f;
        if (i12 != 0) {
            if (i12 == 1) {
                oVar = (o) this.f128406g;
                t0.n(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i13 = this.f128404e;
                it = (Iterator) this.f128403d;
                Object obj3 = this.f128402c;
                oVar2 = (o) this.f128406g;
                t0.n(obj);
                i10 = i13;
                obj2 = obj3;
            }
            while (it.hasNext()) {
                Object next = it.next();
                yh.q<Integer, R, T, R> qVar = this.f128409j;
                i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.W();
                }
                rInvoke = qVar.invoke(kotlin.coroutines.jvm.internal.a.f(i10), (R) obj2, (T) next);
                this.f128406g = oVar2;
                this.f128402c = rInvoke;
                this.f128403d = it;
                this.f128404e = i11;
                this.f128405f = 2;
                if (oVar2.a(rInvoke, this) == objH) {
                    return objH;
                }
                obj2 = rInvoke;
                i10 = i11;
            }
            return b2.f124493a;
        }
        t0.n(obj);
        oVar = (o) this.f128406g;
        R r10 = this.f128407h;
        this.f128406g = oVar;
        this.f128405f = 1;
        if (oVar.a(r10, this) == objH) {
            return objH;
        }
        i10 = 0;
        oVar2 = oVar;
        obj2 = this.f128407h;
        it = this.f128408i.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            yh.q<Integer, R, T, R> qVar2 = this.f128409j;
            i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            rInvoke = qVar2.invoke(kotlin.coroutines.jvm.internal.a.f(i10), (R) obj2, (T) next2);
            this.f128406g = oVar2;
            this.f128402c = rInvoke;
            this.f128403d = it;
            this.f128404e = i11;
            this.f128405f = 2;
            if (oVar2.a(rInvoke, this) == objH) {
                return objH;
            }
            obj2 = rInvoke;
            i10 = i11;
        }
        return b2.f124493a;
    }
}
