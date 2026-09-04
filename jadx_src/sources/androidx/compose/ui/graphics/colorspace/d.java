package androidx.compose.ui.graphics.colorspace;

import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ColorSpace.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000b\u001a+\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007\u001a8\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a8\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001aH\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001aH\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a8\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a8\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a\u001a\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0000\u001a\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001bH\u0000\u001a\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0000\u001a\u0018\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0000\u001a\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0000\u001a\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0000\u001a \u0010\u0015\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001bH\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/c;", "destination", "Landroidx/compose/ui/graphics/colorspace/i;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroidx/compose/ui/graphics/colorspace/e;", "j", "(Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;I)Landroidx/compose/ui/graphics/colorspace/e;", "Landroidx/compose/ui/graphics/colorspace/k;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/a;", "adaptation", "d", "", "x", ak.av, "b", ak.aF, "g", "p", "r", "e", "f", "q", ak.aB, "Landroidx/compose/ui/graphics/colorspace/j;", "", RXScreenCaptureService.KEY_HEIGHT, "", "i", "m", "l", "lhs", "rhs", "o", "n", "matrix", "srcWhitePoint", "dstWhitePoint", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    public static final double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(p(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final double b(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(r(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    @dl.d
    @xh.i
    public static final c c(@dl.d c cVar, @dl.d WhitePoint whitePoint) {
        f0.p(cVar, "<this>");
        f0.p(whitePoint, "whitePoint");
        return e(cVar, whitePoint, null, 2, null);
    }

    @dl.d
    @xh.i
    public static final c d(@dl.d c cVar, @dl.d WhitePoint whitePoint, @dl.d a adaptation) {
        f0.p(cVar, "<this>");
        f0.p(whitePoint, "whitePoint");
        f0.p(adaptation, "adaptation");
        if (!b.h(cVar.getCom.taobao.accs.common.Constants.KEY_MODEL java.lang.String(), b.INSTANCE.c())) {
            return cVar;
        }
        Rgb rgb = (Rgb) cVar;
        if (h(rgb.getWhitePoint(), whitePoint)) {
            return cVar;
        }
        return new Rgb(rgb, m(f(adaptation.getTransform(), rgb.getWhitePoint().g(), whitePoint.g()), rgb.getTransform()), whitePoint);
    }

    public static /* synthetic */ c e(c cVar, WhitePoint kVar, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = a.INSTANCE.a();
        }
        return d(cVar, kVar, aVar);
    }

    @dl.d
    public static final float[] f(@dl.d float[] matrix, @dl.d float[] srcWhitePoint, @dl.d float[] dstWhitePoint) {
        f0.p(matrix, "matrix");
        f0.p(srcWhitePoint, "srcWhitePoint");
        f0.p(dstWhitePoint, "dstWhitePoint");
        float[] fArrO = o(matrix, srcWhitePoint);
        float[] fArrO2 = o(matrix, dstWhitePoint);
        return m(l(matrix), n(new float[]{fArrO2[0] / fArrO[0], fArrO2[1] / fArrO[1], fArrO2[2] / fArrO[2]}, matrix));
    }

    public static final boolean g(@dl.d TransferParameters a10, @dl.e TransferParameters jVar) {
        f0.p(a10, "a");
        return jVar != null && Math.abs(a10.j() - jVar.j()) < 0.001d && Math.abs(a10.k() - jVar.k()) < 0.001d && Math.abs(a10.l() - jVar.l()) < 0.001d && Math.abs(a10.m() - jVar.m()) < 0.002d && Math.abs(a10.n() - jVar.n()) < 0.001d && Math.abs(a10.o() - jVar.o()) < 0.001d && Math.abs(a10.p() - jVar.p()) < 0.001d;
    }

    public static final boolean h(@dl.d WhitePoint a10, @dl.d WhitePoint b10) {
        f0.p(a10, "a");
        f0.p(b10, "b");
        if (a10 == b10) {
            return true;
        }
        return Math.abs(a10.e() - b10.e()) < 0.001f && Math.abs(a10.f() - b10.f()) < 0.001f;
    }

    public static final boolean i(@dl.d float[] a10, @dl.d float[] b10) {
        f0.p(a10, "a");
        f0.p(b10, "b");
        if (a10 == b10) {
            return true;
        }
        int length = a10.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(a10[i10], b10[i10]) != 0 && Math.abs(a10[i10] - b10[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public static final e j(@dl.d c connect, @dl.d c destination, int i10) {
        f0.p(connect, "$this$connect");
        f0.p(destination, "destination");
        if (connect == destination) {
            return e.INSTANCE.c(connect);
        }
        long jG = connect.getCom.taobao.accs.common.Constants.KEY_MODEL java.lang.String();
        b.Companion aVar = b.INSTANCE;
        u uVar = null;
        return (b.h(jG, aVar.c()) && b.h(destination.getCom.taobao.accs.common.Constants.KEY_MODEL java.lang.String(), aVar.c())) ? new e.b((Rgb) connect, (Rgb) destination, i10, uVar) : new e(connect, destination, i10, uVar);
    }

    public static /* synthetic */ e k(c cVar, c cVar2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar2 = ColorSpaces.f13697a.t();
        }
        if ((i11 & 2) != 0) {
            i10 = i.INSTANCE.b();
        }
        return j(cVar, cVar2, i10);
    }

    @dl.d
    public static final float[] l(@dl.d float[] m10) {
        f0.p(m10, "m");
        float f10 = m10[0];
        float f11 = m10[3];
        float f12 = m10[6];
        float f13 = m10[1];
        float f14 = m10[4];
        float f15 = m10[7];
        float f16 = m10[2];
        float f17 = m10[5];
        float f18 = m10[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f10 * f19) + (f11 * f20) + (f12 * f21);
        float[] fArr = new float[m10.length];
        fArr[0] = f19 / f22;
        fArr[1] = f20 / f22;
        fArr[2] = f21 / f22;
        fArr[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr;
    }

    @dl.d
    public static final float[] m(@dl.d float[] lhs, @dl.d float[] rhs) {
        f0.p(lhs, "lhs");
        f0.p(rhs, "rhs");
        float f10 = lhs[0] * rhs[0];
        float f11 = lhs[3];
        float f12 = rhs[1];
        float f13 = lhs[6];
        float f14 = rhs[2];
        float f15 = lhs[1];
        float f16 = rhs[0];
        float f17 = lhs[4];
        float f18 = lhs[7];
        float f19 = lhs[2] * f16;
        float f20 = lhs[5];
        float f21 = f19 + (rhs[1] * f20);
        float f22 = lhs[8];
        float f23 = lhs[0];
        float f24 = rhs[3] * f23;
        float f25 = rhs[4];
        float f26 = f24 + (f11 * f25);
        float f27 = rhs[5];
        float f28 = lhs[1];
        float f29 = rhs[3];
        float f30 = lhs[2];
        float f31 = f23 * rhs[6];
        float f32 = lhs[3];
        float f33 = rhs[7];
        float f34 = f31 + (f32 * f33);
        float f35 = rhs[8];
        float f36 = rhs[6];
        return new float[]{f10 + (f11 * f12) + (f13 * f14), (f15 * f16) + (f12 * f17) + (f18 * f14), f21 + (f14 * f22), f26 + (f13 * f27), (f28 * f29) + (f17 * f25) + (f18 * f27), (f29 * f30) + (f20 * rhs[4]) + (f27 * f22), f34 + (f13 * f35), (f28 * f36) + (lhs[4] * f33) + (f18 * f35), (f30 * f36) + (lhs[5] * rhs[7]) + (f22 * f35)};
    }

    @dl.d
    public static final float[] n(@dl.d float[] lhs, @dl.d float[] rhs) {
        f0.p(lhs, "lhs");
        f0.p(rhs, "rhs");
        float f10 = lhs[0];
        float f11 = lhs[1];
        float f12 = lhs[2];
        return new float[]{lhs[0] * rhs[0], lhs[1] * rhs[1], lhs[2] * rhs[2], rhs[3] * f10, rhs[4] * f11, rhs[5] * f12, f10 * rhs[6], f11 * rhs[7], f12 * rhs[8]};
    }

    @dl.d
    public static final float[] o(@dl.d float[] lhs, @dl.d float[] rhs) {
        f0.p(lhs, "lhs");
        f0.p(rhs, "rhs");
        float f10 = rhs[0];
        float f11 = rhs[1];
        float f12 = rhs[2];
        rhs[0] = (lhs[0] * f10) + (lhs[3] * f11) + (lhs[6] * f12);
        rhs[1] = (lhs[1] * f10) + (lhs[4] * f11) + (lhs[7] * f12);
        rhs[2] = (lhs[2] * f10) + (lhs[5] * f11) + (lhs[8] * f12);
        return rhs;
    }

    public static final double p(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 * d13 ? (Math.pow(d10, 1.0d / d15) - d12) / d11 : d10 / d13;
    }

    public static final double q(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 * d13 ? (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11 : (d10 - d16) / d13;
    }

    public static final double r(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d15) : d10 * d13;
    }

    public static final double s(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d17) + d15 : (d13 * d10) + d16;
    }
}
