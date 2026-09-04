package s1;

import androidx.compose.runtime.j2;
import com.lzy.okgo.model.Progress;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.r0;

/* JADX INFO: compiled from: TextUnit.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0018\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\t\u001a\u00020\u0004*\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0086\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u0006\u001a\"\u0010\u000e\u001a\u00020\u0004*\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0004H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\"\u0010\u0011\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0004H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\"\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000H\u0001ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\"\"\u0010'\u001a\u00020#*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b&\u0010\u0019\u001a\u0004\b$\u0010%\"!\u0010*\u001a\u00020#*\u00020\u00048FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b)\u0010\u0019\u001a\u0004\b(\u0010%\"!\u0010/\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,\"!\u00102\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010,\"!\u0010/\u001a\u00020\u0004*\u00020\r8FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b-\u00105\u001a\u0004\b3\u00104\"!\u00102\u001a\u00020\u0004*\u00020\r8FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b1\u00105\u001a\u0004\b6\u00104\"!\u0010/\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b-\u00109\u001a\u0004\b7\u00108\"!\u00102\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b1\u00109\u001a\u0004\b:\u00108\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"", "value", "Ls1/w;", "type", "Ls1/u;", ak.av, "(FJ)J", "Lkotlin/Function0;", "block", RXScreenCaptureService.KEY_WIDTH, "(JLyh/a;)J", "other", "y", "", "x", "(DJ)J", "", ak.aD, "(IJ)J", "", "unitType", "v", "(JF)J", "Lkotlin/b2;", "b", "(J)V", ak.aF, "(JJ)V", "d", "(JJJ)V", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", Progress.G, ak.aG, "(JJF)J", "", "q", "(J)Z", "isSpecified--R2X_6o$annotations", "isSpecified", ak.aB, "isUnspecified--R2X_6o$annotations", "isUnspecified", "l", "(F)J", "getSp$annotations", "(F)V", "sp", "f", "getEm$annotations", "em", "k", "(D)J", "(D)V", "e", "m", "(I)J", "(I)V", "g", "ui-unit_release"}, k = 2, mv = {1, 7, 1})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f139253a = 1095216660480L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f139254b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f139255c = 4294967296L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f139256d = 8589934592L;

    @m
    public static final long a(float f10, long j10) {
        return v(j10, f10);
    }

    @r0
    public static final void b(long j10) {
        if (!(!s(j10))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    @r0
    public static final void c(long j10, long j11) {
        if (!((s(j10) || s(j11)) ? false : true)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (w.g(u.m(j10), u.m(j11))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) w.i(u.m(j10))) + " and " + ((Object) w.i(u.m(j11)))).toString());
    }

    @r0
    public static final void d(long j10, long j11, long j12) {
        if (!((s(j10) || s(j11) || s(j12)) ? false : true)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (w.g(u.m(j10), u.m(j11)) && w.g(u.m(j11), u.m(j12))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) w.i(u.m(j10))) + " and " + ((Object) w.i(u.m(j11)))).toString());
    }

    public static final long e(double d10) {
        return v(f139256d, (float) d10);
    }

    public static final long f(float f10) {
        return v(f139256d, f10);
    }

    public static final long g(int i10) {
        return v(f139256d, i10);
    }

    @j2
    public static /* synthetic */ void h(double d10) {
    }

    @j2
    public static /* synthetic */ void i(float f10) {
    }

    @j2
    public static /* synthetic */ void j(int i10) {
    }

    public static final long k(double d10) {
        return v(f139255c, (float) d10);
    }

    public static final long l(float f10) {
        return v(f139255c, f10);
    }

    public static final long m(int i10) {
        return v(f139255c, i10);
    }

    @j2
    public static /* synthetic */ void n(double d10) {
    }

    @j2
    public static /* synthetic */ void o(float f10) {
    }

    @j2
    public static /* synthetic */ void p(int i10) {
    }

    public static final boolean q(long j10) {
        return !s(j10);
    }

    @j2
    public static /* synthetic */ void r(long j10) {
    }

    public static final boolean s(long j10) {
        return u.l(j10) == 0;
    }

    @j2
    public static /* synthetic */ void t(long j10) {
    }

    @j2
    public static final long u(long j10, long j11, float f10) {
        c(j10, j11);
        return v(u.l(j10), u1.d.a(u.n(j10), u.n(j11), f10));
    }

    @r0
    public static final long v(long j10, float f10) {
        return u.e(j10 | (((long) Float.floatToIntBits(f10)) & KeyboardMap.kValueMask));
    }

    public static final long w(long j10, @dl.d yh.a<u> block) {
        f0.p(block, "block");
        return s(j10) ^ true ? j10 : block.invoke().getF139252a();
    }

    @j2
    public static final long x(double d10, long j10) {
        b(j10);
        return v(u.l(j10), ((float) d10) * u.n(j10));
    }

    @j2
    public static final long y(float f10, long j10) {
        b(j10);
        return v(u.l(j10), f10 * u.n(j10));
    }

    @j2
    public static final long z(int i10, long j10) {
        b(j10);
        return v(u.l(j10), i10 * u.n(j10));
    }
}
