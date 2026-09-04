package androidx.paging;

import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: PageKeyedDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.k(message = "PageKeyedDataSource is deprecated and has been replaced by PagingSource", replaceWith = @kotlin.s0(expression = "PagingSource<Key, Value>", imports = {"androidx.paging.PagingSource"}))
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u00041\u001e23B\u0007¢\u0006\u0004\b0\u0010.J0\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0015J*\u0010\u001a\u001a\u00020\u00192\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017H&J*\u0010\u001b\u001a\u00020\u00192\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH&J*\u0010\u001c\u001a\u00020\u00192\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH&J\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u0001H\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010 *\u00020\u00012\u001e\u0010#\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\"0!J<\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010 *\u00020\u00012\u001e\u0010#\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\"0%J0\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010 *\u00020\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020!J0\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010 *\u00020\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020%R \u0010/\u001a\u00020\b8\u0010X\u0090D¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Landroidx/paging/PageKeyedDataSource;", "", "Key", "Value", "Landroidx/paging/DataSource;", "Lkotlinx/coroutines/p;", "Landroidx/paging/DataSource$a;", "continuation", "", "isAppend", "Landroidx/paging/PageKeyedDataSource$a;", "q", "Landroidx/paging/DataSource$d;", "params", "j", "(Landroidx/paging/DataSource$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/PageKeyedDataSource$c;", RXScreenCaptureService.KEY_WIDTH, "(Landroidx/paging/PageKeyedDataSource$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/PageKeyedDataSource$d;", ak.aG, "(Landroidx/paging/PageKeyedDataSource$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aB, "Landroidx/paging/PageKeyedDataSource$b;", "callback", "Lkotlin/b2;", "x", "v", "t", ChannelListActivity.q.f79586f, "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "ToValue", "Lf0/a;", "", "function", androidx.exifinterface.media.a.W4, "Lkotlin/Function1;", "B", "y", ak.aD, "g", "Z", "e", "()Z", "getSupportsPageDropping$paging_common$annotations", "()V", "supportsPageDropping", "<init>", ak.av, ak.aF, "d", "paging-common"}, k = 1, mv = {1, 4, 2})
public abstract class PageKeyedDataSource<Key, Value> extends DataSource<Key, Value> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsPageDropping;

    /* JADX INFO: compiled from: PageKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\b\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/paging/PageKeyedDataSource$a;", "Key", "Value", "", "", "data", "adjacentPageKey", "Lkotlin/b2;", ak.av, "(Ljava/util/List;Ljava/lang/Object;)V", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class a<Key, Value> {
        public abstract void a(@dl.d List<? extends Value> data, @dl.e Key adjacentPageKey);
    }

    /* JADX INFO: compiled from: PageKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00018\u00022\b\u0010\n\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000e\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\b\u0010\t\u001a\u0004\u0018\u00018\u00022\b\u0010\n\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/paging/PageKeyedDataSource$b;", "Key", "Value", "", "", "data", "", CommonNetImpl.POSITION, "totalCount", "previousPageKey", "nextPageKey", "Lkotlin/b2;", ak.av, "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "b", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class b<Key, Value> {
        public abstract void a(@dl.d List<? extends Value> data, int position, int totalCount, @dl.e Key previousPageKey, @dl.e Key nextPageKey);

        public abstract void b(@dl.d List<? extends Value> data, @dl.e Key previousPageKey, @dl.e Key nextPageKey);
    }

    /* JADX INFO: compiled from: PageKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/paging/PageKeyedDataSource$c;", "", "Key", "", ak.av, "I", "requestedLoadSize", "", "b", "Z", "placeholdersEnabled", "<init>", "(IZ)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static class c<Key> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int requestedLoadSize;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final boolean placeholdersEnabled;

        public c(int i10, boolean z10) {
            this.requestedLoadSize = i10;
            this.placeholdersEnabled = z10;
        }
    }

    /* JADX INFO: compiled from: PageKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00028\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/paging/PageKeyedDataSource$d;", "", "Key", ak.av, "Ljava/lang/Object;", "key", "", "b", "I", "requestedLoadSize", "<init>", "(Ljava/lang/Object;I)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static class d<Key> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final Key key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int requestedLoadSize;

        public d(@dl.d Key key, int i10) {
            kotlin.jvm.internal.f0.p(key, "key");
            this.key = key;
            this.requestedLoadSize = i10;
        }
    }

    /* JADX INFO: compiled from: PageKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/paging/PageKeyedDataSource$e", "Landroidx/paging/PageKeyedDataSource$a;", "", "data", "adjacentPageKey", "Lkotlin/b2;", ak.av, "(Ljava/util/List;Ljava/lang/Object;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class e extends a<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p f25932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f25933b;

        e(kotlinx.coroutines.p pVar, boolean z10) {
            this.f25932a = pVar;
            this.f25933b = z10;
        }

        @Override // androidx.paging.PageKeyedDataSource.a
        public void a(@dl.d List<? extends Value> data, @dl.e Key adjacentPageKey) {
            kotlin.jvm.internal.f0.p(data, "data");
            kotlinx.coroutines.p pVar = this.f25932a;
            boolean z10 = this.f25933b;
            DataSource.a aVar = new DataSource.a(data, z10 ? null : adjacentPageKey, z10 ? adjacentPageKey : null, 0, 0, 24, null);
            Result.a aVar2 = Result.f124476c;
            pVar.resumeWith(Result.b(aVar));
        }
    }

    /* JADX INFO: compiled from: PageKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001JA\u0010\n\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\f\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/paging/PageKeyedDataSource$f", "Landroidx/paging/PageKeyedDataSource$b;", "", "data", "", CommonNetImpl.POSITION, "totalCount", "previousPageKey", "nextPageKey", "Lkotlin/b2;", ak.av, "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "b", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class f extends b<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p f25934a;

        f(kotlinx.coroutines.p pVar) {
            this.f25934a = pVar;
        }

        @Override // androidx.paging.PageKeyedDataSource.b
        public void a(@dl.d List<? extends Value> data, int position, int totalCount, @dl.e Key previousPageKey, @dl.e Key nextPageKey) {
            kotlin.jvm.internal.f0.p(data, "data");
            kotlinx.coroutines.p pVar = this.f25934a;
            DataSource.a aVar = new DataSource.a(data, previousPageKey, nextPageKey, position, (totalCount - data.size()) - position);
            Result.a aVar2 = Result.f124476c;
            pVar.resumeWith(Result.b(aVar));
        }

        @Override // androidx.paging.PageKeyedDataSource.b
        public void b(@dl.d List<? extends Value> data, @dl.e Key previousPageKey, @dl.e Key nextPageKey) {
            kotlin.jvm.internal.f0.p(data, "data");
            kotlinx.coroutines.p pVar = this.f25934a;
            DataSource.a aVar = new DataSource.a(data, previousPageKey, nextPageKey, 0, 0, 24, null);
            Result.a aVar2 = Result.f124476c;
            pVar.resumeWith(Result.b(aVar));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [ToValue] */
    /* JADX INFO: compiled from: PageKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0002 \u0005*\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "ToValue", "Key", "Value", "", "kotlin.jvm.PlatformType", "list", ak.av, "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 4, 2})
    public static final class g<I, O, ToValue> implements f0.a<List<? extends Value>, List<? extends ToValue>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0.a f25935a;

        g(f0.a aVar) {
            this.f25935a = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ToValue> apply(List<? extends Value> list) {
            kotlin.jvm.internal.f0.o(list, "list");
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.f25935a.apply(it.next()));
            }
            return arrayList;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [ToValue] */
    /* JADX INFO: compiled from: PageKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0002 \u0005*\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "ToValue", "Key", "Value", "", "kotlin.jvm.PlatformType", "list", ak.av, "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 4, 2})
    public static final class h<I, O, ToValue> implements f0.a<List<? extends Value>, List<? extends ToValue>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.l f25936a;

        h(yh.l lVar) {
            this.f25936a = lVar;
        }

        @Override // f0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ToValue> apply(List<? extends Value> list) {
            kotlin.jvm.internal.f0.o(list, "list");
            yh.l lVar = this.f25936a;
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(lVar.invoke(it.next()));
            }
            return arrayList;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [ToValue] */
    /* JADX INFO: compiled from: PageKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0002 \u0005*\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "ToValue", "Key", "Value", "", "kotlin.jvm.PlatformType", "it", ak.av, "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 4, 2})
    public static final class i<I, O, ToValue> implements f0.a<List<? extends Value>, List<? extends ToValue>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.l f25937a;

        i(yh.l lVar) {
            this.f25937a = lVar;
        }

        @Override // f0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ToValue> apply(List<? extends Value> it) {
            yh.l lVar = this.f25937a;
            kotlin.jvm.internal.f0.o(it, "it");
            return (List) lVar.invoke(it);
        }
    }

    public PageKeyedDataSource() {
        super(DataSource.KeyType.PAGE_KEYED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a<Key, Value> q(kotlinx.coroutines.p<? super DataSource.a<Value>> continuation, boolean isAppend) {
        return new e(continuation, isAppend);
    }

    public static /* synthetic */ void r() {
    }

    @Override // androidx.paging.DataSource
    @dl.d
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final <ToValue> PageKeyedDataSource<Key, ToValue> m(@dl.d f0.a<List<Value>, List<ToValue>> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return new i1(this, function);
    }

    @Override // androidx.paging.DataSource
    @dl.d
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final <ToValue> PageKeyedDataSource<Key, ToValue> n(@dl.d yh.l<? super List<? extends Value>, ? extends List<? extends ToValue>> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return m(new i(function));
    }

    @Override // androidx.paging.DataSource
    @dl.d
    public Key b(@dl.d Value item) {
        kotlin.jvm.internal.f0.p(item, "item");
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // androidx.paging.DataSource
    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getSupportsPageDropping() {
        return this.supportsPageDropping;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.paging.DataSource
    @dl.e
    public final Object j(@dl.d DataSource.d<Key> dVar, @dl.d kotlin.coroutines.c<? super DataSource.a<Value>> cVar) throws Throwable {
        PageKeyedDataSource$load$1 pageKeyedDataSource$load$1;
        if (cVar instanceof PageKeyedDataSource$load$1) {
            pageKeyedDataSource$load$1 = (PageKeyedDataSource$load$1) cVar;
            int i10 = pageKeyedDataSource$load$1.f25939c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pageKeyedDataSource$load$1.f25939c = i10 - Integer.MIN_VALUE;
            } else {
                pageKeyedDataSource$load$1 = new PageKeyedDataSource$load$1(this, cVar);
            }
        } else {
            pageKeyedDataSource$load$1 = new PageKeyedDataSource$load$1(this, cVar);
        }
        Object objS = pageKeyedDataSource$load$1.f25938b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = pageKeyedDataSource$load$1.f25939c;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.t0.n(objS);
                return (DataSource.a) objS;
            }
            if (i11 == 2) {
                kotlin.t0.n(objS);
                return (DataSource.a) objS;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(objS);
            return (DataSource.a) objS;
        }
        kotlin.t0.n(objS);
        if (dVar.getType() == LoadType.REFRESH) {
            c<Key> cVar2 = new c<>(dVar.getInitialLoadSize(), dVar.getPlaceholdersEnabled());
            pageKeyedDataSource$load$1.f25939c = 1;
            objS = w(cVar2, pageKeyedDataSource$load$1);
            if (objS == objH) {
                return objH;
            }
            return (DataSource.a) objS;
        }
        if (dVar.b() == null) {
            return DataSource.a.INSTANCE.b();
        }
        if (dVar.getType() == LoadType.PREPEND) {
            d<Key> dVar2 = new d<>(dVar.b(), dVar.getPageSize());
            pageKeyedDataSource$load$1.f25939c = 2;
            objS = u(dVar2, pageKeyedDataSource$load$1);
            if (objS == objH) {
                return objH;
            }
            return (DataSource.a) objS;
        }
        if (dVar.getType() != LoadType.APPEND) {
            throw new IllegalArgumentException("Unsupported type " + dVar.getType().toString());
        }
        d<Key> dVar3 = new d<>(dVar.b(), dVar.getPageSize());
        pageKeyedDataSource$load$1.f25939c = 3;
        objS = s(dVar3, pageKeyedDataSource$load$1);
        if (objS == objH) {
            return objH;
        }
        return (DataSource.a) objS;
    }

    final /* synthetic */ Object s(d<Key> dVar, kotlin.coroutines.c<? super DataSource.a<Value>> cVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        t(dVar, q(qVar, true));
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    public abstract void t(@dl.d d<Key> dVar, @dl.d a<Key, Value> aVar);

    final /* synthetic */ Object u(d<Key> dVar, kotlin.coroutines.c<? super DataSource.a<Value>> cVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        v(dVar, q(qVar, false));
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    public abstract void v(@dl.d d<Key> dVar, @dl.d a<Key, Value> aVar);

    final /* synthetic */ Object w(c<Key> cVar, kotlin.coroutines.c<? super DataSource.a<Value>> cVar2) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar2), 1);
        qVar.F0();
        x(cVar, new f(qVar));
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar2);
        }
        return objT;
    }

    public abstract void x(@dl.d c<Key> cVar, @dl.d b<Key, Value> bVar);

    @Override // androidx.paging.DataSource
    @dl.d
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final <ToValue> PageKeyedDataSource<Key, ToValue> k(@dl.d f0.a<Value, ToValue> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return m(new g(function));
    }

    @Override // androidx.paging.DataSource
    @dl.d
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final <ToValue> PageKeyedDataSource<Key, ToValue> l(@dl.d yh.l<? super Value, ? extends ToValue> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return m(new h(function));
    }
}
