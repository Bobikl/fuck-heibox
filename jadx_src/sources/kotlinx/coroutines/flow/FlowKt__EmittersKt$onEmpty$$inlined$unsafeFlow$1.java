package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.c0;
import kotlin.t0;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1<T> implements e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f129380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.p f129381c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {114, 122}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u2d3", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f129382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f129383c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f129387g;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f129382b = obj;
            this.f129383c |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(e eVar, yh.p pVar) {
        this.f129380b = eVar;
        this.f129381c = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.flow.f] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.f<? super T>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1<T> flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1;
        ?? r10;
        Ref.BooleanRef booleanRef;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f129383c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f129383c = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.f129382b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.f129383c;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    booleanRef = (Ref.BooleanRef) anonymousClass1.f129387g;
                    f fVar2 = (f) anonymousClass1.f129386f;
                    flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1) anonymousClass1.f129385e;
                    t0.n(obj);
                    r10 = fVar2;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SafeCollector safeCollector = (SafeCollector) anonymousClass1.f129385e;
                    t0.n(obj);
                    fVar = safeCollector;
                }
                ((SafeCollector) fVar).releaseIntercepted();
                return b2.f124493a;
            }
            t0.n(obj);
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            booleanRef2.f124884b = true;
            e eVar = this.f129380b;
            FlowKt__EmittersKt$onEmpty$1$1 flowKt__EmittersKt$onEmpty$1$1 = new FlowKt__EmittersKt$onEmpty$1$1(booleanRef2, fVar);
            anonymousClass1.f129385e = this;
            anonymousClass1.f129386f = fVar;
            anonymousClass1.f129387g = booleanRef2;
            anonymousClass1.f129383c = 1;
            if (eVar.a(flowKt__EmittersKt$onEmpty$1$1, anonymousClass1) == objH) {
                return objH;
            }
            flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 = this;
            r10 = fVar;
            booleanRef = booleanRef2;
            if (booleanRef.f124884b) {
                SafeCollector safeCollector2 = new SafeCollector(r10, anonymousClass1.getContext());
                yh.p pVar = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.f129381c;
                anonymousClass1.f129385e = safeCollector2;
                anonymousClass1.f129386f = null;
                anonymousClass1.f129387g = null;
                anonymousClass1.f129383c = 2;
                c0.e(6);
                Object objInvoke = pVar.invoke(safeCollector2, anonymousClass1);
                c0.e(7);
                fVar = safeCollector2;
                if (objInvoke == objH) {
                    return objH;
                }
                ((SafeCollector) fVar).releaseIntercepted();
            }
            return b2.f124493a;
        } catch (Throwable th2) {
            fVar.releaseIntercepted();
            throw th2;
        }
    }
}
