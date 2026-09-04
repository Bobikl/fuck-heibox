package androidx.paging;

import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: PagingData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0007*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u000bB%\b\u0000\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/paging/o0;", "", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "Landroidx/paging/PageEvent;", ak.av, "Lkotlinx/coroutines/flow/e;", "e", "()Lkotlinx/coroutines/flow/e;", "flow", "Landroidx/paging/e1;", "b", "Landroidx/paging/e1;", "f", "()Landroidx/paging/e1;", SocialConstants.PARAM_RECEIVER, "<init>", "(Lkotlinx/coroutines/flow/e;Landroidx/paging/e1;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class o0<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final e1 f26583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final o0<Object> f26584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.flow.e<PageEvent<T>> flow;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e1 receiver;

    /* JADX INFO: compiled from: PagingData.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/paging/o0$a", "Landroidx/paging/e1;", "Landroidx/paging/f1;", "viewportHint", "Lkotlin/b2;", "I", "H", "refresh", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class a implements e1 {
        a() {
        }

        @Override // androidx.paging.e1
        public void H() {
        }

        @Override // androidx.paging.e1
        public void I(@dl.d f1 viewportHint) {
            kotlin.jvm.internal.f0.p(viewportHint, "viewportHint");
        }

        @Override // androidx.paging.e1
        public void refresh() {
        }
    }

    /* JADX INFO: renamed from: androidx.paging.o0$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PagingData.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u0007J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0007R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/paging/o0$b;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/o0;", ak.av, "", "data", "b", "Landroidx/paging/e1;", "NOOP_RECEIVER", "Landroidx/paging/e1;", "e", "()Landroidx/paging/e1;", "EMPTY", "Landroidx/paging/o0;", ak.aF, "()Landroidx/paging/o0;", "getEMPTY$paging_common$annotations", "()V", "<init>", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ void d() {
        }

        @dl.d
        @xh.m
        public final <T> o0<T> a() {
            o0<T> o0Var = (o0<T>) c();
            if (o0Var != null) {
                return o0Var;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.PagingData<T>");
        }

        @dl.d
        @xh.m
        public final <T> o0<T> b(@dl.d List<? extends T> data) {
            kotlin.jvm.internal.f0.p(data, "data");
            PageEvent.Insert.Companion companion = PageEvent.Insert.INSTANCE;
            List<TransformablePage<T>> listK = kotlin.collections.s.k(new TransformablePage(0, data));
            v.NotLoading.Companion companion2 = v.NotLoading.INSTANCE;
            return new o0<>(kotlinx.coroutines.flow.g.L0(companion.c(listK, 0, 0, new CombinedLoadStates(companion2.b(), companion2.a(), companion2.a(), new LoadStates(companion2.b(), companion2.a(), companion2.a()), null, 16, null))), e());
        }

        @dl.d
        public final o0<Object> c() {
            return o0.f26584d;
        }

        @dl.d
        public final e1 e() {
            return o0.f26583c;
        }
    }

    static {
        a aVar = new a();
        f26583c = aVar;
        f26584d = new o0<>(kotlinx.coroutines.flow.g.L0(PageEvent.Insert.INSTANCE.d()), aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0(@dl.d kotlinx.coroutines.flow.e<? extends PageEvent<T>> flow, @dl.d e1 receiver) {
        kotlin.jvm.internal.f0.p(flow, "flow");
        kotlin.jvm.internal.f0.p(receiver, "receiver");
        this.flow = flow;
        this.receiver = receiver;
    }

    @dl.d
    @xh.m
    public static final <T> o0<T> c() {
        return INSTANCE.a();
    }

    @dl.d
    @xh.m
    public static final <T> o0<T> d(@dl.d List<? extends T> list) {
        return INSTANCE.b(list);
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<PageEvent<T>> e() {
        return this.flow;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final e1 getReceiver() {
        return this.receiver;
    }
}
