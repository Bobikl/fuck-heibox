package androidx.paging;

import androidx.annotation.k1;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: DataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 /*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0006\u0010\u00196\u001d7*B\u0011\b\u0000\u0012\u0006\u00101\u001a\u00020-¢\u0006\u0004\b4\u00105J>\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\u0005H\u0016J>\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\tH\u0016J2\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016J2\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0017J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0017J\b\u0010\u0012\u001a\u00020\u000fH\u0017J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H @ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H ¢\u0006\u0004\b\u0019\u0010\u001aR&\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u001b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u001a\u0010)\u001a\u00020%8\u0010X\u0090D¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\u00020%8\u0010X\u0090D¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u001a\u00101\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020%8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Landroidx/paging/DataSource;", "", "Key", "Value", "ToValue", "Lf0/a;", "", "function", "m", "Lkotlin/Function1;", "n", "k", "l", "Landroidx/paging/DataSource$c;", "onInvalidatedCallback", "Lkotlin/b2;", ak.av, "o", "g", "Landroidx/paging/DataSource$d;", "params", "Landroidx/paging/DataSource$a;", "j", "(Landroidx/paging/DataSource$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", ChannelListActivity.q.f79586f, "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", ak.aF, "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getOnInvalidatedCallbacks$paging_common$annotations", "()V", "onInvalidatedCallbacks", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_invalid", "", "Z", RXScreenCaptureService.KEY_HEIGHT, "()Z", "isContiguous", "d", "e", "supportsPageDropping", "Landroidx/paging/DataSource$KeyType;", "Landroidx/paging/DataSource$KeyType;", "f", "()Landroidx/paging/DataSource$KeyType;", "type", "i", "isInvalid", "<init>", "(Landroidx/paging/DataSource$KeyType;)V", "Factory", "KeyType", "paging-common"}, k = 1, mv = {1, 4, 2})
public abstract class DataSource<Key, Value> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CopyOnWriteArrayList<c> onInvalidatedCallbacks;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean _invalid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isContiguous;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsPageDropping;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final KeyType type;

    /* JADX INFO: compiled from: DataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004H&J2\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00040\u0000\"\b\b\u0004\u0010\u0006*\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0007H\u0016J2\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00040\u0000\"\b\b\u0004\u0010\u0006*\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\nH\u0016J>\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00040\u0000\"\b\b\u0004\u0010\u0006*\u00020\u00012\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\f0\u0007H\u0016J>\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00040\u0000\"\b\b\u0004\u0010\u0006*\u00020\u00012\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\f0\nH\u0016J$\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00120\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¨\u0006\u0016"}, d2 = {"Landroidx/paging/DataSource$Factory;", "", "Key", "Value", "Landroidx/paging/DataSource;", "d", "ToValue", "Lf0/a;", "function", "e", "Lkotlin/Function1;", "f", "", "g", RXScreenCaptureService.KEY_HEIGHT, "Lkotlinx/coroutines/CoroutineDispatcher;", "fetchDispatcher", "Lkotlin/Function0;", "Landroidx/paging/q0;", "b", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class Factory<Key, Value> {

        /* JADX INFO: Add missing generic type declarations: [ToValue] */
        /* JADX INFO: compiled from: DataSource.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0002*\u00020\u0000\"\b\b\u0004\u0010\u0003*\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0004 \u0005*\n\u0012\u0004\u0012\u00028\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "ToValue", "Key", "Value", "", "kotlin.jvm.PlatformType", "list", ak.av, "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 4, 2})
        public static final class a<I, O, ToValue> implements f0.a<List<? extends Value>, List<? extends ToValue>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f0.a f25498a;

            a(f0.a aVar) {
                this.f25498a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // f0.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<ToValue> apply(List<? extends Value> list) {
                kotlin.jvm.internal.f0.o(list, "list");
                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f25498a.apply(it.next()));
                }
                return arrayList;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ToValue] */
        /* JADX INFO: compiled from: DataSource.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0002*\u00020\u0000\"\b\b\u0004\u0010\u0003*\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0004 \u0005*\n\u0012\u0004\u0012\u00028\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "ToValue", "Key", "Value", "", "kotlin.jvm.PlatformType", "list", ak.av, "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 4, 2})
        public static final class b<I, O, ToValue> implements f0.a<List<? extends Value>, List<? extends ToValue>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ yh.l f25501a;

            b(yh.l lVar) {
                this.f25501a = lVar;
            }

            @Override // f0.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<ToValue> apply(List<? extends Value> list) {
                kotlin.jvm.internal.f0.o(list, "list");
                yh.l lVar = this.f25501a;
                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(lVar.invoke(it.next()));
                }
                return arrayList;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ToValue] */
        /* JADX INFO: compiled from: DataSource.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/paging/DataSource$Factory$c", "Landroidx/paging/DataSource$Factory;", "Landroidx/paging/DataSource;", "d", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class c<ToValue> extends Factory<Key, ToValue> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f0.a f25503b;

            c(f0.a aVar) {
                this.f25503b = aVar;
            }

            @Override // androidx.paging.DataSource.Factory
            @dl.d
            public DataSource<Key, ToValue> d() {
                return Factory.this.d().m(this.f25503b);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ToValue] */
        /* JADX INFO: compiled from: DataSource.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0002*\u00020\u0000\"\b\b\u0004\u0010\u0003*\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0004 \u0005*\n\u0012\u0004\u0012\u00028\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "ToValue", "Key", "Value", "", "kotlin.jvm.PlatformType", "it", ak.av, "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 4, 2})
        public static final class d<I, O, ToValue> implements f0.a<List<? extends Value>, List<? extends ToValue>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ yh.l f25504a;

            d(yh.l lVar) {
                this.f25504a = lVar;
            }

            @Override // f0.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<ToValue> apply(List<? extends Value> it) {
                yh.l lVar = this.f25504a;
                kotlin.jvm.internal.f0.o(it, "it");
                return (List) lVar.invoke(it);
            }
        }

        public static /* synthetic */ yh.a c(Factory factory, CoroutineDispatcher coroutineDispatcher, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asPagingSourceFactory");
            }
            if ((i10 & 1) != 0) {
                coroutineDispatcher = kotlinx.coroutines.e1.c();
            }
            return factory.b(coroutineDispatcher);
        }

        @dl.d
        @xh.i
        public final yh.a<q0<Key, Value>> a() {
            return c(this, null, 1, null);
        }

        @dl.d
        @xh.i
        public final yh.a<q0<Key, Value>> b(@dl.d final CoroutineDispatcher fetchDispatcher) {
            kotlin.jvm.internal.f0.p(fetchDispatcher, "fetchDispatcher");
            return new SuspendingPagingSourceFactory(fetchDispatcher, new yh.a<q0<Key, Value>>() { // from class: androidx.paging.DataSource$Factory$asPagingSourceFactory$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final q0<Key, Value> invoke() {
                    return new LegacyPagingSource(fetchDispatcher, this.f25499b.d());
                }
            });
        }

        @dl.d
        public abstract DataSource<Key, Value> d();

        @dl.d
        public <ToValue> Factory<Key, ToValue> e(@dl.d f0.a<Value, ToValue> function) {
            kotlin.jvm.internal.f0.p(function, "function");
            return g(new a(function));
        }

        public /* synthetic */ <ToValue> Factory<Key, ToValue> f(yh.l<? super Value, ? extends ToValue> function) {
            kotlin.jvm.internal.f0.p(function, "function");
            return g(new b(function));
        }

        @dl.d
        public <ToValue> Factory<Key, ToValue> g(@dl.d f0.a<List<Value>, List<ToValue>> function) {
            kotlin.jvm.internal.f0.p(function, "function");
            return new c(function);
        }

        public /* synthetic */ <ToValue> Factory<Key, ToValue> h(yh.l<? super List<? extends Value>, ? extends List<? extends ToValue>> function) {
            kotlin.jvm.internal.f0.p(function, "function");
            return g(new d(function));
        }
    }

    /* JADX INFO: compiled from: DataSource.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/DataSource$KeyType;", "", "(Ljava/lang/String;I)V", "POSITIONAL", "PAGE_KEYED", "ITEM_KEYED", "paging-common"}, k = 1, mv = {1, 4, 2})
    public enum KeyType {
        POSITIONAL,
        PAGE_KEYED,
        ITEM_KEYED
    }

    /* JADX INFO: compiled from: DataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\b\u0000\u0018\u0000 \u001c*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\fB?\b\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\f\u0010\u0017¨\u0006\u001d"}, d2 = {"Landroidx/paging/DataSource$a;", "", "Value", "", "pageSize", "Lkotlin/b2;", "e", "(I)V", "other", "", "equals", "", ak.av, "Ljava/util/List;", "data", "b", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "prevKey", ak.aF, "nextKey", "I", "()I", "itemsBefore", "itemsAfter", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V", "f", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class a<Value> {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final List<Value> data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private final Object prevKey;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private final Object nextKey;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int itemsBefore;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int itemsAfter;

        /* JADX INFO: renamed from: androidx.paging.DataSource$a$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: DataSource.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\b\b\u0003\u0010\u0002*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\b\b\u0003\u0010\u0006*\u00020\u0001\"\b\b\u0004\u0010\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\u001e\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\n0\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/paging/DataSource$a$a;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/DataSource$a;", "b", "()Landroidx/paging/DataSource$a;", "ToValue", "Value", "result", "Lf0/a;", "", "function", ak.av, "(Landroidx/paging/DataSource$a;Lf0/a;)Landroidx/paging/DataSource$a;", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.d
            public final <ToValue, Value> a<Value> a(@dl.d a<ToValue> result, @dl.d f0.a<List<ToValue>, List<Value>> function) {
                kotlin.jvm.internal.f0.p(result, "result");
                kotlin.jvm.internal.f0.p(function, "function");
                return new a<>(DataSource.INSTANCE.a(function, result.data), result.getPrevKey(), result.getNextKey(), result.getItemsBefore(), result.getItemsAfter());
            }

            @dl.d
            public final <T> a<T> b() {
                return new a<>(CollectionsKt__CollectionsKt.E(), null, null, 0, 0);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@dl.d List<? extends Value> data, @dl.e Object obj, @dl.e Object obj2, int i10, int i11) {
            kotlin.jvm.internal.f0.p(data, "data");
            this.data = data;
            this.prevKey = obj;
            this.nextKey = obj2;
            this.itemsBefore = i10;
            this.itemsAfter = i11;
            if (i10 < 0 && i10 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Position must be non-negative");
            }
            if (data.isEmpty() && (i10 > 0 || i11 > 0)) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
            if (i11 < 0 && i11 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
        }

        public /* synthetic */ a(List list, Object obj, Object obj2, int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
            this(list, obj, obj2, (i12 & 8) != 0 ? Integer.MIN_VALUE : i10, (i12 & 16) != 0 ? Integer.MIN_VALUE : i11);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getItemsAfter() {
            return this.itemsAfter;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getItemsBefore() {
            return this.itemsBefore;
        }

        @dl.e
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Object getNextKey() {
            return this.nextKey;
        }

        @dl.e
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Object getPrevKey() {
            return this.prevKey;
        }

        public final void e(int pageSize) {
            int i10;
            if (this.itemsBefore == Integer.MIN_VALUE || (i10 = this.itemsAfter) == Integer.MIN_VALUE) {
                throw new IllegalStateException("Placeholders requested, but totalCount not provided. Please call the three-parameter onResult method, or disable placeholders in the PagedList.Config");
            }
            if (i10 <= 0 || this.data.size() % pageSize == 0) {
                if (this.itemsBefore % pageSize == 0) {
                    return;
                }
                throw new IllegalArgumentException("Initial load must be pageSize aligned.Position = " + this.itemsBefore + ", pageSize = " + pageSize);
            }
            throw new IllegalArgumentException("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize " + this.data.size() + ", position " + this.itemsBefore + ", totalCount " + (this.itemsBefore + this.data.size() + this.itemsAfter) + ", pageSize " + pageSize);
        }

        public boolean equals(@dl.e Object other) {
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return kotlin.jvm.internal.f0.g(this.data, aVar.data) && kotlin.jvm.internal.f0.g(this.prevKey, aVar.prevKey) && kotlin.jvm.internal.f0.g(this.nextKey, aVar.nextKey) && this.itemsBefore == aVar.itemsBefore && this.itemsAfter == aVar.itemsAfter;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.DataSource$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: DataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJO\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00030\u0005\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u001e\u0010\u0006\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/paging/DataSource$b;", "", androidx.exifinterface.media.a.W4, "B", "Lf0/a;", "", "function", "source", ak.av, "(Lf0/a;Ljava/util/List;)Ljava/util/List;", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @dl.d
        public final <A, B> List<B> a(@dl.d f0.a<List<A>, List<B>> function, @dl.d List<? extends A> source) {
            kotlin.jvm.internal.f0.p(function, "function");
            kotlin.jvm.internal.f0.p(source, "source");
            List<B> dest = function.apply(source);
            if (dest.size() == source.size()) {
                kotlin.jvm.internal.f0.o(dest, "dest");
                return dest;
            }
            throw new IllegalStateException("Invalid Function " + function + " changed return size. This is not supported.");
        }
    }

    /* JADX INFO: compiled from: DataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0004"}, d2 = {"Landroidx/paging/DataSource$c;", "", "Lkotlin/b2;", ak.av, "paging-common"}, k = 1, mv = {1, 4, 2})
    public interface c {
        @androidx.annotation.d
        void a();
    }

    /* JADX INFO: compiled from: DataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B3\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00018\u0002\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\f\u001a\u0004\u0018\u00018\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0004\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u001a"}, d2 = {"Landroidx/paging/DataSource$d;", "", "K", "Landroidx/paging/LoadType;", ak.av, "Landroidx/paging/LoadType;", "e", "()Landroidx/paging/LoadType;", "type", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "key", "", ak.aF, "I", "()I", "initialLoadSize", "", "d", "Z", "()Z", "placeholdersEnabled", "pageSize", "<init>", "(Landroidx/paging/LoadType;Ljava/lang/Object;IZI)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class d<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final LoadType type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private final K key;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int initialLoadSize;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean placeholdersEnabled;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int pageSize;

        public d(@dl.d LoadType type, @dl.e K k10, int i10, boolean z10, int i11) {
            kotlin.jvm.internal.f0.p(type, "type");
            this.type = type;
            this.key = k10;
            this.initialLoadSize = i10;
            this.placeholdersEnabled = z10;
            this.pageSize = i11;
            if (type != LoadType.REFRESH && k10 == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getInitialLoadSize() {
            return this.initialLoadSize;
        }

        @dl.e
        public final K b() {
            return this.key;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getPageSize() {
            return this.pageSize;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getPlaceholdersEnabled() {
            return this.placeholdersEnabled;
        }

        @dl.d
        /* JADX INFO: renamed from: e, reason: from getter */
        public final LoadType getType() {
            return this.type;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [ToValue] */
    /* JADX INFO: compiled from: DataSource.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0005*\u00020\u00032\u000e\u0010\u0006\u001a\n \u0002*\u0004\u0018\u0001H\u0005H\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "ToValue", "kotlin.jvm.PlatformType", "", "Key", "Value", "it", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    public static final class e<I, O, ToValue> implements f0.a<Value, ToValue> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.l f25516a;

        e(yh.l lVar) {
            this.f25516a = lVar;
        }

        @Override // f0.a
        public final ToValue apply(Value it) {
            yh.l lVar = this.f25516a;
            kotlin.jvm.internal.f0.o(it, "it");
            return (ToValue) lVar.invoke(it);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [ToValue] */
    /* JADX INFO: compiled from: DataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0002 \u0005*\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "ToValue", "Key", "Value", "", "kotlin.jvm.PlatformType", "it", ak.av, "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 4, 2})
    public static final class f<I, O, ToValue> implements f0.a<List<? extends Value>, List<? extends ToValue>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.l f25517a;

        f(yh.l lVar) {
            this.f25517a = lVar;
        }

        @Override // f0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ToValue> apply(List<? extends Value> it) {
            yh.l lVar = this.f25517a;
            kotlin.jvm.internal.f0.o(it, "it");
            return (List) lVar.invoke(it);
        }
    }

    public DataSource(@dl.d KeyType type) {
        kotlin.jvm.internal.f0.p(type, "type");
        this.type = type;
        this.onInvalidatedCallbacks = new CopyOnWriteArrayList<>();
        this._invalid = new AtomicBoolean(false);
        this.isContiguous = true;
        this.supportsPageDropping = true;
    }

    @androidx.annotation.j1
    public static /* synthetic */ void d() {
    }

    @androidx.annotation.d
    public void a(@dl.d c onInvalidatedCallback) {
        kotlin.jvm.internal.f0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.onInvalidatedCallbacks.add(onInvalidatedCallback);
    }

    @dl.d
    public abstract Key b(@dl.d Value item);

    @dl.d
    public final CopyOnWriteArrayList<c> c() {
        return this.onInvalidatedCallbacks;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getSupportsPageDropping() {
        return this.supportsPageDropping;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final KeyType getType() {
        return this.type;
    }

    @androidx.annotation.d
    public void g() {
        if (this._invalid.compareAndSet(false, true)) {
            Iterator<T> it = this.onInvalidatedCallbacks.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a();
            }
        }
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public boolean getIsContiguous() {
        return this.isContiguous;
    }

    @k1
    public boolean i() {
        return this._invalid.get();
    }

    @dl.e
    public abstract Object j(@dl.d d<Key> dVar, @dl.d kotlin.coroutines.c<? super a<Value>> cVar);

    @dl.d
    public <ToValue> DataSource<Key, ToValue> k(@dl.d final f0.a<Value, ToValue> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return n(new yh.l<List<? extends Value>, List<? extends ToValue>>() { // from class: androidx.paging.DataSource$map$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<ToValue> invoke(@dl.d List<? extends Value> list) {
                kotlin.jvm.internal.f0.p(list, "list");
                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(function.apply(it.next()));
                }
                return arrayList;
            }
        });
    }

    public /* synthetic */ <ToValue> DataSource<Key, ToValue> l(yh.l<? super Value, ? extends ToValue> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return k(new e(function));
    }

    @dl.d
    public <ToValue> DataSource<Key, ToValue> m(@dl.d f0.a<List<Value>, List<ToValue>> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return new WrapperDataSource(this, function);
    }

    public /* synthetic */ <ToValue> DataSource<Key, ToValue> n(yh.l<? super List<? extends Value>, ? extends List<? extends ToValue>> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return m(new f(function));
    }

    @androidx.annotation.d
    public void o(@dl.d c onInvalidatedCallback) {
        kotlin.jvm.internal.f0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.onInvalidatedCallbacks.remove(onInvalidatedCallback);
    }
}
