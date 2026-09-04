package androidx.paging.multicast;

import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: compiled from: ChannelManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\bb\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/paging/multicast/a;", androidx.exifinterface.media.a.f23244d5, "", "Landroidx/paging/multicast/ChannelManager$b$b$c;", ChannelListActivity.q.f79586f, "Lkotlin/b2;", "b", "", "isEmpty", "", ak.av, "()Ljava/util/Collection;", "items", "paging-common"}, k = 1, mv = {1, 4, 2})
public interface a<T> {

    /* JADX INFO: renamed from: androidx.paging.multicast.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChannelManager.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static final class C0203a {
        public static <T> boolean a(@dl.d a<T> aVar) {
            return aVar.a().isEmpty();
        }
    }

    @dl.d
    Collection<ChannelManager.b.AbstractC0200b.c<T>> a();

    void b(@dl.d ChannelManager.b.AbstractC0200b.c<T> cVar);

    boolean isEmpty();
}
