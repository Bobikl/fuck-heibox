package androidx.window.embedding;

import android.app.Activity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: EmbeddingBackend.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&J,\u0010\u0013\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH&J\u001c\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH&J\b\u0010\u0017\u001a\u00020\u0016H&¨\u0006\u0018"}, d2 = {"Landroidx/window/embedding/j;", "", "", "Landroidx/window/embedding/m;", "rules", "Lkotlin/b2;", ak.av, "b", x9.b.f141151p, "g", "f", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/d;", "", "Landroidx/window/embedding/t;", "callback", ak.aF, "consumer", "d", "", "e", "window_release"}, k = 1, mv = {1, 6, 0})
public interface j {
    void a(@dl.d Set<? extends m> set);

    @dl.d
    Set<m> b();

    void c(@dl.d Activity activity, @dl.d Executor executor, @dl.d androidx.core.util.d<List<t>> dVar);

    void d(@dl.d androidx.core.util.d<List<t>> dVar);

    boolean e();

    void f(@dl.d m mVar);

    void g(@dl.d m mVar);
}
