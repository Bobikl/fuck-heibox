package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.c0;
import kotlin.t0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class FlowKt__ReduceKt$first$$inlined$collectWhile$2<T> implements f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.p f129566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f129567c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: Limit.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {142}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f129568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f129569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f129570d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129572f;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f129569c = obj;
            this.f129570d |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt$first$$inlined$collectWhile$2.this.emit(null, this);
        }
    }

    public FlowKt__ReduceKt$first$$inlined$collectWhile$2(yh.p pVar, Ref.ObjectRef objectRef) {
        this.f129566b = pVar;
        this.f129567c = objectRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FlowKt__ReduceKt$first$$inlined$collectWhile$2<T> flowKt__ReduceKt$first$$inlined$collectWhile$2;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f129570d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f129570d = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objInvoke = anonymousClass1.f129569c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.f129570d;
        boolean z10 = true;
        if (i11 == 0) {
            t0.n(objInvoke);
            yh.p pVar = this.f129566b;
            anonymousClass1.f129568b = this;
            anonymousClass1.f129572f = t10;
            anonymousClass1.f129570d = 1;
            c0.e(6);
            objInvoke = pVar.invoke(t10, anonymousClass1);
            c0.e(7);
            if (objInvoke == objH) {
                return objH;
            }
            flowKt__ReduceKt$first$$inlined$collectWhile$2 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t10 = (T) anonymousClass1.f129572f;
            flowKt__ReduceKt$first$$inlined$collectWhile$2 = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) anonymousClass1.f129568b;
            t0.n(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            flowKt__ReduceKt$first$$inlined$collectWhile$2.f129567c.f124891b = t10;
            z10 = false;
        }
        if (z10) {
            return b2.f124493a;
        }
        throw new AbortFlowException(flowKt__ReduceKt$first$$inlined$collectWhile$2);
    }
}
