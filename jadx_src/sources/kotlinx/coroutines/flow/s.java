package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/r$a;", "Lkotlin/time/e;", "stopTimeout", "replayExpiration", "Lkotlinx/coroutines/flow/r;", ak.av, "(Lkotlinx/coroutines/flow/r$a;JJ)Lkotlinx/coroutines/flow/r;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class s {
    @dl.d
    public static final r a(@dl.d r.Companion companion, long j10, long j11) {
        return new StartedWhileSubscribed(kotlin.time.e.Q(j10), kotlin.time.e.Q(j11));
    }

    public static /* synthetic */ r b(r.Companion companion, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = kotlin.time.e.f128628c.W();
        }
        if ((i10 & 2) != 0) {
            j11 = kotlin.time.e.f128628c.q();
        }
        return a(companion, j10, j11);
    }
}
