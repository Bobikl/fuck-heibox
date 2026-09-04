package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* JADX INFO: compiled from: RemoteMediatorAccessor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002&\rB\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\"\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nJ\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\nJ \u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0018\u00010\u0013J\u0006\u0010\u0015\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0010J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"¨\u0006'"}, d2 = {"Landroidx/paging/AccessorState;", "", "Key", "Value", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/v;", "f", "Landroidx/paging/x;", "e", "Landroidx/paging/t0;", "pagingState", "", ak.av, "Landroidx/paging/AccessorState$BlockState;", "state", "Lkotlin/b2;", "i", RXScreenCaptureService.KEY_HEIGHT, "Lkotlin/Pair;", "g", "d", ak.aF, "b", "Landroidx/paging/v$a;", "errorState", "j", "", "[Landroidx/paging/AccessorState$BlockState;", "blockStates", "[Landroidx/paging/v$a;", "errors", "Lkotlin/collections/i;", "Landroidx/paging/AccessorState$a;", "Lkotlin/collections/i;", "pendingRequests", "<init>", "()V", "BlockState", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class AccessorState<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final BlockState[] blockStates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v.Error[] errors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kotlin.collections.i<a<Key, Value>> pendingRequests;

    /* JADX INFO: compiled from: RemoteMediatorAccessor.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/AccessorState$BlockState;", "", "(Ljava/lang/String;I)V", "UNBLOCKED", "COMPLETED", "REQUIRES_REFRESH", "paging-common"}, k = 1, mv = {1, 4, 2})
    public enum BlockState {
        UNBLOCKED,
        COMPLETED,
        REQUIRES_REFRESH
    }

    /* JADX INFO: compiled from: RemoteMediatorAccessor.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R.\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/paging/AccessorState$a;", "", "Key", "Value", "Landroidx/paging/LoadType;", ak.av, "Landroidx/paging/LoadType;", "()Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/t0;", "b", "Landroidx/paging/t0;", "()Landroidx/paging/t0;", ak.aF, "(Landroidx/paging/t0;)V", "pagingState", "<init>", "(Landroidx/paging/LoadType;Landroidx/paging/t0;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class a<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final LoadType loadType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private PagingState<Key, Value> pagingState;

        public a(@dl.d LoadType loadType, @dl.d PagingState<Key, Value> pagingState) {
            kotlin.jvm.internal.f0.p(loadType, "loadType");
            kotlin.jvm.internal.f0.p(pagingState, "pagingState");
            this.loadType = loadType;
            this.pagingState = pagingState;
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final LoadType getLoadType() {
            return this.loadType;
        }

        @dl.d
        public final PagingState<Key, Value> b() {
            return this.pagingState;
        }

        public final void c(@dl.d PagingState<Key, Value> pagingState) {
            kotlin.jvm.internal.f0.p(pagingState, "<set-?>");
            this.pagingState = pagingState;
        }
    }

    public AccessorState() {
        int length = LoadType.values().length;
        BlockState[] blockStateArr = new BlockState[length];
        for (int i10 = 0; i10 < length; i10++) {
            blockStateArr[i10] = BlockState.UNBLOCKED;
        }
        this.blockStates = blockStateArr;
        int length2 = LoadType.values().length;
        v.Error[] errorArr = new v.Error[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            errorArr[i11] = null;
        }
        this.errors = errorArr;
        this.pendingRequests = new kotlin.collections.i<>();
    }

    private final v f(LoadType loadType) {
        BlockState blockState = this.blockStates[loadType.ordinal()];
        kotlin.collections.i<a<Key, Value>> iVar = this.pendingRequests;
        boolean z10 = false;
        if (!(iVar instanceof Collection) || !iVar.isEmpty()) {
            Iterator<a<Key, Value>> it = iVar.iterator();
            while (it.hasNext()) {
                if (it.next().getLoadType() == loadType) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10 && blockState != BlockState.REQUIRES_REFRESH) {
            return v.Loading.f26654b;
        }
        v.Error error = this.errors[loadType.ordinal()];
        if (error != null) {
            return error;
        }
        int i10 = androidx.paging.a.f26362a[blockState.ordinal()];
        if (i10 == 1) {
            return v.NotLoading.INSTANCE.a();
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return v.NotLoading.INSTANCE.b();
    }

    public final boolean a(@dl.d LoadType loadType, @dl.d PagingState<Key, Value> pagingState) {
        a<Key, Value> next;
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        kotlin.jvm.internal.f0.p(pagingState, "pagingState");
        Iterator<a<Key, Value>> it = this.pendingRequests.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next.getLoadType() == loadType));
        a<Key, Value> aVar = next;
        if (aVar != null) {
            aVar.c(pagingState);
            return false;
        }
        BlockState blockState = this.blockStates[loadType.ordinal()];
        if (blockState == BlockState.REQUIRES_REFRESH && loadType != LoadType.REFRESH) {
            this.pendingRequests.add(new a<>(loadType, pagingState));
            return false;
        }
        if (blockState != BlockState.UNBLOCKED && loadType != LoadType.REFRESH) {
            return false;
        }
        LoadType loadType2 = LoadType.REFRESH;
        if (loadType == loadType2) {
            j(loadType2, null);
        }
        if (this.errors[loadType.ordinal()] == null) {
            return this.pendingRequests.add(new a<>(loadType, pagingState));
        }
        return false;
    }

    public final void b() {
        int length = this.errors.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.errors[i10] = null;
        }
    }

    public final void c(@dl.d final LoadType loadType) {
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        kotlin.collections.x.I0(this.pendingRequests, new yh.l<a<Key, Value>, Boolean>() { // from class: androidx.paging.AccessorState$clearPendingRequest$1
            {
                super(1);
            }

            public final boolean a(@dl.d AccessorState.a<Key, Value> it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return it.getLoadType() == loadType;
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return Boolean.valueOf(a((AccessorState.a) obj));
            }
        });
    }

    public final void d() {
        this.pendingRequests.clear();
    }

    @dl.d
    public final LoadStates e() {
        return new LoadStates(f(LoadType.REFRESH), f(LoadType.PREPEND), f(LoadType.APPEND));
    }

    @dl.e
    public final Pair<LoadType, PagingState<Key, Value>> g() {
        a<Key, Value> next;
        a<Key, Value> aVar;
        Iterator<a<Key, Value>> it = this.pendingRequests.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            aVar = next;
        } while (!(aVar.getLoadType() != LoadType.REFRESH && this.blockStates[aVar.getLoadType().ordinal()] == BlockState.UNBLOCKED));
        a<Key, Value> aVar2 = next;
        if (aVar2 != null) {
            return kotlin.c1.a(aVar2.getLoadType(), aVar2.b());
        }
        return null;
    }

    @dl.e
    public final PagingState<Key, Value> h() {
        a<Key, Value> next;
        Iterator<a<Key, Value>> it = this.pendingRequests.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next.getLoadType() == LoadType.REFRESH));
        a<Key, Value> aVar = next;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public final void i(@dl.d LoadType loadType, @dl.d BlockState state) {
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        kotlin.jvm.internal.f0.p(state, "state");
        this.blockStates[loadType.ordinal()] = state;
    }

    public final void j(@dl.d LoadType loadType, @dl.e v.Error error) {
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        this.errors[loadType.ordinal()] = error;
    }
}
