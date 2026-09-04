package androidx.compose.foundation.lazy;

import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyListScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0084\u0001\u0012#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012#\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002\u00121\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u0017\u0010\u0018R7\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR7\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bRB\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/l;", "Landroidx/compose/foundation/lazy/layout/g;", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", UCropPlusActivity.ARG_INDEX, "", "key", "Lyh/l;", "getKey", "()Lyh/l;", "type", "getType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/g;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", ChannelListActivity.q.f79586f, "Lyh/r;", ak.av, "()Lyh/r;", "<init>", "(Lyh/l;Lyh/l;Lyh/r;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class l implements androidx.compose.foundation.lazy.layout.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final yh.l<Integer, Object> f7001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<Integer, Object> f7002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.r<g, Integer, androidx.compose.runtime.p, Integer, b2> f7003c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@dl.e yh.l<? super Integer, ? extends Object> lVar, @dl.d yh.l<? super Integer, ? extends Object> type, @dl.d yh.r<? super g, ? super Integer, ? super androidx.compose.runtime.p, ? super Integer, b2> item) {
        f0.p(type, "type");
        f0.p(item, "item");
        this.f7001a = lVar;
        this.f7002b = type;
        this.f7003c = item;
    }

    @dl.d
    public final yh.r<g, Integer, androidx.compose.runtime.p, Integer, b2> a() {
        return this.f7003c;
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    @dl.e
    public yh.l<Integer, Object> getKey() {
        return this.f7001a;
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    @dl.d
    public yh.l<Integer, Object> getType() {
        return this.f7002b;
    }
}
