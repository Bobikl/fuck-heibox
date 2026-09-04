package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/StartedLazily;", "Lkotlinx/coroutines/flow/r;", "Lkotlinx/coroutines/flow/u;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/SharingCommand;", ak.av, "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class StartedLazily implements r {
    @Override // kotlinx.coroutines.flow.r
    @dl.d
    public e<SharingCommand> a(@dl.d u<Integer> subscriptionCount) {
        return g.I0(new StartedLazily$command$1(subscriptionCount, null));
    }

    @dl.d
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
