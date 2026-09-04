package kotlinx.coroutines.flow;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "b", ak.av, "g", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, RXScreenCaptureService.KEY_HEIGHT, "e", "Lkotlin/b2;", "f", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class h {
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ e a(e eVar, int i10) {
        return d(eVar, i10, null, 2, null);
    }

    @dl.d
    public static final <T> e<T> b(@dl.d e<? extends T> eVar, int i10, @dl.d BufferOverflow bufferOverflow) {
        int i11;
        BufferOverflow bufferOverflow2;
        boolean z10 = true;
        if (!(i10 >= 0 || i10 == -2 || i10 == -1)) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i10 == -1) {
            bufferOverflow2 = BufferOverflow.DROP_OLDEST;
            i11 = 0;
        } else {
            i11 = i10;
            bufferOverflow2 = bufferOverflow;
        }
        return eVar instanceof kotlinx.coroutines.flow.internal.i ? kotlinx.coroutines.flow.internal.i.a.a((kotlinx.coroutines.flow.internal.i) eVar, null, i11, bufferOverflow2, 1, null) : new kotlinx.coroutines.flow.internal.e(eVar, null, i11, bufferOverflow2, 2, null);
    }

    public static /* synthetic */ e c(e eVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        return a(eVar, i10);
    }

    public static /* synthetic */ e d(e eVar, int i10, BufferOverflow bufferOverflow, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return g.o(eVar, i10, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T> e<T> e(@dl.d e<? extends T> eVar) {
        return eVar instanceof a ? eVar : new CancellableFlowImpl(eVar);
    }

    private static final void f(CoroutineContext coroutineContext) {
        if (coroutineContext.f(d2.INSTANCE) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    @dl.d
    public static final <T> e<T> g(@dl.d e<? extends T> eVar) {
        return d(eVar, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T> e<T> h(@dl.d e<? extends T> eVar, @dl.d CoroutineContext coroutineContext) {
        f(coroutineContext);
        if (f0.g(coroutineContext, EmptyCoroutineContext.f124694b)) {
            return eVar;
        }
        return eVar instanceof kotlinx.coroutines.flow.internal.i ? kotlinx.coroutines.flow.internal.i.a.a((kotlinx.coroutines.flow.internal.i) eVar, coroutineContext, 0, null, 6, null) : new kotlinx.coroutines.flow.internal.e(eVar, coroutineContext, 0, null, 12, null);
    }
}
