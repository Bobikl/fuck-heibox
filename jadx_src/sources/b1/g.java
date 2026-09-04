package b1;

import androidx.compose.runtime.j2;
import com.lzy.okgo.model.Progress;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\u00020\u0003*\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\"!\u0010\u0014\u001a\u00020\u000f*\u00020\u00038FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\"!\u0010\u0017\u001a\u00020\u000f*\u00020\u00038FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011\"!\u0010\u001a\u001a\u00020\u000f*\u00020\u00038FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0018\u0010\u0011\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"", "x", "y", "Lb1/f;", ak.av, "(FF)J", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", Progress.G, RXScreenCaptureService.KEY_HEIGHT, "(JJF)J", "Lkotlin/Function0;", "block", "i", "(JLyh/a;)J", "", "b", "(J)Z", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite", "d", "isSpecified-k-4lQ0M$annotations", "isSpecified", "f", "isUnspecified-k-4lQ0M$annotations", "isUnspecified", "ui-geometry_release"}, k = 2, mv = {1, 7, 1})
public final class g {
    @j2
    public static final long a(float f10, float f11) {
        return f.g((((long) Float.floatToIntBits(f11)) & KeyboardMap.kValueMask) | (Float.floatToIntBits(f10) << 32));
    }

    public static final boolean b(long j10) {
        float fP = f.p(j10);
        if ((Float.isInfinite(fP) || Float.isNaN(fP)) ? false : true) {
            float fR = f.r(j10);
            if ((Float.isInfinite(fR) || Float.isNaN(fR)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    @j2
    public static /* synthetic */ void c(long j10) {
    }

    public static final boolean d(long j10) {
        return j10 != f.f30364b.c();
    }

    @j2
    public static /* synthetic */ void e(long j10) {
    }

    public static final boolean f(long j10) {
        return j10 == f.f30364b.c();
    }

    @j2
    public static /* synthetic */ void g(long j10) {
    }

    @j2
    public static final long h(long j10, long j11, float f10) {
        return a(u1.d.a(f.p(j10), f.p(j11), f10), u1.d.a(f.r(j10), f.r(j11), f10));
    }

    public static final long i(long j10, @dl.d yh.a<f> block) {
        f0.p(block, "block");
        return d(j10) ? j10 : block.invoke().getF30368a();
    }
}
