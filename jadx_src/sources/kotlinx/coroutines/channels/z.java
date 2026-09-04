package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: RendezvousChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/z;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/AbstractChannel;", "", "g0", "()Z", "isBufferAlwaysEmpty", "h0", "isBufferEmpty", "C", "isBufferAlwaysFull", "D", "isBufferFull", "Lkotlin/Function1;", "Lkotlin/b2;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lyh/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class z<E> extends AbstractChannel<E> {
    public z(@dl.e yh.l<? super E, b2> lVar) {
        super(lVar);
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean C() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean D() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean g0() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean h0() {
        return true;
    }
}
