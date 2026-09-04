package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/flow/r;", "", "Lkotlinx/coroutines/flow/u;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/SharingCommand;", ak.av, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f130101a;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.r$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/flow/r$a;", "", "", "stopTimeoutMillis", "replayExpirationMillis", "Lkotlinx/coroutines/flow/r;", ak.av, "b", "Lkotlinx/coroutines/flow/r;", ak.aF, "()Lkotlinx/coroutines/flow/r;", "Eagerly", "d", "Lazily", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f130101a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final r Eagerly = new t();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final r Lazily = new StartedLazily();

        private Companion() {
        }

        public static /* synthetic */ r b(Companion companion, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return companion.a(j10, j11);
        }

        @dl.d
        public final r a(long stopTimeoutMillis, long replayExpirationMillis) {
            return new StartedWhileSubscribed(stopTimeoutMillis, replayExpirationMillis);
        }

        @dl.d
        public final r c() {
            return Eagerly;
        }

        @dl.d
        public final r d() {
            return Lazily;
        }
    }

    @dl.d
    e<SharingCommand> a(@dl.d u<Integer> subscriptionCount);
}
