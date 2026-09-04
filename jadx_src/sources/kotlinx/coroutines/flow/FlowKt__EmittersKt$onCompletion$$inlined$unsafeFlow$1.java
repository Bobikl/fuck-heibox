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
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> implements e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f129373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.q f129374c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {114, 121, 128}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u2d2", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f129375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f129376c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129379f;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f129375b = obj;
            this.f129376c |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(e eVar, yh.q qVar) {
        this.f129373b = eVar;
        this.f129374c = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
        x xVar;
        yh.q qVar;
        SafeCollector safeCollector;
        Throwable th2;
        SafeCollector safeCollector2;
        Object objInvoke;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f129376c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f129376c = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.f129375b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.f129376c;
        if (i11 == 0) {
            t0.n(obj);
            try {
                e eVar = this.f129373b;
                anonymousClass1.f129378e = this;
                anonymousClass1.f129379f = fVar;
                anonymousClass1.f129376c = 1;
                if (eVar.a(fVar, anonymousClass1) == objH) {
                    return objH;
                }
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                safeCollector = new SafeCollector(fVar, anonymousClass1.getCom.umeng.analytics.pro.d.R java.lang.String());
                yh.q qVar2 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f129374c;
                anonymousClass1.f129378e = safeCollector;
                anonymousClass1.f129379f = null;
                anonymousClass1.f129376c = 3;
                c0.e(6);
                objInvoke = qVar2.invoke(safeCollector, null, anonymousClass1);
                c0.e(7);
                if (objInvoke == objH) {
                    return objH;
                }
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                return b2.f124493a;
            } catch (Throwable th3) {
                th = th3;
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                xVar = new x(th);
                qVar = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f129374c;
                anonymousClass1.f129378e = th;
                anonymousClass1.f129379f = null;
                anonymousClass1.f129376c = 2;
                if (FlowKt__EmittersKt.c(xVar, qVar, th, anonymousClass1) == objH) {
                    return objH;
                }
                throw th;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                Throwable th4 = (Throwable) anonymousClass1.f129378e;
                t0.n(obj);
                throw th4;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeCollector2 = (SafeCollector) anonymousClass1.f129378e;
            try {
                t0.n(obj);
                safeCollector2.releaseIntercepted();
                return b2.f124493a;
            } catch (Throwable th5) {
                th2 = th5;
                safeCollector2.releaseIntercepted();
                throw th2;
            }
        }
        fVar = (f) anonymousClass1.f129379f;
        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) anonymousClass1.f129378e;
        try {
            t0.n(obj);
            safeCollector = new SafeCollector(fVar, anonymousClass1.getCom.umeng.analytics.pro.d.R java.lang.String());
            try {
                yh.q qVar3 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f129374c;
                anonymousClass1.f129378e = safeCollector;
                anonymousClass1.f129379f = null;
                anonymousClass1.f129376c = 3;
                c0.e(6);
                objInvoke = qVar3.invoke(safeCollector, null, anonymousClass1);
                c0.e(7);
                if (objInvoke == objH) {
                    return objH;
                }
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                return b2.f124493a;
            } catch (Throwable th6) {
                th2 = th6;
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                throw th2;
            }
        } catch (Throwable th7) {
            th = th7;
            xVar = new x(th);
            qVar = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f129374c;
            anonymousClass1.f129378e = th;
            anonymousClass1.f129379f = null;
            anonymousClass1.f129376c = 2;
            if (FlowKt__EmittersKt.c(xVar, qVar, th, anonymousClass1) == objH) {
                return objH;
            }
            throw th;
        }
    }
}
