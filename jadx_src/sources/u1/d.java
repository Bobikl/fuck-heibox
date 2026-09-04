package u1;

import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: MathHelpers.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0000¨\u0006\t"}, d2 = {"", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", Progress.G, ak.av, "", "b", "", ak.aF, "ui-util_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    public static final float a(float f10, float f11, float f12) {
        return ((1 - f12) * f10) + (f12 * f11);
    }

    public static final int b(int i10, int i11, float f10) {
        return i10 + di.d.K0(((double) (i11 - i10)) * ((double) f10));
    }

    public static final long c(long j10, long j11, float f10) {
        return j10 + di.d.M0((j11 - j10) * ((double) f10));
    }
}
