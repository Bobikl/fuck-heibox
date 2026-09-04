package androidx.paging.multicast;

import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.channels.m;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Multicaster.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.multicast.Multicaster$flow$1", f = "Multicaster.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
public final class Multicaster$flow$1<T> extends SuspendLambda implements p<f<? super T>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f26520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Multicaster f26522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Multicaster$flow$1(Multicaster multicaster, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f26522d = multicaster;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        f0.p(completion, "completion");
        Multicaster$flow$1 multicaster$flow$1 = new Multicaster$flow$1(this.f26522d, completion);
        multicaster$flow$1.f26520b = obj;
        return multicaster$flow$1;
    }

    @Override // yh.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
        return ((Multicaster$flow$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26521c;
        if (i10 == 0) {
            t0.n(obj);
            f<? super T> fVar = (f) this.f26520b;
            k kVarD = m.d(Integer.MAX_VALUE, null, null, 6, null);
            kotlinx.coroutines.flow.e eVarD1 = g.d1(g.I0(new Multicaster$flow$1$invokeSuspend$$inlined$transform$1(g.l1(g.X(kVarD), new Multicaster$flow$1$subFlow$1(this, kVarD, null)), null)), new Multicaster$flow$1$subFlow$3(this, kVarD, null));
            this.f26521c = 1;
            if (eVarD1.a(fVar, this) == objH) {
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
