package androidx.paging;

import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: ItemKeyedDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.k(message = "ItemKeyedDataSource is deprecated and has been replaced by PagingSource", replaceWith = @kotlin.s0(expression = "PagingSource<Key, Value>", imports = {"androidx.paging.PagingSource"}))
@Metadata(bv = {}, d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0004.#/0B\u0007¢\u0006\u0004\b,\u0010-J+\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u001c\u001a\u00020\u001b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H&J$\u0010\u001e\u001a\u00020\u001b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u001dH&J$\u0010\u001f\u001a\u00020\u001b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u001dH&J\u0017\u0010!\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0001H&¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0001H\u0010¢\u0006\u0004\b#\u0010\"J<\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010$*\u00020\u00012\u001e\u0010&\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000e0%J<\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010$*\u00020\u00012\u001e\u0010&\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000e0(J0\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010$*\u00020\u00012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020%J0\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010$*\u00020\u00012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020(\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Landroidx/paging/ItemKeyedDataSource;", "", "Key", "Value", "Landroidx/paging/DataSource;", "Lkotlinx/coroutines/p;", "Landroidx/paging/DataSource$a;", "androidx/paging/ItemKeyedDataSource$e", "q", "(Lkotlinx/coroutines/p;)Landroidx/paging/ItemKeyedDataSource$e;", "Landroidx/paging/DataSource$d;", "params", "j", "(Landroidx/paging/DataSource$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "t", "(Ljava/util/List;)Ljava/lang/Object;", ak.aB, "Landroidx/paging/ItemKeyedDataSource$c;", ak.aD, "(Landroidx/paging/ItemKeyedDataSource$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/ItemKeyedDataSource$d;", "x", "(Landroidx/paging/ItemKeyedDataSource$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "v", "Landroidx/paging/ItemKeyedDataSource$b;", "callback", "Lkotlin/b2;", "y", "Landroidx/paging/ItemKeyedDataSource$a;", ak.aG, RXScreenCaptureService.KEY_WIDTH, ChannelListActivity.q.f79586f, "r", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "ToValue", "Lf0/a;", "function", "C", "Lkotlin/Function1;", "D", androidx.exifinterface.media.a.W4, "B", "<init>", "()V", ak.av, ak.aF, "d", "paging-common"}, k = 1, mv = {1, 4, 2})
public abstract class ItemKeyedDataSource<Key, Value> extends DataSource<Key, Value> {

    /* JADX INFO: compiled from: ItemKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003H&¨\u0006\t"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$a;", "Value", "", "", "data", "Lkotlin/b2;", ak.av, "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class a<Value> {
        public abstract void a(@dl.d List<? extends Value> list);
    }

    /* JADX INFO: compiled from: ItemKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$b;", "Value", "Landroidx/paging/ItemKeyedDataSource$a;", "", "data", "", CommonNetImpl.POSITION, "totalCount", "Lkotlin/b2;", "b", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class b<Value> extends a<Value> {
        public abstract void b(@dl.d List<? extends Value> list, int i10, int i11);
    }

    /* JADX INFO: compiled from: ItemKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B!\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00018\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$c;", "", "Key", ak.av, "Ljava/lang/Object;", "requestedInitialKey", "", "b", "I", "requestedLoadSize", "", ak.aF, "Z", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static class c<Key> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.e
        @xh.e
        public final Key requestedInitialKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int requestedLoadSize;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final boolean placeholdersEnabled;

        public c(@dl.e Key key, int i10, boolean z10) {
            this.requestedInitialKey = key;
            this.requestedLoadSize = i10;
            this.placeholdersEnabled = z10;
        }
    }

    /* JADX INFO: compiled from: ItemKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00028\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$d;", "", "Key", ak.av, "Ljava/lang/Object;", "key", "", "b", "I", "requestedLoadSize", "<init>", "(Ljava/lang/Object;I)V", "paging-common"}, k = 1, mv = {1, 4, 2})
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

    /* JADX INFO: compiled from: ItemKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\u0006"}, d2 = {"androidx/paging/ItemKeyedDataSource$e", "Landroidx/paging/ItemKeyedDataSource$a;", "", "data", "Lkotlin/b2;", ak.av, "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class e extends a<Value> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p f25588b;

        e(kotlinx.coroutines.p<? super DataSource.a<Value>> pVar) {
            this.f25588b = pVar;
        }

        @Override // androidx.paging.ItemKeyedDataSource.a
        public void a(@dl.d List<? extends Value> data) {
            kotlin.jvm.internal.f0.p(data, "data");
            kotlinx.coroutines.p pVar = this.f25588b;
            DataSource.a aVar = new DataSource.a(data, ItemKeyedDataSource.this.t(data), ItemKeyedDataSource.this.s(data), 0, 0, 24, null);
            Result.a aVar2 = Result.f124476c;
            pVar.resumeWith(Result.b(aVar));
        }
    }

    /* JADX INFO: compiled from: ItemKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0016\u0010\t\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"androidx/paging/ItemKeyedDataSource$loadInitial$2$1", "Landroidx/paging/ItemKeyedDataSource$b;", "", "data", "", CommonNetImpl.POSITION, "totalCount", "Lkotlin/b2;", "b", ak.av, "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class f extends b<Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p f25589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ItemKeyedDataSource f25590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f25591c;

        f(kotlinx.coroutines.p pVar, ItemKeyedDataSource itemKeyedDataSource, c cVar) {
            this.f25589a = pVar;
            this.f25590b = itemKeyedDataSource;
            this.f25591c = cVar;
        }

        @Override // androidx.paging.ItemKeyedDataSource.a
        public void a(@dl.d List<? extends Value> data) {
            kotlin.jvm.internal.f0.p(data, "data");
            kotlinx.coroutines.p pVar = this.f25589a;
            DataSource.a aVar = new DataSource.a(data, this.f25590b.t(data), this.f25590b.s(data), 0, 0, 24, null);
            Result.a aVar2 = Result.f124476c;
            pVar.resumeWith(Result.b(aVar));
        }

        @Override // androidx.paging.ItemKeyedDataSource.b
        public void b(@dl.d List<? extends Value> data, int i10, int i11) {
            kotlin.jvm.internal.f0.p(data, "data");
            kotlinx.coroutines.p pVar = this.f25589a;
            DataSource.a aVar = new DataSource.a(data, this.f25590b.t(data), this.f25590b.s(data), i10, (i11 - data.size()) - i10);
            Result.a aVar2 = Result.f124476c;
            pVar.resumeWith(Result.b(aVar));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [ToValue] */
    /* JADX INFO: compiled from: ItemKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0002 \u0005*\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "ToValue", "Key", "Value", "", "kotlin.jvm.PlatformType", "list", ak.av, "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 4, 2})
    public static final class g<I, O, ToValue> implements f0.a<List<? extends Value>, List<? extends ToValue>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0.a f25592a;

        g(f0.a aVar) {
            this.f25592a = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ToValue> apply(List<? extends Value> list) {
            kotlin.jvm.internal.f0.o(list, "list");
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.f25592a.apply(it.next()));
            }
            return arrayList;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [ToValue] */
    /* JADX INFO: compiled from: ItemKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0002 \u0005*\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "ToValue", "Key", "Value", "", "kotlin.jvm.PlatformType", "list", ak.av, "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 4, 2})
    public static final class h<I, O, ToValue> implements f0.a<List<? extends Value>, List<? extends ToValue>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.l f25593a;

        h(yh.l lVar) {
            this.f25593a = lVar;
        }

        @Override // f0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ToValue> apply(List<? extends Value> list) {
            kotlin.jvm.internal.f0.o(list, "list");
            yh.l lVar = this.f25593a;
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(lVar.invoke(it.next()));
            }
            return arrayList;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [ToValue] */
    /* JADX INFO: compiled from: ItemKeyedDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0002 \u0005*\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "ToValue", "Key", "Value", "", "kotlin.jvm.PlatformType", "it", ak.av, "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 4, 2})
    public static final class i<I, O, ToValue> implements f0.a<List<? extends Value>, List<? extends ToValue>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.l f25594a;

        i(yh.l lVar) {
            this.f25594a = lVar;
        }

        @Override // f0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ToValue> apply(List<? extends Value> it) {
            yh.l lVar = this.f25594a;
            kotlin.jvm.internal.f0.o(it, "it");
            return (List) lVar.invoke(it);
        }
    }

    public ItemKeyedDataSource() {
        super(DataSource.KeyType.ITEM_KEYED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e q(kotlinx.coroutines.p<? super DataSource.a<Value>> pVar) {
        return new e(pVar);
    }

    @Override // androidx.paging.DataSource
    @dl.d
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> k(@dl.d f0.a<Value, ToValue> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return m(new g(function));
    }

    @Override // androidx.paging.DataSource
    @dl.d
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> l(@dl.d yh.l<? super Value, ? extends ToValue> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return m(new h(function));
    }

    @Override // androidx.paging.DataSource
    @dl.d
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> m(@dl.d f0.a<List<Value>, List<ToValue>> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return new h1(this, function);
    }

    @Override // androidx.paging.DataSource
    @dl.d
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> n(@dl.d yh.l<? super List<? extends Value>, ? extends List<? extends ToValue>> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return m(new i(function));
    }

    @Override // androidx.paging.DataSource
    @dl.d
    public Key b(@dl.d Value item) {
        kotlin.jvm.internal.f0.p(item, "item");
        return r(item);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.paging.DataSource
    @dl.e
    public final Object j(@dl.d DataSource.d<Key> dVar, @dl.d kotlin.coroutines.c<? super DataSource.a<Value>> cVar) throws Throwable {
        ItemKeyedDataSource$load$1 itemKeyedDataSource$load$1;
        if (cVar instanceof ItemKeyedDataSource$load$1) {
            itemKeyedDataSource$load$1 = (ItemKeyedDataSource$load$1) cVar;
            int i10 = itemKeyedDataSource$load$1.f25596c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                itemKeyedDataSource$load$1.f25596c = i10 - Integer.MIN_VALUE;
            } else {
                itemKeyedDataSource$load$1 = new ItemKeyedDataSource$load$1(this, cVar);
            }
        } else {
            itemKeyedDataSource$load$1 = new ItemKeyedDataSource$load$1(this, cVar);
        }
        Object objZ = itemKeyedDataSource$load$1.f25595b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = itemKeyedDataSource$load$1.f25596c;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.t0.n(objZ);
                return (DataSource.a) objZ;
            }
            if (i11 == 2) {
                kotlin.t0.n(objZ);
                return (DataSource.a) objZ;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(objZ);
            return (DataSource.a) objZ;
        }
        kotlin.t0.n(objZ);
        int i12 = o.f26582a[dVar.getType().ordinal()];
        if (i12 == 1) {
            c<Key> cVar2 = new c<>(dVar.b(), dVar.getInitialLoadSize(), dVar.getPlaceholdersEnabled());
            itemKeyedDataSource$load$1.f25596c = 1;
            objZ = z(cVar2, itemKeyedDataSource$load$1);
            if (objZ == objH) {
                return objH;
            }
            return (DataSource.a) objZ;
        }
        if (i12 == 2) {
            Key keyB = dVar.b();
            kotlin.jvm.internal.f0.m(keyB);
            d<Key> dVar2 = new d<>(keyB, dVar.getPageSize());
            itemKeyedDataSource$load$1.f25596c = 2;
            objZ = x(dVar2, itemKeyedDataSource$load$1);
            if (objZ == objH) {
                return objH;
            }
            return (DataSource.a) objZ;
        }
        if (i12 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Key keyB2 = dVar.b();
        kotlin.jvm.internal.f0.m(keyB2);
        d<Key> dVar3 = new d<>(keyB2, dVar.getPageSize());
        itemKeyedDataSource$load$1.f25596c = 3;
        objZ = v(dVar3, itemKeyedDataSource$load$1);
        if (objZ == objH) {
            return objH;
        }
        return (DataSource.a) objZ;
    }

    @dl.d
    public abstract Key r(@dl.d Value item);

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final Key s(@dl.d List<? extends Value> getNextKey) {
        kotlin.jvm.internal.f0.p(getNextKey, "$this$getNextKey");
        Object objQ3 = CollectionsKt___CollectionsKt.q3(getNextKey);
        if (objQ3 != null) {
            return (Key) r(objQ3);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final Key t(@dl.d List<? extends Value> getPrevKey) {
        kotlin.jvm.internal.f0.p(getPrevKey, "$this$getPrevKey");
        Object objB2 = CollectionsKt___CollectionsKt.B2(getPrevKey);
        if (objB2 != null) {
            return (Key) r(objB2);
        }
        return null;
    }

    public abstract void u(@dl.d d<Key> dVar, @dl.d a<Value> aVar);

    @androidx.annotation.j1
    @dl.e
    public final Object v(@dl.d d<Key> dVar, @dl.d kotlin.coroutines.c<? super DataSource.a<Value>> cVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        u(dVar, q(qVar));
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    public abstract void w(@dl.d d<Key> dVar, @dl.d a<Value> aVar);

    @androidx.annotation.j1
    @dl.e
    public final Object x(@dl.d d<Key> dVar, @dl.d kotlin.coroutines.c<? super DataSource.a<Value>> cVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        w(dVar, q(qVar));
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    public abstract void y(@dl.d c<Key> cVar, @dl.d b<Value> bVar);

    @androidx.annotation.j1
    @dl.e
    public final Object z(@dl.d c<Key> cVar, @dl.d kotlin.coroutines.c<? super DataSource.a<Value>> cVar2) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar2), 1);
        qVar.F0();
        y(cVar, new f(qVar, this, cVar));
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar2);
        }
        return objT;
    }
}
