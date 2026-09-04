package kotlinx.coroutines.flow;

import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.o0;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a%\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "replay", "extraBufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", ak.av, "", "", "", UCropPlusActivity.ARG_INDEX, "f", "([Ljava/lang/Object;J)Ljava/lang/Object;", ChannelListActivity.q.f79586f, "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lkotlinx/coroutines/flow/n;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "capacity", "Lkotlinx/coroutines/flow/e;", "e", "Lkotlinx/coroutines/internal/o0;", "Lkotlinx/coroutines/internal/o0;", "getNO_VALUE$annotations", "()V", "NO_VALUE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final o0 f130093a = new o0("NO_VALUE");

    @dl.d
    public static final <T> i<T> a(int i10, int i11, @dl.d BufferOverflow bufferOverflow) {
        boolean z10 = true;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        }
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        if (i10 <= 0 && i11 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
            z10 = false;
        }
        if (z10) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            return new SharedFlowImpl(i10, i12, bufferOverflow);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
    }

    public static /* synthetic */ i b(int i10, int i11, BufferOverflow bufferOverflow, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return a(i10, i11, bufferOverflow);
    }

    @dl.d
    public static final <T> e<T> e(@dl.d n<? extends T> nVar, @dl.d CoroutineContext coroutineContext, int i10, @dl.d BufferOverflow bufferOverflow) {
        return ((i10 == 0 || i10 == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? nVar : new kotlinx.coroutines.flow.internal.e(nVar, coroutineContext, i10, bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    public static /* synthetic */ void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
