package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0017R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/flow/StartedWhileSubscribed;", "Lkotlinx/coroutines/flow/r;", "Lkotlinx/coroutines/flow/u;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/SharingCommand;", ak.av, "", "toString", "", "other", "", "equals", "hashCode", "", "b", "J", "stopTimeout", ak.aF, "replayExpiration", "<init>", "(JJ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class StartedWhileSubscribed implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long stopTimeout;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long replayExpiration;

    public StartedWhileSubscribed(long j10, long j11) {
        this.stopTimeout = j10;
        this.replayExpiration = j11;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        }
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.r
    @dl.d
    public e<SharingCommand> a(@dl.d u<Integer> subscriptionCount) {
        return g.g0(g.k0(g.b2(subscriptionCount, new StartedWhileSubscribed$command$1(this, null)), new StartedWhileSubscribed$command$2(null)));
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof StartedWhileSubscribed) {
            StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) other;
            if (this.stopTimeout == startedWhileSubscribed.stopTimeout && this.replayExpiration == startedWhileSubscribed.replayExpiration) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (androidx.collection.k.a(this.stopTimeout) * 31) + androidx.collection.k.a(this.replayExpiration);
    }

    @dl.d
    public String toString() {
        List listJ = kotlin.collections.s.j(2);
        if (this.stopTimeout > 0) {
            listJ.add("stopTimeout=" + this.stopTimeout + "ms");
        }
        if (this.replayExpiration < Long.MAX_VALUE) {
            listJ.add("replayExpiration=" + this.replayExpiration + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + CollectionsKt___CollectionsKt.h3(kotlin.collections.s.a(listJ), null, null, null, 0, null, null, 63, null) + ')';
    }
}
