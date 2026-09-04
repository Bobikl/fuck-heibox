package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@z1
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/internal/i;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "f", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface i<T> extends kotlinx.coroutines.flow.e<T> {

    /* JADX INFO: compiled from: ChannelFlow.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ kotlinx.coroutines.flow.e a(i iVar, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                coroutineContext = EmptyCoroutineContext.f124694b;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return iVar.f(coroutineContext, i10, bufferOverflow);
        }
    }

    @dl.d
    kotlinx.coroutines.flow.e<T> f(@dl.d CoroutineContext context, int capacity, @dl.d BufferOverflow onBufferOverflow);
}
