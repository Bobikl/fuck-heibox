package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 implements kotlinx.coroutines.flow.f<LoadStates> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ PageFetcher$injectRemoteEvents$1.AnonymousClass2 f25763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f25764c;

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1", "emit"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1", f = "PageFetcher.kt", i = {0, 0, 1, 1, 2, 2}, l = {135, 139, 143}, m = "emit", n = {"this", "it", "this", "it", "this", "it"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25766c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f25768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f25769f;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f25765b = obj;
            this.f25766c |= Integer.MIN_VALUE;
            return PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1(PageFetcher$injectRemoteEvents$1.AnonymousClass2 anonymousClass2, Ref.ObjectRef objectRef) {
        this.f25763b = anonymousClass2;
        this.f25764c = objectRef;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:33:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(LoadStates loadStates, @dl.d kotlin.coroutines.c cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1;
        LoadStates loadStates2;
        LoadStates loadStates3;
        boolean z10;
        LoadType loadType;
        PageFetcher$injectRemoteEvents$1.AnonymousClass1 anonymousClass2;
        v vVarI;
        PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$2;
        T t10;
        LoadStates loadStates4;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f25766c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f25766c = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.f25765b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.f25766c;
        if (i11 != 0) {
            if (i11 == 1) {
                LoadStates loadStates5 = (LoadStates) anonymousClass1.f25769f;
                pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 = (PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1) anonymousClass1.f25768e;
                kotlin.t0.n(obj);
                loadStates2 = loadStates5;
            } else {
                if (i11 == 2) {
                    LoadStates loadStates6 = (LoadStates) anonymousClass1.f25769f;
                    pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 = (PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1) anonymousClass1.f25768e;
                    kotlin.t0.n(obj);
                    loadStates3 = loadStates6;
                    loadStates3 = loadStates2;
                    z10 = !kotlin.jvm.internal.f0.g(((LoadStates) pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.f25764c.f124891b).i(), loadStates3.i());
                    t10 = loadStates3;
                    if (z10) {
                        z zVar = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.f25763b.f25761d;
                        loadType = LoadType.APPEND;
                        zVar.j(loadType, true, loadStates3.i());
                        anonymousClass2 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.f25763b.f25762e;
                        vVarI = loadStates3.i();
                        anonymousClass1.f25768e = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1;
                        anonymousClass1.f25769f = loadStates3;
                        anonymousClass1.f25766c = 3;
                        if (anonymousClass2.invoke(loadType, vVarI, anonymousClass1) == objH) {
                            return objH;
                        }
                        pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$2 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1;
                        loadStates4 = loadStates3;
                    }
                    pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.f25764c.f124891b = t10;
                    return b2.f124493a;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                LoadStates loadStates7 = (LoadStates) anonymousClass1.f25769f;
                pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$2 = (PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1) anonymousClass1.f25768e;
                kotlin.t0.n(obj);
                loadStates4 = loadStates7;
            }
            pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$2;
            t10 = loadStates4;
            pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.f25764c.f124891b = t10;
            return b2.f124493a;
        }
        kotlin.t0.n(obj);
        LoadStates loadStates8 = loadStates;
        if (!kotlin.jvm.internal.f0.g(((LoadStates) this.f25764c.f124891b).k(), loadStates8.k())) {
            z zVar2 = this.f25763b.f25761d;
            LoadType loadType2 = LoadType.REFRESH;
            zVar2.j(loadType2, true, loadStates8.k());
            PageFetcher$injectRemoteEvents$1.AnonymousClass1 anonymousClass3 = this.f25763b.f25762e;
            v vVarK = loadStates8.k();
            anonymousClass1.f25768e = this;
            anonymousClass1.f25769f = loadStates8;
            anonymousClass1.f25766c = 1;
            if (anonymousClass3.invoke(loadType2, vVarK, anonymousClass1) == objH) {
                return objH;
            }
        }
        pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 = this;
        loadStates2 = loadStates8;
        boolean z11 = !kotlin.jvm.internal.f0.g(((LoadStates) pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.f25764c.f124891b).j(), loadStates2.j());
        loadStates3 = loadStates2;
        if (z11) {
            z zVar3 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.f25763b.f25761d;
            LoadType loadType3 = LoadType.PREPEND;
            zVar3.j(loadType3, true, loadStates2.j());
            PageFetcher$injectRemoteEvents$1.AnonymousClass1 anonymousClass4 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.f25763b.f25762e;
            v vVarJ = loadStates2.j();
            anonymousClass1.f25768e = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1;
            anonymousClass1.f25769f = loadStates2;
            anonymousClass1.f25766c = 2;
            if (anonymousClass4.invoke(loadType3, vVarJ, anonymousClass1) == objH) {
                loadStates3 = loadStates2;
                return objH;
            }
        }
        loadStates3 = loadStates2;
        z10 = !kotlin.jvm.internal.f0.g(((LoadStates) pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.f25764c.f124891b).i(), loadStates3.i());
        t10 = loadStates3;
        if (z10) {
            z zVar4 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.f25763b.f25761d;
            loadType = LoadType.APPEND;
            zVar4.j(loadType, true, loadStates3.i());
            anonymousClass2 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.f25763b.f25762e;
            vVarI = loadStates3.i();
            anonymousClass1.f25768e = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1;
            anonymousClass1.f25769f = loadStates3;
            anonymousClass1.f25766c = 3;
            if (anonymousClass2.invoke(loadType, vVarI, anonymousClass1) == objH) {
                return objH;
            }
            pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$2 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1;
            loadStates4 = loadStates3;
            pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$2;
            t10 = loadStates4;
        }
        pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.f25764c.f124891b = t10;
        return b2.f124493a;
    }
}
