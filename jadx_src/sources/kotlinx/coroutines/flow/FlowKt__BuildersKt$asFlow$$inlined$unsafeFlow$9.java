package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.k0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.t0;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9 implements e<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ fi.l f129268b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d17"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f129269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f129270c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129273f;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f129269b = obj;
            this.f129270c |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9.this.a(null, this);
        }
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(fi.l lVar) {
        this.f129268b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d f<? super Integer> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        f fVar2;
        Iterator<Integer> it;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f129270c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f129270c = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.f129269b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.f129270c;
        if (i11 == 0) {
            t0.n(obj);
            fVar2 = fVar;
            it = this.f129268b.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) anonymousClass1.f129273f;
            f fVar3 = (f) anonymousClass1.f129272e;
            t0.n(obj);
            fVar2 = fVar3;
        }
        while (it.hasNext()) {
            Integer numF = kotlin.coroutines.jvm.internal.a.f(((k0) it).nextInt());
            anonymousClass1.f129272e = fVar2;
            anonymousClass1.f129273f = it;
            anonymousClass1.f129270c = 1;
            if (fVar2.emit(numF, anonymousClass1) == objH) {
                return objH;
            }
        }
        return b2.f124493a;
    }
}
