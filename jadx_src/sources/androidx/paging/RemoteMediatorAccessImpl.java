package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: RemoteMediatorAccessor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 %*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u000fB#\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b#\u0010$J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J$\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0016J\u001c\u0010\r\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0016J\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/paging/RemoteMediatorAccessImpl;", "", "Key", "Value", "Landroidx/paging/x0;", "Lkotlin/b2;", "i", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/t0;", "pagingState", ak.aF, "b", "Landroidx/paging/RemoteMediator$InitializeAction;", ak.av, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/b;", "Landroidx/paging/b;", "accessorState", "Landroidx/paging/SingleRunner;", "Landroidx/paging/SingleRunner;", "isolationRunner", "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/q0;", "scope", "Landroidx/paging/RemoteMediator;", "d", "Landroidx/paging/RemoteMediator;", "remoteMediator", "Lkotlinx/coroutines/flow/u;", "Landroidx/paging/x;", "getState", "()Lkotlinx/coroutines/flow/u;", "state", "<init>", "(Lkotlinx/coroutines/q0;Landroidx/paging/RemoteMediator;)V", "g", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class RemoteMediatorAccessImpl<Key, Value> implements x0<Key, Value> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f26207e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f26208f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<Key, Value> accessorState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SingleRunner isolationRunner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kotlinx.coroutines.q0 scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final RemoteMediator<Key, Value> remoteMediator;

    public RemoteMediatorAccessImpl(@dl.d kotlinx.coroutines.q0 scope, @dl.d RemoteMediator<Key, Value> remoteMediator) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        kotlin.jvm.internal.f0.p(remoteMediator, "remoteMediator");
        this.scope = scope;
        this.remoteMediator = remoteMediator;
        this.accessorState = new b<>();
        this.isolationRunner = new SingleRunner(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        kotlinx.coroutines.k.f(this.scope, null, null, new RemoteMediatorAccessImpl$launchBoundary$1(this, null), 3, null);
    }

    private final void i() {
        kotlinx.coroutines.k.f(this.scope, null, null, new RemoteMediatorAccessImpl$launchRefresh$1(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.paging.x0
    @dl.e
    public Object a(@dl.d kotlin.coroutines.c<? super RemoteMediator.InitializeAction> cVar) throws Throwable {
        RemoteMediatorAccessImpl$initialize$1 remoteMediatorAccessImpl$initialize$1;
        RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl;
        if (cVar instanceof RemoteMediatorAccessImpl$initialize$1) {
            remoteMediatorAccessImpl$initialize$1 = (RemoteMediatorAccessImpl$initialize$1) cVar;
            int i10 = remoteMediatorAccessImpl$initialize$1.f26215c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                remoteMediatorAccessImpl$initialize$1.f26215c = i10 - Integer.MIN_VALUE;
            } else {
                remoteMediatorAccessImpl$initialize$1 = new RemoteMediatorAccessImpl$initialize$1(this, cVar);
            }
        } else {
            remoteMediatorAccessImpl$initialize$1 = new RemoteMediatorAccessImpl$initialize$1(this, cVar);
        }
        Object objA = remoteMediatorAccessImpl$initialize$1.f26214b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = remoteMediatorAccessImpl$initialize$1.f26215c;
        if (i11 == 0) {
            kotlin.t0.n(objA);
            RemoteMediator<Key, Value> remoteMediator = this.remoteMediator;
            remoteMediatorAccessImpl$initialize$1.f26217e = this;
            remoteMediatorAccessImpl$initialize$1.f26215c = 1;
            objA = remoteMediator.a(remoteMediatorAccessImpl$initialize$1);
            if (objA == objH) {
                return objH;
            }
            remoteMediatorAccessImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteMediatorAccessImpl = (RemoteMediatorAccessImpl) remoteMediatorAccessImpl$initialize$1.f26217e;
            kotlin.t0.n(objA);
        }
        if (((RemoteMediator.InitializeAction) objA) == RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH) {
            remoteMediatorAccessImpl.accessorState.b(new yh.l<AccessorState<Key, Value>, b2>() { // from class: androidx.paging.RemoteMediatorAccessImpl$initialize$2$1
                public final void a(@dl.d AccessorState<Key, Value> it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    LoadType loadType = LoadType.APPEND;
                    AccessorState.BlockState blockState = AccessorState.BlockState.REQUIRES_REFRESH;
                    it.i(loadType, blockState);
                    it.i(LoadType.PREPEND, blockState);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
                    a((AccessorState) obj);
                    return b2.f124493a;
                }
            });
        }
        return objA;
    }

    @Override // androidx.paging.z0
    public void b(@dl.d PagingState<Key, Value> pagingState) {
        kotlin.jvm.internal.f0.p(pagingState, "pagingState");
        final ArrayList arrayList = new ArrayList();
        this.accessorState.b(new yh.l<AccessorState<Key, Value>, b2>() { // from class: androidx.paging.RemoteMediatorAccessImpl$retryFailed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d AccessorState<Key, Value> accessorState) {
                kotlin.jvm.internal.f0.p(accessorState, "accessorState");
                LoadStates loadStatesE = accessorState.e();
                boolean z10 = loadStatesE.k() instanceof v.Error;
                accessorState.b();
                if (z10) {
                    List list = arrayList;
                    LoadType loadType = LoadType.REFRESH;
                    list.add(loadType);
                    accessorState.i(loadType, AccessorState.BlockState.UNBLOCKED);
                }
                if (loadStatesE.i() instanceof v.Error) {
                    if (!z10) {
                        arrayList.add(LoadType.APPEND);
                    }
                    accessorState.c(LoadType.APPEND);
                }
                if (loadStatesE.j() instanceof v.Error) {
                    if (!z10) {
                        arrayList.add(LoadType.PREPEND);
                    }
                    accessorState.c(LoadType.PREPEND);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
                a((AccessorState) obj);
                return b2.f124493a;
            }
        });
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c((LoadType) it.next(), pagingState);
        }
    }

    @Override // androidx.paging.z0
    public void c(@dl.d final LoadType loadType, @dl.d final PagingState<Key, Value> pagingState) {
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        kotlin.jvm.internal.f0.p(pagingState, "pagingState");
        if (((Boolean) this.accessorState.b(new yh.l<AccessorState<Key, Value>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$requestLoad$newRequest$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final boolean a(@dl.d AccessorState<Key, Value> it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return it.a(loadType, pagingState);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return Boolean.valueOf(a((AccessorState) obj));
            }
        })).booleanValue()) {
            if (w0.f26664a[loadType.ordinal()] != 1) {
                h();
            } else {
                i();
            }
        }
    }

    @Override // androidx.paging.x0
    @dl.d
    public kotlinx.coroutines.flow.u<LoadStates> getState() {
        return this.accessorState.a();
    }
}
