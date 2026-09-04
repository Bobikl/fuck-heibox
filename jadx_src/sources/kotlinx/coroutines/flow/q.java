package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/flow/q;", androidx.exifinterface.media.a.f23244d5, "", "Lkotlinx/coroutines/flow/e;", ak.av, "Lkotlinx/coroutines/flow/e;", "upstream", "", "b", "I", "extraBufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", ak.aF, "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/coroutines/CoroutineContext;", "d", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "<init>", "(Lkotlinx/coroutines/flow/e;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final e<T> upstream;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final int extraBufferCapacity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final BufferOverflow onBufferOverflow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final CoroutineContext context;

    /* JADX WARN: Multi-variable type inference failed */
    public q(@dl.d e<? extends T> eVar, int i10, @dl.d BufferOverflow bufferOverflow, @dl.d CoroutineContext coroutineContext) {
        this.upstream = eVar;
        this.extraBufferCapacity = i10;
        this.onBufferOverflow = bufferOverflow;
        this.context = coroutineContext;
    }
}
