package s1;

import androidx.compose.runtime.j2;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Constraints.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\u001a:\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\r\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\n\u001a!\u0010\u000f\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0012\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a!\u0010\u0014\u001a\u00020\u0013*\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a-\u0010\u0018\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"", "minWidth", "maxWidth", "minHeight", "maxHeight", "Ls1/b;", ak.av, "(IIII)J", "otherConstraints", "e", "(JJ)J", "Ls1/r;", UiKitSpanObj.TYPE_SIZE, "d", "width", "g", "(JI)I", "height", "f", "", RXScreenCaptureService.KEY_HEIGHT, "(JJ)Z", "horizontal", "vertical", "i", "(JII)J", org.apache.tools.ant.types.selectors.o.f136589m, "value", ak.aF, "ui-unit_release"}, k = 2, mv = {1, 7, 1})
public final class c {
    @j2
    public static final long a(int i10, int i11, int i12, int i13) {
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')').toString());
        }
        if (!(i13 >= i12)) {
            throw new IllegalArgumentException(("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')').toString());
        }
        if (i10 >= 0 && i12 >= 0) {
            return b.f139198b.b(i10, i11, i12, i13);
        }
        throw new IllegalArgumentException(("minWidth(" + i10 + ") and minHeight(" + i12 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long b(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a(i10, i11, i12, i13);
    }

    private static final int c(int i10, int i11) {
        return i10 == Integer.MAX_VALUE ? i10 : fi.u.u(i10 + i11, 0);
    }

    @j2
    public static final long d(long j10, long j11) {
        return s.a(fi.u.I(r.m(j11), b.r(j10), b.p(j10)), fi.u.I(r.j(j11), b.q(j10), b.o(j10)));
    }

    public static final long e(long j10, long j11) {
        return a(fi.u.I(b.r(j11), b.r(j10), b.p(j10)), fi.u.I(b.p(j11), b.r(j10), b.p(j10)), fi.u.I(b.q(j11), b.q(j10), b.o(j10)), fi.u.I(b.o(j11), b.q(j10), b.o(j10)));
    }

    @j2
    public static final int f(long j10, int i10) {
        return fi.u.I(i10, b.q(j10), b.o(j10));
    }

    @j2
    public static final int g(long j10, int i10) {
        return fi.u.I(i10, b.r(j10), b.p(j10));
    }

    @j2
    public static final boolean h(long j10, long j11) {
        int iR = b.r(j10);
        int iP = b.p(j10);
        int iM = r.m(j11);
        if (iR <= iM && iM <= iP) {
            int iQ = b.q(j10);
            int iO = b.o(j10);
            int iJ = r.j(j11);
            if (iQ <= iJ && iJ <= iO) {
                return true;
            }
        }
        return false;
    }

    @j2
    public static final long i(long j10, int i10, int i11) {
        return a(fi.u.u(b.r(j10) + i10, 0), c(b.p(j10), i10), fi.u.u(b.q(j10) + i11, 0), c(b.o(j10), i11));
    }

    public static /* synthetic */ long j(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return i(j10, i10, i11);
    }
}
