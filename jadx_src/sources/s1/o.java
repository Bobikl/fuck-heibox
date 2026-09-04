package s1;

import androidx.compose.runtime.j2;
import com.lzy.okgo.model.Progress;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: IntOffset.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001a\u0010\r\u001a\u00020\f*\u00020\u0003H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u0010\u001a\u00020\f*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\f*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u001a\"\u0010\u0014\u001a\u00020\f*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u001a\u0010\u0015\u001a\u00020\u0003*\u00020\fH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"", "x", "y", "Ls1/n;", ak.av, "(II)J", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", "", Progress.G, "b", "(JJF)J", "Lb1/f;", RXScreenCaptureService.KEY_HEIGHT, "(J)J", androidx.constraintlayout.core.motion.utils.w.c.R, "e", "(JJ)J", ak.aF, "f", "d", "g", "ui-unit_release"}, k = 2, mv = {1, 7, 1})
public final class o {
    @j2
    public static final long a(int i10, int i11) {
        return n.e((((long) i11) & KeyboardMap.kValueMask) | (((long) i10) << 32));
    }

    @j2
    public static final long b(long j10, long j11, float f10) {
        return a(u1.d.b(n.m(j10), n.m(j11), f10), u1.d.b(n.o(j10), n.o(j11), f10));
    }

    @j2
    public static final long c(long j10, long j11) {
        return b1.g.a(b1.f.p(j10) - n.m(j11), b1.f.r(j10) - n.o(j11));
    }

    @j2
    public static final long d(long j10, long j11) {
        return b1.g.a(n.m(j10) - b1.f.p(j11), n.o(j10) - b1.f.r(j11));
    }

    @j2
    public static final long e(long j10, long j11) {
        return b1.g.a(b1.f.p(j10) + n.m(j11), b1.f.r(j10) + n.o(j11));
    }

    @j2
    public static final long f(long j10, long j11) {
        return b1.g.a(n.m(j10) + b1.f.p(j11), n.o(j10) + b1.f.r(j11));
    }

    @j2
    public static final long g(long j10) {
        return a(di.d.L0(b1.f.p(j10)), di.d.L0(b1.f.r(j10)));
    }

    @j2
    public static final long h(long j10) {
        return b1.g.a(n.m(j10), n.o(j10));
    }
}
