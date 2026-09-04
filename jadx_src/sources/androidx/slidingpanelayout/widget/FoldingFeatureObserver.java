package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.window.sidecar.h;
import androidx.window.sidecar.m;
import androidx.window.sidecar.s;
import androidx.window.sidecar.v;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s1;

/* JADX INFO: compiled from: FoldingFeatureObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\bR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;", "", "Landroidx/window/layout/v;", "windowLayoutInfo", "Landroidx/window/layout/m;", "d", "Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$a;", "onFoldingFeatureChangeListener", "Lkotlin/b2;", "f", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "e", "g", "Landroidx/window/layout/s;", ak.av, "Landroidx/window/layout/s;", "windowInfoTracker", "Ljava/util/concurrent/Executor;", "b", "Ljava/util/concurrent/Executor;", "executor", "Lkotlinx/coroutines/d2;", ak.aF, "Lkotlinx/coroutines/d2;", "job", "Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$a;", "<init>", "(Landroidx/window/layout/s;Ljava/util/concurrent/Executor;)V", "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0})
public final class FoldingFeatureObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final s windowInfoTracker;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final Executor executor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @e
    private d2 job;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @e
    private a onFoldingFeatureChangeListener;

    /* JADX INFO: compiled from: FoldingFeatureObserver.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$a;", "", "Landroidx/window/layout/m;", "foldingFeature", "Lkotlin/b2;", ak.av, "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0})
    public interface a {
        void a(@d m mVar);
    }

    public FoldingFeatureObserver(@d s windowInfoTracker, @d Executor executor) {
        f0.p(windowInfoTracker, "windowInfoTracker");
        f0.p(executor, "executor");
        this.windowInfoTracker = windowInfoTracker;
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m d(v windowLayoutInfo) {
        Object next;
        Iterator<T> it = windowLayoutInfo.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((h) next) instanceof m));
        if (next instanceof m) {
            return (m) next;
        }
        return null;
    }

    public final void e(@d Activity activity) {
        f0.p(activity, "activity");
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2.a.b(d2Var, null, 1, null);
        }
        this.job = k.f(r0.a(s1.c(this.executor)), null, null, new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this, activity, null), 3, null);
    }

    public final void f(@d a onFoldingFeatureChangeListener) {
        f0.p(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        this.onFoldingFeatureChangeListener = onFoldingFeatureChangeListener;
    }

    public final void g() {
        d2 d2Var = this.job;
        if (d2Var == null) {
            return;
        }
        d2.a.b(d2Var, null, 1, null);
    }
}
