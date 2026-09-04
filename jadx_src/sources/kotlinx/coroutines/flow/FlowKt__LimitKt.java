package kotlinx.coroutines.flow;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.c0;
import kotlin.t0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a+\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aJ\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000b\u001ar\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00012D\b\u0001\u0010\u0018\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0014¢\u0006\u0002\b\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aX\u0010\u001b\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0080Hø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "", "count", "d", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "", "predicate", "e", "(Lkotlinx/coroutines/flow/e;Lyh/p;)Lkotlinx/coroutines/flow/e;", "g", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "f", "(Lkotlinx/coroutines/flow/f;Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "R", "Lkotlin/Function3;", "Lkotlin/m0;", "name", "Lkotlin/t;", "transform", "i", "(Lkotlinx/coroutines/flow/e;Lyh/q;)Lkotlinx/coroutines/flow/e;", "b", "(Lkotlinx/coroutines/flow/e;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__LimitKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> implements e<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f129452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f129453c;

        public a(e eVar, int i10) {
            this.f129452b = eVar;
            this.f129453c = i10;
        }

        @Override // kotlinx.coroutines.flow.e
        @dl.e
        public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            Object objA = this.f129452b.a(new FlowKt__LimitKt$drop$2$1(new Ref.IntRef(), this.f129453c, fVar), cVar);
            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b<T> implements e<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f129454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.p f129455c;

        public b(e eVar, yh.p pVar) {
            this.f129454b = eVar;
            this.f129455c = pVar;
        }

        @Override // kotlinx.coroutines.flow.e
        @dl.e
        public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            Object objA = this.f129454b.a(new FlowKt__LimitKt$dropWhile$1$1(new Ref.BooleanRef(), fVar, this.f129455c), cVar);
            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <T> Object b(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        FlowKt__LimitKt$collectWhile$1 flowKt__LimitKt$collectWhile$1;
        f<? super Object> fVar;
        if (cVar instanceof FlowKt__LimitKt$collectWhile$1) {
            flowKt__LimitKt$collectWhile$1 = (FlowKt__LimitKt$collectWhile$1) cVar;
            int i10 = flowKt__LimitKt$collectWhile$1.f129458d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$1.f129458d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$collectWhile$1 = new FlowKt__LimitKt$collectWhile$1(cVar);
            }
        } else {
            flowKt__LimitKt$collectWhile$1 = new FlowKt__LimitKt$collectWhile$1(cVar);
        }
        Object obj = flowKt__LimitKt$collectWhile$1.f129457c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__LimitKt$collectWhile$1.f129458d;
        if (i11 == 0) {
            t0.n(obj);
            f<? super Object> flowKt__LimitKt$collectWhile$collector$1 = new FlowKt__LimitKt$collectWhile$collector$1<>(pVar);
            try {
                flowKt__LimitKt$collectWhile$1.f129456b = flowKt__LimitKt$collectWhile$collector$1;
                flowKt__LimitKt$collectWhile$1.f129458d = 1;
                if (eVar.a(flowKt__LimitKt$collectWhile$collector$1, flowKt__LimitKt$collectWhile$1) == objH) {
                    return objH;
                }
            } catch (AbortFlowException e10) {
                e = e10;
                fVar = flowKt__LimitKt$collectWhile$collector$1;
                kotlinx.coroutines.flow.internal.h.b(e, fVar);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$1.f129456b;
            try {
                t0.n(obj);
            } catch (AbortFlowException e11) {
                e = e11;
                kotlinx.coroutines.flow.internal.h.b(e, fVar);
            }
        }
        return b2.f124493a;
    }

    private static final <T> Object c(e<? extends T> eVar, yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.c<? super b2> cVar) {
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = new FlowKt__LimitKt$collectWhile$collector$1(pVar);
        try {
            c0.e(0);
            eVar.a(flowKt__LimitKt$collectWhile$collector$1, cVar);
            c0.e(1);
        } catch (AbortFlowException e10) {
            kotlinx.coroutines.flow.internal.h.b(e10, flowKt__LimitKt$collectWhile$collector$1);
        }
        return b2.f124493a;
    }

    @dl.d
    public static final <T> e<T> d(@dl.d e<? extends T> eVar, int i10) {
        if (i10 >= 0) {
            return new a(eVar, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    @dl.d
    public static final <T> e<T> e(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return new b(eVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object f(f<? super T> fVar, T t10, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        if (cVar instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) cVar;
            int i10 = flowKt__LimitKt$emitAbort$1.f129480d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$emitAbort$1.f129480d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(cVar);
            }
        } else {
            flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(cVar);
        }
        Object obj = flowKt__LimitKt$emitAbort$1.f129479c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__LimitKt$emitAbort$1.f129480d;
        if (i11 == 0) {
            t0.n(obj);
            flowKt__LimitKt$emitAbort$1.f129478b = fVar;
            flowKt__LimitKt$emitAbort$1.f129480d = 1;
            if (fVar.emit(t10, flowKt__LimitKt$emitAbort$1) == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (f) flowKt__LimitKt$emitAbort$1.f129478b;
            t0.n(obj);
        }
        throw new AbortFlowException(fVar);
    }

    @dl.d
    public static final <T> e<T> g(@dl.d e<? extends T> eVar, int i10) {
        if (i10 > 0) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(eVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    @dl.d
    public static final <T> e<T> h(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(eVar, pVar);
    }

    @dl.d
    public static final <T, R> e<R> i(@dl.d e<? extends T> eVar, @kotlin.b @dl.d yh.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> qVar) {
        return g.I0(new FlowKt__LimitKt$transformWhile$1(eVar, qVar, null));
    }
}
