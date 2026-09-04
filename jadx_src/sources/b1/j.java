package b1;

import androidx.compose.runtime.j2;
import androidx.constraintlayout.core.motion.utils.w;
import com.lzy.okgo.model.Progress;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Rect.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006\u001a%\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000bH\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lb1/f;", w.c.R, "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "Lb1/i;", ak.aF, "(JJ)Lb1/i;", "topLeft", "bottomRight", ak.av, com.google.android.exoplayer2.text.ttml.d.f49794m0, "", "radius", "b", "(JF)Lb1/i;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", Progress.G, "d", "ui-geometry_release"}, k = 2, mv = {1, 7, 1})
public final class j {
    @j2
    @dl.d
    public static final i a(long j10, long j11) {
        return new i(f.p(j10), f.r(j10), f.p(j11), f.r(j11));
    }

    @j2
    @dl.d
    public static final i b(long j10, float f10) {
        return new i(f.p(j10) - f10, f.r(j10) - f10, f.p(j10) + f10, f.r(j10) + f10);
    }

    @j2
    @dl.d
    public static final i c(long j10, long j11) {
        return new i(f.p(j10), f.r(j10), f.p(j10) + m.t(j11), f.r(j10) + m.m(j11));
    }

    @j2
    @dl.d
    public static final i d(@dl.d i start, @dl.d i stop, float f10) {
        f0.p(start, "start");
        f0.p(stop, "stop");
        return new i(u1.d.a(start.t(), stop.t(), f10), u1.d.a(start.getF30372b(), stop.getF30372b(), f10), u1.d.a(start.x(), stop.x(), f10), u1.d.a(start.j(), stop.j(), f10));
    }
}
