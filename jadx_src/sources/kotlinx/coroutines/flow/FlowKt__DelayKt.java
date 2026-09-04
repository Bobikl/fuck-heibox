package kotlinx.coroutines.flow;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.l0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.u1;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a2\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0007\u001a3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000f\u001a\u00020\u0002H\u0007\u001a$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002H\u0000\u001a3\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "", "timeoutMillis", ak.av, "Lkotlin/Function1;", "b", "Lkotlin/time/e;", l5.a.f130839h0, ak.aF, "(Lkotlinx/coroutines/flow/e;J)Lkotlinx/coroutines/flow/e;", "d", "(Lkotlinx/coroutines/flow/e;Lyh/l;)Lkotlinx/coroutines/flow/e;", "timeoutMillisSelector", "e", "periodMillis", RXScreenCaptureService.KEY_HEIGHT, "Lkotlinx/coroutines/q0;", "delayMillis", "initialDelayMillis", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlin/b2;", "f", "period", "i", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__DelayKt {
    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    @u1
    public static final <T> e<T> a(@dl.d e<? extends T> eVar, final long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? eVar : e(eVar, new yh.l<T, Long>() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Long invoke(T t10) {
                    return Long.valueOf(j10);
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    @dl.d
    @u1
    @l0
    public static final <T> e<T> b(@dl.d e<? extends T> eVar, @dl.d yh.l<? super T, Long> lVar) {
        return e(eVar, lVar);
    }

    @dl.d
    @u1
    public static final <T> e<T> c(@dl.d e<? extends T> eVar, long j10) {
        return g.a0(eVar, DelayKt.e(j10));
    }

    @dl.d
    @u1
    @l0
    @xh.h(name = "debounceDuration")
    public static final <T> e<T> d(@dl.d e<? extends T> eVar, @dl.d final yh.l<? super T, kotlin.time.e> lVar) {
        return e(eVar, new yh.l<T, Long>() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(T t10) {
                return Long.valueOf(DelayKt.e(lVar.invoke(t10).D0()));
            }
        });
    }

    private static final <T> e<T> e(e<? extends T> eVar, yh.l<? super T, Long> lVar) {
        return FlowCoroutineKt.b(new FlowKt__DelayKt$debounceInternal$1(lVar, eVar, null));
    }

    @dl.d
    public static final ReceiveChannel<b2> f(@dl.d q0 q0Var, long j10, long j11) {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j10 + " ms").toString());
        }
        if (j11 >= 0) {
            return ProduceKt.h(q0Var, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$3(j11, j10, null), 1, null);
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j11 + " ms").toString());
    }

    public static /* synthetic */ ReceiveChannel g(q0 q0Var, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = j10;
        }
        return g.x0(q0Var, j10, j11);
    }

    @dl.d
    @u1
    public static final <T> e<T> h(@dl.d e<? extends T> eVar, long j10) {
        if (j10 > 0) {
            return FlowCoroutineKt.b(new FlowKt__DelayKt$sample$2(j10, eVar, null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    @dl.d
    @u1
    public static final <T> e<T> i(@dl.d e<? extends T> eVar, long j10) {
        return g.A1(eVar, DelayKt.e(j10));
    }
}
