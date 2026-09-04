package androidx.compose.foundation.lazy.grid;

import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyGridScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0097\u0001\u0012#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f\u0012#\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002\u0012\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\f¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u000fø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR7\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR1\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R7\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000bR3\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\f¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u000f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/g;", "Landroidx/compose/foundation/lazy/layout/g;", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", UCropPlusActivity.ARG_INDEX, "", "key", "Lyh/l;", "getKey", "()Lyh/l;", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/m;", "Landroidx/compose/foundation/lazy/grid/d;", "Lkotlin/t;", com.google.android.exoplayer2.text.ttml.d.f49805s, "Lyh/p;", "b", "()Lyh/p;", "type", "getType", "Landroidx/compose/foundation/lazy/grid/l;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", ChannelListActivity.q.f79586f, "Lyh/r;", ak.av, "()Lyh/r;", "<init>", "(Lyh/l;Lyh/p;Lyh/l;Lyh/r;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class g implements androidx.compose.foundation.lazy.layout.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final yh.l<Integer, Object> f6905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.p<m, Integer, d> f6906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.l<Integer, Object> f6907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final yh.r<l, Integer, androidx.compose.runtime.p, Integer, b2> f6908d;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@dl.e yh.l<? super Integer, ? extends Object> lVar, @dl.d yh.p<? super m, ? super Integer, d> span, @dl.d yh.l<? super Integer, ? extends Object> type, @dl.d yh.r<? super l, ? super Integer, ? super androidx.compose.runtime.p, ? super Integer, b2> item) {
        f0.p(span, "span");
        f0.p(type, "type");
        f0.p(item, "item");
        this.f6905a = lVar;
        this.f6906b = span;
        this.f6907c = type;
        this.f6908d = item;
    }

    @dl.d
    public final yh.r<l, Integer, androidx.compose.runtime.p, Integer, b2> a() {
        return this.f6908d;
    }

    @dl.d
    public final yh.p<m, Integer, d> b() {
        return this.f6906b;
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    @dl.e
    public yh.l<Integer, Object> getKey() {
        return this.f6905a;
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    @dl.d
    public yh.l<Integer, Object> getType() {
        return this.f6907c;
    }
}
