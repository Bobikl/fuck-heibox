package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: WrapperPageKeyedDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\u001e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u001d0\u001c¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u0010\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000eH\u0016J*\u0010\u0013\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0012H\u0016J*\u0010\u0014\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0012H\u0016R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Landroidx/paging/i1;", "", "K", androidx.exifinterface.media.a.W4, "B", "Landroidx/paging/PageKeyedDataSource;", "Landroidx/paging/DataSource$c;", "onInvalidatedCallback", "Lkotlin/b2;", ak.av, "o", "g", "Landroidx/paging/PageKeyedDataSource$c;", "params", "Landroidx/paging/PageKeyedDataSource$b;", "callback", "x", "Landroidx/paging/PageKeyedDataSource$d;", "Landroidx/paging/PageKeyedDataSource$a;", "v", "t", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/paging/PageKeyedDataSource;", "source", "", "i", "()Z", "isInvalid", "Lf0/a;", "", "listFunction", "<init>", "(Landroidx/paging/PageKeyedDataSource;Lf0/a;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class i1<K, A, B> extends PageKeyedDataSource<K, B> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final PageKeyedDataSource<K, A> source;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f0.a<List<A>, List<B>> f26446i;

    /* JADX INFO: compiled from: WrapperPageKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/paging/i1$a", "Landroidx/paging/PageKeyedDataSource$a;", "", "data", "adjacentPageKey", "Lkotlin/b2;", ak.av, "(Ljava/util/List;Ljava/lang/Object;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class a extends PageKeyedDataSource.a<K, A> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PageKeyedDataSource.a f26448b;

        a(PageKeyedDataSource.a aVar) {
            this.f26448b = aVar;
        }

        @Override // androidx.paging.PageKeyedDataSource.a
        public void a(@dl.d List<? extends A> data, @dl.e K adjacentPageKey) {
            kotlin.jvm.internal.f0.p(data, "data");
            this.f26448b.a(DataSource.INSTANCE.a(i1.this.f26446i, data), adjacentPageKey);
        }
    }

    /* JADX INFO: compiled from: WrapperPageKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/paging/i1$b", "Landroidx/paging/PageKeyedDataSource$a;", "", "data", "adjacentPageKey", "Lkotlin/b2;", ak.av, "(Ljava/util/List;Ljava/lang/Object;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class b extends PageKeyedDataSource.a<K, A> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PageKeyedDataSource.a f26450b;

        b(PageKeyedDataSource.a aVar) {
            this.f26450b = aVar;
        }

        @Override // androidx.paging.PageKeyedDataSource.a
        public void a(@dl.d List<? extends A> data, @dl.e K adjacentPageKey) {
            kotlin.jvm.internal.f0.p(data, "data");
            this.f26450b.a(DataSource.INSTANCE.a(i1.this.f26446i, data), adjacentPageKey);
        }
    }

    /* JADX INFO: compiled from: WrapperPageKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001JA\u0010\n\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\f\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/paging/i1$c", "Landroidx/paging/PageKeyedDataSource$b;", "", "data", "", CommonNetImpl.POSITION, "totalCount", "previousPageKey", "nextPageKey", "Lkotlin/b2;", ak.av, "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "b", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class c extends PageKeyedDataSource.b<K, A> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PageKeyedDataSource.b f26452b;

        c(PageKeyedDataSource.b bVar) {
            this.f26452b = bVar;
        }

        @Override // androidx.paging.PageKeyedDataSource.b
        public void a(@dl.d List<? extends A> data, int position, int totalCount, @dl.e K previousPageKey, @dl.e K nextPageKey) {
            kotlin.jvm.internal.f0.p(data, "data");
            this.f26452b.a(DataSource.INSTANCE.a(i1.this.f26446i, data), position, totalCount, previousPageKey, nextPageKey);
        }

        @Override // androidx.paging.PageKeyedDataSource.b
        public void b(@dl.d List<? extends A> data, @dl.e K previousPageKey, @dl.e K nextPageKey) {
            kotlin.jvm.internal.f0.p(data, "data");
            this.f26452b.b(DataSource.INSTANCE.a(i1.this.f26446i, data), previousPageKey, nextPageKey);
        }
    }

    public i1(@dl.d PageKeyedDataSource<K, A> source, @dl.d f0.a<List<A>, List<B>> listFunction) {
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(listFunction, "listFunction");
        this.source = source;
        this.f26446i = listFunction;
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

    @Override // androidx.paging.PageKeyedDataSource
    public void t(@dl.d PageKeyedDataSource.d<K> params, @dl.d PageKeyedDataSource.a<K, B> callback) {
        kotlin.jvm.internal.f0.p(params, "params");
        kotlin.jvm.internal.f0.p(callback, "callback");
        this.source.t(params, new a(callback));
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void v(@dl.d PageKeyedDataSource.d<K> params, @dl.d PageKeyedDataSource.a<K, B> callback) {
        kotlin.jvm.internal.f0.p(params, "params");
        kotlin.jvm.internal.f0.p(callback, "callback");
        this.source.v(params, new b(callback));
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void x(@dl.d PageKeyedDataSource.c<K> params, @dl.d PageKeyedDataSource.b<K, B> callback) {
        kotlin.jvm.internal.f0.p(params, "params");
        kotlin.jvm.internal.f0.p(callback, "callback");
        this.source.x(params, new c(callback));
    }
}
