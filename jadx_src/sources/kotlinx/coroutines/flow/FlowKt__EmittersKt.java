package kotlinx.coroutines.flow;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.r0;
import kotlin.t0;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\u001au\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001au\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001aU\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001al\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000e\u001aU\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u0010\u0010\u0018\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0004H\u0000\u001as\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/e;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/f;", "Lkotlin/m0;", "name", "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "transform", "g", "(Lkotlinx/coroutines/flow/e;Lyh/q;)Lkotlinx/coroutines/flow/e;", RXScreenCaptureService.KEY_HEIGHT, "Lkotlin/Function2;", "action", "f", "(Lkotlinx/coroutines/flow/e;Lyh/p;)Lkotlinx/coroutines/flow/e;", "", "cause", "d", "e", "b", ak.aF, "(Lkotlinx/coroutines/flow/f;Lyh/q;Ljava/lang/Throwable;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__EmittersKt {
    public static final void b(@dl.d f<?> fVar) {
        if (fVar instanceof x) {
            throw ((x) fVar).e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object c(f<? super T> fVar, yh.q<? super f<? super T>, ? super Throwable, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, Throwable th2, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        if (cVar instanceof FlowKt__EmittersKt$invokeSafely$1) {
            flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) cVar;
            int i10 = flowKt__EmittersKt$invokeSafely$1.f129372d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$invokeSafely$1.f129372d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(cVar);
            }
        } else {
            flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(cVar);
        }
        Object obj = flowKt__EmittersKt$invokeSafely$1.f129371c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__EmittersKt$invokeSafely$1.f129372d;
        try {
            if (i11 == 0) {
                t0.n(obj);
                flowKt__EmittersKt$invokeSafely$1.f129370b = th2;
                flowKt__EmittersKt$invokeSafely$1.f129372d = 1;
                if (qVar.invoke(fVar, th2, flowKt__EmittersKt$invokeSafely$1) == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = (Throwable) flowKt__EmittersKt$invokeSafely$1.f129370b;
                t0.n(obj);
            }
            return b2.f124493a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                kotlin.o.a(th3, th2);
            }
            throw th3;
        }
    }

    @dl.d
    public static final <T> e<T> d(@dl.d e<? extends T> eVar, @dl.d yh.q<? super f<? super T>, ? super Throwable, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(eVar, qVar);
    }

    @dl.d
    public static final <T> e<T> e(@dl.d e<? extends T> eVar, @dl.d yh.p<? super f<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(eVar, pVar);
    }

    @dl.d
    public static final <T> e<T> f(@dl.d e<? extends T> eVar, @dl.d yh.p<? super f<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(pVar, eVar);
    }

    @dl.d
    public static final <T, R> e<R> g(@dl.d e<? extends T> eVar, @kotlin.b @dl.d yh.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        return g.I0(new FlowKt__EmittersKt$transform$1(eVar, qVar, null));
    }

    @dl.d
    @r0
    public static final <T, R> e<R> h(@dl.d e<? extends T> eVar, @kotlin.b @dl.d yh.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        return new FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(eVar, qVar);
    }
}
