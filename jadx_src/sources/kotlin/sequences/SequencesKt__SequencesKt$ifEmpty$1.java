package kotlin.sequences;

import java.util.Iterator;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
public final class SequencesKt__SequencesKt$ifEmpty$1<T> extends RestrictedSuspendLambda implements yh.p<o<? super T>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f128353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f128354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ m<T> f128355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.a<m<T>> f128356f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt__SequencesKt$ifEmpty$1(m<? extends T> mVar, yh.a<? extends m<? extends T>> aVar, kotlin.coroutines.c<? super SequencesKt__SequencesKt$ifEmpty$1> cVar) {
        super(2, cVar);
        this.f128355e = mVar;
        this.f128356f = aVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d o<? super T> oVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SequencesKt__SequencesKt$ifEmpty$1) create(oVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.f128355e, this.f128356f, cVar);
        sequencesKt__SequencesKt$ifEmpty$1.f128354d = obj;
        return sequencesKt__SequencesKt$ifEmpty$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f128353c;
        if (i10 == 0) {
            t0.n(obj);
            o oVar = (o) this.f128354d;
            Iterator<? extends T> it = this.f128355e.iterator();
            if (it.hasNext()) {
                this.f128353c = 1;
                if (oVar.d(it, this) == objH) {
                    return objH;
                }
            } else {
                m<T> mVarInvoke = this.f128356f.invoke();
                this.f128353c = 2;
                if (oVar.e(mVarInvoke, this) == objH) {
                    return objH;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
