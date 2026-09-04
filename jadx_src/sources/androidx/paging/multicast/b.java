package androidx.paging.multicast;

import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.umeng.analytics.pro.ak;
import fi.u;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ChannelManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016R&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/paging/multicast/b;", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/multicast/a;", "Landroidx/paging/multicast/ChannelManager$b$b$c;", ChannelListActivity.q.f79586f, "Lkotlin/b2;", "b", "Ljava/util/ArrayDeque;", ak.av, "Ljava/util/ArrayDeque;", ak.aF, "()Ljava/util/ArrayDeque;", "items", "", "I", "limit", "<init>", "(I)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class b<T> implements a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ArrayDeque<ChannelManager.b.AbstractC0200b.c<T>> items;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int limit;

    public b(int i10) {
        this.limit = i10;
        this.items = new ArrayDeque<>(u.B(i10, 10));
    }

    @Override // androidx.paging.multicast.a
    public void b(@dl.d ChannelManager.b.AbstractC0200b.c<T> item) {
        f0.p(item, "item");
        while (a().size() >= this.limit) {
            a().pollFirst();
        }
        a().offerLast(item);
    }

    @Override // androidx.paging.multicast.a
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ArrayDeque<ChannelManager.b.AbstractC0200b.c<T>> a() {
        return this.items;
    }

    @Override // androidx.paging.multicast.a
    public boolean isEmpty() {
        return a.C0203a.a(this);
    }
}
