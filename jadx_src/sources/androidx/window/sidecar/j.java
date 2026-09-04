package androidx.window.sidecar;

import android.app.Activity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: ExtensionInterfaceCompat.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Landroidx/window/layout/j;", "", "", "b", "Landroidx/window/layout/j$a;", "extensionCallback", "Lkotlin/b2;", ak.av, "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, ak.aF, "d", "window_release"}, k = 1, mv = {1, 6, 0})
public interface j {

    /* JADX INFO: compiled from: ExtensionInterfaceCompat.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/j$a;", "", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Landroidx/window/layout/v;", "newLayout", "Lkotlin/b2;", ak.av, "window_release"}, k = 1, mv = {1, 6, 0})
    public interface a {
        void a(@d Activity activity, @d v vVar);
    }

    void a(@d a aVar);

    boolean b();

    void c(@d Activity activity);

    void d(@d Activity activity);
}
