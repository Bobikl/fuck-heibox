package androidx.window.embedding;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EmbeddingCompat.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001c\u0010\u000b\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/window/embedding/o;", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "", "Landroidx/window/extensions/embedding/EmbeddingRule;", "splitRules", "Lkotlin/b2;", ak.av, "Ljava/util/function/Consumer;", "", "Landroidx/window/extensions/embedding/SplitInfo;", "consumer", "b", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class o implements ActivityEmbeddingComponent {
    public void a(@dl.d Set<EmbeddingRule> splitRules) {
        f0.p(splitRules, "splitRules");
    }

    public void b(@dl.d Consumer<List<SplitInfo>> consumer) {
        f0.p(consumer, "consumer");
    }
}
