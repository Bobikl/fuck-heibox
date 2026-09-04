package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LoadState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\t\nB\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Landroidx/paging/v;", "", "", ak.av, "Z", "()Z", "endOfPaginationReached", "<init>", "(Z)V", "b", ak.aF, "Landroidx/paging/v$c;", "Landroidx/paging/v$b;", "Landroidx/paging/v$a;", "paging-common"}, k = 1, mv = {1, 4, 2})
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean endOfPaginationReached;

    /* JADX INFO: renamed from: androidx.paging.v$a, reason: from toString */
    /* JADX INFO: compiled from: LoadState.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/paging/v$a;", "Landroidx/paging/v;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "error", "<init>", "(Ljava/lang/Throwable;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Error extends v {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@dl.d Throwable error) {
            super(false, null);
            kotlin.jvm.internal.f0.p(error, "error");
            this.error = error;
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public boolean equals(@dl.e Object other) {
            if (other instanceof Error) {
                Error error = (Error) other;
                if (getEndOfPaginationReached() == error.getEndOfPaginationReached() && kotlin.jvm.internal.f0.g(this.error, error.error)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return androidx.compose.foundation.b0.a(getEndOfPaginationReached()) + this.error.hashCode();
        }

        @dl.d
        public String toString() {
            return "Error(endOfPaginationReached=" + getEndOfPaginationReached() + ", error=" + this.error + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.paging.v$b, reason: from toString */
    /* JADX INFO: compiled from: LoadState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Landroidx/paging/v$b;", "Landroidx/paging/v;", "", "toString", "", "other", "", "equals", "", "hashCode", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Loading extends v {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final Loading f26654b = new Loading();

        private Loading() {
            super(false, null);
        }

        public boolean equals(@dl.e Object other) {
            return (other instanceof Loading) && getEndOfPaginationReached() == ((Loading) other).getEndOfPaginationReached();
        }

        public int hashCode() {
            return androidx.compose.foundation.b0.a(getEndOfPaginationReached());
        }

        @dl.d
        public String toString() {
            return "Loading(endOfPaginationReached=" + getEndOfPaginationReached() + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.paging.v$c, reason: from toString */
    /* JADX INFO: compiled from: LoadState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"Landroidx/paging/v$c;", "Landroidx/paging/v;", "", "toString", "", "other", "", "equals", "", "hashCode", "endOfPaginationReached", "<init>", "(Z)V", "d", ak.av, "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class NotLoading extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private static final NotLoading f26655b = new NotLoading(true);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private static final NotLoading f26656c = new NotLoading(false);

        /* JADX INFO: renamed from: androidx.paging.v$c$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: LoadState.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/paging/v$c$a;", "", "Landroidx/paging/v$c;", "Complete", "Landroidx/paging/v$c;", ak.av, "()Landroidx/paging/v$c;", "Incomplete", "b", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.d
            public final NotLoading a() {
                return NotLoading.f26655b;
            }

            @dl.d
            public final NotLoading b() {
                return NotLoading.f26656c;
            }
        }

        public NotLoading(boolean z10) {
            super(z10, null);
        }

        public boolean equals(@dl.e Object other) {
            return (other instanceof NotLoading) && getEndOfPaginationReached() == ((NotLoading) other).getEndOfPaginationReached();
        }

        public int hashCode() {
            return androidx.compose.foundation.b0.a(getEndOfPaginationReached());
        }

        @dl.d
        public String toString() {
            return "NotLoading(endOfPaginationReached=" + getEndOfPaginationReached() + ')';
        }
    }

    private v(boolean z10) {
        this.endOfPaginationReached = z10;
    }

    public /* synthetic */ v(boolean z10, kotlin.jvm.internal.u uVar) {
        this(z10);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEndOfPaginationReached() {
        return this.endOfPaginationReached;
    }
}
