package b1;

import androidx.compose.runtime.j2;
import com.lzy.okgo.model.Progress;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\b\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0000H\u0007ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u0011\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0087\nø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\"\u0010\u0014\u001a\u00020\u0003*\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0003H\u0087\nø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0017\u001a\u00020\u0016*\u00020\u0003H\u0007ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\"\u0010\u0019\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0087\nø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\"\"\u0010 \u001a\u00020\u001b*\u00020\u00038Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\"\"\u0010#\u001a\u00020\u001b*\u00020\u00038Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001d\"!\u0010(\u001a\u00020$*\u00020\u00038FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b'\u0010\u001f\u001a\u0004\b%\u0010&\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"", "width", "height", "Lb1/m;", ak.av, "(FF)J", "Lkotlin/Function0;", "block", "i", "(JLyh/a;)J", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", Progress.G, RXScreenCaptureService.KEY_HEIGHT, "(JJF)J", "", UiKitSpanObj.TYPE_SIZE, "l", "(IJ)J", "", "j", "(DJ)J", "Lb1/i;", "m", "(J)Lb1/i;", "k", "(FJ)J", "", "d", "(J)Z", "isSpecified-uvyYCjk$annotations", "(J)V", "isSpecified", "f", "isUnspecified-uvyYCjk$annotations", "isUnspecified", "Lb1/f;", "b", "(J)J", "getCenter-uvyYCjk$annotations", com.google.android.exoplayer2.text.ttml.d.f49794m0, "ui-geometry_release"}, k = 2, mv = {1, 7, 1})
public final class n {
    @j2
    public static final long a(float f10, float f11) {
        return m.f((((long) Float.floatToIntBits(f11)) & KeyboardMap.kValueMask) | (Float.floatToIntBits(f10) << 32));
    }

    public static final long b(long j10) {
        return g.a(m.t(j10) / 2.0f, m.m(j10) / 2.0f);
    }

    @j2
    public static /* synthetic */ void c(long j10) {
    }

    public static final boolean d(long j10) {
        return j10 != m.f30386b.a();
    }

    @j2
    public static /* synthetic */ void e(long j10) {
    }

    public static final boolean f(long j10) {
        return j10 == m.f30386b.a();
    }

    @j2
    public static /* synthetic */ void g(long j10) {
    }

    @j2
    public static final long h(long j10, long j11, float f10) {
        return a(u1.d.a(m.t(j10), m.t(j11), f10), u1.d.a(m.m(j10), m.m(j11), f10));
    }

    public static final long i(long j10, @dl.d yh.a<m> block) {
        f0.p(block, "block");
        return (j10 > m.f30386b.a() ? 1 : (j10 == m.f30386b.a() ? 0 : -1)) != 0 ? j10 : block.invoke().getF30389a();
    }

    @j2
    public static final long j(double d10, long j10) {
        return m.w(j10, (float) d10);
    }

    @j2
    public static final long k(float f10, long j10) {
        return m.w(j10, f10);
    }

    @j2
    public static final long l(int i10, long j10) {
        return m.w(j10, i10);
    }

    @j2
    @dl.d
    public static final i m(long j10) {
        return j.c(f.f30364b.e(), j10);
    }
}
