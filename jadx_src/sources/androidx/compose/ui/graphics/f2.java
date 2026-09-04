package androidx.compose.ui.graphics;

import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Shadow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/e2;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", "", Progress.G, ak.av, "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class f2 {
    @androidx.compose.runtime.j2
    @dl.d
    public static final Shadow a(@dl.d Shadow start, @dl.d Shadow stop, float f10) {
        kotlin.jvm.internal.f0.p(start, "start");
        kotlin.jvm.internal.f0.p(stop, "stop");
        return new Shadow(n0.o(start.getColor(), stop.getColor(), f10), b1.g.h(start.getOffset(), stop.getOffset(), f10), u1.d.a(start.getBlurRadius(), stop.getBlurRadius(), f10), null);
    }
}
