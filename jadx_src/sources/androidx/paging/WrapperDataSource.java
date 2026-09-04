package androidx.paging;

import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: WrapperDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\"\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000f0!¢\u0006\u0004\b#\u0010$J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0017\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0002H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0012\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fJ'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0090@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/paging/WrapperDataSource;", "", "Key", "ValueFrom", "ValueTo", "Landroidx/paging/DataSource;", "Landroidx/paging/DataSource$c;", "onInvalidatedCallback", "Lkotlin/b2;", ak.av, "o", "g", ChannelListActivity.q.f79586f, "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "source", "dest", "q", "Landroidx/paging/DataSource$d;", "params", "Landroidx/paging/DataSource$a;", "j", "(Landroidx/paging/DataSource$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Ljava/util/IdentityHashMap;", "Ljava/util/IdentityHashMap;", "keyMap", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/paging/DataSource;", "", "i", "()Z", "isInvalid", "Lf0/a;", "listFunction", "<init>", "(Landroidx/paging/DataSource;Lf0/a;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public class WrapperDataSource<Key, ValueFrom, ValueTo> extends DataSource<Key, ValueTo> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final IdentityHashMap<ValueTo, Key> keyMap;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final DataSource<Key, ValueFrom> source;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f0.a<List<ValueFrom>, List<ValueTo>> f26357i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapperDataSource(@dl.d DataSource<Key, ValueFrom> source, @dl.d f0.a<List<ValueFrom>, List<ValueTo>> listFunction) {
        super(source.getType());
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(listFunction, "listFunction");
        this.source = source;
        this.f26357i = listFunction;
        this.keyMap = g1.f26419a[source.getType().ordinal()] != 1 ? null : new IdentityHashMap<>();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object p(WrapperDataSource wrapperDataSource, DataSource.d dVar, kotlin.coroutines.c cVar) throws Throwable {
        WrapperDataSource$load$1 wrapperDataSource$load$1;
        WrapperDataSource wrapperDataSource2;
        if (cVar instanceof WrapperDataSource$load$1) {
            wrapperDataSource$load$1 = (WrapperDataSource$load$1) cVar;
            int i10 = wrapperDataSource$load$1.f26359c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                wrapperDataSource$load$1.f26359c = i10 - Integer.MIN_VALUE;
            } else {
                wrapperDataSource$load$1 = new WrapperDataSource$load$1(wrapperDataSource, cVar);
            }
        } else {
            wrapperDataSource$load$1 = new WrapperDataSource$load$1(wrapperDataSource, cVar);
        }
        Object objJ = wrapperDataSource$load$1.f26358b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = wrapperDataSource$load$1.f26359c;
        if (i11 == 0) {
            kotlin.t0.n(objJ);
            DataSource<Key, ValueFrom> dataSource = wrapperDataSource.source;
            wrapperDataSource$load$1.f26361e = wrapperDataSource;
            wrapperDataSource$load$1.f26359c = 1;
            objJ = dataSource.j(dVar, wrapperDataSource$load$1);
            if (objJ == objH) {
                wrapperDataSource2 = wrapperDataSource;
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            WrapperDataSource wrapperDataSource3 = (WrapperDataSource) wrapperDataSource$load$1.f26361e;
            kotlin.t0.n(objJ);
            wrapperDataSource2 = wrapperDataSource3;
        }
        wrapperDataSource2 = wrapperDataSource;
        DataSource.a aVar = (DataSource.a) objJ;
        DataSource.a aVarA = DataSource.a.INSTANCE.a(aVar, wrapperDataSource2.f26357i);
        wrapperDataSource2.q(aVar.data, aVarA.data);
        return aVarA;
    }

    @Override // androidx.paging.DataSource
    public void a(@dl.d DataSource.c onInvalidatedCallback) {
        kotlin.jvm.internal.f0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.a(onInvalidatedCallback);
    }

    @Override // androidx.paging.DataSource
    @dl.d
    public Key b(@dl.d ValueTo item) {
        Key key;
        kotlin.jvm.internal.f0.p(item, "item");
        IdentityHashMap<ValueTo, Key> identityHashMap = this.keyMap;
        if (identityHashMap == null) {
            throw new IllegalStateException("Cannot get key by item in non-item keyed DataSource");
        }
        synchronized (identityHashMap) {
            key = this.keyMap.get(item);
            kotlin.jvm.internal.f0.m(key);
        }
        return key;
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
    @dl.e
    public Object j(@dl.d DataSource.d<Key> dVar, @dl.d kotlin.coroutines.c<? super DataSource.a<ValueTo>> cVar) {
        return p(this, dVar, cVar);
    }

    @Override // androidx.paging.DataSource
    public void o(@dl.d DataSource.c onInvalidatedCallback) {
        kotlin.jvm.internal.f0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.o(onInvalidatedCallback);
    }

    public final void q(@dl.d List<? extends ValueFrom> source, @dl.d List<? extends ValueTo> dest) {
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(dest, "dest");
        IdentityHashMap<ValueTo, Key> identityHashMap = this.keyMap;
        if (identityHashMap != null) {
            synchronized (identityHashMap) {
                int size = dest.size();
                for (int i10 = 0; i10 < size; i10++) {
                    IdentityHashMap<ValueTo, Key> identityHashMap2 = this.keyMap;
                    ValueTo valueto = dest.get(i10);
                    DataSource<Key, ValueFrom> dataSource = this.source;
                    if (dataSource == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.paging.ItemKeyedDataSource<Key, ValueFrom>");
                    }
                    identityHashMap2.put(valueto, (Key) ((ItemKeyedDataSource) dataSource).r(source.get(i10)));
                }
                b2 b2Var = b2.f124493a;
            }
        }
    }
}
