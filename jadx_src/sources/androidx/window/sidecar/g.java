package androidx.window.sidecar;

import android.view.DisplayCutout;
import androidx.annotation.w0;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DisplayCompatHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@w0(28)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/g;", "", "Landroid/view/DisplayCutout;", "displayCutout", "", "b", "d", ak.aF, ak.av, "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final g f28624a = new g();

    private g() {
    }

    public final int a(@d DisplayCutout displayCutout) {
        f0.p(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int b(@d DisplayCutout displayCutout) {
        f0.p(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int c(@d DisplayCutout displayCutout) {
        f0.p(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int d(@d DisplayCutout displayCutout) {
        f0.p(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
