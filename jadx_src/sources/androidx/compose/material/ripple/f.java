package androidx.compose.material.ripple;

import b1.m;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RippleAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\b\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lb1/m;", UiKitSpanObj.TYPE_SIZE, "", "b", "(J)F", "Ls1/e;", "", "bounded", ak.av, "(Ls1/e;ZJ)F", "Ls1/h;", "F", "BoundedRippleExtraRadius", "", "I", "FadeInDuration", ak.aF, "RadiusDuration", "d", "FadeOutDuration", "material-ripple_release"}, k = 2, mv = {1, 7, 1})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f8512a = s1.h.g(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f8513b = 75;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f8514c = 225;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f8515d = 150;

    public static final float a(@dl.d s1.e getRippleEndRadius, boolean z10, long j10) {
        f0.p(getRippleEndRadius, "$this$getRippleEndRadius");
        float fM = b1.f.m(b1.g.a(m.t(j10), m.m(j10))) / 2.0f;
        return z10 ? fM + getRippleEndRadius.E1(f8512a) : fM;
    }

    public static final float b(long j10) {
        return Math.max(m.t(j10), m.m(j10)) * 0.3f;
    }
}
