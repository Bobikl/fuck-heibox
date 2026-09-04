package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: WrapperPositionalDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0004B5\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001e\u0010\u001b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001a0\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016J\u001e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0017R/\u0010\u001b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/paging/j1;", "", androidx.exifinterface.media.a.W4, "B", "Landroidx/paging/u0;", "Landroidx/paging/DataSource$c;", "onInvalidatedCallback", "Lkotlin/b2;", ak.av, "o", "g", "Landroidx/paging/u0$c;", "params", "Landroidx/paging/u0$b;", "callback", "t", "Landroidx/paging/u0$e;", "Landroidx/paging/u0$d;", RXScreenCaptureService.KEY_WIDTH, "i", "Landroidx/paging/u0;", "source", "", "()Z", "isInvalid", "Lf0/a;", "", "listFunction", "Lf0/a;", "()Lf0/a;", "<init>", "(Landroidx/paging/u0;Lf0/a;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class j1<A, B> extends u0<B> {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final u0<A> source;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final f0.a<List<A>, List<B>> f26456j;

    /* JADX INFO: compiled from: WrapperPositionalDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u001e\u0010\t\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"androidx/paging/j1$a", "Landroidx/paging/u0$b;", "", "data", "", CommonNetImpl.POSITION, "totalCount", "Lkotlin/b2;", "b", ak.av, "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class a extends u0.b<A> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0.b f26458b;

        a(u0.b bVar) {
            this.f26458b = bVar;
        }

        @Override // androidx.paging.u0.b
        public void a(@dl.d List<? extends A> data, int i10) {
            kotlin.jvm.internal.f0.p(data, "data");
            this.f26458b.a(DataSource.INSTANCE.a(j1.this.B(), data), i10);
        }

        @Override // androidx.paging.u0.b
        public void b(@dl.d List<? extends A> data, int i10, int i11) {
            kotlin.jvm.internal.f0.p(data, "data");
            this.f26458b.b(DataSource.INSTANCE.a(j1.this.B(), data), i10, i11);
        }
    }

    /* JADX INFO: compiled from: WrapperPositionalDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\u0006"}, d2 = {"androidx/paging/j1$b", "Landroidx/paging/u0$d;", "", "data", "Lkotlin/b2;", ak.av, "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class b extends u0.d<A> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0.d f26460b;

        b(u0.d dVar) {
            this.f26460b = dVar;
        }

        @Override // androidx.paging.u0.d
        public void a(@dl.d List<? extends A> data) {
            kotlin.jvm.internal.f0.p(data, "data");
            this.f26460b.a(DataSource.INSTANCE.a(j1.this.B(), data));
        }
    }

    public j1(@dl.d u0<A> source, @dl.d f0.a<List<A>, List<B>> listFunction) {
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(listFunction, "listFunction");
        this.source = source;
        this.f26456j = listFunction;
    }

    @dl.d
    public final f0.a<List<A>, List<B>> B() {
        return this.f26456j;
    }

    @Override // androidx.paging.DataSource
    public void a(@dl.d DataSource.c onInvalidatedCallback) {
        kotlin.jvm.internal.f0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.a(onInvalidatedCallback);
    }

    @Override // androidx.paging.DataSource
    public void g() {
        this.source.g();
    }

    @Override // androidx.paging.DataSource
    public boolean i() {
        return this.source.i();
    }

    @Override // androidx.paging.DataSource
    public void o(@dl.d DataSource.c onInvalidatedCallback) {
        kotlin.jvm.internal.f0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.o(onInvalidatedCallback);
    }

    @Override // androidx.paging.u0
    public void t(@dl.d u0.c params, @dl.d u0.b<B> callback) {
        kotlin.jvm.internal.f0.p(params, "params");
        kotlin.jvm.internal.f0.p(callback, "callback");
        this.source.t(params, new a(callback));
    }

    @Override // androidx.paging.u0
    public void w(@dl.d u0.e params, @dl.d u0.d<B> callback) {
        kotlin.jvm.internal.f0.p(params, "params");
        kotlin.jvm.internal.f0.p(callback, "callback");
        this.source.w(params, new b(callback));
    }
}
