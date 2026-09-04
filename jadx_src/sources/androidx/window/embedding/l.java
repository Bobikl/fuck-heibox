package androidx.window.embedding;

import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: EmbeddingInterfaceCompat.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Landroidx/window/embedding/l;", "", "", "Landroidx/window/embedding/m;", "rules", "Lkotlin/b2;", ak.av, "Landroidx/window/embedding/l$a;", "embeddingCallback", "b", "window_release"}, k = 1, mv = {1, 6, 0})
public interface l {

    /* JADX INFO: compiled from: EmbeddingInterfaceCompat.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0007"}, d2 = {"Landroidx/window/embedding/l$a;", "", "", "Landroidx/window/embedding/t;", "splitInfo", "Lkotlin/b2;", ak.av, "window_release"}, k = 1, mv = {1, 6, 0})
    public interface a {
        void a(@dl.d List<t> list);
    }

    void a(@dl.d Set<? extends m> set);

    void b(@dl.d a aVar);
}
