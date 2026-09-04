package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.c0;
import kotlin.t0;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1<T> implements e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.p f129393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f129394c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {116, 120}, m = "collect", n = {"this", "$this$onStart_u24lambda_u2d1", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f129395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f129396c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129398e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129399f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f129400g;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f129395b = obj;
            this.f129396c |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(yh.p pVar, e eVar) {
        this.f129393b = pVar;
        this.f129394c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Throwable th2;
        SafeCollector safeCollector;
        FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1<T> flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
        f<? super T> fVar2;
        e eVar;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f129396c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f129396c = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.f129395b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.f129396c;
        if (i11 == 0) {
            t0.n(obj);
            SafeCollector safeCollector2 = new SafeCollector(fVar, anonymousClass1.getContext());
            try {
                yh.p pVar = this.f129393b;
                anonymousClass1.f129398e = this;
                anonymousClass1.f129399f = fVar;
                anonymousClass1.f129400g = safeCollector2;
                anonymousClass1.f129396c = 1;
                c0.e(6);
                Object objInvoke = pVar.invoke(safeCollector2, anonymousClass1);
                c0.e(7);
                if (objInvoke == objH) {
                    return objH;
                }
                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = this;
                fVar2 = fVar;
                safeCollector = safeCollector2;
                safeCollector.releaseIntercepted();
                eVar = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.f129394c;
                anonymousClass1.f129398e = null;
                anonymousClass1.f129399f = null;
                anonymousClass1.f129400g = null;
                anonymousClass1.f129396c = 2;
                if (eVar.a(fVar2, anonymousClass1) == objH) {
                    return objH;
                }
            } catch (Throwable th3) {
                th2 = th3;
                safeCollector = safeCollector2;
                safeCollector.releaseIntercepted();
                throw th2;
            }
        } else if (i11 == 1) {
            safeCollector = (SafeCollector) anonymousClass1.f129400g;
            fVar2 = (f) anonymousClass1.f129399f;
            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1) anonymousClass1.f129398e;
            try {
                t0.n(obj);
                safeCollector.releaseIntercepted();
                eVar = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.f129394c;
                anonymousClass1.f129398e = null;
                anonymousClass1.f129399f = null;
                anonymousClass1.f129400g = null;
                anonymousClass1.f129396c = 2;
                if (eVar.a(fVar2, anonymousClass1) == objH) {
                    return objH;
                }
            } catch (Throwable th4) {
                th2 = th4;
                safeCollector.releaseIntercepted();
                throw th2;
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
