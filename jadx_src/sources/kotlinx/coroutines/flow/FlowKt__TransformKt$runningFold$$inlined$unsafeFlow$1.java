package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1<R> implements e<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f129721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f129722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.q f129723d;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {114, 115}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u2d8", "accumulator"}, s = {"L$0", "L$1", "L$2"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f129724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f129725c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129728f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f129729g;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f129724b = obj;
            this.f129725c |= Integer.MIN_VALUE;
            return FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(Object obj, e eVar, yh.q qVar) {
        this.f129721b = obj;
        this.f129722c = eVar;
        this.f129723d = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d f<? super R> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1<R> flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
        f fVar2;
        Ref.ObjectRef objectRef;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f129725c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f129725c = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.f129724b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.f129725c;
        if (i11 != 0) {
            if (i11 == 1) {
                objectRef = (Ref.ObjectRef) anonymousClass1.f129729g;
                f fVar3 = (f) anonymousClass1.f129728f;
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = (FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1) anonymousClass1.f129727e;
                t0.n(obj);
                fVar2 = fVar3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        ?? r10 = this.f129721b;
        objectRef2.f124891b = r10;
        anonymousClass1.f129727e = this;
        anonymousClass1.f129728f = fVar;
        anonymousClass1.f129729g = objectRef2;
        anonymousClass1.f129725c = 1;
        if (fVar.emit(r10, anonymousClass1) == objH) {
            return objH;
        }
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = this;
        fVar2 = fVar;
        objectRef = objectRef2;
        e eVar = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.f129722c;
        FlowKt__TransformKt$runningFold$1$1 flowKt__TransformKt$runningFold$1$1 = new FlowKt__TransformKt$runningFold$1$1(objectRef, flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.f129723d, fVar2);
        anonymousClass1.f129727e = null;
        anonymousClass1.f129728f = null;
        anonymousClass1.f129729g = null;
        anonymousClass1.f129725c = 2;
        if (eVar.a(flowKt__TransformKt$runningFold$1$1, anonymousClass1) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
