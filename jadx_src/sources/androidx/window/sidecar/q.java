package androidx.window.sidecar;

import android.app.Activity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowBackend.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\f"}, d2 = {"Landroidx/window/layout/q;", "", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/d;", "Landroidx/window/layout/v;", "callback", "Lkotlin/b2;", ak.av, "b", "window_release"}, k = 1, mv = {1, 6, 0})
public interface q {
    void a(@d Activity activity, @d Executor executor, @d androidx.core.util.d<v> dVar);

    void b(@d androidx.core.util.d<v> dVar);
}
