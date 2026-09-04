package androidx.paging.multicast;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ChannelManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¨\u0006\b"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "limit", "Landroidx/paging/multicast/a;", ak.av, "Landroidx/paging/multicast/ChannelManager$b$b$c;", "", ak.aF, "paging-common"}, k = 2, mv = {1, 4, 2})
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> a<T> a(int i10) {
        return i10 > 0 ? new b(i10) : new d();
    }

    public static final <T> boolean c(@dl.d ChannelManager.b.AbstractC0200b.c<T> markDelivered) {
        f0.p(markDelivered, "$this$markDelivered");
        return markDelivered.a().A(b2.f124493a);
    }
}
