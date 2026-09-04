package s1;

import androidx.compose.runtime.j2;
import com.lzy.okgo.model.Progress;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: IntRect.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006\u001a%\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Ls1/n;", androidx.constraintlayout.core.motion.utils.w.c.R, "Ls1/r;", UiKitSpanObj.TYPE_SIZE, "Ls1/p;", "b", "(JJ)Ls1/p;", "topLeft", "bottomRight", ak.av, com.google.android.exoplayer2.text.ttml.d.f49794m0, "", "radius", ak.aF, "(JI)Ls1/p;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", "", Progress.G, "d", "ui-unit_release"}, k = 2, mv = {1, 7, 1})
public final class q {
    @j2
    @dl.d
    public static final p a(long j10, long j11) {
        return new p(n.m(j10), n.o(j10), n.m(j11), n.o(j11));
    }

    @j2
    @dl.d
    public static final p b(long j10, long j11) {
        return new p(n.m(j10), n.o(j10), n.m(j10) + r.m(j11), n.o(j10) + r.j(j11));
    }

    @j2
    @dl.d
    public static final p c(long j10, int i10) {
        return new p(n.m(j10) - i10, n.o(j10) - i10, n.m(j10) + i10, n.o(j10) + i10);
    }

    @j2
    @dl.d
    public static final p d(@dl.d p start, @dl.d p stop, float f10) {
        f0.p(start, "start");
        f0.p(stop, "stop");
        return new p(u1.d.b(start.t(), stop.t(), f10), u1.d.b(start.getF139243b(), stop.getF139243b(), f10), u1.d.b(start.x(), stop.x(), f10), u1.d.b(start.j(), stop.j(), f10));
    }
}
