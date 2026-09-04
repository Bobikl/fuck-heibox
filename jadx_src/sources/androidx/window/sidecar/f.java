package androidx.window.sidecar;

import android.graphics.Point;
import android.view.Display;
import androidx.annotation.w0;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DisplayCompatHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@w0(17)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/window/layout/f;", "", "Landroid/view/Display;", "display", "Landroid/graphics/Point;", "point", "Lkotlin/b2;", ak.av, "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final f f28623a = new f();

    private f() {
    }

    public final void a(@d Display display, @d Point point) {
        f0.p(display, "display");
        f0.p(point, "point");
        display.getRealSize(point);
    }
}
