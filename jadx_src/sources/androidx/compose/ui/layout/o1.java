package androidx.compose.ui.layout;

import androidx.compose.runtime.j2;
import com.lzy.okgo.model.Progress;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: ScaleFactor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\f\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0002\u001a+\u0010\t\u001a\u00020\u0003*\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\bø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\r\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u0010\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\"\u0010\u0011\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000e\u001a-\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0000H\u0007ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\"\u0010\u001c\u001a\u00020\u0017*\u00020\u00038Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\"\"\u0010\u001f\u001a\u00020\u0017*\u00020\u00038Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u0019\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"", "scaleX", "scaleY", "Landroidx/compose/ui/layout/n1;", ak.av, "(FF)J", "i", "Lkotlin/Function0;", "block", "j", "(JLyh/a;)J", "Lb1/m;", "scaleFactor", "k", "(JJ)J", UiKitSpanObj.TYPE_SIZE, "l", ak.aF, com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", Progress.G, RXScreenCaptureService.KEY_HEIGHT, "(JJF)J", "", "d", "(J)Z", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified", "f", "isUnspecified-FK8aYYs$annotations", "isUnspecified", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class o1 {
    @j2
    public static final long a(float f10, float f11) {
        return n1.e((((long) Float.floatToIntBits(f11)) & KeyboardMap.kValueMask) | (Float.floatToIntBits(f10) << 32));
    }

    @j2
    public static final long c(long j10, long j11) {
        return b1.n.a(b1.m.t(j10) / n1.m(j11), b1.m.m(j10) / n1.o(j11));
    }

    public static final boolean d(long j10) {
        return j10 != n1.f15029b.a();
    }

    @j2
    public static /* synthetic */ void e(long j10) {
    }

    public static final boolean f(long j10) {
        return j10 == n1.f15029b.a();
    }

    @j2
    public static /* synthetic */ void g(long j10) {
    }

    @j2
    public static final long h(long j10, long j11, float f10) {
        return a(u1.d.a(n1.m(j10), n1.m(j11), f10), u1.d.a(n1.o(j10), n1.o(j11), f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(float f10) {
        float f11 = 10;
        float f12 = f10 * f11;
        int i10 = (int) f12;
        if (f12 - i10 >= 0.5f) {
            i10++;
        }
        return i10 / f11;
    }

    public static final long j(long j10, @dl.d yh.a<n1> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        return (j10 > n1.f15029b.a() ? 1 : (j10 == n1.f15029b.a() ? 0 : -1)) != 0 ? j10 : block.invoke().s();
    }

    @j2
    public static final long k(long j10, long j11) {
        return b1.n.a(b1.m.t(j10) * n1.m(j11), b1.m.m(j10) * n1.o(j11));
    }

    @j2
    public static final long l(long j10, long j11) {
        return k(j11, j10);
    }
}
