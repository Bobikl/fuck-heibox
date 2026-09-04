package androidx.paging;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 implements kotlinx.coroutines.flow.f<b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4 f25864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.q0 f25865c;

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1", "emit"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 13, 13, 13, 13, 14, 14, 15, 15, 15}, l = {140, 162, 155, 180, bb.c.b.f30828o0, 195, bb.c.b.f30645g1, 155, bb.c.b.f30919s1, bb.c.b.f30828o0, bb.c.b.E1, 251, 155, 263, bb.c.b.f30828o0, bb.c.b.f30853p2}, m = "emit", n = {"this", "this_$iv", "$this$withLock$iv$iv", "this", "loadType", "this_$iv", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "this_$iv", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "this_$iv", "this", "this_$iv", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "this_$iv", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "this_$iv", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "this_$iv", "this", "this_$iv", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "this_$iv", "$this$withLock$iv$iv", "this", "loadType", "$this$withLock$iv$iv", "this", "loadType", "this_$iv", "$this$withLock$iv$iv", "this", "loadType", "this", "this_$iv", "$this$withLock$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25867c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f25869e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f25870f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f25871g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f25872h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f25873i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f25874j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f25875k;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f25866b = obj;
            this.f25867c |= Integer.MIN_VALUE;
            return PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1(PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4 anonymousClass4, kotlinx.coroutines.q0 q0Var) {
        this.f25864b = anonymousClass4;
        this.f25865c = q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x033b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:102:0x033c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0349  */
    /* JADX WARN: Code duplicated, block: B:110:0x035c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0382 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:113:0x0383  */
    /* JADX WARN: Code duplicated, block: B:119:0x039e  */
    /* JADX WARN: Code duplicated, block: B:122:0x03b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:123:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:126:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:128:0x03e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:132:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:137:0x0408 A[PHI: r5 r12
  0x0408: PHI (r5v49 androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) = 
  (r5v23 androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1)
  (r5v50 androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1)
 binds: [B:91:0x02ef, B:136:0x0407] A[DONT_GENERATE, DONT_INLINE]
  0x0408: PHI (r12v59 androidx.paging.x) = (r12v33 androidx.paging.x), (r12v67 androidx.paging.x) binds: [B:91:0x02ef, B:136:0x0407] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:140:0x0414  */
    /* JADX WARN: Code duplicated, block: B:142:0x0418  */
    /* JADX WARN: Code duplicated, block: B:144:0x0438 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:147:0x0455 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:148:0x0456  */
    /* JADX WARN: Code duplicated, block: B:153:0x0461  */
    /* JADX WARN: Code duplicated, block: B:156:0x0473  */
    /* JADX WARN: Code duplicated, block: B:158:0x0497 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:159:0x0498  */
    /* JADX WARN: Code duplicated, block: B:165:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:168:0x04ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:169:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:172:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:174:0x04f2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:175:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:179:0x050b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0219  */
    /* JADX WARN: Code duplicated, block: B:60:0x022a  */
    /* JADX WARN: Code duplicated, block: B:63:0x023e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0263 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0264  */
    /* JADX WARN: Code duplicated, block: B:72:0x027f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0299 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x029a  */
    /* JADX WARN: Code duplicated, block: B:79:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x02bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:90:0x02e7 A[PHI: r5 r12
  0x02e7: PHI (r5v23 androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) = 
  (r5v1 androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1)
  (r5v25 androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1)
 binds: [B:58:0x0226, B:89:0x02e6] A[DONT_GENERATE, DONT_INLINE]
  0x02e7: PHI (r12v33 androidx.paging.x) = (r12v11 androidx.paging.x), (r12v34 androidx.paging.x) binds: [B:58:0x0226, B:89:0x02e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:95:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:97:0x0318 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:98:0x0319  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.b2] */
    /* JADX WARN: Type inference failed for: r12v105 */
    /* JADX WARN: Type inference failed for: r12v106 */
    /* JADX WARN: Type inference failed for: r12v2, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARN: Type inference failed for: r12v79, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARN: Type inference failed for: r2v18, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARN: Type inference failed for: r2v48, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(b2 b2Var, @dl.d kotlin.coroutines.c cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        PageFetcherSnapshotState.Holder holder;
        kotlinx.coroutines.sync.c cVar2;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
        LoadStates loadStates;
        PagingState pagingState;
        z0 z0VarV;
        LoadType loadType;
        LoadType loadType2;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
        LoadType loadType3;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$3;
        LoadStates loadStates2;
        PageFetcherSnapshot pageFetcherSnapshot;
        f1 f1Var;
        LoadStates loadStates3;
        LoadType loadType4;
        PageFetcherSnapshotState.Holder holder2;
        kotlinx.coroutines.sync.c cVar3;
        LoadType loadType5;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
        PageFetcherSnapshotState.Holder holder3;
        kotlinx.coroutines.sync.c cVar4;
        LoadType loadType6;
        LoadType loadType7;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
        PageFetcherSnapshotState.Holder holder4;
        kotlinx.coroutines.sync.c cVar5;
        PageFetcherSnapshotState.Holder holder5;
        kotlinx.coroutines.sync.c cVar6;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
        v vVarH;
        PageFetcherSnapshotState pageFetcherSnapshotState;
        PageFetcherSnapshot pageFetcherSnapshot2;
        LoadType loadType8;
        LoadStates loadStates4;
        PageFetcherSnapshot pageFetcherSnapshot3;
        f1 f1Var2;
        LoadStates loadStates5;
        LoadType loadType9;
        PageFetcherSnapshotState.Holder holder6;
        kotlinx.coroutines.sync.c cVar7;
        LoadType loadType10;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
        PageFetcherSnapshotState.Holder holder7;
        kotlinx.coroutines.sync.c cVar8;
        LoadType loadType11;
        LoadType loadType12;
        PageFetcherSnapshotState.Holder holder8;
        kotlinx.coroutines.sync.c cVar9;
        v vVarH2;
        kotlinx.coroutines.sync.c cVar10;
        PageFetcherSnapshotState pageFetcherSnapshotState2;
        PageFetcherSnapshot pageFetcherSnapshot4;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
        PageFetcherSnapshot pageFetcherSnapshot5;
        PageFetcherSnapshot pageFetcherSnapshot6;
        LoadType loadType13;
        LoadType loadType14;
        f1 f1Var3;
        PageFetcherSnapshotState.Holder holder9;
        kotlinx.coroutines.sync.c cVar11;
        LoadType loadType15;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
        PageFetcherSnapshotState.Holder holder10;
        kotlinx.coroutines.sync.c cVar12;
        PageFetcherSnapshotState.Holder holder11;
        kotlinx.coroutines.sync.c cVar13;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10;
        v vVarH3;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f25867c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f25867c = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.f25866b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        ?? r10 = anonymousClass1.f25867c;
        try {
            try {
                try {
                    switch (r10) {
                        case 0:
                            kotlin.t0.n(obj);
                            holder = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                            cVar2 = holder.lock;
                            anonymousClass1.f25869e = this;
                            anonymousClass1.f25870f = holder;
                            anonymousClass1.f25871g = cVar2;
                            anonymousClass1.f25867c = 1;
                            if (cVar2.e(null, anonymousClass1) == objH) {
                                return objH;
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = this;
                            try {
                                PageFetcherSnapshotState pageFetcherSnapshotState3 = holder.state;
                                Pair pairA = kotlin.c1.a(pageFetcherSnapshotState3.getSourceLoadStates(), pageFetcherSnapshotState3.i(PageFetcherSnapshot$pageEventFlow$1.this.f25848g.lastHint));
                                cVar2.f(null);
                                loadStates = (LoadStates) pairA.a();
                                pagingState = (PagingState) pairA.b();
                                z0VarV = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.v();
                                if (z0VarV != null) {
                                    z0VarV.b(pagingState);
                                    b2 b2Var2 = b2.f124493a;
                                }
                                loadType = LoadType.REFRESH;
                                if (!(loadStates.k() instanceof v.Error)) {
                                    loadType6 = LoadType.PREPEND;
                                    if (loadStates.j() instanceof v.Error) {
                                        if (loadType6 != LoadType.REFRESH) {
                                            holder4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                            cVar5 = holder4.lock;
                                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                            anonymousClass1.f25870f = loadType6;
                                            anonymousClass1.f25871g = holder4;
                                            anonymousClass1.f25872h = cVar5;
                                            anonymousClass1.f25873i = loadStates;
                                            anonymousClass1.f25867c = 7;
                                            if (cVar5.e(null, anonymousClass1) == objH) {
                                                return objH;
                                            }
                                            PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$11 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                            holder5 = holder4;
                                            cVar6 = cVar5;
                                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$11;
                                            pageFetcherSnapshotState = holder5.state;
                                            pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                            anonymousClass1.f25870f = loadType6;
                                            anonymousClass1.f25871g = cVar6;
                                            anonymousClass1.f25872h = loadStates;
                                            anonymousClass1.f25873i = null;
                                            anonymousClass1.f25867c = 8;
                                            if (pageFetcherSnapshot2.z(pageFetcherSnapshotState, loadType6, anonymousClass1) == objH) {
                                                return objH;
                                            }
                                            loadType8 = loadType6;
                                            r10 = cVar6;
                                            b2 b2Var3 = b2.f124493a;
                                            r10.f(null);
                                            loadType7 = loadType8;
                                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                        } else {
                                            loadType7 = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        }
                                        loadStates4 = loadStates;
                                        pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                        if (f0.f26408a[loadType7.ordinal()] != 1) {
                                            holder6 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                            cVar7 = holder6.lock;
                                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                            anonymousClass1.f25870f = loadType7;
                                            anonymousClass1.f25871g = holder6;
                                            anonymousClass1.f25872h = cVar7;
                                            anonymousClass1.f25873i = loadStates4;
                                            anonymousClass1.f25874j = loadType7;
                                            anonymousClass1.f25875k = pageFetcherSnapshot3;
                                            anonymousClass1.f25867c = 9;
                                            if (cVar7.e(null, anonymousClass1) == objH) {
                                                return objH;
                                            }
                                            loadType10 = loadType7;
                                            try {
                                                f1Var2 = holder6.state.m().get(loadType10);
                                                cVar7.f(null);
                                                loadStates5 = loadStates4;
                                                loadType9 = loadType7;
                                                loadType7 = loadType10;
                                            } catch (Throwable th2) {
                                                cVar7.f(null);
                                                throw th2;
                                            }
                                        } else {
                                            f1Var2 = null;
                                            loadStates5 = loadStates4;
                                            loadType9 = loadType7;
                                        }
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                        anonymousClass1.f25870f = loadType7;
                                        anonymousClass1.f25871g = loadStates5;
                                        anonymousClass1.f25872h = null;
                                        anonymousClass1.f25873i = null;
                                        anonymousClass1.f25874j = null;
                                        anonymousClass1.f25875k = null;
                                        anonymousClass1.f25867c = 10;
                                        if (pageFetcherSnapshot3.y(loadType9, f1Var2, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadStates = loadStates5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                        if (loadType7 == LoadType.REFRESH) {
                                            holder7 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                            cVar8 = holder7.lock;
                                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                            anonymousClass1.f25870f = holder7;
                                            anonymousClass1.f25871g = cVar8;
                                            anonymousClass1.f25872h = loadStates;
                                            anonymousClass1.f25867c = 11;
                                            if (cVar8.e(null, anonymousClass1) == objH) {
                                                return objH;
                                            }
                                            try {
                                                vVarH2 = holder7.state.getSourceLoadStates().h(LoadType.REFRESH);
                                                cVar8.f(null);
                                                if (!(vVarH2 instanceof v.Error)) {
                                                    PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.f25865c);
                                                }
                                            } catch (Throwable th3) {
                                                cVar8.f(null);
                                                throw th3;
                                            }
                                        }
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                    }
                                    return b2.f124493a;
                                }
                                loadType2 = loadType;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                loadStates2 = loadStates;
                                pageFetcherSnapshot = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                if (f0.f26408a[loadType2.ordinal()] != 1) {
                                    holder2 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar3 = holder2.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                                    anonymousClass1.f25870f = loadType2;
                                    anonymousClass1.f25871g = holder2;
                                    anonymousClass1.f25872h = cVar3;
                                    anonymousClass1.f25873i = loadStates2;
                                    anonymousClass1.f25874j = loadType2;
                                    anonymousClass1.f25875k = pageFetcherSnapshot;
                                    anonymousClass1.f25867c = 4;
                                    if (cVar3.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType5 = loadType2;
                                    try {
                                        f1Var = holder2.state.m().get(loadType5);
                                        cVar3.f(null);
                                        loadStates3 = loadStates2;
                                        loadType4 = loadType2;
                                        loadType2 = loadType5;
                                    } catch (Throwable th4) {
                                        cVar3.f(null);
                                        throw th4;
                                    }
                                } else {
                                    f1Var = null;
                                    loadStates3 = loadStates2;
                                    loadType4 = loadType2;
                                }
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                                anonymousClass1.f25870f = loadType2;
                                anonymousClass1.f25871g = loadStates3;
                                anonymousClass1.f25872h = null;
                                anonymousClass1.f25873i = null;
                                anonymousClass1.f25874j = null;
                                anonymousClass1.f25875k = null;
                                anonymousClass1.f25867c = 5;
                                if (pageFetcherSnapshot.y(loadType4, f1Var, anonymousClass1) == objH) {
                                    return objH;
                                }
                                loadStates = loadStates3;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                                if (loadType2 == LoadType.REFRESH) {
                                    holder3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar4 = holder3.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                                    anonymousClass1.f25870f = holder3;
                                    anonymousClass1.f25871g = cVar4;
                                    anonymousClass1.f25872h = loadStates;
                                    anonymousClass1.f25867c = 6;
                                    if (cVar4.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    try {
                                        vVarH = holder3.state.getSourceLoadStates().h(LoadType.REFRESH);
                                        cVar4.f(null);
                                        if (!(vVarH instanceof v.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4.f25865c);
                                        }
                                    } catch (Throwable th5) {
                                        cVar4.f(null);
                                        throw th5;
                                    }
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                                loadType6 = LoadType.PREPEND;
                                if (loadStates.j() instanceof v.Error) {
                                    if (loadType6 != LoadType.REFRESH) {
                                        holder4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar5 = holder4.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType6;
                                        anonymousClass1.f25871g = holder4;
                                        anonymousClass1.f25872h = cVar5;
                                        anonymousClass1.f25873i = loadStates;
                                        anonymousClass1.f25867c = 7;
                                        if (cVar5.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$12 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        holder5 = holder4;
                                        cVar6 = cVar5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$12;
                                        pageFetcherSnapshotState = holder5.state;
                                        pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                        anonymousClass1.f25870f = loadType6;
                                        anonymousClass1.f25871g = cVar6;
                                        anonymousClass1.f25872h = loadStates;
                                        anonymousClass1.f25873i = null;
                                        anonymousClass1.f25867c = 8;
                                        if (pageFetcherSnapshot2.z(pageFetcherSnapshotState, loadType6, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType8 = loadType6;
                                        r10 = cVar6;
                                        b2 b2Var4 = b2.f124493a;
                                        r10.f(null);
                                        loadType7 = loadType8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    } else {
                                        loadType7 = loadType6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    }
                                    loadStates4 = loadStates;
                                    pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    if (f0.f26408a[loadType7.ordinal()] != 1) {
                                        holder6 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar7 = holder6.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                        anonymousClass1.f25870f = loadType7;
                                        anonymousClass1.f25871g = holder6;
                                        anonymousClass1.f25872h = cVar7;
                                        anonymousClass1.f25873i = loadStates4;
                                        anonymousClass1.f25874j = loadType7;
                                        anonymousClass1.f25875k = pageFetcherSnapshot3;
                                        anonymousClass1.f25867c = 9;
                                        if (cVar7.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType10 = loadType7;
                                        f1Var2 = holder6.state.m().get(loadType10);
                                        cVar7.f(null);
                                        loadStates5 = loadStates4;
                                        loadType9 = loadType7;
                                        loadType7 = loadType10;
                                    } else {
                                        f1Var2 = null;
                                        loadStates5 = loadStates4;
                                        loadType9 = loadType7;
                                    }
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.f25870f = loadType7;
                                    anonymousClass1.f25871g = loadStates5;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25874j = null;
                                    anonymousClass1.f25875k = null;
                                    anonymousClass1.f25867c = 10;
                                    if (pageFetcherSnapshot3.y(loadType9, f1Var2, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadStates = loadStates5;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    if (loadType7 == LoadType.REFRESH) {
                                        holder7 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar8 = holder7.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                        anonymousClass1.f25870f = holder7;
                                        anonymousClass1.f25871g = cVar8;
                                        anonymousClass1.f25872h = loadStates;
                                        anonymousClass1.f25867c = 11;
                                        if (cVar8.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        vVarH2 = holder7.state.getSourceLoadStates().h(LoadType.REFRESH);
                                        cVar8.f(null);
                                        if (!(vVarH2 instanceof v.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.f25865c);
                                        }
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                }
                                return b2.f124493a;
                                loadType11 = LoadType.APPEND;
                                if (loadStates.i() instanceof v.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar9 = holder8.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = holder8;
                                        anonymousClass1.f25872h = cVar9;
                                        anonymousClass1.f25867c = 12;
                                        if (cVar9.e(null, anonymousClass1) == objH) {
                                            cVar10 = cVar9;
                                            return objH;
                                        }
                                        cVar10 = cVar9;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = cVar10;
                                        anonymousClass1.f25872h = null;
                                        anonymousClass1.f25867c = 13;
                                        if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType12 = loadType11;
                                        b2Var = cVar10;
                                        b2 b2Var5 = b2.f124493a;
                                        b2Var.f(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    if (f0.f26408a[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar11 = holder9.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.f25870f = loadType12;
                                        anonymousClass1.f25871g = holder9;
                                        anonymousClass1.f25872h = cVar11;
                                        anonymousClass1.f25873i = loadType12;
                                        anonymousClass1.f25874j = pageFetcherSnapshot5;
                                        anonymousClass1.f25867c = 14;
                                        if (cVar11.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType15 = loadType12;
                                        try {
                                            f1 f1Var4 = holder9.state.m().get(loadType15);
                                            cVar11.f(null);
                                            loadType14 = loadType12;
                                            f1Var3 = f1Var4;
                                            pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                            loadType13 = loadType15;
                                        } catch (Throwable th6) {
                                            cVar11.f(null);
                                            throw th6;
                                        }
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        f1Var3 = null;
                                    }
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType13;
                                    anonymousClass1.f25871g = null;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25874j = null;
                                    anonymousClass1.f25867c = 15;
                                    if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar12 = holder10.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.f25870f = holder10;
                                        anonymousClass1.f25871g = cVar12;
                                        anonymousClass1.f25867c = 16;
                                        if (cVar12.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        holder11 = holder10;
                                        cVar13 = cVar12;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        try {
                                            vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                            cVar13.f(null);
                                            if (!(vVarH3 instanceof v.Error)) {
                                                PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                            }
                                        } catch (Throwable th7) {
                                            cVar13.f(null);
                                            throw th7;
                                        }
                                    }
                                }
                                return b2.f124493a;
                            } catch (Throwable th8) {
                                cVar2.f(null);
                                throw th8;
                            }
                        case 1:
                            cVar2 = (kotlinx.coroutines.sync.c) anonymousClass1.f25871g;
                            holder = (PageFetcherSnapshotState.Holder) anonymousClass1.f25870f;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            PageFetcherSnapshotState pageFetcherSnapshotState4 = holder.state;
                            Pair pairA2 = kotlin.c1.a(pageFetcherSnapshotState4.getSourceLoadStates(), pageFetcherSnapshotState4.i(PageFetcherSnapshot$pageEventFlow$1.this.f25848g.lastHint));
                            cVar2.f(null);
                            loadStates = (LoadStates) pairA2.a();
                            pagingState = (PagingState) pairA2.b();
                            z0VarV = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.v();
                            if (z0VarV != null) {
                                z0VarV.b(pagingState);
                                b2 b2Var6 = b2.f124493a;
                            }
                            loadType = LoadType.REFRESH;
                            if (!(loadStates.k() instanceof v.Error)) {
                                loadType6 = LoadType.PREPEND;
                                if (loadStates.j() instanceof v.Error) {
                                    if (loadType6 != LoadType.REFRESH) {
                                        holder4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar5 = holder4.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType6;
                                        anonymousClass1.f25871g = holder4;
                                        anonymousClass1.f25872h = cVar5;
                                        anonymousClass1.f25873i = loadStates;
                                        anonymousClass1.f25867c = 7;
                                        if (cVar5.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$13 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        holder5 = holder4;
                                        cVar6 = cVar5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$13;
                                        pageFetcherSnapshotState = holder5.state;
                                        pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                        anonymousClass1.f25870f = loadType6;
                                        anonymousClass1.f25871g = cVar6;
                                        anonymousClass1.f25872h = loadStates;
                                        anonymousClass1.f25873i = null;
                                        anonymousClass1.f25867c = 8;
                                        if (pageFetcherSnapshot2.z(pageFetcherSnapshotState, loadType6, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType8 = loadType6;
                                        r10 = cVar6;
                                        b2 b2Var7 = b2.f124493a;
                                        r10.f(null);
                                        loadType7 = loadType8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    } else {
                                        loadType7 = loadType6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    }
                                    loadStates4 = loadStates;
                                    pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    if (f0.f26408a[loadType7.ordinal()] != 1) {
                                        holder6 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar7 = holder6.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                        anonymousClass1.f25870f = loadType7;
                                        anonymousClass1.f25871g = holder6;
                                        anonymousClass1.f25872h = cVar7;
                                        anonymousClass1.f25873i = loadStates4;
                                        anonymousClass1.f25874j = loadType7;
                                        anonymousClass1.f25875k = pageFetcherSnapshot3;
                                        anonymousClass1.f25867c = 9;
                                        if (cVar7.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType10 = loadType7;
                                        f1Var2 = holder6.state.m().get(loadType10);
                                        cVar7.f(null);
                                        loadStates5 = loadStates4;
                                        loadType9 = loadType7;
                                        loadType7 = loadType10;
                                    } else {
                                        f1Var2 = null;
                                        loadStates5 = loadStates4;
                                        loadType9 = loadType7;
                                    }
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.f25870f = loadType7;
                                    anonymousClass1.f25871g = loadStates5;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25874j = null;
                                    anonymousClass1.f25875k = null;
                                    anonymousClass1.f25867c = 10;
                                    if (pageFetcherSnapshot3.y(loadType9, f1Var2, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadStates = loadStates5;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    if (loadType7 == LoadType.REFRESH) {
                                        holder7 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar8 = holder7.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                        anonymousClass1.f25870f = holder7;
                                        anonymousClass1.f25871g = cVar8;
                                        anonymousClass1.f25872h = loadStates;
                                        anonymousClass1.f25867c = 11;
                                        if (cVar8.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        vVarH2 = holder7.state.getSourceLoadStates().h(LoadType.REFRESH);
                                        cVar8.f(null);
                                        if (!(vVarH2 instanceof v.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.f25865c);
                                        }
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                }
                                return b2.f124493a;
                            }
                            loadType2 = loadType;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                            loadStates2 = loadStates;
                            pageFetcherSnapshot = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                            if (f0.f26408a[loadType2.ordinal()] != 1) {
                                holder2 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar3 = holder2.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                                anonymousClass1.f25870f = loadType2;
                                anonymousClass1.f25871g = holder2;
                                anonymousClass1.f25872h = cVar3;
                                anonymousClass1.f25873i = loadStates2;
                                anonymousClass1.f25874j = loadType2;
                                anonymousClass1.f25875k = pageFetcherSnapshot;
                                anonymousClass1.f25867c = 4;
                                if (cVar3.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                loadType5 = loadType2;
                                f1Var = holder2.state.m().get(loadType5);
                                cVar3.f(null);
                                loadStates3 = loadStates2;
                                loadType4 = loadType2;
                                loadType2 = loadType5;
                            } else {
                                f1Var = null;
                                loadStates3 = loadStates2;
                                loadType4 = loadType2;
                            }
                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            anonymousClass1.f25870f = loadType2;
                            anonymousClass1.f25871g = loadStates3;
                            anonymousClass1.f25872h = null;
                            anonymousClass1.f25873i = null;
                            anonymousClass1.f25874j = null;
                            anonymousClass1.f25875k = null;
                            anonymousClass1.f25867c = 5;
                            if (pageFetcherSnapshot.y(loadType4, f1Var, anonymousClass1) == objH) {
                                return objH;
                            }
                            loadStates = loadStates3;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            if (loadType2 == LoadType.REFRESH) {
                                holder3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar4 = holder3.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                                anonymousClass1.f25870f = holder3;
                                anonymousClass1.f25871g = cVar4;
                                anonymousClass1.f25872h = loadStates;
                                anonymousClass1.f25867c = 6;
                                if (cVar4.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                vVarH = holder3.state.getSourceLoadStates().h(LoadType.REFRESH);
                                cVar4.f(null);
                                if (!(vVarH instanceof v.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4.f25865c);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                            loadType6 = LoadType.PREPEND;
                            if (loadStates.j() instanceof v.Error) {
                                if (loadType6 != LoadType.REFRESH) {
                                    holder4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar5 = holder4.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType6;
                                    anonymousClass1.f25871g = holder4;
                                    anonymousClass1.f25872h = cVar5;
                                    anonymousClass1.f25873i = loadStates;
                                    anonymousClass1.f25867c = 7;
                                    if (cVar5.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$14 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    holder5 = holder4;
                                    cVar6 = cVar5;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$14;
                                    pageFetcherSnapshotState = holder5.state;
                                    pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    anonymousClass1.f25870f = loadType6;
                                    anonymousClass1.f25871g = cVar6;
                                    anonymousClass1.f25872h = loadStates;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25867c = 8;
                                    if (pageFetcherSnapshot2.z(pageFetcherSnapshotState, loadType6, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType8 = loadType6;
                                    r10 = cVar6;
                                    b2 b2Var8 = b2.f124493a;
                                    r10.f(null);
                                    loadType7 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                } else {
                                    loadType7 = loadType6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                }
                                loadStates4 = loadStates;
                                pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                if (f0.f26408a[loadType7.ordinal()] != 1) {
                                    holder6 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar7 = holder6.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.f25870f = loadType7;
                                    anonymousClass1.f25871g = holder6;
                                    anonymousClass1.f25872h = cVar7;
                                    anonymousClass1.f25873i = loadStates4;
                                    anonymousClass1.f25874j = loadType7;
                                    anonymousClass1.f25875k = pageFetcherSnapshot3;
                                    anonymousClass1.f25867c = 9;
                                    if (cVar7.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType10 = loadType7;
                                    f1Var2 = holder6.state.m().get(loadType10);
                                    cVar7.f(null);
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                    loadType7 = loadType10;
                                } else {
                                    f1Var2 = null;
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                }
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.f25870f = loadType7;
                                anonymousClass1.f25871g = loadStates5;
                                anonymousClass1.f25872h = null;
                                anonymousClass1.f25873i = null;
                                anonymousClass1.f25874j = null;
                                anonymousClass1.f25875k = null;
                                anonymousClass1.f25867c = 10;
                                if (pageFetcherSnapshot3.y(loadType9, f1Var2, anonymousClass1) == objH) {
                                    return objH;
                                }
                                loadStates = loadStates5;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                if (loadType7 == LoadType.REFRESH) {
                                    holder7 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar8 = holder7.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                    anonymousClass1.f25870f = holder7;
                                    anonymousClass1.f25871g = cVar8;
                                    anonymousClass1.f25872h = loadStates;
                                    anonymousClass1.f25867c = 11;
                                    if (cVar8.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    vVarH2 = holder7.state.getSourceLoadStates().h(LoadType.REFRESH);
                                    cVar8.f(null);
                                    if (!(vVarH2 instanceof v.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.f25865c);
                                    }
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                            }
                            return b2.f124493a;
                            loadType11 = LoadType.APPEND;
                            if (loadStates.i() instanceof v.Error) {
                                if (loadType11 != LoadType.REFRESH) {
                                    holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar9 = holder8.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType11;
                                    anonymousClass1.f25871g = holder8;
                                    anonymousClass1.f25872h = cVar9;
                                    anonymousClass1.f25867c = 12;
                                    if (cVar9.e(null, anonymousClass1) == objH) {
                                        cVar10 = cVar9;
                                        return objH;
                                    }
                                    cVar10 = cVar9;
                                    pageFetcherSnapshotState2 = holder8.state;
                                    pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType11;
                                    anonymousClass1.f25871g = cVar10;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25867c = 13;
                                    if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType12 = loadType11;
                                    b2Var = cVar10;
                                    b2 b2Var9 = b2.f124493a;
                                    b2Var.f(null);
                                } else {
                                    loadType12 = loadType11;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                if (f0.f26408a[loadType12.ordinal()] != 1) {
                                    holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar11 = holder9.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType12;
                                    anonymousClass1.f25871g = holder9;
                                    anonymousClass1.f25872h = cVar11;
                                    anonymousClass1.f25873i = loadType12;
                                    anonymousClass1.f25874j = pageFetcherSnapshot5;
                                    anonymousClass1.f25867c = 14;
                                    if (cVar11.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType15 = loadType12;
                                    f1 f1Var5 = holder9.state.m().get(loadType15);
                                    cVar11.f(null);
                                    loadType14 = loadType12;
                                    f1Var3 = f1Var5;
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType15;
                                } else {
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType12;
                                    loadType14 = loadType13;
                                    f1Var3 = null;
                                }
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.f25870f = loadType13;
                                anonymousClass1.f25871g = null;
                                anonymousClass1.f25872h = null;
                                anonymousClass1.f25873i = null;
                                anonymousClass1.f25874j = null;
                                anonymousClass1.f25867c = 15;
                                if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                    return objH;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                if (loadType13 == LoadType.REFRESH) {
                                    holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar12 = holder10.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    anonymousClass1.f25870f = holder10;
                                    anonymousClass1.f25871g = cVar12;
                                    anonymousClass1.f25867c = 16;
                                    if (cVar12.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    holder11 = holder10;
                                    cVar13 = cVar12;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                    cVar13.f(null);
                                    if (!(vVarH3 instanceof v.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                    }
                                }
                            }
                            return b2.f124493a;
                        case 2:
                            loadStates = (LoadStates) anonymousClass1.f25873i;
                            kotlinx.coroutines.sync.c cVar14 = (kotlinx.coroutines.sync.c) anonymousClass1.f25872h;
                            PageFetcherSnapshotState.Holder holder12 = (PageFetcherSnapshotState.Holder) anonymousClass1.f25871g;
                            LoadType loadType16 = (LoadType) anonymousClass1.f25870f;
                            PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$15 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            PageFetcherSnapshotState pageFetcherSnapshotState5 = holder12.state;
                            PageFetcherSnapshot pageFetcherSnapshot7 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$15;
                            anonymousClass1.f25870f = loadType16;
                            anonymousClass1.f25871g = cVar14;
                            anonymousClass1.f25872h = loadStates;
                            anonymousClass1.f25873i = null;
                            anonymousClass1.f25867c = 3;
                            if (pageFetcherSnapshot7.z(pageFetcherSnapshotState5, loadType16, anonymousClass1) == objH) {
                                return objH;
                            }
                            loadType3 = loadType16;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$3 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$15;
                            r10 = cVar14;
                            b2 b2Var10 = b2.f124493a;
                            r10.f(null);
                            loadType2 = loadType3;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$3;
                            loadStates2 = loadStates;
                            pageFetcherSnapshot = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                            if (f0.f26408a[loadType2.ordinal()] != 1) {
                                holder2 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar3 = holder2.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                                anonymousClass1.f25870f = loadType2;
                                anonymousClass1.f25871g = holder2;
                                anonymousClass1.f25872h = cVar3;
                                anonymousClass1.f25873i = loadStates2;
                                anonymousClass1.f25874j = loadType2;
                                anonymousClass1.f25875k = pageFetcherSnapshot;
                                anonymousClass1.f25867c = 4;
                                if (cVar3.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                loadType5 = loadType2;
                                f1Var = holder2.state.m().get(loadType5);
                                cVar3.f(null);
                                loadStates3 = loadStates2;
                                loadType4 = loadType2;
                                loadType2 = loadType5;
                            } else {
                                f1Var = null;
                                loadStates3 = loadStates2;
                                loadType4 = loadType2;
                            }
                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            anonymousClass1.f25870f = loadType2;
                            anonymousClass1.f25871g = loadStates3;
                            anonymousClass1.f25872h = null;
                            anonymousClass1.f25873i = null;
                            anonymousClass1.f25874j = null;
                            anonymousClass1.f25875k = null;
                            anonymousClass1.f25867c = 5;
                            if (pageFetcherSnapshot.y(loadType4, f1Var, anonymousClass1) == objH) {
                                return objH;
                            }
                            loadStates = loadStates3;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            if (loadType2 == LoadType.REFRESH) {
                                holder3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar4 = holder3.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                                anonymousClass1.f25870f = holder3;
                                anonymousClass1.f25871g = cVar4;
                                anonymousClass1.f25872h = loadStates;
                                anonymousClass1.f25867c = 6;
                                if (cVar4.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                vVarH = holder3.state.getSourceLoadStates().h(LoadType.REFRESH);
                                cVar4.f(null);
                                if (!(vVarH instanceof v.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4.f25865c);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                            loadType6 = LoadType.PREPEND;
                            if (loadStates.j() instanceof v.Error) {
                                if (loadType6 != LoadType.REFRESH) {
                                    holder4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar5 = holder4.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType6;
                                    anonymousClass1.f25871g = holder4;
                                    anonymousClass1.f25872h = cVar5;
                                    anonymousClass1.f25873i = loadStates;
                                    anonymousClass1.f25867c = 7;
                                    if (cVar5.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$16 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    holder5 = holder4;
                                    cVar6 = cVar5;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$16;
                                    pageFetcherSnapshotState = holder5.state;
                                    pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    anonymousClass1.f25870f = loadType6;
                                    anonymousClass1.f25871g = cVar6;
                                    anonymousClass1.f25872h = loadStates;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25867c = 8;
                                    if (pageFetcherSnapshot2.z(pageFetcherSnapshotState, loadType6, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType8 = loadType6;
                                    r10 = cVar6;
                                    b2 b2Var11 = b2.f124493a;
                                    r10.f(null);
                                    loadType7 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                } else {
                                    loadType7 = loadType6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                }
                                loadStates4 = loadStates;
                                pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                if (f0.f26408a[loadType7.ordinal()] != 1) {
                                    holder6 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar7 = holder6.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.f25870f = loadType7;
                                    anonymousClass1.f25871g = holder6;
                                    anonymousClass1.f25872h = cVar7;
                                    anonymousClass1.f25873i = loadStates4;
                                    anonymousClass1.f25874j = loadType7;
                                    anonymousClass1.f25875k = pageFetcherSnapshot3;
                                    anonymousClass1.f25867c = 9;
                                    if (cVar7.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType10 = loadType7;
                                    f1Var2 = holder6.state.m().get(loadType10);
                                    cVar7.f(null);
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                    loadType7 = loadType10;
                                } else {
                                    f1Var2 = null;
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                }
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.f25870f = loadType7;
                                anonymousClass1.f25871g = loadStates5;
                                anonymousClass1.f25872h = null;
                                anonymousClass1.f25873i = null;
                                anonymousClass1.f25874j = null;
                                anonymousClass1.f25875k = null;
                                anonymousClass1.f25867c = 10;
                                if (pageFetcherSnapshot3.y(loadType9, f1Var2, anonymousClass1) == objH) {
                                    return objH;
                                }
                                loadStates = loadStates5;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                if (loadType7 == LoadType.REFRESH) {
                                    holder7 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar8 = holder7.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                    anonymousClass1.f25870f = holder7;
                                    anonymousClass1.f25871g = cVar8;
                                    anonymousClass1.f25872h = loadStates;
                                    anonymousClass1.f25867c = 11;
                                    if (cVar8.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    vVarH2 = holder7.state.getSourceLoadStates().h(LoadType.REFRESH);
                                    cVar8.f(null);
                                    if (!(vVarH2 instanceof v.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.f25865c);
                                    }
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                loadType11 = LoadType.APPEND;
                                if (loadStates.i() instanceof v.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar9 = holder8.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = holder8;
                                        anonymousClass1.f25872h = cVar9;
                                        anonymousClass1.f25867c = 12;
                                        if (cVar9.e(null, anonymousClass1) == objH) {
                                            cVar10 = cVar9;
                                            return objH;
                                        }
                                        cVar10 = cVar9;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = cVar10;
                                        anonymousClass1.f25872h = null;
                                        anonymousClass1.f25867c = 13;
                                        if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType12 = loadType11;
                                        b2Var = cVar10;
                                        b2 b2Var12 = b2.f124493a;
                                        b2Var.f(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    if (f0.f26408a[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar11 = holder9.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.f25870f = loadType12;
                                        anonymousClass1.f25871g = holder9;
                                        anonymousClass1.f25872h = cVar11;
                                        anonymousClass1.f25873i = loadType12;
                                        anonymousClass1.f25874j = pageFetcherSnapshot5;
                                        anonymousClass1.f25867c = 14;
                                        if (cVar11.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType15 = loadType12;
                                        f1 f1Var6 = holder9.state.m().get(loadType15);
                                        cVar11.f(null);
                                        loadType14 = loadType12;
                                        f1Var3 = f1Var6;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        f1Var3 = null;
                                    }
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType13;
                                    anonymousClass1.f25871g = null;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25874j = null;
                                    anonymousClass1.f25867c = 15;
                                    if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar12 = holder10.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.f25870f = holder10;
                                        anonymousClass1.f25871g = cVar12;
                                        anonymousClass1.f25867c = 16;
                                        if (cVar12.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        holder11 = holder10;
                                        cVar13 = cVar12;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                        cVar13.f(null);
                                        if (!(vVarH3 instanceof v.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                        }
                                    }
                                }
                            } else {
                                loadType11 = LoadType.APPEND;
                                if (loadStates.i() instanceof v.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar9 = holder8.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = holder8;
                                        anonymousClass1.f25872h = cVar9;
                                        anonymousClass1.f25867c = 12;
                                        if (cVar9.e(null, anonymousClass1) == objH) {
                                            cVar10 = cVar9;
                                            return objH;
                                        }
                                        cVar10 = cVar9;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = cVar10;
                                        anonymousClass1.f25872h = null;
                                        anonymousClass1.f25867c = 13;
                                        if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType12 = loadType11;
                                        b2Var = cVar10;
                                        b2 b2Var13 = b2.f124493a;
                                        b2Var.f(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    if (f0.f26408a[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar11 = holder9.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.f25870f = loadType12;
                                        anonymousClass1.f25871g = holder9;
                                        anonymousClass1.f25872h = cVar11;
                                        anonymousClass1.f25873i = loadType12;
                                        anonymousClass1.f25874j = pageFetcherSnapshot5;
                                        anonymousClass1.f25867c = 14;
                                        if (cVar11.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType15 = loadType12;
                                        f1 f1Var7 = holder9.state.m().get(loadType15);
                                        cVar11.f(null);
                                        loadType14 = loadType12;
                                        f1Var3 = f1Var7;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        f1Var3 = null;
                                    }
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType13;
                                    anonymousClass1.f25871g = null;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25874j = null;
                                    anonymousClass1.f25867c = 15;
                                    if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar12 = holder10.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.f25870f = holder10;
                                        anonymousClass1.f25871g = cVar12;
                                        anonymousClass1.f25867c = 16;
                                        if (cVar12.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        holder11 = holder10;
                                        cVar13 = cVar12;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                        cVar13.f(null);
                                        if (!(vVarH3 instanceof v.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                        }
                                    }
                                }
                            }
                            return b2.f124493a;
                        case 3:
                            loadStates = (LoadStates) anonymousClass1.f25872h;
                            kotlinx.coroutines.sync.c cVar15 = (kotlinx.coroutines.sync.c) anonymousClass1.f25871g;
                            loadType3 = (LoadType) anonymousClass1.f25870f;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$3 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            r10 = cVar15;
                            b2 b2Var14 = b2.f124493a;
                            r10.f(null);
                            loadType2 = loadType3;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$3;
                            loadStates2 = loadStates;
                            pageFetcherSnapshot = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                            if (f0.f26408a[loadType2.ordinal()] != 1) {
                                holder2 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar3 = holder2.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                                anonymousClass1.f25870f = loadType2;
                                anonymousClass1.f25871g = holder2;
                                anonymousClass1.f25872h = cVar3;
                                anonymousClass1.f25873i = loadStates2;
                                anonymousClass1.f25874j = loadType2;
                                anonymousClass1.f25875k = pageFetcherSnapshot;
                                anonymousClass1.f25867c = 4;
                                if (cVar3.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                loadType5 = loadType2;
                                f1Var = holder2.state.m().get(loadType5);
                                cVar3.f(null);
                                loadStates3 = loadStates2;
                                loadType4 = loadType2;
                                loadType2 = loadType5;
                            } else {
                                f1Var = null;
                                loadStates3 = loadStates2;
                                loadType4 = loadType2;
                            }
                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            anonymousClass1.f25870f = loadType2;
                            anonymousClass1.f25871g = loadStates3;
                            anonymousClass1.f25872h = null;
                            anonymousClass1.f25873i = null;
                            anonymousClass1.f25874j = null;
                            anonymousClass1.f25875k = null;
                            anonymousClass1.f25867c = 5;
                            if (pageFetcherSnapshot.y(loadType4, f1Var, anonymousClass1) == objH) {
                                return objH;
                            }
                            loadStates = loadStates3;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            if (loadType2 == LoadType.REFRESH) {
                                holder3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar4 = holder3.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                                anonymousClass1.f25870f = holder3;
                                anonymousClass1.f25871g = cVar4;
                                anonymousClass1.f25872h = loadStates;
                                anonymousClass1.f25867c = 6;
                                if (cVar4.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                vVarH = holder3.state.getSourceLoadStates().h(LoadType.REFRESH);
                                cVar4.f(null);
                                if (!(vVarH instanceof v.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4.f25865c);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                            loadType6 = LoadType.PREPEND;
                            if (loadStates.j() instanceof v.Error) {
                                if (loadType6 != LoadType.REFRESH) {
                                    holder4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar5 = holder4.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType6;
                                    anonymousClass1.f25871g = holder4;
                                    anonymousClass1.f25872h = cVar5;
                                    anonymousClass1.f25873i = loadStates;
                                    anonymousClass1.f25867c = 7;
                                    if (cVar5.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$17 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    holder5 = holder4;
                                    cVar6 = cVar5;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$17;
                                    pageFetcherSnapshotState = holder5.state;
                                    pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    anonymousClass1.f25870f = loadType6;
                                    anonymousClass1.f25871g = cVar6;
                                    anonymousClass1.f25872h = loadStates;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25867c = 8;
                                    if (pageFetcherSnapshot2.z(pageFetcherSnapshotState, loadType6, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType8 = loadType6;
                                    r10 = cVar6;
                                    b2 b2Var15 = b2.f124493a;
                                    r10.f(null);
                                    loadType7 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                } else {
                                    loadType7 = loadType6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                }
                                loadStates4 = loadStates;
                                pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                if (f0.f26408a[loadType7.ordinal()] != 1) {
                                    holder6 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar7 = holder6.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.f25870f = loadType7;
                                    anonymousClass1.f25871g = holder6;
                                    anonymousClass1.f25872h = cVar7;
                                    anonymousClass1.f25873i = loadStates4;
                                    anonymousClass1.f25874j = loadType7;
                                    anonymousClass1.f25875k = pageFetcherSnapshot3;
                                    anonymousClass1.f25867c = 9;
                                    if (cVar7.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType10 = loadType7;
                                    f1Var2 = holder6.state.m().get(loadType10);
                                    cVar7.f(null);
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                    loadType7 = loadType10;
                                } else {
                                    f1Var2 = null;
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                }
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.f25870f = loadType7;
                                anonymousClass1.f25871g = loadStates5;
                                anonymousClass1.f25872h = null;
                                anonymousClass1.f25873i = null;
                                anonymousClass1.f25874j = null;
                                anonymousClass1.f25875k = null;
                                anonymousClass1.f25867c = 10;
                                if (pageFetcherSnapshot3.y(loadType9, f1Var2, anonymousClass1) == objH) {
                                    return objH;
                                }
                                loadStates = loadStates5;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                if (loadType7 == LoadType.REFRESH) {
                                    holder7 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar8 = holder7.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                    anonymousClass1.f25870f = holder7;
                                    anonymousClass1.f25871g = cVar8;
                                    anonymousClass1.f25872h = loadStates;
                                    anonymousClass1.f25867c = 11;
                                    if (cVar8.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    vVarH2 = holder7.state.getSourceLoadStates().h(LoadType.REFRESH);
                                    cVar8.f(null);
                                    if (!(vVarH2 instanceof v.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.f25865c);
                                    }
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                loadType11 = LoadType.APPEND;
                                if (loadStates.i() instanceof v.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar9 = holder8.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = holder8;
                                        anonymousClass1.f25872h = cVar9;
                                        anonymousClass1.f25867c = 12;
                                        if (cVar9.e(null, anonymousClass1) == objH) {
                                            cVar10 = cVar9;
                                            return objH;
                                        }
                                        cVar10 = cVar9;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = cVar10;
                                        anonymousClass1.f25872h = null;
                                        anonymousClass1.f25867c = 13;
                                        if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType12 = loadType11;
                                        b2Var = cVar10;
                                        b2 b2Var16 = b2.f124493a;
                                        b2Var.f(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    if (f0.f26408a[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar11 = holder9.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.f25870f = loadType12;
                                        anonymousClass1.f25871g = holder9;
                                        anonymousClass1.f25872h = cVar11;
                                        anonymousClass1.f25873i = loadType12;
                                        anonymousClass1.f25874j = pageFetcherSnapshot5;
                                        anonymousClass1.f25867c = 14;
                                        if (cVar11.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType15 = loadType12;
                                        f1 f1Var8 = holder9.state.m().get(loadType15);
                                        cVar11.f(null);
                                        loadType14 = loadType12;
                                        f1Var3 = f1Var8;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        f1Var3 = null;
                                    }
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType13;
                                    anonymousClass1.f25871g = null;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25874j = null;
                                    anonymousClass1.f25867c = 15;
                                    if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar12 = holder10.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.f25870f = holder10;
                                        anonymousClass1.f25871g = cVar12;
                                        anonymousClass1.f25867c = 16;
                                        if (cVar12.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        holder11 = holder10;
                                        cVar13 = cVar12;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                        cVar13.f(null);
                                        if (!(vVarH3 instanceof v.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                        }
                                    }
                                }
                            } else {
                                loadType11 = LoadType.APPEND;
                                if (loadStates.i() instanceof v.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar9 = holder8.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = holder8;
                                        anonymousClass1.f25872h = cVar9;
                                        anonymousClass1.f25867c = 12;
                                        if (cVar9.e(null, anonymousClass1) == objH) {
                                            cVar10 = cVar9;
                                            return objH;
                                        }
                                        cVar10 = cVar9;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = cVar10;
                                        anonymousClass1.f25872h = null;
                                        anonymousClass1.f25867c = 13;
                                        if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType12 = loadType11;
                                        b2Var = cVar10;
                                        b2 b2Var17 = b2.f124493a;
                                        b2Var.f(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    if (f0.f26408a[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar11 = holder9.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.f25870f = loadType12;
                                        anonymousClass1.f25871g = holder9;
                                        anonymousClass1.f25872h = cVar11;
                                        anonymousClass1.f25873i = loadType12;
                                        anonymousClass1.f25874j = pageFetcherSnapshot5;
                                        anonymousClass1.f25867c = 14;
                                        if (cVar11.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType15 = loadType12;
                                        f1 f1Var9 = holder9.state.m().get(loadType15);
                                        cVar11.f(null);
                                        loadType14 = loadType12;
                                        f1Var3 = f1Var9;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        f1Var3 = null;
                                    }
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType13;
                                    anonymousClass1.f25871g = null;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25874j = null;
                                    anonymousClass1.f25867c = 15;
                                    if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar12 = holder10.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.f25870f = holder10;
                                        anonymousClass1.f25871g = cVar12;
                                        anonymousClass1.f25867c = 16;
                                        if (cVar12.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        holder11 = holder10;
                                        cVar13 = cVar12;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                        cVar13.f(null);
                                        if (!(vVarH3 instanceof v.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                        }
                                    }
                                }
                            }
                            return b2.f124493a;
                        case 4:
                            pageFetcherSnapshot = (PageFetcherSnapshot) anonymousClass1.f25875k;
                            loadType2 = (LoadType) anonymousClass1.f25874j;
                            loadStates2 = (LoadStates) anonymousClass1.f25873i;
                            cVar3 = (kotlinx.coroutines.sync.c) anonymousClass1.f25872h;
                            holder2 = (PageFetcherSnapshotState.Holder) anonymousClass1.f25871g;
                            loadType5 = (LoadType) anonymousClass1.f25870f;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            f1Var = holder2.state.m().get(loadType5);
                            cVar3.f(null);
                            loadStates3 = loadStates2;
                            loadType4 = loadType2;
                            loadType2 = loadType5;
                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            anonymousClass1.f25870f = loadType2;
                            anonymousClass1.f25871g = loadStates3;
                            anonymousClass1.f25872h = null;
                            anonymousClass1.f25873i = null;
                            anonymousClass1.f25874j = null;
                            anonymousClass1.f25875k = null;
                            anonymousClass1.f25867c = 5;
                            if (pageFetcherSnapshot.y(loadType4, f1Var, anonymousClass1) == objH) {
                                return objH;
                            }
                            loadStates = loadStates3;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            if (loadType2 == LoadType.REFRESH) {
                                holder3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar4 = holder3.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                                anonymousClass1.f25870f = holder3;
                                anonymousClass1.f25871g = cVar4;
                                anonymousClass1.f25872h = loadStates;
                                anonymousClass1.f25867c = 6;
                                if (cVar4.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                vVarH = holder3.state.getSourceLoadStates().h(LoadType.REFRESH);
                                cVar4.f(null);
                                if (!(vVarH instanceof v.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4.f25865c);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                            loadType6 = LoadType.PREPEND;
                            if (loadStates.j() instanceof v.Error) {
                                if (loadType6 != LoadType.REFRESH) {
                                    holder4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar5 = holder4.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType6;
                                    anonymousClass1.f25871g = holder4;
                                    anonymousClass1.f25872h = cVar5;
                                    anonymousClass1.f25873i = loadStates;
                                    anonymousClass1.f25867c = 7;
                                    if (cVar5.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$18 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    holder5 = holder4;
                                    cVar6 = cVar5;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$18;
                                    pageFetcherSnapshotState = holder5.state;
                                    pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    anonymousClass1.f25870f = loadType6;
                                    anonymousClass1.f25871g = cVar6;
                                    anonymousClass1.f25872h = loadStates;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25867c = 8;
                                    if (pageFetcherSnapshot2.z(pageFetcherSnapshotState, loadType6, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType8 = loadType6;
                                    r10 = cVar6;
                                    b2 b2Var18 = b2.f124493a;
                                    r10.f(null);
                                    loadType7 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                } else {
                                    loadType7 = loadType6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                }
                                loadStates4 = loadStates;
                                pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                if (f0.f26408a[loadType7.ordinal()] != 1) {
                                    holder6 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar7 = holder6.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.f25870f = loadType7;
                                    anonymousClass1.f25871g = holder6;
                                    anonymousClass1.f25872h = cVar7;
                                    anonymousClass1.f25873i = loadStates4;
                                    anonymousClass1.f25874j = loadType7;
                                    anonymousClass1.f25875k = pageFetcherSnapshot3;
                                    anonymousClass1.f25867c = 9;
                                    if (cVar7.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType10 = loadType7;
                                    f1Var2 = holder6.state.m().get(loadType10);
                                    cVar7.f(null);
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                    loadType7 = loadType10;
                                } else {
                                    f1Var2 = null;
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                }
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.f25870f = loadType7;
                                anonymousClass1.f25871g = loadStates5;
                                anonymousClass1.f25872h = null;
                                anonymousClass1.f25873i = null;
                                anonymousClass1.f25874j = null;
                                anonymousClass1.f25875k = null;
                                anonymousClass1.f25867c = 10;
                                if (pageFetcherSnapshot3.y(loadType9, f1Var2, anonymousClass1) == objH) {
                                    return objH;
                                }
                                loadStates = loadStates5;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                if (loadType7 == LoadType.REFRESH) {
                                    holder7 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar8 = holder7.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                    anonymousClass1.f25870f = holder7;
                                    anonymousClass1.f25871g = cVar8;
                                    anonymousClass1.f25872h = loadStates;
                                    anonymousClass1.f25867c = 11;
                                    if (cVar8.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    vVarH2 = holder7.state.getSourceLoadStates().h(LoadType.REFRESH);
                                    cVar8.f(null);
                                    if (!(vVarH2 instanceof v.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.f25865c);
                                    }
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                loadType11 = LoadType.APPEND;
                                if (loadStates.i() instanceof v.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar9 = holder8.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = holder8;
                                        anonymousClass1.f25872h = cVar9;
                                        anonymousClass1.f25867c = 12;
                                        if (cVar9.e(null, anonymousClass1) == objH) {
                                            cVar10 = cVar9;
                                            return objH;
                                        }
                                        cVar10 = cVar9;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = cVar10;
                                        anonymousClass1.f25872h = null;
                                        anonymousClass1.f25867c = 13;
                                        if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType12 = loadType11;
                                        b2Var = cVar10;
                                        b2 b2Var19 = b2.f124493a;
                                        b2Var.f(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    if (f0.f26408a[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar11 = holder9.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.f25870f = loadType12;
                                        anonymousClass1.f25871g = holder9;
                                        anonymousClass1.f25872h = cVar11;
                                        anonymousClass1.f25873i = loadType12;
                                        anonymousClass1.f25874j = pageFetcherSnapshot5;
                                        anonymousClass1.f25867c = 14;
                                        if (cVar11.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType15 = loadType12;
                                        f1 f1Var10 = holder9.state.m().get(loadType15);
                                        cVar11.f(null);
                                        loadType14 = loadType12;
                                        f1Var3 = f1Var10;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        f1Var3 = null;
                                    }
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType13;
                                    anonymousClass1.f25871g = null;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25874j = null;
                                    anonymousClass1.f25867c = 15;
                                    if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar12 = holder10.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.f25870f = holder10;
                                        anonymousClass1.f25871g = cVar12;
                                        anonymousClass1.f25867c = 16;
                                        if (cVar12.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        holder11 = holder10;
                                        cVar13 = cVar12;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                        cVar13.f(null);
                                        if (!(vVarH3 instanceof v.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                        }
                                    }
                                }
                            } else {
                                loadType11 = LoadType.APPEND;
                                if (loadStates.i() instanceof v.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar9 = holder8.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = holder8;
                                        anonymousClass1.f25872h = cVar9;
                                        anonymousClass1.f25867c = 12;
                                        if (cVar9.e(null, anonymousClass1) == objH) {
                                            cVar10 = cVar9;
                                            return objH;
                                        }
                                        cVar10 = cVar9;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = cVar10;
                                        anonymousClass1.f25872h = null;
                                        anonymousClass1.f25867c = 13;
                                        if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType12 = loadType11;
                                        b2Var = cVar10;
                                        b2 b2Var110 = b2.f124493a;
                                        b2Var.f(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    if (f0.f26408a[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar11 = holder9.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.f25870f = loadType12;
                                        anonymousClass1.f25871g = holder9;
                                        anonymousClass1.f25872h = cVar11;
                                        anonymousClass1.f25873i = loadType12;
                                        anonymousClass1.f25874j = pageFetcherSnapshot5;
                                        anonymousClass1.f25867c = 14;
                                        if (cVar11.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType15 = loadType12;
                                        f1 f1Var11 = holder9.state.m().get(loadType15);
                                        cVar11.f(null);
                                        loadType14 = loadType12;
                                        f1Var3 = f1Var11;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        f1Var3 = null;
                                    }
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType13;
                                    anonymousClass1.f25871g = null;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25874j = null;
                                    anonymousClass1.f25867c = 15;
                                    if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar12 = holder10.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.f25870f = holder10;
                                        anonymousClass1.f25871g = cVar12;
                                        anonymousClass1.f25867c = 16;
                                        if (cVar12.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        holder11 = holder10;
                                        cVar13 = cVar12;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                        cVar13.f(null);
                                        if (!(vVarH3 instanceof v.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                        }
                                    }
                                }
                            }
                            return b2.f124493a;
                        case 5:
                            loadStates = (LoadStates) anonymousClass1.f25871g;
                            loadType2 = (LoadType) anonymousClass1.f25870f;
                            PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$19 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$19;
                            if (loadType2 == LoadType.REFRESH) {
                                holder3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar4 = holder3.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                                anonymousClass1.f25870f = holder3;
                                anonymousClass1.f25871g = cVar4;
                                anonymousClass1.f25872h = loadStates;
                                anonymousClass1.f25867c = 6;
                                if (cVar4.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                vVarH = holder3.state.getSourceLoadStates().h(LoadType.REFRESH);
                                cVar4.f(null);
                                if (!(vVarH instanceof v.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4.f25865c);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                            loadType6 = LoadType.PREPEND;
                            if (loadStates.j() instanceof v.Error) {
                                if (loadType6 != LoadType.REFRESH) {
                                    holder4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar5 = holder4.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType6;
                                    anonymousClass1.f25871g = holder4;
                                    anonymousClass1.f25872h = cVar5;
                                    anonymousClass1.f25873i = loadStates;
                                    anonymousClass1.f25867c = 7;
                                    if (cVar5.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$110 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    holder5 = holder4;
                                    cVar6 = cVar5;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$110;
                                    pageFetcherSnapshotState = holder5.state;
                                    pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    anonymousClass1.f25870f = loadType6;
                                    anonymousClass1.f25871g = cVar6;
                                    anonymousClass1.f25872h = loadStates;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25867c = 8;
                                    if (pageFetcherSnapshot2.z(pageFetcherSnapshotState, loadType6, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType8 = loadType6;
                                    r10 = cVar6;
                                    b2 b2Var111 = b2.f124493a;
                                    r10.f(null);
                                    loadType7 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                } else {
                                    loadType7 = loadType6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                }
                                loadStates4 = loadStates;
                                pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                if (f0.f26408a[loadType7.ordinal()] != 1) {
                                    holder6 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar7 = holder6.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.f25870f = loadType7;
                                    anonymousClass1.f25871g = holder6;
                                    anonymousClass1.f25872h = cVar7;
                                    anonymousClass1.f25873i = loadStates4;
                                    anonymousClass1.f25874j = loadType7;
                                    anonymousClass1.f25875k = pageFetcherSnapshot3;
                                    anonymousClass1.f25867c = 9;
                                    if (cVar7.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType10 = loadType7;
                                    f1Var2 = holder6.state.m().get(loadType10);
                                    cVar7.f(null);
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                    loadType7 = loadType10;
                                } else {
                                    f1Var2 = null;
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                }
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.f25870f = loadType7;
                                anonymousClass1.f25871g = loadStates5;
                                anonymousClass1.f25872h = null;
                                anonymousClass1.f25873i = null;
                                anonymousClass1.f25874j = null;
                                anonymousClass1.f25875k = null;
                                anonymousClass1.f25867c = 10;
                                if (pageFetcherSnapshot3.y(loadType9, f1Var2, anonymousClass1) == objH) {
                                    return objH;
                                }
                                loadStates = loadStates5;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                if (loadType7 == LoadType.REFRESH) {
                                    holder7 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar8 = holder7.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                    anonymousClass1.f25870f = holder7;
                                    anonymousClass1.f25871g = cVar8;
                                    anonymousClass1.f25872h = loadStates;
                                    anonymousClass1.f25867c = 11;
                                    if (cVar8.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    vVarH2 = holder7.state.getSourceLoadStates().h(LoadType.REFRESH);
                                    cVar8.f(null);
                                    if (!(vVarH2 instanceof v.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.f25865c);
                                    }
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                loadType11 = LoadType.APPEND;
                                if (loadStates.i() instanceof v.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar9 = holder8.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = holder8;
                                        anonymousClass1.f25872h = cVar9;
                                        anonymousClass1.f25867c = 12;
                                        if (cVar9.e(null, anonymousClass1) == objH) {
                                            cVar10 = cVar9;
                                            return objH;
                                        }
                                        cVar10 = cVar9;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = cVar10;
                                        anonymousClass1.f25872h = null;
                                        anonymousClass1.f25867c = 13;
                                        if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType12 = loadType11;
                                        b2Var = cVar10;
                                        b2 b2Var112 = b2.f124493a;
                                        b2Var.f(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    if (f0.f26408a[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar11 = holder9.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.f25870f = loadType12;
                                        anonymousClass1.f25871g = holder9;
                                        anonymousClass1.f25872h = cVar11;
                                        anonymousClass1.f25873i = loadType12;
                                        anonymousClass1.f25874j = pageFetcherSnapshot5;
                                        anonymousClass1.f25867c = 14;
                                        if (cVar11.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType15 = loadType12;
                                        f1 f1Var12 = holder9.state.m().get(loadType15);
                                        cVar11.f(null);
                                        loadType14 = loadType12;
                                        f1Var3 = f1Var12;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        f1Var3 = null;
                                    }
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType13;
                                    anonymousClass1.f25871g = null;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25874j = null;
                                    anonymousClass1.f25867c = 15;
                                    if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar12 = holder10.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.f25870f = holder10;
                                        anonymousClass1.f25871g = cVar12;
                                        anonymousClass1.f25867c = 16;
                                        if (cVar12.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        holder11 = holder10;
                                        cVar13 = cVar12;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                        cVar13.f(null);
                                        if (!(vVarH3 instanceof v.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                        }
                                    }
                                }
                            } else {
                                loadType11 = LoadType.APPEND;
                                if (loadStates.i() instanceof v.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar9 = holder8.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = holder8;
                                        anonymousClass1.f25872h = cVar9;
                                        anonymousClass1.f25867c = 12;
                                        if (cVar9.e(null, anonymousClass1) == objH) {
                                            cVar10 = cVar9;
                                            return objH;
                                        }
                                        cVar10 = cVar9;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = cVar10;
                                        anonymousClass1.f25872h = null;
                                        anonymousClass1.f25867c = 13;
                                        if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType12 = loadType11;
                                        b2Var = cVar10;
                                        b2 b2Var113 = b2.f124493a;
                                        b2Var.f(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    if (f0.f26408a[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar11 = holder9.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.f25870f = loadType12;
                                        anonymousClass1.f25871g = holder9;
                                        anonymousClass1.f25872h = cVar11;
                                        anonymousClass1.f25873i = loadType12;
                                        anonymousClass1.f25874j = pageFetcherSnapshot5;
                                        anonymousClass1.f25867c = 14;
                                        if (cVar11.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType15 = loadType12;
                                        f1 f1Var13 = holder9.state.m().get(loadType15);
                                        cVar11.f(null);
                                        loadType14 = loadType12;
                                        f1Var3 = f1Var13;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        f1Var3 = null;
                                    }
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType13;
                                    anonymousClass1.f25871g = null;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25874j = null;
                                    anonymousClass1.f25867c = 15;
                                    if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar12 = holder10.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.f25870f = holder10;
                                        anonymousClass1.f25871g = cVar12;
                                        anonymousClass1.f25867c = 16;
                                        if (cVar12.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        holder11 = holder10;
                                        cVar13 = cVar12;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                        cVar13.f(null);
                                        if (!(vVarH3 instanceof v.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                        }
                                    }
                                }
                            }
                            return b2.f124493a;
                        case 6:
                            loadStates = (LoadStates) anonymousClass1.f25872h;
                            cVar4 = (kotlinx.coroutines.sync.c) anonymousClass1.f25871g;
                            holder3 = (PageFetcherSnapshotState.Holder) anonymousClass1.f25870f;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            vVarH = holder3.state.getSourceLoadStates().h(LoadType.REFRESH);
                            cVar4.f(null);
                            if (!(vVarH instanceof v.Error)) {
                                PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4.f25865c);
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                            loadType6 = LoadType.PREPEND;
                            if (loadStates.j() instanceof v.Error) {
                                if (loadType6 != LoadType.REFRESH) {
                                    holder4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar5 = holder4.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType6;
                                    anonymousClass1.f25871g = holder4;
                                    anonymousClass1.f25872h = cVar5;
                                    anonymousClass1.f25873i = loadStates;
                                    anonymousClass1.f25867c = 7;
                                    if (cVar5.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$111 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    holder5 = holder4;
                                    cVar6 = cVar5;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$111;
                                    pageFetcherSnapshotState = holder5.state;
                                    pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    anonymousClass1.f25870f = loadType6;
                                    anonymousClass1.f25871g = cVar6;
                                    anonymousClass1.f25872h = loadStates;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25867c = 8;
                                    if (pageFetcherSnapshot2.z(pageFetcherSnapshotState, loadType6, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType8 = loadType6;
                                    r10 = cVar6;
                                    b2 b2Var114 = b2.f124493a;
                                    r10.f(null);
                                    loadType7 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                } else {
                                    loadType7 = loadType6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                }
                                loadStates4 = loadStates;
                                pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                if (f0.f26408a[loadType7.ordinal()] != 1) {
                                    holder6 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar7 = holder6.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.f25870f = loadType7;
                                    anonymousClass1.f25871g = holder6;
                                    anonymousClass1.f25872h = cVar7;
                                    anonymousClass1.f25873i = loadStates4;
                                    anonymousClass1.f25874j = loadType7;
                                    anonymousClass1.f25875k = pageFetcherSnapshot3;
                                    anonymousClass1.f25867c = 9;
                                    if (cVar7.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType10 = loadType7;
                                    f1Var2 = holder6.state.m().get(loadType10);
                                    cVar7.f(null);
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                    loadType7 = loadType10;
                                } else {
                                    f1Var2 = null;
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                }
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.f25870f = loadType7;
                                anonymousClass1.f25871g = loadStates5;
                                anonymousClass1.f25872h = null;
                                anonymousClass1.f25873i = null;
                                anonymousClass1.f25874j = null;
                                anonymousClass1.f25875k = null;
                                anonymousClass1.f25867c = 10;
                                if (pageFetcherSnapshot3.y(loadType9, f1Var2, anonymousClass1) == objH) {
                                    return objH;
                                }
                                loadStates = loadStates5;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                if (loadType7 == LoadType.REFRESH) {
                                    holder7 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar8 = holder7.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                    anonymousClass1.f25870f = holder7;
                                    anonymousClass1.f25871g = cVar8;
                                    anonymousClass1.f25872h = loadStates;
                                    anonymousClass1.f25867c = 11;
                                    if (cVar8.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    vVarH2 = holder7.state.getSourceLoadStates().h(LoadType.REFRESH);
                                    cVar8.f(null);
                                    if (!(vVarH2 instanceof v.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.f25865c);
                                    }
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                loadType11 = LoadType.APPEND;
                                if (loadStates.i() instanceof v.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar9 = holder8.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = holder8;
                                        anonymousClass1.f25872h = cVar9;
                                        anonymousClass1.f25867c = 12;
                                        if (cVar9.e(null, anonymousClass1) == objH) {
                                            cVar10 = cVar9;
                                            return objH;
                                        }
                                        cVar10 = cVar9;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = cVar10;
                                        anonymousClass1.f25872h = null;
                                        anonymousClass1.f25867c = 13;
                                        if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType12 = loadType11;
                                        b2Var = cVar10;
                                        b2 b2Var115 = b2.f124493a;
                                        b2Var.f(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    if (f0.f26408a[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar11 = holder9.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.f25870f = loadType12;
                                        anonymousClass1.f25871g = holder9;
                                        anonymousClass1.f25872h = cVar11;
                                        anonymousClass1.f25873i = loadType12;
                                        anonymousClass1.f25874j = pageFetcherSnapshot5;
                                        anonymousClass1.f25867c = 14;
                                        if (cVar11.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType15 = loadType12;
                                        f1 f1Var14 = holder9.state.m().get(loadType15);
                                        cVar11.f(null);
                                        loadType14 = loadType12;
                                        f1Var3 = f1Var14;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        f1Var3 = null;
                                    }
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType13;
                                    anonymousClass1.f25871g = null;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25874j = null;
                                    anonymousClass1.f25867c = 15;
                                    if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar12 = holder10.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.f25870f = holder10;
                                        anonymousClass1.f25871g = cVar12;
                                        anonymousClass1.f25867c = 16;
                                        if (cVar12.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        holder11 = holder10;
                                        cVar13 = cVar12;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                        cVar13.f(null);
                                        if (!(vVarH3 instanceof v.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                        }
                                    }
                                }
                            } else {
                                loadType11 = LoadType.APPEND;
                                if (loadStates.i() instanceof v.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar9 = holder8.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = holder8;
                                        anonymousClass1.f25872h = cVar9;
                                        anonymousClass1.f25867c = 12;
                                        if (cVar9.e(null, anonymousClass1) == objH) {
                                            cVar10 = cVar9;
                                            return objH;
                                        }
                                        cVar10 = cVar9;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.f25870f = loadType11;
                                        anonymousClass1.f25871g = cVar10;
                                        anonymousClass1.f25872h = null;
                                        anonymousClass1.f25867c = 13;
                                        if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType12 = loadType11;
                                        b2Var = cVar10;
                                        b2 b2Var116 = b2.f124493a;
                                        b2Var.f(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    if (f0.f26408a[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar11 = holder9.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.f25870f = loadType12;
                                        anonymousClass1.f25871g = holder9;
                                        anonymousClass1.f25872h = cVar11;
                                        anonymousClass1.f25873i = loadType12;
                                        anonymousClass1.f25874j = pageFetcherSnapshot5;
                                        anonymousClass1.f25867c = 14;
                                        if (cVar11.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        loadType15 = loadType12;
                                        f1 f1Var15 = holder9.state.m().get(loadType15);
                                        cVar11.f(null);
                                        loadType14 = loadType12;
                                        f1Var3 = f1Var15;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        f1Var3 = null;
                                    }
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType13;
                                    anonymousClass1.f25871g = null;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25873i = null;
                                    anonymousClass1.f25874j = null;
                                    anonymousClass1.f25867c = 15;
                                    if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                        cVar12 = holder10.lock;
                                        anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.f25870f = holder10;
                                        anonymousClass1.f25871g = cVar12;
                                        anonymousClass1.f25867c = 16;
                                        if (cVar12.e(null, anonymousClass1) == objH) {
                                            return objH;
                                        }
                                        holder11 = holder10;
                                        cVar13 = cVar12;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                        cVar13.f(null);
                                        if (!(vVarH3 instanceof v.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                        }
                                    }
                                }
                            }
                            return b2.f124493a;
                        case 7:
                            loadStates = (LoadStates) anonymousClass1.f25873i;
                            kotlinx.coroutines.sync.c cVar16 = (kotlinx.coroutines.sync.c) anonymousClass1.f25872h;
                            holder5 = (PageFetcherSnapshotState.Holder) anonymousClass1.f25871g;
                            LoadType loadType17 = (LoadType) anonymousClass1.f25870f;
                            PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$20 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            loadType6 = loadType17;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$20;
                            cVar6 = cVar16;
                            pageFetcherSnapshotState = holder5.state;
                            pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                            anonymousClass1.f25870f = loadType6;
                            anonymousClass1.f25871g = cVar6;
                            anonymousClass1.f25872h = loadStates;
                            anonymousClass1.f25873i = null;
                            anonymousClass1.f25867c = 8;
                            if (pageFetcherSnapshot2.z(pageFetcherSnapshotState, loadType6, anonymousClass1) == objH) {
                                return objH;
                            }
                            loadType8 = loadType6;
                            r10 = cVar6;
                            b2 b2Var117 = b2.f124493a;
                            r10.f(null);
                            loadType7 = loadType8;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                            loadStates4 = loadStates;
                            pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                            if (f0.f26408a[loadType7.ordinal()] != 1) {
                                holder6 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar7 = holder6.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.f25870f = loadType7;
                                anonymousClass1.f25871g = holder6;
                                anonymousClass1.f25872h = cVar7;
                                anonymousClass1.f25873i = loadStates4;
                                anonymousClass1.f25874j = loadType7;
                                anonymousClass1.f25875k = pageFetcherSnapshot3;
                                anonymousClass1.f25867c = 9;
                                if (cVar7.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                loadType10 = loadType7;
                                f1Var2 = holder6.state.m().get(loadType10);
                                cVar7.f(null);
                                loadStates5 = loadStates4;
                                loadType9 = loadType7;
                                loadType7 = loadType10;
                            } else {
                                f1Var2 = null;
                                loadStates5 = loadStates4;
                                loadType9 = loadType7;
                            }
                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                            anonymousClass1.f25870f = loadType7;
                            anonymousClass1.f25871g = loadStates5;
                            anonymousClass1.f25872h = null;
                            anonymousClass1.f25873i = null;
                            anonymousClass1.f25874j = null;
                            anonymousClass1.f25875k = null;
                            anonymousClass1.f25867c = 10;
                            if (pageFetcherSnapshot3.y(loadType9, f1Var2, anonymousClass1) == objH) {
                                return objH;
                            }
                            loadStates = loadStates5;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                            if (loadType7 == LoadType.REFRESH) {
                                holder7 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar8 = holder7.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                anonymousClass1.f25870f = holder7;
                                anonymousClass1.f25871g = cVar8;
                                anonymousClass1.f25872h = loadStates;
                                anonymousClass1.f25867c = 11;
                                if (cVar8.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                vVarH2 = holder7.state.getSourceLoadStates().h(LoadType.REFRESH);
                                cVar8.f(null);
                                if (!(vVarH2 instanceof v.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.f25865c);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                            loadType11 = LoadType.APPEND;
                            if (loadStates.i() instanceof v.Error) {
                                if (loadType11 != LoadType.REFRESH) {
                                    holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar9 = holder8.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType11;
                                    anonymousClass1.f25871g = holder8;
                                    anonymousClass1.f25872h = cVar9;
                                    anonymousClass1.f25867c = 12;
                                    if (cVar9.e(null, anonymousClass1) == objH) {
                                        cVar10 = cVar9;
                                        return objH;
                                    }
                                    cVar10 = cVar9;
                                    pageFetcherSnapshotState2 = holder8.state;
                                    pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType11;
                                    anonymousClass1.f25871g = cVar10;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25867c = 13;
                                    if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType12 = loadType11;
                                    b2Var = cVar10;
                                    b2 b2Var118 = b2.f124493a;
                                    b2Var.f(null);
                                } else {
                                    loadType12 = loadType11;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                if (f0.f26408a[loadType12.ordinal()] != 1) {
                                    holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar11 = holder9.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType12;
                                    anonymousClass1.f25871g = holder9;
                                    anonymousClass1.f25872h = cVar11;
                                    anonymousClass1.f25873i = loadType12;
                                    anonymousClass1.f25874j = pageFetcherSnapshot5;
                                    anonymousClass1.f25867c = 14;
                                    if (cVar11.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType15 = loadType12;
                                    f1 f1Var16 = holder9.state.m().get(loadType15);
                                    cVar11.f(null);
                                    loadType14 = loadType12;
                                    f1Var3 = f1Var16;
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType15;
                                } else {
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType12;
                                    loadType14 = loadType13;
                                    f1Var3 = null;
                                }
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.f25870f = loadType13;
                                anonymousClass1.f25871g = null;
                                anonymousClass1.f25872h = null;
                                anonymousClass1.f25873i = null;
                                anonymousClass1.f25874j = null;
                                anonymousClass1.f25867c = 15;
                                if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                    return objH;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                if (loadType13 == LoadType.REFRESH) {
                                    holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar12 = holder10.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    anonymousClass1.f25870f = holder10;
                                    anonymousClass1.f25871g = cVar12;
                                    anonymousClass1.f25867c = 16;
                                    if (cVar12.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    holder11 = holder10;
                                    cVar13 = cVar12;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                    cVar13.f(null);
                                    if (!(vVarH3 instanceof v.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                    }
                                }
                            }
                            return b2.f124493a;
                        case 8:
                            loadStates = (LoadStates) anonymousClass1.f25872h;
                            kotlinx.coroutines.sync.c cVar17 = (kotlinx.coroutines.sync.c) anonymousClass1.f25871g;
                            loadType8 = (LoadType) anonymousClass1.f25870f;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            r10 = cVar17;
                            b2 b2Var119 = b2.f124493a;
                            r10.f(null);
                            loadType7 = loadType8;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                            loadStates4 = loadStates;
                            pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                            if (f0.f26408a[loadType7.ordinal()] != 1) {
                                holder6 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar7 = holder6.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.f25870f = loadType7;
                                anonymousClass1.f25871g = holder6;
                                anonymousClass1.f25872h = cVar7;
                                anonymousClass1.f25873i = loadStates4;
                                anonymousClass1.f25874j = loadType7;
                                anonymousClass1.f25875k = pageFetcherSnapshot3;
                                anonymousClass1.f25867c = 9;
                                if (cVar7.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                loadType10 = loadType7;
                                f1Var2 = holder6.state.m().get(loadType10);
                                cVar7.f(null);
                                loadStates5 = loadStates4;
                                loadType9 = loadType7;
                                loadType7 = loadType10;
                            } else {
                                f1Var2 = null;
                                loadStates5 = loadStates4;
                                loadType9 = loadType7;
                            }
                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                            anonymousClass1.f25870f = loadType7;
                            anonymousClass1.f25871g = loadStates5;
                            anonymousClass1.f25872h = null;
                            anonymousClass1.f25873i = null;
                            anonymousClass1.f25874j = null;
                            anonymousClass1.f25875k = null;
                            anonymousClass1.f25867c = 10;
                            if (pageFetcherSnapshot3.y(loadType9, f1Var2, anonymousClass1) == objH) {
                                return objH;
                            }
                            loadStates = loadStates5;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                            if (loadType7 == LoadType.REFRESH) {
                                holder7 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar8 = holder7.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                anonymousClass1.f25870f = holder7;
                                anonymousClass1.f25871g = cVar8;
                                anonymousClass1.f25872h = loadStates;
                                anonymousClass1.f25867c = 11;
                                if (cVar8.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                vVarH2 = holder7.state.getSourceLoadStates().h(LoadType.REFRESH);
                                cVar8.f(null);
                                if (!(vVarH2 instanceof v.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.f25865c);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                            loadType11 = LoadType.APPEND;
                            if (loadStates.i() instanceof v.Error) {
                                if (loadType11 != LoadType.REFRESH) {
                                    holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar9 = holder8.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType11;
                                    anonymousClass1.f25871g = holder8;
                                    anonymousClass1.f25872h = cVar9;
                                    anonymousClass1.f25867c = 12;
                                    if (cVar9.e(null, anonymousClass1) == objH) {
                                        cVar10 = cVar9;
                                        return objH;
                                    }
                                    cVar10 = cVar9;
                                    pageFetcherSnapshotState2 = holder8.state;
                                    pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType11;
                                    anonymousClass1.f25871g = cVar10;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25867c = 13;
                                    if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType12 = loadType11;
                                    b2Var = cVar10;
                                    b2 b2Var1110 = b2.f124493a;
                                    b2Var.f(null);
                                } else {
                                    loadType12 = loadType11;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                if (f0.f26408a[loadType12.ordinal()] != 1) {
                                    holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar11 = holder9.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType12;
                                    anonymousClass1.f25871g = holder9;
                                    anonymousClass1.f25872h = cVar11;
                                    anonymousClass1.f25873i = loadType12;
                                    anonymousClass1.f25874j = pageFetcherSnapshot5;
                                    anonymousClass1.f25867c = 14;
                                    if (cVar11.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType15 = loadType12;
                                    f1 f1Var17 = holder9.state.m().get(loadType15);
                                    cVar11.f(null);
                                    loadType14 = loadType12;
                                    f1Var3 = f1Var17;
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType15;
                                } else {
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType12;
                                    loadType14 = loadType13;
                                    f1Var3 = null;
                                }
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.f25870f = loadType13;
                                anonymousClass1.f25871g = null;
                                anonymousClass1.f25872h = null;
                                anonymousClass1.f25873i = null;
                                anonymousClass1.f25874j = null;
                                anonymousClass1.f25867c = 15;
                                if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                    return objH;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                if (loadType13 == LoadType.REFRESH) {
                                    holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar12 = holder10.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    anonymousClass1.f25870f = holder10;
                                    anonymousClass1.f25871g = cVar12;
                                    anonymousClass1.f25867c = 16;
                                    if (cVar12.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    holder11 = holder10;
                                    cVar13 = cVar12;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                    cVar13.f(null);
                                    if (!(vVarH3 instanceof v.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                    }
                                }
                            }
                            return b2.f124493a;
                        case 9:
                            pageFetcherSnapshot3 = (PageFetcherSnapshot) anonymousClass1.f25875k;
                            loadType7 = (LoadType) anonymousClass1.f25874j;
                            loadStates4 = (LoadStates) anonymousClass1.f25873i;
                            cVar7 = (kotlinx.coroutines.sync.c) anonymousClass1.f25872h;
                            holder6 = (PageFetcherSnapshotState.Holder) anonymousClass1.f25871g;
                            loadType10 = (LoadType) anonymousClass1.f25870f;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            f1Var2 = holder6.state.m().get(loadType10);
                            cVar7.f(null);
                            loadStates5 = loadStates4;
                            loadType9 = loadType7;
                            loadType7 = loadType10;
                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                            anonymousClass1.f25870f = loadType7;
                            anonymousClass1.f25871g = loadStates5;
                            anonymousClass1.f25872h = null;
                            anonymousClass1.f25873i = null;
                            anonymousClass1.f25874j = null;
                            anonymousClass1.f25875k = null;
                            anonymousClass1.f25867c = 10;
                            if (pageFetcherSnapshot3.y(loadType9, f1Var2, anonymousClass1) == objH) {
                                return objH;
                            }
                            loadStates = loadStates5;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                            if (loadType7 == LoadType.REFRESH) {
                                holder7 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar8 = holder7.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                anonymousClass1.f25870f = holder7;
                                anonymousClass1.f25871g = cVar8;
                                anonymousClass1.f25872h = loadStates;
                                anonymousClass1.f25867c = 11;
                                if (cVar8.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                vVarH2 = holder7.state.getSourceLoadStates().h(LoadType.REFRESH);
                                cVar8.f(null);
                                if (!(vVarH2 instanceof v.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.f25865c);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                            loadType11 = LoadType.APPEND;
                            if (loadStates.i() instanceof v.Error) {
                                if (loadType11 != LoadType.REFRESH) {
                                    holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar9 = holder8.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType11;
                                    anonymousClass1.f25871g = holder8;
                                    anonymousClass1.f25872h = cVar9;
                                    anonymousClass1.f25867c = 12;
                                    if (cVar9.e(null, anonymousClass1) == objH) {
                                        cVar10 = cVar9;
                                        return objH;
                                    }
                                    cVar10 = cVar9;
                                    pageFetcherSnapshotState2 = holder8.state;
                                    pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType11;
                                    anonymousClass1.f25871g = cVar10;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25867c = 13;
                                    if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType12 = loadType11;
                                    b2Var = cVar10;
                                    b2 b2Var1111 = b2.f124493a;
                                    b2Var.f(null);
                                } else {
                                    loadType12 = loadType11;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                if (f0.f26408a[loadType12.ordinal()] != 1) {
                                    holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar11 = holder9.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType12;
                                    anonymousClass1.f25871g = holder9;
                                    anonymousClass1.f25872h = cVar11;
                                    anonymousClass1.f25873i = loadType12;
                                    anonymousClass1.f25874j = pageFetcherSnapshot5;
                                    anonymousClass1.f25867c = 14;
                                    if (cVar11.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType15 = loadType12;
                                    f1 f1Var18 = holder9.state.m().get(loadType15);
                                    cVar11.f(null);
                                    loadType14 = loadType12;
                                    f1Var3 = f1Var18;
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType15;
                                } else {
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType12;
                                    loadType14 = loadType13;
                                    f1Var3 = null;
                                }
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.f25870f = loadType13;
                                anonymousClass1.f25871g = null;
                                anonymousClass1.f25872h = null;
                                anonymousClass1.f25873i = null;
                                anonymousClass1.f25874j = null;
                                anonymousClass1.f25867c = 15;
                                if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                    return objH;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                if (loadType13 == LoadType.REFRESH) {
                                    holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar12 = holder10.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    anonymousClass1.f25870f = holder10;
                                    anonymousClass1.f25871g = cVar12;
                                    anonymousClass1.f25867c = 16;
                                    if (cVar12.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    holder11 = holder10;
                                    cVar13 = cVar12;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                    cVar13.f(null);
                                    if (!(vVarH3 instanceof v.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                    }
                                }
                            }
                            return b2.f124493a;
                        case 10:
                            loadStates = (LoadStates) anonymousClass1.f25871g;
                            loadType7 = (LoadType) anonymousClass1.f25870f;
                            PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$21 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$21;
                            if (loadType7 == LoadType.REFRESH) {
                                holder7 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar8 = holder7.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                anonymousClass1.f25870f = holder7;
                                anonymousClass1.f25871g = cVar8;
                                anonymousClass1.f25872h = loadStates;
                                anonymousClass1.f25867c = 11;
                                if (cVar8.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                vVarH2 = holder7.state.getSourceLoadStates().h(LoadType.REFRESH);
                                cVar8.f(null);
                                if (!(vVarH2 instanceof v.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.f25865c);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                            loadType11 = LoadType.APPEND;
                            if (loadStates.i() instanceof v.Error) {
                                if (loadType11 != LoadType.REFRESH) {
                                    holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar9 = holder8.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType11;
                                    anonymousClass1.f25871g = holder8;
                                    anonymousClass1.f25872h = cVar9;
                                    anonymousClass1.f25867c = 12;
                                    if (cVar9.e(null, anonymousClass1) == objH) {
                                        cVar10 = cVar9;
                                        return objH;
                                    }
                                    cVar10 = cVar9;
                                    pageFetcherSnapshotState2 = holder8.state;
                                    pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType11;
                                    anonymousClass1.f25871g = cVar10;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25867c = 13;
                                    if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType12 = loadType11;
                                    b2Var = cVar10;
                                    b2 b2Var1112 = b2.f124493a;
                                    b2Var.f(null);
                                } else {
                                    loadType12 = loadType11;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                if (f0.f26408a[loadType12.ordinal()] != 1) {
                                    holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar11 = holder9.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType12;
                                    anonymousClass1.f25871g = holder9;
                                    anonymousClass1.f25872h = cVar11;
                                    anonymousClass1.f25873i = loadType12;
                                    anonymousClass1.f25874j = pageFetcherSnapshot5;
                                    anonymousClass1.f25867c = 14;
                                    if (cVar11.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType15 = loadType12;
                                    f1 f1Var19 = holder9.state.m().get(loadType15);
                                    cVar11.f(null);
                                    loadType14 = loadType12;
                                    f1Var3 = f1Var19;
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType15;
                                } else {
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType12;
                                    loadType14 = loadType13;
                                    f1Var3 = null;
                                }
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.f25870f = loadType13;
                                anonymousClass1.f25871g = null;
                                anonymousClass1.f25872h = null;
                                anonymousClass1.f25873i = null;
                                anonymousClass1.f25874j = null;
                                anonymousClass1.f25867c = 15;
                                if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                    return objH;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                if (loadType13 == LoadType.REFRESH) {
                                    holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar12 = holder10.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    anonymousClass1.f25870f = holder10;
                                    anonymousClass1.f25871g = cVar12;
                                    anonymousClass1.f25867c = 16;
                                    if (cVar12.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    holder11 = holder10;
                                    cVar13 = cVar12;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                    cVar13.f(null);
                                    if (!(vVarH3 instanceof v.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                    }
                                }
                            }
                            return b2.f124493a;
                        case 11:
                            loadStates = (LoadStates) anonymousClass1.f25872h;
                            cVar8 = (kotlinx.coroutines.sync.c) anonymousClass1.f25871g;
                            holder7 = (PageFetcherSnapshotState.Holder) anonymousClass1.f25870f;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            vVarH2 = holder7.state.getSourceLoadStates().h(LoadType.REFRESH);
                            cVar8.f(null);
                            if (!(vVarH2 instanceof v.Error)) {
                                PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.f25865c);
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                            loadType11 = LoadType.APPEND;
                            if (loadStates.i() instanceof v.Error) {
                                if (loadType11 != LoadType.REFRESH) {
                                    holder8 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar9 = holder8.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType11;
                                    anonymousClass1.f25871g = holder8;
                                    anonymousClass1.f25872h = cVar9;
                                    anonymousClass1.f25867c = 12;
                                    if (cVar9.e(null, anonymousClass1) == objH) {
                                        cVar10 = cVar9;
                                        return objH;
                                    }
                                    cVar10 = cVar9;
                                    pageFetcherSnapshotState2 = holder8.state;
                                    pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.f25870f = loadType11;
                                    anonymousClass1.f25871g = cVar10;
                                    anonymousClass1.f25872h = null;
                                    anonymousClass1.f25867c = 13;
                                    if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType12 = loadType11;
                                    b2Var = cVar10;
                                    b2 b2Var1113 = b2.f124493a;
                                    b2Var.f(null);
                                } else {
                                    loadType12 = loadType11;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                                if (f0.f26408a[loadType12.ordinal()] != 1) {
                                    holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar11 = holder9.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.f25870f = loadType12;
                                    anonymousClass1.f25871g = holder9;
                                    anonymousClass1.f25872h = cVar11;
                                    anonymousClass1.f25873i = loadType12;
                                    anonymousClass1.f25874j = pageFetcherSnapshot5;
                                    anonymousClass1.f25867c = 14;
                                    if (cVar11.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    loadType15 = loadType12;
                                    f1 f1Var110 = holder9.state.m().get(loadType15);
                                    cVar11.f(null);
                                    loadType14 = loadType12;
                                    f1Var3 = f1Var110;
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType15;
                                } else {
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType12;
                                    loadType14 = loadType13;
                                    f1Var3 = null;
                                }
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.f25870f = loadType13;
                                anonymousClass1.f25871g = null;
                                anonymousClass1.f25872h = null;
                                anonymousClass1.f25873i = null;
                                anonymousClass1.f25874j = null;
                                anonymousClass1.f25867c = 15;
                                if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                    return objH;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                if (loadType13 == LoadType.REFRESH) {
                                    holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                    cVar12 = holder10.lock;
                                    anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    anonymousClass1.f25870f = holder10;
                                    anonymousClass1.f25871g = cVar12;
                                    anonymousClass1.f25867c = 16;
                                    if (cVar12.e(null, anonymousClass1) == objH) {
                                        return objH;
                                    }
                                    holder11 = holder10;
                                    cVar13 = cVar12;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                    cVar13.f(null);
                                    if (!(vVarH3 instanceof v.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                    }
                                }
                            }
                            return b2.f124493a;
                        case 12:
                            kotlinx.coroutines.sync.c cVar18 = (kotlinx.coroutines.sync.c) anonymousClass1.f25872h;
                            holder8 = (PageFetcherSnapshotState.Holder) anonymousClass1.f25871g;
                            LoadType loadType18 = (LoadType) anonymousClass1.f25870f;
                            PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$22 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            loadType11 = loadType18;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$22;
                            cVar10 = cVar18;
                            cVar10 = cVar9;
                            pageFetcherSnapshotState2 = holder8.state;
                            pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                            anonymousClass1.f25870f = loadType11;
                            anonymousClass1.f25871g = cVar10;
                            anonymousClass1.f25872h = null;
                            anonymousClass1.f25867c = 13;
                            if (pageFetcherSnapshot4.z(pageFetcherSnapshotState2, loadType11, anonymousClass1) == objH) {
                                return objH;
                            }
                            loadType12 = loadType11;
                            b2Var = cVar10;
                            b2 b2Var1114 = b2.f124493a;
                            b2Var.f(null);
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                            pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                            if (f0.f26408a[loadType12.ordinal()] != 1) {
                                holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar11 = holder9.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.f25870f = loadType12;
                                anonymousClass1.f25871g = holder9;
                                anonymousClass1.f25872h = cVar11;
                                anonymousClass1.f25873i = loadType12;
                                anonymousClass1.f25874j = pageFetcherSnapshot5;
                                anonymousClass1.f25867c = 14;
                                if (cVar11.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                loadType15 = loadType12;
                                f1 f1Var111 = holder9.state.m().get(loadType15);
                                cVar11.f(null);
                                loadType14 = loadType12;
                                f1Var3 = f1Var111;
                                pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                loadType13 = loadType15;
                            } else {
                                pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                loadType13 = loadType12;
                                loadType14 = loadType13;
                                f1Var3 = null;
                            }
                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                            anonymousClass1.f25870f = loadType13;
                            anonymousClass1.f25871g = null;
                            anonymousClass1.f25872h = null;
                            anonymousClass1.f25873i = null;
                            anonymousClass1.f25874j = null;
                            anonymousClass1.f25867c = 15;
                            if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                return objH;
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                            if (loadType13 == LoadType.REFRESH) {
                                holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar12 = holder10.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                anonymousClass1.f25870f = holder10;
                                anonymousClass1.f25871g = cVar12;
                                anonymousClass1.f25867c = 16;
                                if (cVar12.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                holder11 = holder10;
                                cVar13 = cVar12;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                cVar13.f(null);
                                if (!(vVarH3 instanceof v.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                }
                            }
                            return b2.f124493a;
                        case 13:
                            kotlinx.coroutines.sync.c cVar19 = (kotlinx.coroutines.sync.c) anonymousClass1.f25871g;
                            loadType12 = (LoadType) anonymousClass1.f25870f;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            b2Var = cVar19;
                            b2 b2Var1115 = b2.f124493a;
                            b2Var.f(null);
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                            pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g;
                            if (f0.f26408a[loadType12.ordinal()] != 1) {
                                holder9 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar11 = holder9.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.f25870f = loadType12;
                                anonymousClass1.f25871g = holder9;
                                anonymousClass1.f25872h = cVar11;
                                anonymousClass1.f25873i = loadType12;
                                anonymousClass1.f25874j = pageFetcherSnapshot5;
                                anonymousClass1.f25867c = 14;
                                if (cVar11.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                loadType15 = loadType12;
                                f1 f1Var112 = holder9.state.m().get(loadType15);
                                cVar11.f(null);
                                loadType14 = loadType12;
                                f1Var3 = f1Var112;
                                pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                loadType13 = loadType15;
                            } else {
                                pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                loadType13 = loadType12;
                                loadType14 = loadType13;
                                f1Var3 = null;
                            }
                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                            anonymousClass1.f25870f = loadType13;
                            anonymousClass1.f25871g = null;
                            anonymousClass1.f25872h = null;
                            anonymousClass1.f25873i = null;
                            anonymousClass1.f25874j = null;
                            anonymousClass1.f25867c = 15;
                            if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                return objH;
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                            if (loadType13 == LoadType.REFRESH) {
                                holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar12 = holder10.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                anonymousClass1.f25870f = holder10;
                                anonymousClass1.f25871g = cVar12;
                                anonymousClass1.f25867c = 16;
                                if (cVar12.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                holder11 = holder10;
                                cVar13 = cVar12;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                cVar13.f(null);
                                if (!(vVarH3 instanceof v.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                }
                            }
                            return b2.f124493a;
                        case 14:
                            pageFetcherSnapshot5 = (PageFetcherSnapshot) anonymousClass1.f25874j;
                            loadType12 = (LoadType) anonymousClass1.f25873i;
                            cVar11 = (kotlinx.coroutines.sync.c) anonymousClass1.f25872h;
                            holder9 = (PageFetcherSnapshotState.Holder) anonymousClass1.f25871g;
                            loadType15 = (LoadType) anonymousClass1.f25870f;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            f1 f1Var113 = holder9.state.m().get(loadType15);
                            cVar11.f(null);
                            loadType14 = loadType12;
                            f1Var3 = f1Var113;
                            pageFetcherSnapshot6 = pageFetcherSnapshot5;
                            loadType13 = loadType15;
                            anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                            anonymousClass1.f25870f = loadType13;
                            anonymousClass1.f25871g = null;
                            anonymousClass1.f25872h = null;
                            anonymousClass1.f25873i = null;
                            anonymousClass1.f25874j = null;
                            anonymousClass1.f25867c = 15;
                            if (pageFetcherSnapshot6.y(loadType14, f1Var3, anonymousClass1) == objH) {
                                return objH;
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                            if (loadType13 == LoadType.REFRESH) {
                                holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar12 = holder10.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                anonymousClass1.f25870f = holder10;
                                anonymousClass1.f25871g = cVar12;
                                anonymousClass1.f25867c = 16;
                                if (cVar12.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                holder11 = holder10;
                                cVar13 = cVar12;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                cVar13.f(null);
                                if (!(vVarH3 instanceof v.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                }
                            }
                            return b2.f124493a;
                        case 15:
                            loadType13 = (LoadType) anonymousClass1.f25870f;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            if (loadType13 == LoadType.REFRESH) {
                                holder10 = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.stateHolder;
                                cVar12 = holder10.lock;
                                anonymousClass1.f25869e = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                anonymousClass1.f25870f = holder10;
                                anonymousClass1.f25871g = cVar12;
                                anonymousClass1.f25867c = 16;
                                if (cVar12.e(null, anonymousClass1) == objH) {
                                    return objH;
                                }
                                holder11 = holder10;
                                cVar13 = cVar12;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                                cVar13.f(null);
                                if (!(vVarH3 instanceof v.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                                }
                            }
                            return b2.f124493a;
                        case 16:
                            cVar13 = (kotlinx.coroutines.sync.c) anonymousClass1.f25871g;
                            holder11 = (PageFetcherSnapshotState.Holder) anonymousClass1.f25870f;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.f25869e;
                            kotlin.t0.n(obj);
                            vVarH3 = holder11.state.getSourceLoadStates().h(LoadType.REFRESH);
                            cVar13.f(null);
                            if (!(vVarH3 instanceof v.Error)) {
                                PageFetcherSnapshot$pageEventFlow$1.this.f25848g.A(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.f25865c);
                            }
                            return b2.f124493a;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th9) {
                    r10.f(null);
                    throw th9;
                }
            } catch (Throwable th10) {
                b2Var.f(null);
                throw th10;
            }
        } catch (Throwable th11) {
            r10.f(null);
            throw th11;
        }
    }
}
