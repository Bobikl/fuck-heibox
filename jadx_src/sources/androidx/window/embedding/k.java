package androidx.window.embedding;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import com.umeng.analytics.pro.ak;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EmbeddingCompat.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0006B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0014"}, d2 = {"Landroidx/window/embedding/k;", "Landroidx/window/embedding/l;", "", "Landroidx/window/embedding/m;", "rules", "Lkotlin/b2;", ak.av, "Landroidx/window/embedding/l$a;", "embeddingCallback", "b", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "embeddingExtension", "Landroidx/window/embedding/i;", "Landroidx/window/embedding/i;", "adapter", "<init>", "(Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;Landroidx/window/embedding/i;)V", "()V", ak.aF, "window_release"}, k = 1, mv = {1, 6, 0})
public final class k implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f28517d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final String f28518e = "EmbeddingCompat";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ActivityEmbeddingComponent embeddingExtension;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final i adapter;

    /* JADX INFO: renamed from: androidx.window.embedding.k$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: EmbeddingCompat.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/window/embedding/k$a;", "", "", "b", "()Ljava/lang/Integer;", "", ak.aF, "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", ak.av, "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final ActivityEmbeddingComponent a() {
            ActivityEmbeddingComponent activityEmbeddingComponent;
            return (!c() || (activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent()) == null) ? new o() : activityEmbeddingComponent;
        }

        @dl.e
        public final Integer b() {
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError unused) {
                Log.d(k.f28518e, "Embedding extension version not found");
                return null;
            } catch (UnsupportedOperationException unused2) {
                Log.d(k.f28518e, "Stub Extension");
                return null;
            }
        }

        public final boolean c() {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
            } catch (NoClassDefFoundError unused) {
                Log.d(k.f28518e, "Embedding extension version not found");
                return false;
            } catch (UnsupportedOperationException unused2) {
                Log.d(k.f28518e, "Stub Extension");
                return false;
            }
        }
    }

    public k() {
        this(INSTANCE.a(), new i());
    }

    public k(@dl.d ActivityEmbeddingComponent embeddingExtension, @dl.d i adapter) {
        f0.p(embeddingExtension, "embeddingExtension");
        f0.p(adapter, "adapter");
        this.embeddingExtension = embeddingExtension;
        this.adapter = adapter;
    }

    @Override // androidx.window.embedding.l
    public void a(@dl.d Set<? extends m> rules) {
        f0.p(rules, "rules");
        this.embeddingExtension.setEmbeddingRules(this.adapter.j(rules));
    }

    @Override // androidx.window.embedding.l
    public void b(@dl.d l.a embeddingCallback) {
        f0.p(embeddingCallback, "embeddingCallback");
        this.embeddingExtension.setSplitInfoCallback(new n(embeddingCallback, this.adapter));
    }
}
