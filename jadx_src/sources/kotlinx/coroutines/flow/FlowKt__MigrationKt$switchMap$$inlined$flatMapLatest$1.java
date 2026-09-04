package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "it", "Lkotlin/b2;", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {bb.c.b.I0, bb.c.b.I0}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1<R, T> extends SuspendLambda implements yh.q<f<? super R>, T, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f129558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.p f129559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(yh.p pVar, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.f129559e = pVar;
    }

    @Override // yh.q
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d f<? super R> fVar, T t10, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 = new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(this.f129559e, cVar);
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.f129557c = fVar;
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.f129558d = t10;
        return flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        f fVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f129556b;
        if (i10 != 0) {
            if (i10 == 1) {
                fVar = (f) this.f129557c;
                t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        fVar = (f) this.f129557c;
        Object obj2 = this.f129558d;
        yh.p pVar = this.f129559e;
        this.f129557c = fVar;
        this.f129556b = 1;
        obj = pVar.invoke(obj2, this);
        if (obj == objH) {
            return objH;
        }
        this.f129557c = null;
        this.f129556b = 2;
        if (g.m0(fVar, (e) obj, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
