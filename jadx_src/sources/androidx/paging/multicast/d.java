package androidx.paging.multicast;

import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ChannelManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/paging/multicast/d;", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/multicast/a;", "Landroidx/paging/multicast/ChannelManager$b$b$c;", ChannelListActivity.q.f79586f, "Lkotlin/b2;", "b", "", ak.av, "()Ljava/util/Collection;", "items", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class d<T> implements a<T> {
    @Override // androidx.paging.multicast.a
    @dl.d
    public Collection<ChannelManager.b.AbstractC0200b.c<T>> a() {
        List listEmptyList = Collections.emptyList();
        f0.o(listEmptyList, "Collections.emptyList()");
        return listEmptyList;
    }

    @Override // androidx.paging.multicast.a
    public void b(@dl.d ChannelManager.b.AbstractC0200b.c<T> item) {
        f0.p(item, "item");
    }

    @Override // androidx.paging.multicast.a
    public boolean isEmpty() {
        return a.C0203a.a(this);
    }
}
