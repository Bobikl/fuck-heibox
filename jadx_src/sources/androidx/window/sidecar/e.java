package androidx.window.sidecar;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.w0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ActivityCompatHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@w0(30)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Landroidx/window/layout/e;", "", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Landroid/graphics/Rect;", ak.av, "b", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final e f28622a = new e();

    private e() {
    }

    @d
    public final Rect a(@d Activity activity) {
        f0.p(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        f0.o(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    @d
    public final Rect b(@d Activity activity) {
        f0.p(activity, "activity");
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        f0.o(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
