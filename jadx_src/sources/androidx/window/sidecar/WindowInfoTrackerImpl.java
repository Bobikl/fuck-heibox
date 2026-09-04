package androidx.window.sidecar;

import android.app.Activity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;

/* JADX INFO: compiled from: WindowInfoTrackerImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0006B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl;", "Landroidx/window/layout/s;", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Lkotlinx/coroutines/flow/e;", "Landroidx/window/layout/v;", ak.av, "Landroidx/window/layout/WindowMetricsCalculator;", "b", "Landroidx/window/layout/WindowMetricsCalculator;", "windowMetricsCalculator", "Landroidx/window/layout/q;", ak.aF, "Landroidx/window/layout/q;", "windowBackend", "<init>", "(Landroidx/window/layout/WindowMetricsCalculator;Landroidx/window/layout/q;)V", "d", "window_release"}, k = 1, mv = {1, 6, 0})
public final class WindowInfoTrackerImpl implements s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f28607e = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final WindowMetricsCalculator windowMetricsCalculator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    private final q windowBackend;

    public WindowInfoTrackerImpl(@d WindowMetricsCalculator windowMetricsCalculator, @d q windowBackend) {
        f0.p(windowMetricsCalculator, "windowMetricsCalculator");
        f0.p(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.sidecar.s
    @d
    public e<v> a(@d Activity activity) {
        f0.p(activity, "activity");
        return g.I0(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, null));
    }
}
