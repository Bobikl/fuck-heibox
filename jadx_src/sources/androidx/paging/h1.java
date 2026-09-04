package androidx.paging;

import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: WrapperItemKeyedDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010%\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\f0$¢\u0006\u0004\b&\u0010'J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fJ$\u0010\u0013\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0011H\u0016J$\u0010\u0016\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0015H\u0016J$\u0010\u0017\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0015H\u0016J\u0017\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006("}, d2 = {"Landroidx/paging/h1;", "", "K", androidx.exifinterface.media.a.W4, "B", "Landroidx/paging/ItemKeyedDataSource;", "Landroidx/paging/DataSource$c;", "onInvalidatedCallback", "Lkotlin/b2;", ak.av, "o", "g", "", "source", androidx.exifinterface.media.a.S4, "Landroidx/paging/ItemKeyedDataSource$c;", "params", "Landroidx/paging/ItemKeyedDataSource$b;", "callback", "y", "Landroidx/paging/ItemKeyedDataSource$d;", "Landroidx/paging/ItemKeyedDataSource$a;", ak.aG, RXScreenCaptureService.KEY_WIDTH, ChannelListActivity.q.f79586f, "r", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/IdentityHashMap;", "Ljava/util/IdentityHashMap;", "keyMap", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/paging/ItemKeyedDataSource;", "", "i", "()Z", "isInvalid", "Lf0/a;", "listFunction", "<init>", "(Landroidx/paging/ItemKeyedDataSource;Lf0/a;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class h1<K, A, B> extends ItemKeyedDataSource<K, B> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final IdentityHashMap<B, K> keyMap;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ItemKeyedDataSource<K, A> source;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f0.a<List<A>, List<B>> f26433i;

    /* JADX INFO: compiled from: WrapperItemKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\u0006"}, d2 = {"androidx/paging/h1$a", "Landroidx/paging/ItemKeyedDataSource$a;", "", "data", "Lkotlin/b2;", ak.av, "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class a extends ItemKeyedDataSource.a<A> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ItemKeyedDataSource.a f26435b;

        a(ItemKeyedDataSource.a aVar) {
            this.f26435b = aVar;
        }

        @Override // androidx.paging.ItemKeyedDataSource.a
        public void a(@dl.d List<? extends A> data) {
            kotlin.jvm.internal.f0.p(data, "data");
            this.f26435b.a(h1.this.E(data));
        }
    }

    /* JADX INFO: compiled from: WrapperItemKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\u0006"}, d2 = {"androidx/paging/h1$b", "Landroidx/paging/ItemKeyedDataSource$a;", "", "data", "Lkotlin/b2;", ak.av, "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class b extends ItemKeyedDataSource.a<A> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ItemKeyedDataSource.a f26437b;

        b(ItemKeyedDataSource.a aVar) {
            this.f26437b = aVar;
        }

        @Override // androidx.paging.ItemKeyedDataSource.a
        public void a(@dl.d List<? extends A> data) {
            kotlin.jvm.internal.f0.p(data, "data");
            this.f26437b.a(h1.this.E(data));
        }
    }

    /* JADX INFO: compiled from: WrapperItemKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0016\u0010\t\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\n"}, d2 = {"androidx/paging/h1$c", "Landroidx/paging/ItemKeyedDataSource$b;", "", "data", "", CommonNetImpl.POSITION, "totalCount", "Lkotlin/b2;", "b", ak.av, "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class c extends ItemKeyedDataSource.b<A> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ItemKeyedDataSource.b f26439b;

        c(ItemKeyedDataSource.b bVar) {
            this.f26439b = bVar;
        }

        @Override // androidx.paging.ItemKeyedDataSource.a
        public void a(@dl.d List<? extends A> data) {
            kotlin.jvm.internal.f0.p(data, "data");
            this.f26439b.a(h1.this.E(data));
        }

        @Override // androidx.paging.ItemKeyedDataSource.b
        public void b(@dl.d List<? extends A> data, int i10, int i11) {
            kotlin.jvm.internal.f0.p(data, "data");
            this.f26439b.b(h1.this.E(data), i10, i11);
        }
    }

    public h1(@dl.d ItemKeyedDataSource<K, A> source, @dl.d f0.a<List<A>, List<B>> listFunction) {
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(listFunction, "listFunction");
        this.source = source;
        this.f26433i = listFunction;
        this.keyMap = new IdentityHashMap<>();
    }

    @dl.d
    public final List<B> E(@dl.d List<? extends A> source) {
        kotlin.jvm.internal.f0.p(source, "source");
        List<B> listA = DataSource.INSTANCE.a(this.f26433i, source);
        synchronized (this.keyMap) {
            int size = listA.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.keyMap.put(listA.get(i10), this.source.r(source.get(i10)));
            }
            b2 b2Var = b2.f124493a;
        }
        return listA;
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

    @Override // androidx.paging.ItemKeyedDataSource
    @dl.d
    public K r(@dl.d B item) {
        K k10;
        kotlin.jvm.internal.f0.p(item, "item");
        synchronized (this.keyMap) {
            k10 = this.keyMap.get(item);
            kotlin.jvm.internal.f0.m(k10);
        }
        return k10;
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void u(@dl.d ItemKeyedDataSource.d<K> params, @dl.d ItemKeyedDataSource.a<B> callback) {
        kotlin.jvm.internal.f0.p(params, "params");
        kotlin.jvm.internal.f0.p(callback, "callback");
        this.source.u(params, new a(callback));
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void w(@dl.d ItemKeyedDataSource.d<K> params, @dl.d ItemKeyedDataSource.a<B> callback) {
        kotlin.jvm.internal.f0.p(params, "params");
        kotlin.jvm.internal.f0.p(callback, "callback");
        this.source.w(params, new b(callback));
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void y(@dl.d ItemKeyedDataSource.c<K> params, @dl.d ItemKeyedDataSource.b<B> callback) {
        kotlin.jvm.internal.f0.p(params, "params");
        kotlin.jvm.internal.f0.p(callback, "callback");
        this.source.y(params, new c(callback));
    }
}
