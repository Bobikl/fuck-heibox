package androidx.compose.foundation.shape;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CutCornerShape.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001b\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\b\u001a\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n\u001a;\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a.\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b\u001a.\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/shape/f;", "corner", "Landroidx/compose/foundation/shape/h;", "e", "Ls1/h;", UiKitSpanObj.TYPE_SIZE, RXScreenCaptureService.KEY_HEIGHT, "(F)Landroidx/compose/foundation/shape/h;", "", ak.av, "", "percent", ak.aF, "topStart", "topEnd", "bottomEnd", "bottomStart", "i", "(FFFF)Landroidx/compose/foundation/shape/h;", "b", "topStartPercent", "topEndPercent", "bottomEndPercent", "bottomStartPercent", "d", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class i {
    @dl.d
    public static final CutCornerShape a(float f10) {
        return e(g.a(f10));
    }

    @dl.d
    public static final CutCornerShape b(float f10, float f11, float f12, float f13) {
        return new CutCornerShape(g.a(f10), g.a(f11), g.a(f12), g.a(f13));
    }

    @dl.d
    public static final CutCornerShape c(int i10) {
        return e(g.b(i10));
    }

    @dl.d
    public static final CutCornerShape d(int i10, int i11, int i12, int i13) {
        return new CutCornerShape(g.b(i10), g.b(i11), g.b(i12), g.b(i13));
    }

    @dl.d
    public static final CutCornerShape e(@dl.d f corner) {
        f0.p(corner, "corner");
        return new CutCornerShape(corner, corner, corner, corner);
    }

    public static /* synthetic */ CutCornerShape f(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        return b(f10, f11, f12, f13);
    }

    public static /* synthetic */ CutCornerShape g(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return d(i10, i11, i12, i13);
    }

    @dl.d
    public static final CutCornerShape h(float f10) {
        return e(g.c(f10));
    }

    @dl.d
    public static final CutCornerShape i(float f10, float f11, float f12, float f13) {
        return new CutCornerShape(g.c(f10), g.c(f11), g.c(f12), g.c(f13));
    }

    public static /* synthetic */ CutCornerShape j(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.g(0);
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.g(0);
        }
        if ((i10 & 4) != 0) {
            f12 = s1.h.g(0);
        }
        if ((i10 & 8) != 0) {
            f13 = s1.h.g(0);
        }
        return i(f10, f11, f12, f13);
    }
}
