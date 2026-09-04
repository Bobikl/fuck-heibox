package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.c0;
import kotlin.t0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1, reason: invalid class name */
/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1<T> implements f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.p f129499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f129500c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Limit.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {142, 143}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f129501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f129502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f129503d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129505f;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f129502c = obj;
            this.f129503d |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1(yh.p pVar, f fVar) {
        this.f129499b = pVar;
        this.f129500c = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object obj;
        Object obj2;
        FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1<T> flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f129503d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f129503d = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj3 = anonymousClass1.f129502c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.f129503d;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                Object obj4 = anonymousClass1.f129505f;
                FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1<T> flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$2 = (FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1) anonymousClass1.f129501b;
                t0.n(obj3);
                obj2 = obj4;
                flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$2;
                obj = obj3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 = (FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1) anonymousClass1.f129501b;
                t0.n(obj3);
            }
            if (z10) {
                return b2.f124493a;
            }
            throw new AbortFlowException(flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1);
        }
        t0.n(obj3);
        yh.p pVar = this.f129499b;
        anonymousClass1.f129501b = this;
        anonymousClass1.f129505f = t10;
        anonymousClass1.f129503d = 1;
        c0.e(6);
        Object objInvoke = pVar.invoke(t10, anonymousClass1);
        c0.e(7);
        if (objInvoke == objH) {
            return objH;
        }
        obj = objInvoke;
        obj2 = t10;
        flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 = this;
        if (((Boolean) obj).booleanValue()) {
            f fVar = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1.f129500c;
            anonymousClass1.f129501b = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1;
            anonymousClass1.f129505f = null;
            anonymousClass1.f129503d = 2;
            if (fVar.emit(obj2, anonymousClass1) == objH) {
                return objH;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            return b2.f124493a;
        }
        throw new AbortFlowException(flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1);
    }
}
