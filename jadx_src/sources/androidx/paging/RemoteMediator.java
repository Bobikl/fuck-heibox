package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RemoteMediator.kt */
/* JADX INFO: loaded from: classes6.dex */
@g
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0010\fB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/paging/RemoteMediator;", "", "Key", "Value", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/t0;", "state", "Landroidx/paging/RemoteMediator$a;", ak.aF, "(Landroidx/paging/LoadType;Landroidx/paging/t0;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/RemoteMediator$InitializeAction;", ak.av, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "<init>", "()V", "InitializeAction", "paging-common"}, k = 1, mv = {1, 4, 2})
public abstract class RemoteMediator<Key, Value> {

    /* JADX INFO: compiled from: RemoteMediator.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/RemoteMediator$InitializeAction;", "", "(Ljava/lang/String;I)V", "LAUNCH_INITIAL_REFRESH", "SKIP_INITIAL_REFRESH", "paging-common"}, k = 1, mv = {1, 4, 2})
    public enum InitializeAction {
        LAUNCH_INITIAL_REFRESH,
        SKIP_INITIAL_REFRESH
    }

    /* JADX INFO: compiled from: RemoteMediator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/paging/RemoteMediator$a;", "", "<init>", "()V", ak.av, "b", "Landroidx/paging/RemoteMediator$a$a;", "Landroidx/paging/RemoteMediator$a$b;", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class a {

        /* JADX INFO: renamed from: androidx.paging.RemoteMediator$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RemoteMediator.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/paging/RemoteMediator$a$a;", "Landroidx/paging/RemoteMediator$a;", "", ak.av, "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class C0197a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @dl.d
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0197a(@dl.d Throwable throwable) {
                super(null);
                kotlin.jvm.internal.f0.p(throwable, "throwable");
                this.throwable = throwable;
            }

            @dl.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        /* JADX INFO: compiled from: RemoteMediator.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/paging/RemoteMediator$a$b;", "Landroidx/paging/RemoteMediator$a;", "", ak.av, "Z", "()Z", "endOfPaginationReached", "<init>", "(Z)V", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final boolean endOfPaginationReached;

            public b(boolean z10) {
                super(null);
                this.endOfPaginationReached = z10;
            }

            @xh.h(name = "endOfPaginationReached")
            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getEndOfPaginationReached() {
                return this.endOfPaginationReached;
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    static /* synthetic */ Object b(RemoteMediator remoteMediator, kotlin.coroutines.c cVar) {
        return InitializeAction.LAUNCH_INITIAL_REFRESH;
    }

    @dl.e
    public Object a(@dl.d kotlin.coroutines.c<? super InitializeAction> cVar) {
        return b(this, cVar);
    }

    @dl.e
    public abstract Object c(@dl.d LoadType loadType, @dl.d PagingState<Key, Value> pagingState, @dl.d kotlin.coroutines.c<? super a> cVar);
}
