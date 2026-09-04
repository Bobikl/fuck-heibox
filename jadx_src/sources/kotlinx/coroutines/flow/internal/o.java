package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.u;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/internal/o;", "Lkotlinx/coroutines/flow/u;", "", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "delta", "", "f0", "e0", "()Ljava/lang/Integer;", "value", "initialValue", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class o extends SharedFlowImpl<Integer> implements u<Integer> {
    public o(int i10) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        d(Integer.valueOf(i10));
    }

    @Override // kotlinx.coroutines.flow.u
    @dl.d
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(Q().intValue());
        }
        return numValueOf;
    }

    public final boolean f0(int delta) {
        boolean zD;
        synchronized (this) {
            zD = d(Integer.valueOf(Q().intValue() + delta));
        }
        return zD;
    }
}
