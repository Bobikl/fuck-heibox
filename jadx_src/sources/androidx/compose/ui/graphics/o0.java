package androidx.compose.ui.graphics;

import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;
import org.apache.tools.ant.taskdefs.a6;

/* JADX INFO: compiled from: ColorMatrix.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0002\u0010;\u001a\u000206ø\u0001\u0001¢\u0006\u0004\b<\u0010=J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010JP\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000526\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\t0\u0012H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0010J5\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J-\u0010'\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b)\u0010\"J\u0015\u0010*\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b*\u0010\"J\u0015\u0010+\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b+\u0010\"J\r\u0010,\u001a\u00020\t¢\u0006\u0004\b,\u0010\rJ\r\u0010-\u001a\u00020\t¢\u0006\u0004\b-\u0010\rJ\u0010\u0010\b\u001a\u00020.HÖ\u0001¢\u0006\u0004\b\b\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010;\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\u0088\u0001;\u0092\u0001\u000206ø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006>"}, d2 = {"Landroidx/compose/ui/graphics/o0;", "", "", a6.a.f133725d, "column", "", "i", "([FII)F", "v", "Lkotlin/b2;", "n", "([FIIF)V", "l", "([F)V", com.max.hbsearch.l.W, "o", "([F[F)V", "degrees", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "cosine", "sine", "block", "m", "([FFLyh/p;)V", "colorMatrix", ak.aG, "m1", "m2", "f", "([F[FI[FI)F", "sat", ak.aB, "([FF)V", "redScale", "greenScale", "blueScale", "alphaScale", "t", "([FFFFF)V", "r", "q", "p", "d", "e", "", "([F)Ljava/lang/String;", "k", "([F)I", "other", "", "g", "([FLjava/lang/Object;)Z", "", ak.av, "[F", "j", "()[F", "values", "b", "([F)[F", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final float[] values;

    private /* synthetic */ o0(float[] fArr) {
        this.values = fArr;
    }

    public static final /* synthetic */ o0 a(float[] fArr) {
        return new o0(fArr);
    }

    @dl.d
    public static float[] b(@dl.d float[] values) {
        kotlin.jvm.internal.f0.p(values, "values");
        return values;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i10, kotlin.jvm.internal.u uVar) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return b(fArr);
    }

    public static final void d(float[] fArr) {
        l(fArr);
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    public static final void e(float[] fArr) {
        l(fArr);
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    private static final float f(float[] fArr, float[] fArr2, int i10, float[] fArr3, int i11) {
        int i12 = i10 * 5;
        return (fArr2[i12 + 0] * fArr3[0 + i11]) + (fArr2[i12 + 1] * fArr3[5 + i11]) + (fArr2[i12 + 2] * fArr3[10 + i11]) + (fArr2[i12 + 3] * fArr3[15 + i11]);
    }

    public static boolean g(float[] fArr, Object obj) {
        return (obj instanceof o0) && kotlin.jvm.internal.f0.g(fArr, ((o0) obj).w());
    }

    public static final boolean h(float[] fArr, float[] fArr2) {
        return kotlin.jvm.internal.f0.g(fArr, fArr2);
    }

    public static final float i(float[] fArr, int i10, int i11) {
        return fArr[(i10 * 5) + i11];
    }

    public static int k(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final void l(float[] fArr) {
        kotlin.collections.m.t2(fArr, 0.0f, 0, 0, 6, null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    private static final void m(float[] fArr, float f10, yh.p<? super Float, ? super Float, kotlin.b2> pVar) {
        l(fArr);
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        pVar.invoke(Float.valueOf((float) Math.cos(d10)), Float.valueOf((float) Math.sin(d10)));
    }

    public static final void n(float[] fArr, int i10, int i11, float f10) {
        fArr[(i10 * 5) + i11] = f10;
    }

    public static final void o(float[] fArr, @dl.d float[] src) {
        kotlin.jvm.internal.f0.p(src, "src");
        kotlin.collections.m.i1(src, fArr, 0, 0, 0, 14, null);
    }

    public static final void p(float[] fArr, float f10) {
        l(fArr);
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        fArr[6] = fCos;
        fArr[0] = fCos;
        fArr[1] = fSin;
        fArr[5] = -fSin;
    }

    public static final void q(float[] fArr, float f10) {
        l(fArr);
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        fArr[12] = fCos;
        fArr[0] = fCos;
        fArr[2] = -fSin;
        fArr[10] = fSin;
    }

    public static final void r(float[] fArr, float f10) {
        l(fArr);
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        fArr[12] = fCos;
        fArr[6] = fCos;
        fArr[7] = fSin;
        fArr[11] = -fSin;
    }

    public static final void s(float[] fArr, float f10) {
        l(fArr);
        float f11 = 1 - f10;
        float f12 = 0.213f * f11;
        float f13 = 0.715f * f11;
        float f14 = f11 * 0.072f;
        fArr[0] = f12 + f10;
        fArr[1] = f13;
        fArr[2] = f14;
        fArr[5] = f12;
        fArr[6] = f13 + f10;
        fArr[7] = f14;
        fArr[10] = f12;
        fArr[11] = f13;
        fArr[12] = f14 + f10;
    }

    public static final void t(float[] fArr, float f10, float f11, float f12, float f13) {
        l(fArr);
        fArr[0] = f10;
        fArr[6] = f11;
        fArr[12] = f12;
        fArr[18] = f13;
    }

    public static final void u(float[] fArr, @dl.d float[] colorMatrix) {
        kotlin.jvm.internal.f0.p(colorMatrix, "colorMatrix");
        float f10 = f(fArr, fArr, 0, colorMatrix, 0);
        float f11 = f(fArr, fArr, 0, colorMatrix, 1);
        float f12 = f(fArr, fArr, 0, colorMatrix, 2);
        float f13 = f(fArr, fArr, 0, colorMatrix, 3);
        float f14 = (fArr[0] * colorMatrix[4]) + (fArr[1] * colorMatrix[9]) + (fArr[2] * colorMatrix[14]) + (fArr[3] * colorMatrix[19]) + fArr[4];
        float f15 = f(fArr, fArr, 1, colorMatrix, 0);
        float f16 = f(fArr, fArr, 1, colorMatrix, 1);
        float f17 = f(fArr, fArr, 1, colorMatrix, 2);
        float f18 = f(fArr, fArr, 1, colorMatrix, 3);
        float f19 = (fArr[5] * colorMatrix[4]) + (fArr[6] * colorMatrix[9]) + (fArr[7] * colorMatrix[14]) + (fArr[8] * colorMatrix[19]) + fArr[9];
        float f20 = f(fArr, fArr, 2, colorMatrix, 0);
        float f21 = f(fArr, fArr, 2, colorMatrix, 1);
        float f22 = f(fArr, fArr, 2, colorMatrix, 2);
        float f23 = f(fArr, fArr, 2, colorMatrix, 3);
        float f24 = (fArr[10] * colorMatrix[4]) + (fArr[11] * colorMatrix[9]) + (fArr[12] * colorMatrix[14]) + (fArr[13] * colorMatrix[19]) + fArr[14];
        float f25 = f(fArr, fArr, 3, colorMatrix, 0);
        float f26 = f(fArr, fArr, 3, colorMatrix, 1);
        float f27 = f(fArr, fArr, 3, colorMatrix, 2);
        float f28 = f(fArr, fArr, 3, colorMatrix, 3);
        float f29 = (fArr[15] * colorMatrix[4]) + (fArr[16] * colorMatrix[9]) + (fArr[17] * colorMatrix[14]) + (fArr[18] * colorMatrix[19]) + fArr[19];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
        fArr[9] = f19;
        fArr[10] = f20;
        fArr[11] = f21;
        fArr[12] = f22;
        fArr[13] = f23;
        fArr[14] = f24;
        fArr[15] = f25;
        fArr[16] = f26;
        fArr[17] = f27;
        fArr[18] = f28;
        fArr[19] = f29;
    }

    public static String v(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return g(this.values, obj);
    }

    public int hashCode() {
        return k(this.values);
    }

    @dl.d
    /* JADX INFO: renamed from: j, reason: from getter */
    public final float[] getValues() {
        return this.values;
    }

    public String toString() {
        return v(this.values);
    }

    public final /* synthetic */ float[] w() {
        return this.values;
    }
}
