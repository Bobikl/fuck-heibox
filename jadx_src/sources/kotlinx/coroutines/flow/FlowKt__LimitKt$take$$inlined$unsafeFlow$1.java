package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlin.t0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1<T> implements e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f129481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f129482c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {115}, m = "collect", n = {"$this$take_u24lambda_u2d4"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f129483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f129484c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129486e;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f129483b = obj;
            this.f129484c |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$take$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(e eVar, int i10) {
        this.f129481b = eVar;
        this.f129482c = i10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.f<? super T>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.flow.f] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f129484c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f129484c = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.f129483b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.f129484c;
        try {
            if (i11 == 0) {
                t0.n(obj);
                Ref.IntRef intRef = new Ref.IntRef();
                e eVar = this.f129481b;
                FlowKt__LimitKt$take$2$1 flowKt__LimitKt$take$2$1 = new FlowKt__LimitKt$take$2$1(intRef, this.f129482c, fVar);
                anonymousClass1.f129486e = fVar;
                anonymousClass1.f129484c = 1;
                Object objA = eVar.a(flowKt__LimitKt$take$2$1, anonymousClass1);
                fVar = objA;
                if (objA == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z10 = (f<? super T>) ((f) anonymousClass1.f129486e);
                t0.n(obj);
                fVar = z10;
            }
        } catch (AbortFlowException e10) {
            kotlinx.coroutines.flow.internal.h.b(e10, fVar);
        }
        return b2.f124493a;
    }
}
