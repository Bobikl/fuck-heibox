package kotlin.sequences;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import java.util.Iterator;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {bb.c.b.f30965u3}, m = "invokeSuspend", n = {"$this$sequence", UCropPlusActivity.ARG_INDEX}, s = {"L$0", "I$0"})
public final class SequencesKt__SequencesKt$flatMapIndexed$1<R> extends RestrictedSuspendLambda implements yh.p<o<? super R>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f128343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f128344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ m<T> f128345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ yh.p<Integer, T, C> f128346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ yh.l<C, Iterator<R>> f128347i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt__SequencesKt$flatMapIndexed$1(m<? extends T> mVar, yh.p<? super Integer, ? super T, ? extends C> pVar, yh.l<? super C, ? extends Iterator<? extends R>> lVar, kotlin.coroutines.c<? super SequencesKt__SequencesKt$flatMapIndexed$1> cVar) {
        super(2, cVar);
        this.f128345g = mVar;
        this.f128346h = pVar;
        this.f128347i = lVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d o<? super R> oVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SequencesKt__SequencesKt$flatMapIndexed$1) create(oVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.f128345g, this.f128346h, this.f128347i, cVar);
        sequencesKt__SequencesKt$flatMapIndexed$1.f128344f = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        int i10;
        Iterator it;
        o oVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = this.f128343e;
        if (i11 == 0) {
            t0.n(obj);
            o oVar2 = (o) this.f128344f;
            i10 = 0;
            it = this.f128345g.iterator();
            oVar = oVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f128342d;
            it = (Iterator) this.f128341c;
            oVar = (o) this.f128344f;
            t0.n(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            yh.p<Integer, T, C> pVar = this.f128346h;
            int i12 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            Iterator<R> itInvoke = this.f128347i.invoke((C) pVar.invoke(kotlin.coroutines.jvm.internal.a.f(i10), (T) next));
            this.f128344f = oVar;
            this.f128341c = it;
            this.f128342d = i12;
            this.f128343e = 1;
            if (oVar.d(itInvoke, this) == objH) {
                return objH;
            }
            i10 = i12;
        }
        return b2.f124493a;
    }
}
