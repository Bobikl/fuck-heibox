package androidx.compose.ui.graphics;

import b1.MutableRect;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import org.apache.tools.ant.taskdefs.a6;

/* JADX INFO: compiled from: Matrix.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\b\u0087@\u0018\u0000 72\u00020\u0001:\u00012B\u0014\u0012\b\b\u0002\u00106\u001a\u000201ø\u0001\u0001¢\u0006\u0004\b7\u00108J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\b\u0010\u001bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0015\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0005¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0005¢\u0006\u0004\b$\u0010\"J+\u0010(\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020\u0005¢\u0006\u0004\b(\u0010)J+\u0010*\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020\u0005¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\u0088\u00016\u0092\u0001\u000201ø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00069"}, d2 = {"Landroidx/compose/ui/graphics/c1;", "", "", a6.a.f133725d, "column", "", "f", "([FII)F", "v", "Lkotlin/b2;", ak.aB, "([FIIF)V", "Lb1/f;", "point", "j", "([FJ)J", "Lb1/i;", "rect", "k", "([FLb1/i;)Lb1/i;", "Lb1/d;", "l", "([FLb1/d;)V", "m", ak.aG, "([F[F)V", "", "([F)Ljava/lang/String;", "i", "([F)V", "matrix", "t", "degrees", "n", "([FF)V", "o", "p", "x", "y", ak.aD, "q", "([FFFF)V", RXScreenCaptureService.KEY_WIDTH, RXScreenCaptureService.KEY_HEIGHT, "([F)I", "other", "", "d", "([FLjava/lang/Object;)Z", "", ak.av, "[F", "g", "()[F", "values", "b", "([F)[F", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13683c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13684d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13685e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f13686f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f13687g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f13688h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f13689i = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f13690j = 12;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f13691k = 13;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f13692l = 14;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f13693m = 15;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final float[] values;

    private /* synthetic */ c1(float[] fArr) {
        this.values = fArr;
    }

    public static final /* synthetic */ c1 a(float[] fArr) {
        return new c1(fArr);
    }

    @dl.d
    public static float[] b(@dl.d float[] values) {
        kotlin.jvm.internal.f0.p(values, "values");
        return values;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i10, kotlin.jvm.internal.u uVar) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof c1) && kotlin.jvm.internal.f0.g(fArr, ((c1) obj).y());
    }

    public static final boolean e(float[] fArr, float[] fArr2) {
        return kotlin.jvm.internal.f0.g(fArr, fArr2);
    }

    public static final float f(float[] fArr, int i10, int i11) {
        return fArr[(i10 * 4) + i11];
    }

    public static int h(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final void i(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (((((f26 * f37) - (f27 * f36)) + (f28 * f35)) + (f29 * f34)) - (f30 * f33)) + (f31 * f32);
        if (f38 == 0.0f) {
            return;
        }
        float f39 = 1.0f / f38;
        fArr[0] = (((f15 * f37) - (f16 * f36)) + (f17 * f35)) * f39;
        fArr[1] = ((((-f11) * f37) + (f12 * f36)) - (f13 * f35)) * f39;
        fArr[2] = (((f23 * f31) - (f24 * f30)) + (f25 * f29)) * f39;
        fArr[3] = ((((-f19) * f31) + (f20 * f30)) - (f21 * f29)) * f39;
        float f40 = -f14;
        fArr[4] = (((f40 * f37) + (f16 * f34)) - (f17 * f33)) * f39;
        fArr[5] = (((f37 * f10) - (f12 * f34)) + (f13 * f33)) * f39;
        float f41 = -f22;
        fArr[6] = (((f41 * f31) + (f24 * f28)) - (f25 * f27)) * f39;
        fArr[7] = (((f31 * f18) - (f20 * f28)) + (f21 * f27)) * f39;
        fArr[8] = (((f14 * f36) - (f15 * f34)) + (f17 * f32)) * f39;
        fArr[9] = ((((-f10) * f36) + (f34 * f11)) - (f13 * f32)) * f39;
        fArr[10] = (((f22 * f30) - (f23 * f28)) + (f25 * f26)) * f39;
        fArr[11] = ((((-f18) * f30) + (f28 * f19)) - (f21 * f26)) * f39;
        fArr[12] = (((f40 * f35) + (f15 * f33)) - (f16 * f32)) * f39;
        fArr[13] = (((f10 * f35) - (f11 * f33)) + (f12 * f32)) * f39;
        fArr[14] = (((f41 * f29) + (f23 * f27)) - (f24 * f26)) * f39;
        fArr[15] = (((f18 * f29) - (f19 * f27)) + (f20 * f26)) * f39;
    }

    public static final long j(float[] fArr, long j10) {
        float fP = b1.f.p(j10);
        float fR = b1.f.r(j10);
        float f10 = 1 / (((fArr[3] * fP) + (fArr[7] * fR)) + fArr[15]);
        if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
            f10 = 0.0f;
        }
        return b1.g.a(((fArr[0] * fP) + (fArr[4] * fR) + fArr[12]) * f10, f10 * ((fArr[1] * fP) + (fArr[5] * fR) + fArr[13]));
    }

    @dl.d
    public static final b1.i k(float[] fArr, @dl.d b1.i rect) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        long j10 = j(fArr, b1.g.a(rect.t(), rect.getF30372b()));
        long j11 = j(fArr, b1.g.a(rect.t(), rect.j()));
        long j12 = j(fArr, b1.g.a(rect.x(), rect.getF30372b()));
        long j13 = j(fArr, b1.g.a(rect.x(), rect.j()));
        return new b1.i(Math.min(Math.min(b1.f.p(j10), b1.f.p(j11)), Math.min(b1.f.p(j12), b1.f.p(j13))), Math.min(Math.min(b1.f.r(j10), b1.f.r(j11)), Math.min(b1.f.r(j12), b1.f.r(j13))), Math.max(Math.max(b1.f.p(j10), b1.f.p(j11)), Math.max(b1.f.p(j12), b1.f.p(j13))), Math.max(Math.max(b1.f.r(j10), b1.f.r(j11)), Math.max(b1.f.r(j12), b1.f.r(j13))));
    }

    public static final void l(float[] fArr, @dl.d MutableRect rect) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        long j10 = j(fArr, b1.g.a(rect.getF30360a(), rect.getF30361b()));
        long j11 = j(fArr, b1.g.a(rect.getF30360a(), rect.getF30363d()));
        long j12 = j(fArr, b1.g.a(rect.getF30362c(), rect.getF30361b()));
        long j13 = j(fArr, b1.g.a(rect.getF30362c(), rect.getF30363d()));
        rect.m(Math.min(Math.min(b1.f.p(j10), b1.f.p(j11)), Math.min(b1.f.p(j12), b1.f.p(j13))));
        rect.o(Math.min(Math.min(b1.f.r(j10), b1.f.r(j11)), Math.min(b1.f.r(j12), b1.f.r(j13))));
        rect.n(Math.max(Math.max(b1.f.p(j10), b1.f.p(j11)), Math.max(b1.f.p(j12), b1.f.p(j13))));
        rect.l(Math.max(Math.max(b1.f.r(j10), b1.f.r(j11)), Math.max(b1.f.r(j12), b1.f.r(j13))));
    }

    public static final void m(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                fArr[(i11 * 4) + i10] = i10 == i11 ? 1.0f : 0.0f;
                i11++;
            }
            i10++;
        }
    }

    public static final void n(float[] fArr, float f10) {
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[9];
        float f16 = fArr[10];
        float f17 = fArr[13];
        float f18 = fArr[14];
        fArr[1] = (f11 * fCos) - (f12 * fSin);
        fArr[2] = (f11 * fSin) + (f12 * fCos);
        fArr[5] = (f13 * fCos) - (f14 * fSin);
        fArr[6] = (f13 * fSin) + (f14 * fCos);
        fArr[9] = (f15 * fCos) - (f16 * fSin);
        fArr[10] = (f15 * fSin) + (f16 * fCos);
        fArr[13] = (f17 * fCos) - (f18 * fSin);
        fArr[14] = (f17 * fSin) + (f18 * fCos);
    }

    public static final void o(float[] fArr, float f10) {
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[2];
        float f13 = fArr[4];
        float f14 = fArr[6];
        float f15 = fArr[8];
        float f16 = fArr[10];
        float f17 = fArr[12];
        float f18 = fArr[14];
        fArr[0] = (f11 * fCos) + (f12 * fSin);
        fArr[2] = ((-f11) * fSin) + (f12 * fCos);
        fArr[4] = (f13 * fCos) + (f14 * fSin);
        fArr[6] = ((-f13) * fSin) + (f14 * fCos);
        fArr[8] = (f15 * fCos) + (f16 * fSin);
        fArr[10] = ((-f15) * fSin) + (f16 * fCos);
        fArr[12] = (f17 * fCos) + (f18 * fSin);
        fArr[14] = ((-f17) * fSin) + (f18 * fCos);
    }

    public static final void p(float[] fArr, float f10) {
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = (fCos * f11) + (fSin * f12);
        float f14 = -fSin;
        float f15 = fArr[1];
        float f16 = fArr[5];
        float f17 = (fCos * f15) + (fSin * f16);
        float f18 = fArr[2];
        float f19 = fArr[6];
        float f20 = (fCos * f18) + (fSin * f19);
        float f21 = fArr[3];
        float f22 = fArr[7];
        fArr[0] = f13;
        fArr[1] = f17;
        fArr[2] = f20;
        fArr[3] = (fCos * f21) + (fSin * f22);
        fArr[4] = (f11 * f14) + (f12 * fCos);
        fArr[5] = (f15 * f14) + (f16 * fCos);
        fArr[6] = (f18 * f14) + (f19 * fCos);
        fArr[7] = (f14 * f21) + (fCos * f22);
    }

    public static final void q(float[] fArr, float f10, float f11, float f12) {
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        fArr[3] = fArr[3] * f10;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * f12;
        fArr[9] = fArr[9] * f12;
        fArr[10] = fArr[10] * f12;
        fArr[11] = fArr[11] * f12;
    }

    public static /* synthetic */ void r(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 1.0f;
        }
        q(fArr, f10, f11, f12);
    }

    public static final void s(float[] fArr, int i10, int i11, float f10) {
        fArr[(i10 * 4) + i11] = f10;
    }

    public static final void t(float[] fArr, @dl.d float[] matrix) {
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        for (int i10 = 0; i10 < 16; i10++) {
            fArr[i10] = matrix[i10];
        }
    }

    public static final void u(float[] fArr, @dl.d float[] m10) {
        kotlin.jvm.internal.f0.p(m10, "m");
        float fB = d1.b(fArr, 0, m10, 0);
        float fB2 = d1.b(fArr, 0, m10, 1);
        float fB3 = d1.b(fArr, 0, m10, 2);
        float fB4 = d1.b(fArr, 0, m10, 3);
        float fB5 = d1.b(fArr, 1, m10, 0);
        float fB6 = d1.b(fArr, 1, m10, 1);
        float fB7 = d1.b(fArr, 1, m10, 2);
        float fB8 = d1.b(fArr, 1, m10, 3);
        float fB9 = d1.b(fArr, 2, m10, 0);
        float fB10 = d1.b(fArr, 2, m10, 1);
        float fB11 = d1.b(fArr, 2, m10, 2);
        float fB12 = d1.b(fArr, 2, m10, 3);
        float fB13 = d1.b(fArr, 3, m10, 0);
        float fB14 = d1.b(fArr, 3, m10, 1);
        float fB15 = d1.b(fArr, 3, m10, 2);
        float fB16 = d1.b(fArr, 3, m10, 3);
        fArr[0] = fB;
        fArr[1] = fB2;
        fArr[2] = fB3;
        fArr[3] = fB4;
        fArr[4] = fB5;
        fArr[5] = fB6;
        fArr[6] = fB7;
        fArr[7] = fB8;
        fArr[8] = fB9;
        fArr[9] = fB10;
        fArr[10] = fB11;
        fArr[11] = fB12;
        fArr[12] = fB13;
        fArr[13] = fB14;
        fArr[14] = fB15;
        fArr[15] = fB16;
    }

    @dl.d
    public static String v(float[] fArr) {
        return StringsKt__IndentKt.p("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void w(float[] fArr, float f10, float f11, float f12) {
        float f13 = (fArr[0] * f10) + (fArr[4] * f11) + (fArr[8] * f12) + fArr[12];
        float f14 = (fArr[1] * f10) + (fArr[5] * f11) + (fArr[9] * f12) + fArr[13];
        float f15 = (fArr[2] * f10) + (fArr[6] * f11) + (fArr[10] * f12) + fArr[14];
        float f16 = (fArr[3] * f10) + (fArr[7] * f11) + (fArr[11] * f12) + fArr[15];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = f16;
    }

    public static /* synthetic */ void x(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        w(fArr, f10, f11, f12);
    }

    public boolean equals(Object obj) {
        return d(this.values, obj);
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return h(this.values);
    }

    @dl.d
    public String toString() {
        return v(this.values);
    }

    public final /* synthetic */ float[] y() {
        return this.values;
    }
}
