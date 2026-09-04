package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import com.lzy.okgo.model.Progress;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u001a>\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001a\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a4\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a!\u0010\u0019\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a1\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0082\b\u001a\u0019\u0010!\u001a\u00020 *\u00020\u0007H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0019\u0010#\u001a\u00020\u0000*\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0010\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0000H\u0002\u001a\u0019\u0010'\u001a\u00020\n*\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a+\u0010+\u001a\u00020\u0007*\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070)H\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\"\"\u00102\u001a\u00020-*\u00020\u00078Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/\"\"\u00105\u001a\u00020-*\u00020\u00078Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010/\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u00066"}, d2 = {"", "red", "green", "blue", "alpha", "Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", "Landroidx/compose/ui/graphics/l0;", ak.av, "(FFFFLandroidx/compose/ui/graphics/colorspace/c;)J", "", "color", "b", "(I)J", "", "d", "(J)J", ak.aF, "(IIII)J", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", Progress.G, "o", "(JJF)J", UiKitSpanObj.TYPE_BACKGROUND, "i", "(JJ)J", "fgC", "bgC", "fgA", "bgA", RXScreenCaptureService.KEY_HEIGHT, "", "j", "(J)[F", "p", "(J)F", "v", "q", ak.aB, "(J)I", "Lkotlin/Function0;", "block", "r", "(JLyh/a;)J", "", "k", "(J)Z", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified", "m", "isUnspecified-8_81llA$annotations", "isUnspecified", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class n0 {
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    @androidx.compose.runtime.j2
    public static final long a(float f10, float f11, float f12, float f13, @dl.d androidx.compose.ui.graphics.colorspace.c colorSpace) {
        boolean z10;
        kotlin.jvm.internal.f0.p(colorSpace, "colorSpace");
        if (f10 <= colorSpace.e(0) && colorSpace.f(0) <= f10) {
            if (f11 <= colorSpace.e(1) && colorSpace.f(1) <= f11) {
                if (f12 <= colorSpace.e(2) && colorSpace.f(2) <= f12) {
                    if (0.0f <= f13 && f13 <= 1.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            if (colorSpace.getIsSrgb()) {
                return l0.t(kotlin.r1.h(kotlin.r1.h(kotlin.r1.h((((((int) ((f10 * 255.0f) + 0.5f)) << 16) | (((int) ((f13 * 255.0f) + 0.5f)) << 24)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((f12 * 255.0f) + 0.5f))) & KeyboardMap.kValueMask) << 32));
            }
            if (!(colorSpace.c() == 3)) {
                throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
            }
            int iD = colorSpace.getId();
            if (!(iD != -1)) {
                throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
            }
            return l0.t(kotlin.r1.h(kotlin.r1.h(kotlin.r1.h(kotlin.r1.h(kotlin.r1.h(kotlin.r1.h(kotlin.r1.h(s0.q(f11)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | kotlin.r1.h(kotlin.r1.h(kotlin.r1.h(s0.q(f10)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48)) | kotlin.r1.h(kotlin.r1.h(kotlin.r1.h(s0.q(f12)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16)) | kotlin.r1.h(kotlin.r1.h(kotlin.r1.h((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | kotlin.r1.h(kotlin.r1.h(iD) & 63)));
        }
        throw new IllegalArgumentException(("red = " + f10 + ", green = " + f11 + ", blue = " + f12 + ", alpha = " + f13 + " outside the range for " + colorSpace).toString());
    }

    @androidx.compose.runtime.j2
    public static final long b(int i10) {
        return l0.t(kotlin.r1.h(kotlin.r1.h(i10) << 32));
    }

    @androidx.compose.runtime.j2
    public static final long c(int i10, int i11, int i12, int i13) {
        return b(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }

    @androidx.compose.runtime.j2
    public static final long d(long j10) {
        return l0.t(kotlin.r1.h(kotlin.r1.h(kotlin.r1.h(j10) & KeyboardMap.kValueMask) << 32));
    }

    public static /* synthetic */ long e(float f10, float f11, float f12, float f13, androidx.compose.ui.graphics.colorspace.c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        if ((i10 & 16) != 0) {
            cVar = ColorSpaces.f13697a.t();
        }
        return a(f10, f11, f12, f13, cVar);
    }

    public static /* synthetic */ long f(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return c(i10, i11, i12, i13);
    }

    private static final float h(float f10, float f11, float f12, float f13, float f14) {
        if (f14 == 0.0f) {
            return 0.0f;
        }
        return ((f10 * f12) + ((f11 * f13) * (1.0f - f12))) / f14;
    }

    @androidx.compose.runtime.j2
    public static final long i(long j10, long j11) {
        long jU = l0.u(j10, l0.E(j11));
        float fA = l0.A(j11);
        float fA2 = l0.A(jU);
        float f10 = 1.0f - fA2;
        float f11 = (fA * f10) + fA2;
        return a((f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1)) == 0 ? 0.0f : ((l0.I(jU) * fA2) + ((l0.I(j11) * fA) * f10)) / f11, (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1)) == 0 ? 0.0f : ((l0.G(jU) * fA2) + ((l0.G(j11) * fA) * f10)) / f11, f11 == 0.0f ? 0.0f : ((l0.C(jU) * fA2) + ((l0.C(j11) * fA) * f10)) / f11, f11, l0.E(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] j(long j10) {
        return new float[]{l0.I(j10), l0.G(j10), l0.C(j10), l0.A(j10)};
    }

    public static final boolean k(long j10) {
        return j10 != l0.INSTANCE.u();
    }

    @androidx.compose.runtime.j2
    public static /* synthetic */ void l(long j10) {
    }

    public static final boolean m(long j10) {
        return j10 == l0.INSTANCE.u();
    }

    @androidx.compose.runtime.j2
    public static /* synthetic */ void n(long j10) {
    }

    @androidx.compose.runtime.j2
    public static final long o(long j10, long j11, float f10) {
        androidx.compose.ui.graphics.colorspace.c cVarQ = ColorSpaces.f13697a.q();
        long jU = l0.u(j10, cVarQ);
        long jU2 = l0.u(j11, cVarQ);
        float fA = l0.A(jU);
        float fI = l0.I(jU);
        float fG = l0.G(jU);
        float fC = l0.C(jU);
        float fA2 = l0.A(jU2);
        float fI2 = l0.I(jU2);
        float fG2 = l0.G(jU2);
        float fC2 = l0.C(jU2);
        return l0.u(a(u1.d.a(fI, fI2, f10), u1.d.a(fG, fG2, f10), u1.d.a(fC, fC2, f10), u1.d.a(fA, fA2, f10), cVarQ), l0.E(j11));
    }

    @androidx.compose.runtime.j2
    public static final float p(long j10) {
        androidx.compose.ui.graphics.colorspace.c cVarE = l0.E(j10);
        if (!androidx.compose.ui.graphics.colorspace.b.h(cVarE.getCom.taobao.accs.common.Constants.KEY_MODEL java.lang.String(), androidx.compose.ui.graphics.colorspace.b.INSTANCE.c())) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) androidx.compose.ui.graphics.colorspace.b.l(cVarE.getCom.taobao.accs.common.Constants.KEY_MODEL java.lang.String()))).toString());
        }
        kotlin.jvm.internal.f0.n(cVarE, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        yh.l<Double, Double> lVarQ = ((Rgb) cVarE).q();
        return q((float) ((lVarQ.invoke(Double.valueOf(l0.I(j10))).doubleValue() * 0.2126d) + (lVarQ.invoke(Double.valueOf(l0.G(j10))).doubleValue() * 0.7152d) + (lVarQ.invoke(Double.valueOf(l0.C(j10))).doubleValue() * 0.0722d)));
    }

    private static final float q(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public static final long r(long j10, @dl.d yh.a<l0> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        return (j10 > l0.INSTANCE.u() ? 1 : (j10 == l0.INSTANCE.u() ? 0 : -1)) != 0 ? j10 : block.invoke().M();
    }

    @androidx.compose.runtime.j2
    public static final int s(long j10) {
        androidx.compose.ui.graphics.colorspace.c cVarE = l0.E(j10);
        if (cVarE.getIsSrgb()) {
            return (int) kotlin.r1.h(j10 >>> 32);
        }
        float[] fArrJ = j(j10);
        androidx.compose.ui.graphics.colorspace.d.k(cVarE, null, 0, 3, null).e(fArrJ);
        return ((int) ((fArrJ[2] * 255.0f) + 0.5f)) | (((int) ((fArrJ[3] * 255.0f) + 0.5f)) << 24) | (((int) ((fArrJ[0] * 255.0f) + 0.5f)) << 16) | (((int) ((fArrJ[1] * 255.0f) + 0.5f)) << 8);
    }
}
