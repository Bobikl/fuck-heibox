package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.v1;

/* JADX INFO: compiled from: LegacyPagingSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 %*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001&B#\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\b#\u0010$J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007J-\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/paging/LegacyPagingSource;", "", "Key", "Value", "Landroidx/paging/q0;", "Landroidx/paging/q0$a;", "params", "", "l", "pageSize", "Lkotlin/b2;", "m", "Landroidx/paging/q0$b;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/paging/q0$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/t0;", "state", "f", "(Landroidx/paging/t0;)Ljava/lang/Object;", ak.aF, "I", "Lkotlinx/coroutines/CoroutineDispatcher;", "d", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetchDispatcher", "Landroidx/paging/DataSource;", "e", "Landroidx/paging/DataSource;", "k", "()Landroidx/paging/DataSource;", "dataSource", "", "b", "()Z", "jumpingSupported", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/DataSource;)V", "g", ak.av, "paging-common"}, k = 1, mv = {1, 4, 2})
public final class LegacyPagingSource<Key, Value> extends q0<Key, Value> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f25616f = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int pageSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher fetchDispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final DataSource<Key, Value> dataSource;

    /* JADX INFO: renamed from: androidx.paging.LegacyPagingSource$1, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyPagingSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Lkotlin/b2;", "i", "()V"}, k = 3, mv = {1, 4, 2})
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements yh.a<b2> {
        AnonymousClass1(LegacyPagingSource legacyPagingSource) {
            super(0, legacyPagingSource, LegacyPagingSource.class, "invalidate", "invalidate()V", 0);
        }

        public final void i() {
            ((LegacyPagingSource) this.receiver).g();
        }

        @Override // yh.a
        public /* bridge */ /* synthetic */ b2 invoke() {
            i();
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.LegacyPagingSource$3, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyPagingSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.LegacyPagingSource$3", f = "LegacyPagingSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25622b;

        AnonymousClass3(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            return new AnonymousClass3(completion);
        }

        @Override // yh.p
        public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.b.h();
            if (this.f25622b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            if (!LegacyPagingSource.this.a() && LegacyPagingSource.this.k().i()) {
                LegacyPagingSource.this.g();
            }
            return b2.f124493a;
        }
    }

    public LegacyPagingSource(@dl.d CoroutineDispatcher fetchDispatcher, @dl.d DataSource<Key, Value> dataSource) {
        kotlin.jvm.internal.f0.p(fetchDispatcher, "fetchDispatcher");
        kotlin.jvm.internal.f0.p(dataSource, "dataSource");
        this.fetchDispatcher = fetchDispatcher;
        this.dataSource = dataSource;
        this.pageSize = Integer.MIN_VALUE;
        dataSource.a(new s(new AnonymousClass1(this)));
        i(new yh.a<b2>() { // from class: androidx.paging.LegacyPagingSource.2

            /* JADX INFO: renamed from: androidx.paging.LegacyPagingSource$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: LegacyPagingSource.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Lkotlin/b2;", "i", "()V"}, k = 3, mv = {1, 4, 2})
            public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements yh.a<b2> {
                AnonymousClass1(LegacyPagingSource legacyPagingSource) {
                    super(0, legacyPagingSource, LegacyPagingSource.class, "invalidate", "invalidate()V", 0);
                }

                public final void i() {
                    ((LegacyPagingSource) this.receiver).g();
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    i();
                    return b2.f124493a;
                }
            }

            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LegacyPagingSource.this.k().o(new s(new AnonymousClass1(LegacyPagingSource.this)));
                LegacyPagingSource.this.k().g();
            }
        });
        kotlinx.coroutines.k.f(v1.f130503b, fetchDispatcher, null, new AnonymousClass3(null), 2, null);
    }

    private final int l(q0.a<Key> params) {
        return ((params instanceof q0.a.d) && params.getLoadSize() % 3 == 0) ? params.getLoadSize() / 3 : params.getLoadSize();
    }

    @Override // androidx.paging.q0
    public boolean b() {
        return this.dataSource.getType() == DataSource.KeyType.POSITIONAL;
    }

    @Override // androidx.paging.q0
    @dl.e
    public Key f(@dl.d PagingState<Key, Value> state) {
        Key keyM;
        Value valueC;
        kotlin.jvm.internal.f0.p(state, "state");
        int i10 = r.f26609a[this.dataSource.getType().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return null;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Integer anchorPosition = state.getAnchorPosition();
            if (anchorPosition == null || (valueC = state.c(anchorPosition.intValue())) == null) {
                return null;
            }
            return this.dataSource.b(valueC);
        }
        Integer anchorPosition2 = state.getAnchorPosition();
        if (anchorPosition2 == null) {
            return null;
        }
        int iIntValue = anchorPosition2.intValue();
        int size = iIntValue - ((PagingState) state).leadingPlaceholderCount;
        for (int i11 = 0; i11 < CollectionsKt__CollectionsKt.G(state.h()) && size > CollectionsKt__CollectionsKt.G(state.h().get(i11).i()); i11++) {
            size -= state.h().get(i11).i().size();
        }
        q0.b.Page<Key, Value> pageD = state.d(iIntValue);
        if (pageD == null || (keyM = pageD.m()) == null) {
            keyM = (Key) 0;
        }
        if (keyM != null) {
            return (Key) Integer.valueOf(keyM.intValue() + size);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [T, androidx.paging.DataSource$d] */
    @Override // androidx.paging.q0
    @dl.e
    public Object h(@dl.d q0.a<Key> aVar, @dl.d kotlin.coroutines.c<? super q0.b<Key, Value>> cVar) {
        LoadType loadType;
        if (aVar instanceof q0.a.d) {
            loadType = LoadType.REFRESH;
        } else if (aVar instanceof q0.a.C0204a) {
            loadType = LoadType.APPEND;
        } else {
            if (!(aVar instanceof q0.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            loadType = LoadType.PREPEND;
        }
        LoadType loadType2 = loadType;
        if (this.pageSize == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            this.pageSize = l(aVar);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = new DataSource.d(loadType2, aVar.a(), aVar.getLoadSize(), aVar.getPlaceholdersEnabled(), this.pageSize);
        return kotlinx.coroutines.i.h(this.fetchDispatcher, new LegacyPagingSource$load$2(this, objectRef, aVar, null), cVar);
    }

    @dl.d
    public final DataSource<Key, Value> k() {
        return this.dataSource;
    }

    public final void m(int i10) {
        int i11 = this.pageSize;
        if (i11 == Integer.MIN_VALUE || i10 == i11) {
            this.pageSize = i10;
            return;
        }
        throw new IllegalStateException(("Page size is already set to " + this.pageSize + lg.a.f131414g).toString());
    }
}
